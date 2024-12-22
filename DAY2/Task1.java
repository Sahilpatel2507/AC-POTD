package DAY2;
class Solution {
    public int singleNumber(int[] nums) {
      int n=nums.length;
      int res=0;
      for(int i=0;i<n;i++){
        res=res^nums[i];
      }
      return res;
    }

}
public class Task1{
    public static void main(String[] args) {
        int nums[]={2,2,1,3,3,4,5,4,5};
        Solution obj=new Solution();
        System.out.println(obj.singleNumber(nums));
    }
}