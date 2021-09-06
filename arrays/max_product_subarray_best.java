class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int fin = nums[0];
        
        for(int i=1; i<nums.length; i++){
            int x = min*nums[i];
            int y = max*nums[i];
            
            max = get_max(x,y,nums[i]);
            min = get_min(x,y,nums[i]);
            if(max>fin){
                fin=max;
            }
        }
        return fin;
    }
    
    int get_max(int x, int y, int z){
        return Math.max(Math.max(x,y),z);
    }
    
    int get_min(int x, int y, int z){
        return Math.min(Math.min(x,y),z);
    }
}
