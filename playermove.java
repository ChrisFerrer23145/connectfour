import java.util.Scanner;
public class playermove {
    public void move (String[][] board) {
        cpumove cpu = new cpumove();
        checkwin check = new checkwin();
        shiftleft shiftl = new shiftleft();
        shiftright shiftr = new shiftright();
        printboard print = new printboard();
        Main main = new Main();

        Scanner scan = new Scanner(System.in);
        System.out.println("Your turn!");
        int row = 0;
        int col = 0;
        int dir = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter the column you want to move to (starts at zero, ends at six, enter the number):");
            col = scan.nextInt();
            if (board[row][col] == "   " && col >= 0 && col <= 6) {
                valid = true;
            } else {
                System.out.println("Invalid move. Try again.");
                scan.next();
            }
        }
        board[row][col] = " R ";
        main.gravity(board);
        print.printBoard(board);

        valid = false;
        while (!valid) {
            System.out.println("Enter the row you want to shift left or right (starts at zero, ends at five, enter the number):");
            row = scan.nextInt();
            if (row >= 0 && row <= 5) {
                valid = true;
            } else {
                System.out.println("Invalid move. Try again.");
                scan.next();
            }
        }
        valid = false;
        while (!valid) {
            System.out.println("Enter the direction you want to shift left or right (enter 0 for left, 1 for right):");
            dir = scan.nextInt();
            if (dir <= 0) {
                board = shiftl.shiftLeft(board, row);
                valid = true;
            } else {
                board = shiftr.shiftRight(board, row);
                valid = true;
            }
        }
        check.check(board, " R ");
        print.printBoard(board);
        cpu.move(board);
    }
}
