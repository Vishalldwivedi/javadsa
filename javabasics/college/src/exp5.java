import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exp5 {

    public static  class CardGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<Card> cards = new HashSet<>();
            while (cards.size() < 4) {
                System.out.println("Enter card symbol and number:");
                String symbol = scanner.next();
                int number = scanner.nextInt();
                cards.add(new Card(symbol, number));
            }
            TreeSet<Card> sortedCards = new TreeSet<>((card1, card2) ->
                    card1.getSymbol().compareTo(card2.getSymbol()));
            sortedCards.addAll(cards);
            System.out.println("Unique cards in alphabetical order:");
            for (Card card : sortedCards) {
                System.out.println(card);
            }
        }
        static class Card {
            private String symbol;
            private int number;
            public Card(String symbol, int number) {
                this.symbol = symbol;
                this.number = number;
            }
            public String getSymbol() {
                return symbol;
            }
            public int getNumber() {
                return number;
            }
            @Override
            public String toString() {
                return "Symbol: " + symbol + ", Number: " + number;
            }
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Card card = (Card) o;
                return symbol.equals(card.symbol);
            }
            @Override
            public int hashCode() {
                return symbol.hashCode();
            }
        }
    }
}
