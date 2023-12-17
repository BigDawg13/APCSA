import java.util.Scanner;
import java.lang.Math;


public class Control extends Model {


   Model mod;
   public Control(Model mod) {
    this.mod = mod;
   }


   // Move & replace(bounds detection)board
   public String BoundsLat(int row, int col, Model mod, Player p) { // Bounds Detection for lateral movement only
       if(row < 0 || row > 49 || col > 24 || col < 0 || row % 2 == 0) return "Wall";

       for(int i = 0; i < Math.abs(row - p.getRow()); i += 2) {
        if(row - p.getRow() < 0) {
            if(mod.getTile(p.getRow() - i, col).contains("D")) return "Door";
            if(mod.getTile(p.getRow() - i, col).contains("-")) return "Wall";
            int uC = 0;
        for(int j = 0; j < mod.getTile(p.getRow() - i, col).length(); j++) {
            if(uC > 0 && mod.getTile(p.getRow() - i, col).charAt(j) == '_') return "Wall";
            else if(uC == 0 && mod.getTile(p.getRow() - i, col).charAt(j) == '_') uC++;
        }
        }
        else {
            if(mod.getTile(p.getRow() + i, col).contains("D")) return "Door";
            if(mod.getTile(p.getRow() + i, col).contains("-")) return "Wall";
            int uC = 0;
        for(int j = 0; j < mod.getTile(p.getRow() + i, col).length(); j++) {
            if(uC > 0 && mod.getTile(p.getRow() + i, col).charAt(j) == '_') return "Wall";
            else if(uC == 0 && mod.getTile(p.getRow() + i, col).charAt(j) == '_') uC++;
        }
            
        }
       }
       return "Valid";
   }

   public String BoundsLong(int row, int col, Model mod, Player p) { // Bounds Detection for longitudinal movement only
    if(row < 0 || row > 49 || col > 24 || col < 0 || row % 2 == 0) return "Wall";
       for(int i = 0; i < Math.abs(col - p.getCol()); i++) {
        if(col-p.getCol() < 0) {
            if(mod.getTile(row, p.getCol() - i).contains("D")) return "Door";
            if(mod.getTile(row, p.getCol() - i).contains("-")) return "Wall";
            if(mod.getTile(row - 1, p.getCol() - i).contains("|") || mod.getTile(row + 1, p.getCol() - i).contains("|")) return "Wall";
        }
        else {
            if(mod.getTile(row, p.getCol() + i).contains("D")) return "Door";
            if(mod.getTile(row, p.getCol() + i).contains("-")) return "Wall";
            if(mod.getTile(row - 1, p.getCol() + i).contains("|") || mod.getTile(row + 1, p.getCol() + i).contains("|")) return "Wall";
        }
       }
    return "Valid";
}


   public void move(Player p, int dis) {
       boolean done = false;
       while(!done) {
        Scanner scanner = new Scanner(System.in);
        int dir = scanner.nextInt();
           switch(dir) {
               case 1:
               if(BoundsLat(p.getRow() - dis, p.getCol(), mod, p).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(BoundsLat(p.getRow() - dis, p.getCol(), mod, p).equals("Door")) {
                   p.setRoomIn(mod.roomCheck(p.getRow() - dis, p.getCol()));
                   mod.replace(p, p.getRow() - dis, p.getCol());
                   done = true;
               }
               else {
                   p.replace(p, p.getRow() - dis, p.getCol());
                   done = true;
               }
               break;
               case 2:
               if(BoundsLat(p.getRow() + dis, p.getCol(), mod, p).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(BoundsLat(p.getRow() + dis, p.getCol(), mod, p).equals("Door")) {
                   p.setRoomIn(mod.roomCheck(p.getRow() + dis, p.getCol()));
                   mod.replace(p, p.getRow() + dis, p.getCol());
                   done = true;
               }
               else {
                   p.replace(p, p.getRow() + dis, p.getCol());
                   done = true;
               }
               break;
               case 3:
               dis /= 2;
               if(BoundsLong(p.getRow(), p.getCol() + dis, mod, p).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(BoundsLong(p.getRow(), p.getCol() + dis, mod, p).equals("Door")) {
                   p.setRoomIn(mod.roomCheck(p.getRow(), p.getCol() + dis));
                   mod.replace(p, p.getRow(), p.getCol() + dis);
                   done = true;
               }
               else {
                   p.replace(p, p.getRow(), p.getCol() + dis);
                   done = true;
               }
               break;
               case 4:
               dis /= 2;
               if(BoundsLong(p.getRow(), p.getCol() - dis, mod, p).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(BoundsLong(p.getRow(), p.getCol() - dis, mod, p).equals("Door")) {
                   p.setRoomIn(mod.roomCheck(p.getRow(), p.getCol() - dis));
                   mod.replace(p, p.getRow(), p.getCol() - dis);
                   done = true;
               }
               else {
                   p.replace(p, p.getRow(), p.getCol() - dis);
                   done = true;
               }
               break;
               case 5: 
               System.out.println("\n No Move :( \n");
               done = true;
               default:
               System.out.println("Invalid Input - Try Again");
           }
       }
   }
  
   // Guess
   public void Guess(Player p1, Player p2, Player p3, Card character, Card room, Card weapon) {
       /*while(true) {
           if(room.getName() != p1.getRoomIn()) {
            System.out.println("\n" + "YOU HAVE TO GUESS WHAT ROOM YOU ARE IN" + "\n");
            break;
            }
       }*/
       System.out.println("You Guessed " + character.getName() + " in the " + room.getName() + " with the " + weapon.getName() + "\n");
       if(p2.getHand().contains(character)) System.out.println(p2.getCharName() + " has " + character.getName());
       else if(p2.getHand().contains(room)) System.out.println(p2.getCharName() + " has " + room.getName());
       else if(p2.getHand().contains(weapon)) System.out.println(p2.getCharName() + " has " + weapon.getName());


       if(p3.getHand().contains(character)) System.out.println(p3.getCharName() + " has " + character.getName());
       else if(p3.getHand().contains(room)) System.out.println(p3.getCharName() + " has " + room.getName());
       else if(p3.getHand().contains(weapon)) System.out.println(p3.getCharName() + " has " + weapon.getName());


      
       System.out.println();


   }
   // Choose card to show
   // Accuse
   public boolean Accuse(Player p, Card character, Card room, Card weapon) {
       System.out.println("Enter Character: \n");
       Scanner scanner = new Scanner(System.in);
       String charIn = scanner.nextLine();


       System.out.println("Enter Room: ");
       Scanner scanner1 = new Scanner(System.in);
       String roomIn = scanner1.nextLine();


       System.out.println("Enter Weapon: ");
       Scanner scanner2 = new Scanner(System.in);
       String weaponIn = scanner2.nextLine();


       if(charIn.equals(character.getName()) && roomIn.equals(room.getName()) && weaponIn.equals(weapon.getName())) return true;
       return false;
   }

}
