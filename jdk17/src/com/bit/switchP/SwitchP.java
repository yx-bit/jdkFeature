package com.bit.switchP;

import java.util.Random;

public class SwitchP {
    public static void main(String[] args) {
        var level = new Random().nextInt(2);
        var name = "";
        switch (level) {
            case 1-> name="1";
            case 2,3->name="2";
            default-> name = "3";
        }

        var name2 = switch (level){
            case 1->{
                System.out.println(1);
                yield "1";
            }
            case 2,3->{
                System.out.println();
                yield "2";
            }
            default -> throw new IllegalStateException("Unexpected value: " + level);
        };
    }
}
