public class Control {

    public Control() {}

    // Move & replace(bounds detection)
    public String Bounds(String tile, Model mod) {
        if(tile.contains("D")) return "Door";
        if(tile.contains("-")) return "Wall";
        int pC = 0;
        int uC = 0;
        for(int i = 0; i < tile.length(); i++) {
            if(pC > 0 && tile.charAt(i) == '|') return "Wall";
            else if(uC > 0 && tile.charAt(i) == '_') return "Wall";
            
        }
        return "Valid";
    }

    public String getRoomAt() {

    }
    // Guess
    // Choose card to show
    // Accuse


}