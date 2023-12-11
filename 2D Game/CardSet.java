import java.util.ArrayList;

public class CardSet {
    public ArrayList<Card> PlayerHand = new ArrayList<>();
    public ArrayList<Card> Deck = new ArrayList<>();

    public int findCardIndex(Card c, ArrayList<Card> set) {
        for(int i = 0;  i < set.size(); i++) {
            if(c.getName().equals(set.get(i).getName())) return i;
        }
        return -1;
    }
}