import java.util.ArrayList;


public class Player extends Model {


   int row;
   int col;
   String charName;
   String roomIn;
   public ArrayList<Card> hand = new ArrayList<>();


   public Player(String charName, String roomIn) {
       this.charName = charName;
       this.roomIn = roomIn;
   }
   public Player() {}


   public int getRow() { return row; }
   public int getCol() { return col; }
   public String getRoomIn() { return roomIn; }
   public String getCharName() { return charName; }
   public String getHandString() {
    String sum = "";
    for(int i = 0; i < hand.size(); i++) {
        sum = sum + hand.get(i).getName() + ", ";
    }
    return sum;
   }

   public ArrayList<Card> getHand() { return hand; }


   public void setRow(int n) { row = n; }
   public void setCol(int n) { col = n; }
   public void setRoomIn(String n) { roomIn = n; }


   public int findCardIndex(Card c) {
       for(int i = 0;  i < hand.size(); i++) {
           if(c.getName().equals(hand.get(i).getName())) return i;
           System.out.println("ACTIVATION");
       }
       return -1;
   }
}
