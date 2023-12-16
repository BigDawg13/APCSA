public class View {
   Model mod;
   public View(Model mod) {
       this.mod = mod;
   }


   public void printBoard() {
       for(String[] line : mod.getBoard()) {
           System.out.println();
           for(String tile : line) {
               System.out.print(tile);
           }
       }
       System.out.println();
   }
   public Model getM() { return mod; }
}
