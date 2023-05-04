package ir.ac.kntu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private static List<Game> gamesArr = new ArrayList<Game>();

    public static List<Game> getUsersArr() {
        return gamesArr;
    }

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
                gameManage();
                break;
            case 2:
                break;
            case 3:
                s.adminStart();
            default:
                break;
        }
    }

    public void gameManage() {
        System.out.println("\033[0;91m" + "game manage menu" + "\033[0m");
        System.out.println("1.create games");
        System.out.println("2.modify games");
        System.out.println("3.delete games");
        System.out.println("4.back");
        Scanner input = new Scanner(System.in);
        int adminDes = input.nextInt();
        switch (adminDes) {
            case 1:
                createGame();
                break;
            case 2:
                searchGame();
                break;
            case 3:

            case 4:
                startMenu();
            default:
                break;
        }
    }

    public void createGame() {
        System.out.println("\033[43m" + "Create game menu" + "\033[0m");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter title:");
        String title = input.nextLine();
        System.out.println("Enter genre");
        String genre = input.nextLine();
        System.out.println("Enter info:");
        String info = input.nextLine();
        System.out.println("Enter price:");
        String price = input.nextLine();
        Game game = new Game(title, genre, info, price);
        gamesArr.add(game);
        gameManage();
    }

    public void searchGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[46m" + "Modify or Delete game menu" + "\033[0m");
        System.out.println("Enter name of game:");
        String name = input.nextLine();
        int count = 0;
        for (int i = 0; i < gamesArr.size(); i++) {
            if (gamesArr.get(i).getTitle().equals(name)) {
                System.out.println("name of game: " + name +
                        " genre " + gamesArr.get(i).getGenre() +
                        " info: " + gamesArr.get(i).getInfo() + " index of game is: " +
                        "\033[1;93m" + String.valueOf(i) + "\033[0m");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("there was no such a game!");
            searchGame();
        } else {
            System.out.println("\033[1;96m" + "Modify or Delete selection Menu" + "\033[0m");
            System.out.println("1.Modify game");
            System.out.println("2.delete game");
            System.out.println("3.back");
            int des = input.nextInt();
            switch (des) {
                case 1:
                    System.out.println("enter the index of the game you want to modify:");
                    int index = input.nextInt();
                    Game game = new Game();
                    game.gameModify(index);
                    break;
                case 2:
                    System.out.println("enter the index of the game you want to modify:");
                    int index1 = input.nextInt();
                    gamesArr.remove(index1);
                case 3:
                    searchGame();
                default:
                    break;
            }

        }
    }

}
