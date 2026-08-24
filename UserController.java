// Controller Class: UserController.java
public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String userName) {
        model.setUserName(userName);
    }

    public String getUserName() {
        return model.getUserName();
    }

    public void setPassword(String password) {
        model.setPassword(password);
    }

    public String getPassword() {
        return model.getPassword();
    }

    public void updateView() {
        view.printUserDetails(model.getUserName(), model.getPassword());
    }
}
