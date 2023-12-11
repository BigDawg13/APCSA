public class Card  extends CardSet{
    public String type;
    public String name;
    
    Card(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() { return name; }
}
