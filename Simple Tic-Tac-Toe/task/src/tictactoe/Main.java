package tictactoe;
import java.util.Scanner;


public class Main {
    public static char whoseMove(int movecounter){
        if(movecounter%2==0){
            return 'X';
        }
        else {
            return 'O';
        }
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String field = "_________";
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("| "+field.charAt(0)+" "+field.charAt(1)+" "+field.charAt(2)+" |");
        System.out.println("| "+field.charAt(3)+" "+field.charAt(4)+" "+field.charAt(5)+" |");
        System.out.println("| "+field.charAt(6)+" "+field.charAt(7)+" "+field.charAt(8)+" |");
        System.out.println("---------");
        char[] letters = field.toCharArray();
        int coordinates[] = new int[2];
        int Xcounter=0;
        int Ocounter=0;
        int winnerCount=0;
        int xAxisWinner=0;
        int yAxisWinner=0;
        int diagonalWinner=0;
        int movecounter = 0;
        char winningLetter = 'a';
        boolean gameOver = false;

        while (!gameOver) {

            boolean valid = false;
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == 'X') {
                    Xcounter += 1;
                } else if (letters[i] == 'O') {
                    Ocounter += 1;
                }
            }
/*
            if (!(Xcounter == Ocounter + 1 || Xcounter == Ocounter || Xcounter + 1 == Ocounter)) {
                System.out.println("Impossible");
                return;
            }

 */
            while (!valid) {
                String move = scanner1.nextLine();
                String[] splitted = move.split(" ");
                try {
                    for (int i = 0; i < splitted.length; i++) {
                        coordinates[i] = Integer.parseInt(splitted[i]);
                    }
                } catch (Exception e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }
                if ((coordinates[0] > 3 || coordinates[0] < 1) || (coordinates[1] > 3 || coordinates[1] < 1)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (letters[coordinates[1] - 1 + (coordinates[0] * 3 - 3)] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else {
                    letters[coordinates[1] - 1 + (coordinates[0] * 3 - 3)] = whoseMove(movecounter);
                    System.out.println("---------");
                    System.out.println("| " + letters[0] + " " + letters[1] + " " + letters[2] + " |");
                    System.out.println("| " + letters[3] + " " + letters[4] + " " + letters[5] + " |");
                    System.out.println("| " + letters[6] + " " + letters[7] + " " + letters[8] + " |");
                    System.out.println("---------");
                    valid = true;
                    movecounter+=1;
                }
            }

        if((letters[0]==letters[1] && letters[1]==letters[2])&& letters[0]!='_'){
            xAxisWinner+=1;
            winningLetter=letters[0];
        }
        if((letters[3]==letters[4] && letters[4]==letters[5])&& letters[3]!='_'){
            xAxisWinner+=1;
            winningLetter=letters[3];
        }
        if((letters[6]==letters[7] && letters[7]==letters[8])&& letters[6]!='_'){
            xAxisWinner+=1;
            winningLetter=letters[6];
        }
        if((letters[0]==letters[3] && letters[3]==letters[6])&& letters[0]!='_'){
            yAxisWinner+=1;
            winningLetter=letters[0];
        }
        if((letters[1]==letters[4] && letters[4]==letters[7])&& letters[1]!='_'){
            yAxisWinner+=1;
            winningLetter=letters[1];
        }
        if((letters[2]==letters[5] && letters[5]==letters[8])&& letters[0]!='_'){
            yAxisWinner+=1;
            winningLetter=letters[2];
        }
        if((letters[0]==letters[4] && letters[4]==letters[8])&& letters[0]!='_'){
            diagonalWinner+=1;
            winningLetter=letters[0];
        }
        if((letters[2]==letters[4] && letters[4]==letters[6])&& letters[2]!='_'){
            winningLetter=letters[2];
            diagonalWinner+=1;
        }

        if(yAxisWinner==1 && winningLetter!='_'){
            System.out.println(""+winningLetter + " wins");
            return;
        }
        else if (diagonalWinner>0 && winningLetter!='_') {
            System.out.println(""+winningLetter+" wins");
            return;
        }
        else if(xAxisWinner==1 && winningLetter!='_'){
            System.out.println(""+winningLetter + " wins");
            return;
        }
        else if(movecounter==9){
            System.out.println("Draw");
            return;
        }
        }
    }
}
