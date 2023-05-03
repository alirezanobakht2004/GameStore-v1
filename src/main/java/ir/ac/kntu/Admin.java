package ir.ac.kntu;

import java.util.Scanner;

public class Admin {
    public void startMenu() {
        System.out.println("\033[1;93m" + "which do you want to modify?" + "\033[0m");
        System.out.println("1.Games");
        System.out.println("2.Users");
        System.out.println("3.back");
        Sign s = new Sign();
        Scanner input = new Scanner(System.in);
        int adminDes = input.nextInt();
        switch (adminDes) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                s.adminStart();
            default:
                break;
        }
    }
}
