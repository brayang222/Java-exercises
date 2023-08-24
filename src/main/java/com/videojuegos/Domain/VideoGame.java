package com.videojuegos.Domain;

public class VideoGame {
    private int cod;
    private String title;
    private String platform;
    private int cantGamers;
    private String category;

    public VideoGame(){

    }

    public VideoGame(int cod, String title, String platform, int cantGamers, String category) {
        this.cod = cod;
        this.title = title;
        this.platform = platform;
        this.cantGamers = cantGamers;
        this.category = category;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getCantGamers() {
        return cantGamers;
    }

    public void setCantGamers(int cantGamers) {
        this.cantGamers = cantGamers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "cod=" + cod +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", cantGamers=" + cantGamers +
                ", category='" + category + '\'' +
                '}';
    }
}
