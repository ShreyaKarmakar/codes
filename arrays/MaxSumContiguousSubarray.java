// kadane's algo

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    int max=Integer.MIN_VALUE;
    int sum=0;
    public int maxSubArray(final int[] A) {
        for(int e:A){
            sum += e;
            if(sum>max){
                max = sum;
                
            }
            if(sum<0)
                sum=0;
        }
        return max;
    }
}
