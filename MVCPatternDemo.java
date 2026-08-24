// Main Class: MVCPatternDemo.java
public class MVCPatternDemo {

    public static void main(String[] args) {
        // Fetch user data from a simulated "database"
        User model = retriveUserFromDatabase();

        // Create the view to display user details
        UserView view = new UserView();

        // Create the controller
        UserController controller = new UserController(model, view);

        System.out.println("\n=== Initial User Details ===");
        controller.updateView();

        // Update user credentials via the controller
        System.out.println("\n>>> Updating Username to 'john_doe' and Password to 'newPass@456'...");
        controller.setUserName("john_doe");
        controller.setPassword("newPass@456");

        System.out.println("\n=== Updated User Details ===");
        controller.updateView();
    }

    // Simulates fetching a user record from a database
    private static User retriveUserFromDatabase() {
        User user = new User();
        user.setUserName("admin");
        user.setPassword("admin@123");
        return user;
    }
}
