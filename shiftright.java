public class shiftright {
    public String[][] shiftRight(String[][] board, int row) {
        String[][] newBoard = new String[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                newBoard[i][j] = board[i][j];
            }
        }
        
        String last = newBoard[row][6];
        if(newBoard[row].length >1) {
            for(int j = newBoard[row].length-2; j >= 0; j--){
                newBoard[row][j+1] = newBoard[row][j];
            }
        }
        newBoard[row][0] = last;
        
        return newBoard;
    }
}
