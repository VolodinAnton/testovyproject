package com.company.MultithreadingQuest.Hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() {
        for (int i = 0; i < 130; i++) {
            move();
            print();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void move() {
        for (Horse horse : horses
        ) {
            horse.move();
        }
    }

    void print() {
        for (Horse horse : horses
        ) {
            horse.print();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse : getHorses()
        ) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.distance;
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " +  getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<Horse> ();
        horses.add(new Horse("Loshad1", 3, 0));
        horses.add(new Horse("Loshad2", 3, 0));
        horses.add(new Horse("Loshad3", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }


}
