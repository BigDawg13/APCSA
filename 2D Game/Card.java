public class Card {
    public String type;
    public String name;
   
    Card(String type, String name) {
        this.type = type;
        this.name = name;
    }
    Card(){}
    public String getName() { return name; }
    public String getType() { return type; }
 }
