package ir.ac.kntu;

import java.util.Scanner;

public class Library {
    int indexOfUser;

    public void start(int i) {
        indexOfUser = i;
        System.out.println("\033[43m" + "welcome to library" + "\033[0m");
        System.out.println("1.Show your games");
        System.out.println("2.back");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                showGames();
                break;
            case 2:
                User x = new User();
                x.userMenu(i);
                break;
            default:
                break;
        }
    }

    public void showGames() {
        for (int i = 0; i < Sign.getUsersArr().get(indexOfUser).getGamesOfUser().size(); i++) {
            System.out.println("Your game title:" + "\033[1;92m"
                    + Sign.getUsersArr().get(indexOfUser).getGamesOfUser().get(i).getTitle() + "\033[0m"
                    + " With index of: " + "\033[1;91m"
                    + Admin.getGamesArr().indexOf(Sign.getUsersArr().get(indexOfUser).getGamesOfUser().get(i))
                    + "\033[0m");
        }
        start(indexOfUser);
    }
}
