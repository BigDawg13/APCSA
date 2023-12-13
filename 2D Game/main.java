public class Main {
   public static void main(String[] args) {
       Model m = new Model();
       View v = new View(m);
       v.printBoard();




       Player MustardP = new Player();
       Player ScarletP = new Player();
       Player PlumP = new Player();


       Card mustard = new Card("Character", "Mustard");
       Card scarlet = new Card("Character", "Scarlet");
       Card peacock = new Card("Character", "Peacock");
       Card plum = new Card("Character", "Plum");
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


   }
}
