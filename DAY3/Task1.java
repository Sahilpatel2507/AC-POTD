package DAY3;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int arr[]=new int[nums.length];
          for(int i=0;i<nums.length;i++){
               int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
              }
                arr[i]=count;
          }
          return arr;
    }
}
public class Task1 {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        Solution obj = new Solution();
        System.out.println(obj.smallerNumbersThanCurrent(nums));
    }
    
}
