package ir.ac.kntu;

import java.util.ArrayList;

public class Main {

    private static Admin admin;

    private ArrayList<Game> gamesArr = new ArrayList<Game>();



    public ArrayList<Game> getGamesArr() {
        return gamesArr;
    }

    public static Admin getAdmin() {
        return admin;
    }

    public static void main(String[] args) {
        Sign start = new Sign();
        start.sign();

    }

}