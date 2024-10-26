package CrossWord.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PuzzleBoard {
    private   int row;
    private   int column;
    private char[][] grid;

    public PuzzleBoard(int row, int column, char[][] gridX) {
        this.row = row;
        this.column = column;
        this.grid = gridX;

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public char[][] getGrid() {
        return grid;
    }

    public boolean isEmpty(){
      //  int row = 0;
     //   int column = 0;
        char[][] grid = getGrid();

        String characterPatter = "[a-zA-Z]+]";
        Pattern compleP = Pattern.compile(characterPatter);

       for (int i = 0; i < this.row; i++) {
           for (int j = 0; j < this.column; j++) {
               Matcher matcher = compleP.matcher(String.valueOf(grid[i][j]));
               if(matcher.find()){
                   return false;
               }

           }
       }

        return true;
    }




}
