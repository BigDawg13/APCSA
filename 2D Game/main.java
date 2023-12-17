import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Model m = new Model();
       View v = new View(m);
       Control c = new Control(m);
       v.printBoard();




       Player MustardP = new Player("M", "Outside");
       Player ScarletP = new Player("S", "Outside");
       Player PlumP = new Player("P", "Outside");

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


       ArrayList<Card> ENDGAME = new ArrayList<>();

       // Create a large ArrayList of Card objects
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(mustard);
        deck.add(peacock);
        deck.add(green);
        deck.add(white);
        deck.add(scarlet);
        int rand1 = (int)(Math.random() * 5);
        int randC = rand1;
        ENDGAME.add(deck.get(randC));

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
        int rand2 = (int)(Math.random() * 11) + 4;
        int randR = rand2;
        ENDGAME.add(deck.get(randR));

        deck.add(candlestick);
        deck.add(dagger);
        deck.add(revolver);
        deck.add(wrench);
        deck.add(rope);
        int rand3 = (int)(Math.random() * 5) + 14;
        int randW = rand3;
        ENDGAME.add(deck.get(randW));

        // Shuffle the large ArrayList
        Collections.shuffle(deck);


        CardSet d = new CardSet(deck);
        // Declare and initialize ArrayLists with the specified fashion

        // Distribute cards into three ArrayLists
        distributeCards(deck, MustardP.getHand(), ScarletP.getHand(), PlumP.getHand());

        

        // Print the results
        System.out.println("Mustard Hand: " + MustardP.getHandString());
        System.out.println("Scarlet Hand: " + ScarletP.getHandString());
        System.out.println("Plum Hand: " + PlumP.getHandString());

        wait(5);

    boolean done = false;
    wait(2);
    clear();
   while(!done) {
    
    //Mustard
    clear();
    v.printBoard();
    System.out.println("MUSTARDS TURN \n");
    System.out.println("Mustard Hand: " + MustardP.getHandString());

    int rand = (int)(Math.random() * 6) % 6 + 1;
    int r = rand * 2;
    System.out.println();
    System.out.println();
    System.out.println("Pick What To Do: \n");
    System.out.println("1 - Move");
    if(MustardP.getRoomIn() != "Outside") System.out.println("2 - Guess");
    if(MustardP.getRoomIn().equals("Stairs")) System.out.println("3 - Accuse");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    switch(choice) {
        case 1:
            clear();
            v.printBoard();
            System.out.println("You rolled a " + r/2 + "! - " + "Choose direction to move: \n");
            System.out.println("1 - Up");
            System.out.println("2 - Down");
            System.out.println("3 - Right");
            System.out.println("4 - Left");
            System.out.println("5 - No Move");
            c.move(MustardP, r);
            clear();
            v.printBoard();
            break;
        case 2:
            System.out.println("Mustard Hand: " + MustardP.getHandString());
            System.out.println("Pick the Number that Corrosponds to the Card in the Deck above (ex. First card = 1): \n");
            System.out.println(d.getSetString() + "\n\n");
            System.out.println("Pick a Character Card: \n");
            Scanner scanner1 = new Scanner(System.in);
            int charIndex = scanner1.nextInt();
            System.out.println("Pick a Room Card: \n");
            Scanner scanner2 = new Scanner(System.in);
            int roomIndex = scanner2.nextInt();
            System.out.println("Pick a Weapon Card: \n");
            Scanner scanner3 = new Scanner(System.in);
            int weaponIndex = scanner3.nextInt();
            c.Guess(MustardP, ScarletP, PlumP, d.getHand().get(charIndex - 1), d.getHand().get(roomIndex - 1), d.getHand().get(weaponIndex - 1));

            if(ScarletP.getHand().contains(deck.get(charIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(ScarletP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(ScarletP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(charIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());

            wait(5);
            System.out.println(MustardP.getHandString());
            wait(5);
        break;
        case 3:
        System.out.println("Mustard Hand: " + MustardP.getHandString());
        if(c.Accuse(PlumP, ENDGAME.get(0), ENDGAME.get(1), ENDGAME.get(2))) {
            System.out.println("Prof. Plum Wins!");
            done = true;
        }
        else System.out.println("WRONG GUESS - HUGE L");
        wait(5);
        break;
        default:
        System.out.println("Invalid Input - Turn Lost");
    }




    //Scarlet
    clear();
    v.printBoard();
    System.out.println("SCARLETS TURN \n");
    System.out.println("Scarlet Hand: " + ScarletP.getHandString());

    int randS = (int)(Math.random() * 6) % 6 + 1;
    int rS = randS * 2;
    System.out.println();
    System.out.println();
    System.out.println("Pick What To Do: \n");
    System.out.println("1 - Move");
    if(ScarletP.getRoomIn() != "Outside") System.out.println("2 - Guess");
    if(ScarletP.getRoomIn().equals("Stairs")) System.out.println("3 - Accuse");
    Scanner scannerS = new Scanner(System.in);
    int choiceS = scannerS.nextInt();
    switch(choiceS) {
        case 1:
            clear();
            v.printBoard();
            System.out.println("Scarlet Hand: " + ScarletP.getHandString());
            System.out.println("You rolled a " + rS/2 + "! - " + "Choose direction to move: \n");
            System.out.println("1 - Up");
            System.out.println("2 - Down");
            System.out.println("3 - Right");
            System.out.println("4 - Left");
            System.out.println("5 - No Move");
            c.move(ScarletP, rS);
            clear();
            v.printBoard();
            break;
        case 2:
            System.out.println("Scarlet Hand: " + ScarletP.getHandString());
            System.out.println("Pick the Number that Corrosponds to the Card in the Deck above (ex. First card = 1): \n");
            System.out.println(d.getSetString() + "\n\n");
            System.out.println("Pick a Character Card: \n");
            Scanner scanner1 = new Scanner(System.in);
            int charIndex = scanner1.nextInt();
            System.out.println("Pick a Room Card: \n");
            Scanner scanner2 = new Scanner(System.in);
            int roomIndex = scanner2.nextInt();
            System.out.println("Pick a Weapon Card: \n");
            Scanner scanner3 = new Scanner(System.in);
            int weaponIndex = scanner3.nextInt();
            c.Guess(MustardP, ScarletP, PlumP, d.getHand().get(charIndex - 1), d.getHand().get(roomIndex - 1), d.getHand().get(weaponIndex - 1));

            if(MustardP.getHand().contains(deck.get(charIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(MustardP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(MustardP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(charIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(PlumP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(PlumP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());

            wait(5);
        break;
        case 3:
        System.out.println("Scarlet Hand: " + ScarletP.getHandString());
        if(c.Accuse(PlumP, ENDGAME.get(0), ENDGAME.get(1), ENDGAME.get(2))) {
            System.out.println("Prof. Plum Wins!");
            done = true;
        }
        else System.out.println("WRONG GUESS - HUGE L");
        wait(5);
        break;
        default:
        System.out.println("Invalid Input - Turn Lost");
    }
    // Plum
    clear();
    v.printBoard();
    System.out.println("PLUMS TURN \n");
    System.out.println("Plum Hand: " + PlumP.getHandString());

    int randP = (int)(Math.random() * 6) % 6 + 1;
    int rP = randP * 2;
    System.out.println();
    System.out.println();
    System.out.println("Pick What To Do: \n");
    System.out.println("1 - Move");
    if(PlumP.getRoomIn() != "Outside") System.out.println("2 - Guess");
    if(PlumP.getRoomIn().equals("Stairs")) System.out.println("3 - Accuse");
    Scanner scannerP = new Scanner(System.in);
    int choiceP = scannerP.nextInt();
    switch(choiceP) {
        case 1:
            clear();
            v.printBoard();
            System.out.println("Plum Hand: " + PlumP.getHandString());
            System.out.println("You rolled a " + rP/2 + "! - " + "Choose direction to move: \n");
            System.out.println("1 - Up");
            System.out.println("2 - Down");
            System.out.println("3 - Right");
            System.out.println("4 - Left");
            System.out.println("5 - No Move");
            c.move(PlumP, rP);
            clear();
            v.printBoard();
            break;
        case 2:
            System.out.println("Plum Hand: " + PlumP.getHandString());
            System.out.println("Pick the Number that Corrosponds to the Card in the Deck above (ex. First card = 1): \n");
            System.out.println(d.getSetString() + "\n\n");
            System.out.println("Pick a Character Card: \n");
            Scanner scanner1 = new Scanner(System.in);
            int charIndex = scanner1.nextInt();
            System.out.println("Pick a Room Card: \n");
            Scanner scanner2 = new Scanner(System.in);
            int roomIndex = scanner2.nextInt();
            System.out.println("Pick a Weapon Card: \n");
            Scanner scanner3 = new Scanner(System.in);
            int weaponIndex = scanner3.nextInt();
            c.Guess(MustardP, ScarletP, PlumP, d.getHand().get(charIndex - 1), d.getHand().get(roomIndex - 1), d.getHand().get(weaponIndex - 1));

            if(MustardP.getHand().contains(deck.get(charIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(MustardP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(MustardP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(MustardP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());
            if(ScarletP.getHand().contains(deck.get(charIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(charIndex - 1).getName());
            if(ScarletP.getHand().contains(deck.get(roomIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(roomIndex - 1).getName());
            if(ScarletP.getHand().contains(deck.get(weaponIndex - 1))) System.out.println(ScarletP.getCharName() + " has " + deck.get(weaponIndex - 1).getName());

            wait(5);
        break;
        case 3:
        System.out.println("Plum Hand: " + PlumP.getHandString());
        if(c.Accuse(PlumP, ENDGAME.get(0), ENDGAME.get(1), ENDGAME.get(2))) {
            System.out.println("Prof. Plum Wins!");
            done = true;
        }
        else System.out.println("WRONG GUESS - HUGE L");
        wait(5);
        break;
        default:
        System.out.println("Invalid Input - Turn Lost");
    }

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
