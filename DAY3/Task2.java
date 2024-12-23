package DAY3;
class Solution {
    public int minimumMoves(String s) {
        int move=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='X'){
                i=i+2;
                move++;
                } 
         }
        return move;
    }
}
public class Task2 {
    public static void main(String[] args) {
        
    
    String str="XXOX";
    Solution obj= new Solution();
    System.out.println(obj.minimumMoves(str));

    }
}