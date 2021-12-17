public class cpumove {
    public void move(String[][] board) {
        playermove player = new playermove();
        checkwin check = new checkwin();
        shiftleft shiftl = new shiftleft();
        shiftright shiftr = new shiftright();
        printboard print = new printboard();
        Main main = new Main();
        
        System.out.println("CPU turn!");

        int row = 0;
        int col = 0;
        int dir = 0;
        boolean valid = false;
        while (!valid) {
            col = (int)(Math.random() * 7);
            if (board[row][col] == "   ") {
                valid = true;
            }
        }
        board[row][col] = " B ";
        main.gravity(board);

        row = (int)(Math.random() * 6);
        dir = (int)(Math.random() * 2);
        if (dir == 0) {
            board = shiftl.shiftLeft(board, row);
        } else {
            board = shiftr.shiftRight(board, row);
        }
        System.out.println("CPU shifted row " + row +" to the " + dir + "!");
        boolean l = check.check(board, " B ");
        print.printBoard(board);
        if (!l) {
            player.move(board);
        }
    }
}
