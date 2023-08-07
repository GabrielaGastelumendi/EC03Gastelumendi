package com.gastelumendi.ec03.model;

public class Menu extends Platos {
    private int menu;


    public Menu(String name, String imgUrl, int season) {
        super(name, imgUrl);
        this.menu = season;
    }

    public int getSeason() {
        return menu;
    }

    public void setSeason(int season) {
        this.menu = season;
    }
}
