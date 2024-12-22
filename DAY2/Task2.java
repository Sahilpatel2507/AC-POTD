package DAY2;
class Solution {
    public int minimumOperations(int[] nums) {
        int opr=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%3==1){
        //         nums[i]-=1;
        //         opr++;
        //     }
        //     else if(nums[i]%3==2){
        //         nums[i]+=1;
        //         opr++;
        //     }
        // }
         for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                opr++;
            }
         }
        return opr;
    }
}
public class Task2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        Solution obj=new Solution();
        System.out.println(obj.minimumOperations(nums));

    }
    
}
