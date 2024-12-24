package war.cardgame;

public class App {

	public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.print("Round " + (i + 1) + ": ");
            card1.describe();
            System.out.print(" vs ");
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                System.out.println("Player 1 wins this round!");
                player1.incrementScore();
            } else if (card1.getValue() < card2.getValue()) {
                System.out.println("Player 2 wins this round!");
                player2.incrementScore();
            } else {
                System.out.println("It's a tie! No points awarded.");
            }

            System.out.println("Current Score: Player 1 - " + player1.getScore() + ", Player 2 - " + player2.getScore() + "\n");
        }

        System.out.println("Final Score:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 is the winner!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 is the winner!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
