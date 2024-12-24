package war.cardgame;

public class Card {

	private int value; // 2-14 representing cards 2-Ace
    private String name; // e.g., Ace of Diamonds, Two of Hearts

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " (Value: " + value + ")");
    }
}
