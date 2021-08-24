public class Solution {
    public List<Integer> getRow(int k) {
      //we use same array... and filling/updating backwards always.
        Integer[] arr = new Integer[k + 1];
       
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
              //we are going backwards and since array is initialized with 0, we always get (j=i) end element as 1...
              //for --> arr[j]+arr[j-1]
              // (0+1)
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
    }
}
