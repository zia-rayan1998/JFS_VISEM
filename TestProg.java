import java.util.*;
class TestProg {
    public static void main(String[] args){
        String  bin_s= "1101";
        int ans = Integer.parseInt(bin_s,2);
        System.out.println("String_value"+ bin_s + "\tanswer"+ ans);

        String  oct_s= "12";
        ans = Integer.parseInt(oct_s,8);
        System.out.println("String_value"+ oct_s + "\tanswer"+ ans);

        String  hex_s= "13A";
        ans = Integer.parseInt(hex_s,16);
        System.out.println("String_value"+ hex_s + "\tanswer"+ ans);

        String  dec_s= "12";
        ans = Integer.parseInt(dec_s,10);
        System.out.println("String_value"+ dec_s + "\tanswer"+ ans);

        System.out.println("Enter the binary string:");
        Scanner sc = new Scanner(System.in);
        bin_s =sc.next();
        int dec_ans = Integer.parseInt(bin_s, 2);
        System.out.println("String_value "+ bin_s+ "\tanswer"+ dec_ans);




    }
}