package usermodule;

public class user {
    public String id;
    public String name;
    public String role;

    public void showInfo() {
        System.out.println("ID: " + id + "Name: " + name + "Role: " + role);
    }

    public void login() {
        System.out.println("User " + name + " has logged in successfully.");
    }
}