import java.util.*;

public class Main {
    // Card class to store card details
  static class Card {
        String symbol;
        int number;

        public Card(String symbol, int number) {
            this.symbol = symbol;
            this.number = number;
        }

        @Override
        public String toString() {
            return symbol + " " + number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cards:");
        int n = Integer.parseInt(scanner.nextLine());

// Map to store symbols as keys and lists of cards as values
        Map<String, List<Card>> cardsMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter card " + (i + 1) + " symbol:");
            String symbol = scanner.nextLine();
            System.out.println("Enter card " + (i + 1) + " number:");
            int number = Integer.parseInt(scanner.nextLine());

            //Card card = new Card(symbol, number);
            Main.Card card = new Main.Card("Hearts", 5);

// Add the card to the map, grouped by symbol
            cardsMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
        }

// Print the card details grouped by their symbol
        for (String symbol : cardsMap.keySet()) {
            List<Card> cards = cardsMap.get(symbol);
            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;
            for (Card card : cards) {
                System.out.println(card.symbol + " " + card.number);
                sum += card.number;
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of numbers : " + sum);
        }
    }
}

