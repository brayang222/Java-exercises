package com.videojuegos.App;

import com.videojuegos.Domain.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<VideoGame> videoGameList = new ArrayList<VideoGame>();

        VideoGame videoGame1 = new VideoGame(1, "God of War", "PlayStation 4",
                1000, "Gods");
        VideoGame videoGame2 = new VideoGame(2, "Need for speed", "PlayStation 5",
                500, "careers");
        VideoGame videoGame3 = new VideoGame(2, "Mario", "nintendo",
                700, "puzzle");
        VideoGame videoGame4 = new VideoGame(2, "Counter Strike", "Pc",
                500, "shooter");
        VideoGame videoGame5 = new VideoGame(2, "Battle Bit", "Pc",
                500, "shooter cartoon");

        videoGameList.add(videoGame1);
        videoGameList.add(videoGame2);
        videoGameList.add(videoGame3);
        videoGameList.add(videoGame4);
        videoGameList.add(videoGame5);

        for (VideoGame video : videoGameList){
            System.out.println("Título: " + video.getTitle());
            System.out.println("Plataforma: " + video.getPlatform());
            System.out.println("Cant jugadores: " + video.getCantGamers());
        }

        videoGame5.setTitle("Operation 7");
        videoGame5.setCantGamers(5000);

        videoGame3.setTitle("Super Mario");
        videoGame3.setCantGamers(4);

        System.out.println("Solo juegos de pc");
        for (VideoGame video : videoGameList){
            if (video.getPlatform().equals("Pc")){
                System.out.println(video);
            }
        }

    }
}
