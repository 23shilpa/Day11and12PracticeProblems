package deckofcards;

public class Card {
    private int Numbers,Colours;
    private static String[] Colour = { "Hearts", "Spades", "Diamonds", "Clubs"};
    private static String[] Number  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knave", "Queen", "King" };
    Card(int Cardcolors, int Cardnumber) {
        this.Numbers = Cardnumber;
        this.Colours = Cardcolors;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getNumbers() {
        return Numbers;
    }

    public static String[] getColour() {
        return Colour;
    }
}
