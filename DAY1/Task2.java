package DAY1;
import java.util.Scanner;

class Solution {
    public static int gcd(int a, int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b ");
        int b = sc.nextInt();
        Solution obj = new Solution();
        System.out.println("The GCD of "+a+" and "+b+" is "+obj.gcd(a, b));
    }
    
}

