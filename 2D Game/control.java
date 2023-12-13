import java.util.Scanner;


public class Control extends Model {


   Model mod;
   public Control(Model mod) {}


   // Move & replace(bounds detection)
   public String Bounds(int row, int col, Model mod) {
       if(mod.getTile(row, col).contains("D")) return "Door";
       if(mod.getTile(row, col).contains("-")) return "Wall";
       int uC = 0;
       for(int i = 0; i < mod.getTile(row, col).length(); i++) {
           if(uC > 0 && mod.getTile(row, col).charAt(i) == '_') return "Wall";
           else if(uC == 0 && mod.getTile(row, col).charAt(i) == '_') uC++;
       }
       if(mod.getTile(row - 1, col).contains("|") || mod.getTile(row + 1, col).contains("|")) return "Wall";
       return "Valid";
   }


   public void move(Player p, int dir, int dis) {
       boolean done = false;
       while(!done) {
           switch(dir) {
               case 1:
               if(Bounds(p.getRow() - dis, p.getCol(), mod).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(Bounds(p.getRow() - dis, p.getCol(), mod).equals("Door")) {
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
               if(Bounds(p.getRow() + dis, p.getCol(), mod).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(Bounds(p.getRow() + dis, p.getCol(), mod).equals("Door")) {
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
               if(Bounds(p.getRow(), p.getCol() + dis, mod).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(Bounds(p.getRow(), p.getCol() + dis, mod).equals("Door")) {
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
               if(Bounds(p.getRow(), p.getCol() - dis, mod).equals("Wall")) System.out.println("Invalid Movement - Try Again");
               else if(Bounds(p.getRow(), p.getCol() - dis, mod).equals("Door")) {
                   p.setRoomIn(mod.roomCheck(p.getRow(), p.getCol() - dis));
                   mod.replace(p, p.getRow(), p.getCol() - dis);
                   done = true;
               }
               else {
                   p.replace(p, p.getRow(), p.getCol() - dis);
                   done = true;
               }
               break;
               default:
               System.out.println("Invalid Input - Try Again");
           }
       }
   }
  
   // Guess
   public void Guess(Player p1, Player p2, Player p3, Card character, Card room, Card weapon) {
       while(true) {
           if(room.getName() != p1.getRoomIn()) System.out.println("\n" + "YOU HAVE TO GUESS WHAT ROOM YOU ARE IN" + "\n");
           else break;
       }
       if(p2.findCardIndex(character) != -1) System.out.println(p2.getCharName() + " has " + character.getName());
       if(p2.findCardIndex(room) != -1) System.out.println(p2.getCharName() + " has " + room.getName());
       if(p2.findCardIndex(weapon) != -1) System.out.println(p2.getCharName() + " has " + weapon.getName());


       if(p3.findCardIndex(character) != -1) System.out.println(p3.getCharName() + " has " + character.getName());
       if(p3.findCardIndex(room) != -1) System.out.println(p3.getCharName() + " has " + room.getName());
       if(p3.findCardIndex(weapon) != -1) System.out.println(p3.getCharName() + " has " + weapon.getName());


      
       System.out.println();


   }
   // Choose card to show
   // Accuse
   public boolean Accuse(Player p, Card character, Card room, Card weapon) {
       System.out.println("Enter Character: ");
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



