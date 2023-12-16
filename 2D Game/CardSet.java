import java.util.ArrayList;


public class CardSet extends Card{
   public ArrayList<Card> set = new ArrayList<>();


   public CardSet(ArrayList<Card> set) {
       this.set = set;
   }
   public CardSet() {}


   public int findCardIndex(Card c) {
       for(int i = 0;  i < set.size(); i++) {
           if(c.getName().equals(set.get(i).getName())) return i;
       }
       return -1;
   }
}
