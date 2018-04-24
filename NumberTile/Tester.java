
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        TileGame game = new TileGame();
        NumberTile t1 = new NumberTile(3, 4, 6, 3);
        NumberTile t2 = new NumberTile(1, 2, 5, 7);
        NumberTile t3 = new NumberTile(8, 7, 1, 3);
        NumberTile t4 = new NumberTile(2, 3, 4, 5);
        NumberTile t5 = new NumberTile(7, 7, 3, 3);
        NumberTile t6 = new NumberTile(9, 8, 7, 6);   
        NumberTile t7 = new NumberTile(3, 3, 0, 4);   

        System.out.println("place tile: expected=true, run="+game.insertTile(t1));
        game.printBoard();
        System.out.println("place tile: expected=false, run="+game.insertTile(t2));
        game.printBoard();
        System.out.println("place tile: expected=true, run="+game.insertTile(t3));
        game.printBoard();
        System.out.println("place tile: expected=true, run="+game.insertTile(t4));
        game.printBoard();
        System.out.println("place tile: expected=true, run="+game.insertTile(t5));
        game.printBoard();
        System.out.println("place tile: expected=false, run="+game.insertTile(t6));
        game.printBoard();
        System.out.println("place tile: expected=true, run="+game.insertTile(t7));
        game.printBoard();
    }

}
