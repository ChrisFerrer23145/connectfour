public class printboard {
    public void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0) {
                    System.out.print("||");
                }
                
                System.out.print(board[i][j]);
                System.out.print("||");
            }
            System.out.println();
        }
    }
}
