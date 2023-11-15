package org.example.bottles;

public class BottleSong {

    public String song() {
        return verses(99, 0);
    }
    public String verses(int initialVerse, int finalVerse) {
        StringBuilder builder = new StringBuilder();
        for (int i = initialVerse; i >= finalVerse; i--) {
            if (i == 0) {
                builder.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bopttles of beer on the wall.");
            } else {
                String v1 = defineBottles(i);
                String v2 = defineBottles(i-1);
                builder.append(String.format("%s on the wall, %s.\nTake it down and pass it around, %s on the wall", v1, v1, v2));
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    private String defineBottles(int i) {
        if(i == 0) {
            return "No more bottles of beer";
        }
        if(i == 1) {
            return "1 bottle of beer";
        }

        return String.format("%s bottles of beer", i);
    }

    public static void main(String[] args) {
        BottleSong song = new BottleSong();
        System.out.println(song.song());
    }
}
