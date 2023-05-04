package ir.ac.kntu;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private int wallet = 0;
    private int i;

    public User(String username, String password, String phoneNumber, String email) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {

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

    public int getWallet() {
        return wallet;
    }

    public void userMenu(int i) {
        this.i = i;
        System.out.println("\033[1;92m" + "User Menu" + "\033[0m");
        System.out.println("Enter 1 for profile");
        System.out.println("Enter 2 for library");
        System.out.println("Enter 3 for store");
        System.out.println("Enter 4 for friends");
        System.out.println("Enter 5 for back");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch (in) {
            case 1:
                Sign.getUsersArr().get(i).profile();
                break;
            case 2:
                Sign.getUsersArr().get(i).profile();
                break;
            case 3:
                Sign.getUsersArr().get(i).profile();
                break;
            case 4:
                Sign.getUsersArr().get(i).profile();
                break;
            case 5:
                Sign back = new Sign();
                back.signIn();
            default:
                break;
        }
    }

    public void profile() {
        System.out.println("\033[1;94m" + "profile menu" + "\033[0m");
        System.out.println("1.show information");
        System.out.println("2.change information");
        System.out.println("3.wallet charging");
        System.out.println("4.Back");
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
            System.out.println("your wallet amount:");
            System.out.println(this.wallet);
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
            this.editProfile();
        }
        if (in == 3) {
            this.wallet();
        }
        if (in == 4) {
            userMenu(i);
        }
    }

    public void editProfile() {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[1;97m" + "edit profile menu" + "\033[0m");
        System.out.println("1.change username");
        System.out.println("2.change password");
        System.out.println("3.change email");
        System.out.println("4.change phonenumber");
        System.out.println("5.back");
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
            default:
                break;
        }
    }

    public void wallet() {
        System.out.println("enter amount of money you want to add:");
        
        Scanner input = new Scanner(System.in);
        this.wallet += input.nextInt();
        this.profile();
    }
}
