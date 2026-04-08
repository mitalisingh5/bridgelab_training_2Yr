import java.util.Stack;

public class BrowserNavigation {

    static Stack<String> backStack = new Stack<>();
    static Stack<String> forwardStack = new Stack<>();
    static String currentPage = "Home";

    // Visit new page
    static void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    // Go back
    static void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No page to go back");
        }
    }

    // Go forward
    static void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No page to go forward");
        }
    }

    public static void main(String[] args) {
        visit("Google");
        visit("YouTube");
        visit("GitHub");

        back();
        back();

        forward();
    }
}
