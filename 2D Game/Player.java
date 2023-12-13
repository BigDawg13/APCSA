import java.util.ArrayList;


public class Player extends Model {


   int row;
   int col;
   char charName;
   String roomIn;
   public ArrayList<Card> hand = new ArrayList<>();


   public Player(char charName) {
       this.charName = charName;
   }
   public Player() {}


   public int getRow() { return row; }
   public int getCol() { return col; }
   public String getRoomIn() { return roomIn; }
   public char getCharName() { return charName; }


   public void setRow(int n) { row = n; }
   public void setCol(int n) { col = n; }
   public void setRoomIn(String n) { roomIn = n; }


   public int findCardIndex(Card c) {
       for(int i = 0;  i < hand.size(); i++) {
           if(c.getName().equals(hand.get(i).getName())) return i;
       }
       return -1;
   }
}
