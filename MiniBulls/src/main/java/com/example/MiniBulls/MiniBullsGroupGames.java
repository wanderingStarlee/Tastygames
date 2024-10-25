package com.example.MiniBulls;

public class MiniBullsGroupGames {
    private String nameGame;
    private String studioGame;
    private String raitingGame;
    private String lowPriceGame;


    public MiniBullsGroupGames (String nameGame, String studioGame, String raitingGame, String lowPriceGame) {
        this.nameGame = nameGame;
        this.studioGame= studioGame;
        this.raitingGame = raitingGame;
        this.lowPriceGame = lowPriceGame;
    }

    public String getText() {
        return nameGame;
    }

    public void setText(String nameGame) {
        this.nameGame = nameGame;
    }

    public String getSign() {
        return studioGame;
    }

    public void setSign(String studioGame) {
        this.studioGame = studioGame;
    }

    public String getDate() {
        return raitingGame;
    }

    public void setDate(String raitingGame) {
        this.raitingGame = raitingGame;
    }

    public String getType() {
        return lowPriceGame;
    }

    public void setType(String lowPriceGame) {
        this.lowPriceGame = lowPriceGame;
    }
}