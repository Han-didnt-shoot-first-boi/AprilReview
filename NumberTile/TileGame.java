import java.util.ArrayList;

public class TileGame
{
  /** represents the game board; guaranteed never to be null */
  private ArrayList<NumberTile> board;

  public TileGame()
  { board = new ArrayList<NumberTile>(); }

  /** Determines where to insert tile, in its current orientation, into game board
   *  @param tile the tile to be placed on the game board
   *  @return the position of tile where tile is to be inserted:
   *           0 if the board is empty;
   *          -1 if tile does not fit in front, at end, 
   *             or between any existing tiles;
   *          otherwise, 0 = position returned = board.size()
   */
  private int getIndexForFit(NumberTile tile)
  { /* Complete the code */ 
  }
  

  /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
   *  If there are no tiles on the game board, the tile is placed at position 0.
   *  The tile should be placed at most 1 time.
   *  Precondition: board is not null
   *  @param tile the tile to be placed on the game board
   *  @return true if tile is placed successfully; false otherwise
   *  Postcondition: the orientations of the other tiles on the board are not changed
   *  Postcondition: the order of the other tiles on the board relative to each other
   *  is not changed
   */
  public boolean insertTile(NumberTile tile)
  { /* Complete the code */ 
  }
  
  public void printBoard()
  {
    for(int x=0; x < board.size(); x++) {
      System.out.print("-------");
    } 
    System.out.println("");
    for(int x=0; x < board.size(); x++) {
      System.out.print("|  "+board.get(x).getTop()+"  |");
    }    
    System.out.println("");
    for(int x=0; x < board.size(); x++) {
      System.out.print("|"+board.get(x).getLeft()+"   "+board.get(x).getRight()+"|");
    }    
    System.out.println("");
    for(int x=0; x < board.size(); x++) {
      System.out.print("|  "+board.get(x).getBottom()+"  |");
    }  
    System.out.print("\n");
    for(int x=0; x < board.size(); x++) {
      System.out.print("-------");
    } 
    System.out.println("\n");
  }
}