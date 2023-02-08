import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String words = scanner.nextLine();
        String[] splitted = words.split(" ");
        long firstNumber = Long.parseLong(splitted[0]);
        long secondNumber = Long.parseLong(splitted[2]);
        String operation = splitted[1];
        switch (operation){
            case "+":
                System.out.println(firstNumber+secondNumber);
                break;
            case "-":
                System.out.println(firstNumber-secondNumber);
                break;
            case "*":
                System.out.println(firstNumber*secondNumber);
                break;
            case "/":
                if(secondNumber==0){
                    System.out.println("Division by 0!");
                    break;
                }
                else {
                    System.out.println(firstNumber/secondNumber);
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }

    }
}
