import java.util.Scanner;

class  Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            char a= s.charAt(i);
            char b= s.charAt(i+1);
            score= score+Math.abs((int)a-(int)b);
        }

        return score;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.scoreOfString(s));
    }
    

}
