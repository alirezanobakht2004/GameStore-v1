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
                userManage();
                break;
            case 3:
                s.sign();
            default:
                break;
        }
    }

    public void gameManage() {
        System.out.println("\033[0;91m" + "game manage menu" + "\033[0m");
        System.out.println("1.create games");
        System.out.println("2.modify games or delete games");
        System.out.println("3.back");
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
        System.out.println("\nYour game has been succsessfully created!\n");
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
                    System.out.println("enter the index of the game you want to delete:");
                    int index1 = input.nextInt();
                    gamesArr.remove(index1);
                    System.out.println("\nYour game has been succsessfully deleted!\n");
                case 3:
                    gameManage();
                default:
                    break;
            }

        }
    }

    public void userManage() {
        System.out.println("\033[0;91m" + "user manage menu" + "\033[0m");
        System.out.println("1.show information of users");
        System.out.println("2.create a user");
        System.out.println("3.modify a user information");
        System.out.println("4.delete a user");
        System.out.println("5.back");
        Scanner input = new Scanner(System.in);
        int adminDes = input.nextInt();
        switch (adminDes) {
            case 1:

                break;
            case 2:
                createUser();
                break;
            case 3:

            case 4:

                break;
            case 5:
                startMenu();
            default:
                break;
        }
    }

    public void createUser() {
        System.out.println("\033[1;95m" + "create user menu" + "\u001B[0m");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")) {
            System.out.println("not correct password!");
            createUser();
        }
        System.out.println("Enter email:");
        String email = input.nextLine();
        System.out.println("Enter phonenumber");
        String phoneNumber = input.nextLine();

        User user = new User(username, password, phoneNumber, email);
        int count = 0;
        for (int i = 0; i < Sign.getUsersArr().size(); i++) {
            if (Sign.getUsersArr().get(i).getUsername().equals(user.getUsername())) {
                System.out.println("already taken username!");
                count++;
            }
        }
        if (count == 0) {
            Sign.getUsersArr().add(user);
            System.out.println("\naccount has been succesfully created!\n");
        }
        userManage();
    }

    public void searchUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[46m" + "Search user menu" + "\033[0m");
        System.out.println("how do you want to search user?");
        System.out.println("1.search by username");
        System.out.println("2.search by email");
        System.out.println("3.search by phone number");
        System.out.println("4.back");
        int in = input.nextInt();
        int count = 0;
        switch (in) {
            case 1:
                System.out.println("Enter username:");
                for (int i = 0; i < Sign.getUsersArr().size(); i++) {
                    if (Sign.getUsersArr().get(i).getUsername() == input.nextLine()) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("\nThere was no such a username!\n");
                }
                break;
            case 2:
                System.out.println("Enter email:");
                for (int i = 0; i < Sign.getUsersArr().size(); i++) {
                    if (Sign.getUsersArr().get(i).getEmail() == input.nextLine()) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("\nThere was no such a username!\n");
                }
                break;
            case 3:
                System.out.println("Enter phone number:");
                for (int i = 0; i < Sign.getUsersArr().size(); i++) {
                    if (Sign.getUsersArr().get(i).getPhoneNumber() == input.nextLine()) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("\nThere was no such a username!\n");
                }
                break;
            case 4:
                userManage();
                break;
            default:
                break;
        }
    }
}
