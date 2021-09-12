class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        
        // find first the pivot (smallest element or the start of array before rotate)
        int mid=0;
        while(i<j){
            mid = (i+j)/2;
            if(nums[mid]>nums[j]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        System.out.println("pivot: "+i);
        
        // i is start
        //now decide which part target belongs
        mid=i;
        i=0;
        j=nums.length-1;
        
        if(target>=nums[mid] && target<=nums[j]){
            i=mid;
        }else{
            j=mid-1;
        }
        // now start binary search on that part
        while(i<=j){
            mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}
