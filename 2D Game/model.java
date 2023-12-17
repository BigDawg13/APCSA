import java.lang.String;


public class Model {
  
   public static String[][] board = {
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|M| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|P| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|s| ", "|t| ", "|u| ", "|d| ", "|y| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|h| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|a| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|l| ", "|o| ", "|u| ", "|n| ", "|g| ", "|e| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-|_", "|_|_", "|_|_", "|_|_", "|_|_", "|_|_", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|l| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|l| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|S| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D|_", "|_|_", "|_|_", "|_|_", "|_|_", "|_|_", "|-|"},
{"____", "____", "____", "____", "____", "__  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_|_", "|D|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|l| ", "|i| ", "|b| ", "|r| ", "|a| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " ___", "____", "____", "____", "__  ", " _  ", " _  ", " ___", "____", "____", "____", "____", "____", "____",  "____"},
{"|-| ", "|_| ", "|r| ", "|y| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|D| ", "|s| ", "|D| ", "|D| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|t| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|d| ", "|i| ", "|n| ", "|i| ", "|n| ", "|g| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-|_", "|_|_", "|_|_", "|_|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|a| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|r| ", "|o| ", "|o| ", "|m| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|i| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{"____", "____", "____", "____", "____", "__  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|b| ", "|i| ", "|l| ", "|l| ", "|i| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|r| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|a| ", "|r| ", "|d| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|s| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|r| ", "|o| ", "|o| ", "|m| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_|_", "|_|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_|_", "|_|_", "|_|_", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " ___", "____", "____", "____", "____", "____", "____", "__  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-|_", "|_|_", "|_|_", "|_|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " ___", "____", "____", "____", "____",  "____"},
{"|-| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|-|"},
{"____", "____", "____", "____", "__  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|D| ", "|_| ", "|b| ", "|a| ", "|l| ", "|l| ", "|_| ", "|D| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _|_", "__  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|c| ", "|o| ", "|n| ", "|s| ", "|e| ", "|_| ", "|_| ", "|_| ", "|_| ", "|r| ", "|o| ", "|o| ", "|m| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|k| ", "|i| ", "|t| ", "|c| ", "|h| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|r| ", "|v| ", "|a| ", "|t| ", "|o| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|e| ", "|n| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|_| ", "|r| ", "|y| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-|_", "|_|_", "|_|_", "|_|_", "|_|_", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|_| ", "|-|"},
{" _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _  ", " _| ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ", "|_  ", " _  ", " _  ", " _  ", " _  ",  " _  "},
{"|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-| ", "|-|"}
};


public Model() {}


public String[][] getBoard() { return board; }
public String getTile(int row, int col) { return board[row][col]; }


public String roomCheck(int row, int col) {


   if((row >= 3 && row <= 7) && (col >= 1 && col <= 6)) return "Study";
   else if((row >= 13 && row <= 21) && (col >= 1 && col <= 5)) return "Library";
   else if((row >=  25 && row <= 35) && (col >= 1 && col <= 5)) return "Billiard Room";
   else if((row >= 39 && row <= 47) && (col >= 1 && col <= 5)) return "Conservatory";
   else if((row >= 3 && row <= 13) && (col >= 10 && col <= 14)) return "Hall";
   else if((row >= 17 && row <= 29) && (col >= 10 && col <= 14)) return "Stairs";
   else if((row >= 35 && row <= 45) && (col >= 8 && col <= 15)) return "Ballroom";
   else if((row >= 35 && row <= 47) && (col >= 10 && col <= 13)) return "Ballroom";
   else if((row >= 3 && row <= 11) && (col >= 18 && col <= 23)) return "Lounge";
   else if((row >= 17 && row <= 27) && (col >= 17 && col <= 23)) return "Diningroom";
   else if((row >= 27 && row <= 47) && (col >= 20 && col <= 24)) return "Kitchen";
   else return "Outside";
}


public void replace(Player p, int row, int col) {
   String oTile = board[p.getRow()][p.getCol()];
   String nTile = board[row][col];


   String oTF = oTile.substring(0, 1); // Old Tile First
   String oTL = oTile.substring(2, 4);
   String nTF = nTile.substring(0, 1);
   String nTL = nTile.substring(2, 4);


  
   oTile = oTF + "_" + oTL;
   nTile = nTF + p.getCharName() + nTL;

    board[row][col] = nTile;
    board[p.getRow()][p.getCol()] = oTile;

   p.setRow(row);
   p.setCol(col);

}

}
