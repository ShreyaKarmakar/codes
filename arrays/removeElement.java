class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i=0, j=nums.length-1;
        while(i<=j){
            while(i<=j && nums[i]!=val){
                i++;
            }
            while(i<=j && nums[j]==val){
                j--;
            }
            //System.out.println(i+" "+j);
            if(i<j){
                
                nums[i] = nums[j];   
                i++;
                j--;
            }
        }
        return i;
    }
}
