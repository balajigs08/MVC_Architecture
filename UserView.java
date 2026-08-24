// View Class: UserView.java
public class UserView {
    public void printUserDetails(String userName, String password) {
        System.out.println("------------------------------------");
        System.out.println("           User Details             ");
        System.out.println("------------------------------------");
        System.out.println("Username : " + userName);
        System.out.println("Password : " + maskPassword(password));
        System.out.println("------------------------------------");
    }

    private String maskPassword(String password) {
        if (password == null || password.isEmpty()) {
            return "";
        }
        return "*".repeat(password.length());
    }
}
