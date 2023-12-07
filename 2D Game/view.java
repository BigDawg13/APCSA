public class view {
    model mod = new model();
    view(model mod) {
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
}
