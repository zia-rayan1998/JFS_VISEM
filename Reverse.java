import java.util.*;

class Reverse {
    public static void main(String[] args) {
        System.out.println("enter the value :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }

        System.out.println("the ans is : " + rev);

    }
}