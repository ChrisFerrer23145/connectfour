class Main {
    public static void main(String[] args) {
        System.out.println("You are playing Connect Four!");
        System.out.println("Your color is RED.");
        System.out.println("Your icon is R.");

        playermove player = new playermove();
        printboard print = new printboard();

        String[][] board = new String[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = "   ";
            }
        }
        print.printBoard(board);

        player.move(board);

    }

    public void gravity(String[][] board) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<7; j++) {
                if (board[i][j] == " R " || board[i][j] == " B ") {
                    if (board[i+1][j] == "   ") {
                        board[i+1][j] = board[i][j];
                        board[i][j] = "   ";
                    }
                }
            }
        }
    }
}