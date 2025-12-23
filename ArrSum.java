import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int input[] = new int[n];
        int output[] = new int[n];
        System.out.println("enter "+ n + " numbers");

        for(int i = 0 ; i < n ; i++){
            input[i]= sc.nextInt();
            int sum = 0;
            int d = 0;
            int t = input[i];

            while(t > 0){
                d = t % 10;
                output[i] =  output[i] + d;
                t = t/10;

            }
            System.out.println("answer:  " +  output[i]);
    }

}
}
