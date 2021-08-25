// this solution is updating the array. So everytime we visit the array ele, we mark it negative.
// this works only becoz array index starts with 0 and array ele starts with 1 (holds [1,n-1] elements)... as atleast 1 duplicate number we have.
public int findDuplicate(int[] nums) {
        int idx=0;
        int tmp;
        while(nums[idx]>0){
            //System.out.println(idx);
            tmp = nums[idx];
            nums[idx] *= -1;
            idx=tmp;
        }
        return idx;
        
    }
