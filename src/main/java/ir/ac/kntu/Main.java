package ir.ac.kntu;

import java.util.ArrayList;

public class Main {

    private ArrayList<Game> gamesArr = new ArrayList<Game>();

    public ArrayList<Game> getGamesArr() {
        return gamesArr;
    }

    public static void main(String[] args) {
        Sign start = new Sign();
        start.sign();

    }

}