package ir.ac.kntu;

import java.util.Scanner;

public class Store {

    int indexOfUser;

    public void start(int i) {
        indexOfUser = i;
        System.out.println("\033[43m" + "welcome to store" + "\033[0m");
        System.out.println("1.Show all games");
        System.out.println("2.Search game");
        System.out.println("3.back");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                showGames();
                break;
            case 2:
                break;
            case 3:
                User x = new User();
                x.userMenu(indexOfUser);
                break;
            default:
                break;
        }
    }

    public void showGames() {
        for (int i = 0; i < Admin.getGamesArr().size(); i++) {
            System.out
                    .println("\n" + "Title of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getTitle() + "\033[0m"
                            + " Index of game is: " + i + "\n");
        }

        System.out.println("\nEnter index of the game you want:");
        Scanner input = new Scanner(System.in);
        showGame(input.nextInt());
    }

    public void showGame(int i) {
        System.out.println("\n" + "Title of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getTitle() + "\033[0m");
        System.out.println("\n" + "Info of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getInfo() + "\033[0m");
        System.out.println("\n" + "genre of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getGenre() + "\033[0m");
        System.out.println("\n" + "price of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getPrice() + "\033[0m");
        System.out
                .println("\n" + "rating of game: " + "\033[1;93m" + Admin.getGamesArr().get(i).getRating() + "\033[0m");

        int u = Sign.getUsersArr().get(indexOfUser).getGamesOfUser().indexOf(Admin.getGamesArr().get(i));
        if (Sign.getUsersArr().get(indexOfUser).getGamesOfUser().indexOf(Admin.getGamesArr().get(i)) == -1) {
            System.out.println("1." + "\033[1;92m" + "Buy the game" + "\033[0m");
            System.out.println("2.Back");
            Scanner input = new Scanner(System.in);
            int in = input.nextInt();
            switch (in) {
                case 1:
                    if (Sign.getUsersArr().get(indexOfUser).getWallet() >= Admin.getGamesArr().get(i).getPrice()) {
                        Sign.getUsersArr().get(indexOfUser).getGamesOfUser().add(Admin.getGamesArr().get(i));
                        Sign.getUsersArr().get(indexOfUser).setWallet(
                                Sign.getUsersArr().get(indexOfUser).getWallet()
                                        - Admin.getGamesArr().get(i).getPrice());
                        System.out.println("\n" + "You bought the game successfully!" + "\n");
                    } else {
                        System.out.println("\033[1;91m" + "Not enough money in wallet" + "\033[0m");
                    }
                    break;
                case 2:
                    showGames();
                    break;
                default:
                    break;
            }
        }
        start(indexOfUser);
    }
}
