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

        if (in == 2) {
            editProfile();
        }
        if (in == 3) {
            Sign usersign = new Sign();
            usersign.signIn();
        }
    }

    public void editProfile() {
        Scanner input = new Scanner(System.in);

        System.out.println("1.change username");
        System.out.println("2.change password");
        System.out.println("3.change email");
        System.out.println("4.change phonenumber");
        System.out.println("5.back");
        System.out.println("6.exit");

        int inner = input.nextInt();
        switch (inner) {
            case 1:
                System.out.println("Enter new username:");
                Scanner inputOne = new Scanner(System.in);
                this.username = inputOne.nextLine();
                System.out.println("your username changed!");
                this.profile();
                break;
            case 2:
                System.out.println("Enter new password:");
                Scanner inputTwo = new Scanner(System.in);
                String pass = inputTwo.nextLine();
                if (pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")) {
                    this.password = pass;
                    System.out.println("your password changed!");
                } else {
                    System.out.println("wrong pattern");
                }
                this.profile();
                break;
            case 3:
                System.out.println("Enter new email:");
                Scanner inputThree = new Scanner(System.in);
                this.email = inputThree.nextLine();
                System.out.println("your email changed!");
                this.profile();
                break;
            case 4:
                System.out.println("Enter new phonenumber:");
                Scanner inputFour = new Scanner(System.in);
                this.phoneNumber = inputFour.nextLine();
                System.out.println("your phonenumber changed!");
                this.profile();
                break;
            case 5:
                this.profile();
                break;
            case 6:
                System.exit(0);
            default:
                break;
        }
    }
}
