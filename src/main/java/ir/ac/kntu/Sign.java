package ir.ac.kntu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sign {

    private static List<User> usersArr = new ArrayList<User>();

    public static List<User> getUsersArr() {
        return usersArr;
    }

    public void sign() {
        System.out.println("Select Your Role");
        System.out.println("Enter 1 if you are Admin");
        System.out.println("Enter 2 if you are User");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        if (in == 1) {
            adminStart();

        }
        if (in == 2) {
            userStart();
        }

    }

    public void adminStart() {
        String usernamerOfAdmin;
        String passwordOfAdmin;
        System.out.println("Enter your username");
        Scanner input1 = new Scanner(System.in);
        usernamerOfAdmin = input1.nextLine();
        System.out.println("Enter your password");
        passwordOfAdmin = input1.nextLine();
        if (usernamerOfAdmin.equals("Alireza") && passwordOfAdmin.equals("12345678")) {
            System.out.println("dkd");
        } else {
            System.out.println("incorrect username or password");
        }
    }

    public void userStart() {
        System.out.println("Sign up or Sign in");
        System.out.println("Enter 1 for sign up");
        System.out.println("Enter 2 for sign in");
        System.out.println("Enter 3 for back");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        if (in == 1) {
            signUp();
        }
        if (in == 2) {
            signIn();
        }
        if (in == 3) {
            sign();
        }
    }

    public void signUp() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        if (!password.matches("(?=(.*[a-z]){3,})(?=(.*[A-Z]){2,})(?=(.*[0-9]){2,})(?=(.*)+).{8,}")) {
            System.out.println("not correct password!");
            signUp();
        }
        System.out.println("Enter email:");
        String email = input.nextLine();
        System.out.println("Enter phonenumber");
        String phoneNumber = input.nextLine();

        User user = new User(username, password, phoneNumber, email);
        int count = 0;
        for (int i = 0; i < usersArr.size(); i++) {
            if (usersArr.get(i).getUsername().equals(user.getUsername())) {
                System.out.println("already taken username!");
                count++;
            }
        }
        if (count == 0) {
            usersArr.add(user);
            System.out.println("You signed up!\n");
        }
        sign();
    }

    public void signIn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        int count = 0;
        for (int i = 0; i < usersArr.size(); i++) {
            if (usersArr.get(i).getUsername().equals(username)) {
                if (usersArr.get(i).getUsername().equals(password)) {
                    System.out.println("Your welcome");
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("Invalid Enties");
            signIn();
        }

    }

}