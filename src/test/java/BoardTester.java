import CrossWord.Util.PuzzleBoard;

import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BoardTester {
    int row = 4;
    int col = 4;
    char[][] newGgird = new char[row][col];
    boolean isempty = true;

    private char[][] board = new char[row][col];
    boolean isnotempty = false;



   PuzzleBoard grid = new PuzzleBoard(row, col, board);
    @Test
    void isboardInitalize(){

    assertEquals(row, grid.getRow());
    assertEquals(col, grid.getColumn());
    }


    @Test
    void isBoardEmpty(){

        assertEquals(isempty, grid.isEmpty());
    }


    void populateBoard(){
        board[0] = new char[] {'C', 'A', 'T', 'S'};
        board[1] = new char[] {'D', 'O', 'G', 'S'};
        board[2] = new char[] {'F', 'I', 'S', 'H'};
        board[3] = new char[] {'B', 'I', 'R', 'D'};
    }


    @Test
    void BoardisnotEmpty(){
        populateBoard();
        assertEquals(isnotempty, !grid.isEmpty());
    }



}
