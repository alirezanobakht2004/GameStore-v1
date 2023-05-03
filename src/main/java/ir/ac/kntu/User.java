package ir.ac.kntu;

import java.util.Scanner;

public class User {
    private String username;

    private String password;

    private String phoneNumber;

    private String email;

    public User(String username, String password, String phoneNumber, String email) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void profile() {
        System.out.println("1.show information");
        System.out.println("2.change information");
        System.out.println("3.Back");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        if (in == 1) {

            System.out.println("your username:");
            System.out.println(this.username);
            System.out.println("your password:");
            System.out.println(this.password);
            System.out.println("your email:");
            System.out.println(this.email);
            System.out.println("your phonenumber:");
            System.out.println(this.phoneNumber);
            System.out.println("\n Enter 1 for back");
            System.out.println(" Enter 2 for exit");

            int back = input.nextInt();
            if (back == 1) {
                this.profile();
            }
            if (back == 2) {
                System.exit(0);
            }
        }

        if (in == 3) {
            Sign usersign = new Sign();
            usersign.signIn();
        }
    }
}
