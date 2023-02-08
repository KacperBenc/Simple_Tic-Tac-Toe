import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> shapes = new HashMap<>();
        // start coding here
        shapes.put(1,"square");
        shapes.put(2,"circle");
        shapes.put(3,"triangle");
        shapes.put(4,"rhombus");
        int shape = scanner.nextInt();
        switch (shape){
            case 1:
                System.out.println("You have chosen a " + shapes.get(1));
                break;
            case 2:
                System.out.println("You have chosen a " + shapes.get(2));
                break;
            case 3:
                System.out.println("You have chosen a " + shapes.get(3));
                break;
            case 4:
                System.out.println("You have chosen a " + shapes.get(4));
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}
