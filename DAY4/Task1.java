package DAY4;
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
           if(nums[i]==0){
            
            cnt0++;
           }
          else if(nums[i]==1){
            
            cnt1++;
           }
          else{
            
            cnt2++;
           }
        }
       for(int j=0;j<n;j++){
        if(cnt0>0){
        nums[j]=0;
        cnt0--;
       }
       else if(cnt1>0){
        nums[j]=1;
        cnt1--;
       }
        else if(cnt2>0){
        nums[j]=2;
        cnt2--;
       }
       }
        System.out.println(nums);
    }
}
public class Task1 {
    public static void main(String[] args) {
        int nums[]={1,2,2,0,1,0};
        Solution obj=new Solution();
        obj.sortColors(nums);
    }
    
}
