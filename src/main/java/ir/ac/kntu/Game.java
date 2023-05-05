package ir.ac.kntu;

import java.util.Scanner;

public class Game {

    private String title;

    private String genre;

    private String info;

    private int price;

    private float rating;

    private Comments comments;

    private User community;

    public Game(String title, String genre, String info, int price) {
        this.title = title;
        this.genre = genre;
        this.info = info;
        this.price = price;
    }

    public Game() {

    }

    public float getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public String getGenre() {
        return genre;
    }

    public void gameModify(int i) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[0;91m" + "game modify menu" + "\033[0m");
        System.out.println("1.change title");
        System.out.println("2.change genre");
        System.out.println("3.change info");
        System.out.println("4.change price");
        System.out.println("5.back");
        int in = input.nextInt();
        switch (in) {
            case 1:
                System.out.println("Enter new title:");
                Scanner inputOne = new Scanner(System.in);
                Admin.getGamesArr().get(i).title = inputOne.nextLine();
                System.out.println("your game title changed!");
                gameModify(i);
                break;
            case 2:
                System.out.println("Enter new genre:");
                Scanner inputTwo = new Scanner(System.in);
                Admin.getGamesArr().get(i).genre = inputTwo.nextLine();
                System.out.println("your game genre changed!");
                gameModify(i);
                break;
            case 3:
                System.out.println("Enter new info:");
                Scanner inputThree = new Scanner(System.in);
                Admin.getGamesArr().get(i).info = inputThree.nextLine();
                System.out.println("your game info changed!");
                gameModify(i);
                break;
            case 4:
                System.out.println("Enter new price:");
                Scanner inputFour = new Scanner(System.in);
                Admin.getGamesArr().get(i).price = inputFour.nextInt();
                System.out.println("your game price changed!");
                gameModify(i);
                break;
            case 5:
                Admin admin = new Admin();
                admin.gameManage();
                break;
            default:
                break;
        }
    }
}
