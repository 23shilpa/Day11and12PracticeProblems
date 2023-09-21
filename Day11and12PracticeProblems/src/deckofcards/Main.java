package deckofcards;

import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);
    public int GetInput(){
        System.out.println("How many cards would you like to draw?");
        String p = s.nextLine();
        int y = Integer.parseInt(p);
        return y;
    }

    public static void main(String[] args) {
        Deck d = new Deck();

        Card C;

        while (d.getTotalCards()!= 0 ){
            C = d.drawFromDeck();
            System.out.println( C.toString() );
        }
    }
}
