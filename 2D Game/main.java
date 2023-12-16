import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Model m = new Model();
       View v = new View(m);
       Control c = new Control(m);
       v.printBoard();




       Player MustardP = new Player("M");
       Player ScarletP = new Player("S");
       Player PlumP = new Player("P");

       MustardP.setRow(1);
       MustardP.setCol(7);

       ScarletP.setRow(11);
       ScarletP.setCol(0);

       PlumP.setRow(1);
       PlumP.setCol(17);



       Card mustard = new Card("Character", "Mustard");
       Card scarlet = new Card("Character", "Scarlet");
       Card peacock = new Card("Character", "Peacock");
       Card white = new Card("Character", "White");
       Card green = new Card("Character", "Green");


       Card study = new Card("Room", "Study");
       Card library = new Card("Room", "Library");
       Card billiard_room = new Card("Room", "Billiard Room");
       Card conservatory = new Card("Room", "Conservatory");
       Card hall = new Card("Room", "Hall");
       Card stairs = new Card("Room", "Stairs");
       Card ballroom = new Card("Room", "Ballroom");
       Card lounge = new Card("Room", "Lounge");
       Card dining_room = new Card("Room", "Dining Room");
       Card kitchen = new Card("Room", "Kitchen");


       Card candlestick = new Card("Weapon", "Candlestick");
       Card dagger = new Card("Weapon", "Dagger");
       Card revolver = new Card("Weapon", "Revolver");
       Card wrench = new Card("Weapon", "Wrench");
       Card rope = new Card("Weapon", "Rope");


       // Create a large ArrayList of Card objects
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(mustard);
        deck.add(peacock);
        deck.add(green);
        deck.add(white);
        deck.add(scarlet);
        deck.add(study);
        deck.add(library);
        deck.add(billiard_room);
        deck.add(hall);
        deck.add(ballroom);
        deck.add(conservatory);
        deck.add(kitchen);
        deck.add(stairs);
        deck.add(lounge);
        deck.add(dining_room);
        deck.add(candlestick);
        deck.add(dagger);
        deck.add(revolver);
        deck.add(wrench);
        deck.add(rope);

        // Shuffle the large ArrayList
        Collections.shuffle(deck);

        // Declare and initialize ArrayLists with the specified fashion

        // Distribute cards into three ArrayLists
        distributeCards(deck, MustardP.getHand(), ScarletP.getHand(), PlumP.getHand());

        // Print the results
        System.out.println("Mustard Hand: " + MustardP.getHandString());
        System.out.println("Scarlet Hand: " + ScarletP.getHandString());
        System.out.println("Plum Hand: " + PlumP.getHandString());


    boolean done = false;
    wait(3);
    clear();
   while(!done) {
    
    //Mustard
    int rand = (int)(Math.random() * 6) % 6 + 1;
    int r = rand;
    System.out.println();
    System.out.println();
    System.out.println("You rolled a " + r + "! - " + "Choose direction to move");
    System.out.println("1 - Up");
    System.out.println("2 - Down");
    System.out.println("3 - Right");
    System.out.println("4 - Left");

    Scanner scanner = new Scanner(System.in);
    int dir = scanner.nextInt();

    System.out.println(m.getTile(MustardP.getRow() + r, MustardP.getCol()));
    c.move(MustardP, dir, r);



    //Scarlet

    //Plum

   }


    }

    private static void distributeCards(ArrayList<Card> largeCardList, ArrayList<Card> list1, ArrayList<Card> list2, ArrayList<Card> list3) {
        int totalCards = largeCardList.size();
        int cardsPerList = totalCards / 3;

        for (int i = 0; i < totalCards; i++) {
            Card card = largeCardList.get(i);

            if (i < cardsPerList) {
                list1.add(card);
            } else if (i < 2 * cardsPerList) {
                list2.add(card);
            } else {
                list3.add(card);
            }
        }
   }

   public static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
   }
   public static void wait(int s) {
    try {
        Thread.sleep(s * 1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      
   }

}