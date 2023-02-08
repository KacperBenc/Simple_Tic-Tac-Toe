import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean symetric = true;
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0;i<arr.length;i++){
            for(int j = 0; j< arr.length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j = 0; j< arr.length;j++){
            if(arr[j][i]!=arr[i][j]){
                symetric=false;
                break;
            }
            }
            if(!symetric){
                break;
            }
        }
        if(!symetric){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}