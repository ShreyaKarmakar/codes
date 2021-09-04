// https://practice.geeksforgeeks.org/problems/maximum-product-subarray
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        
        long g_max = max1(arr);
        
        long max=1;
        long min=1;
        
        for(int e:arr){
            //positive [2,3]
            //negative [-1,-2, -3]
            long tmp=max;
            if(e==0){
                max=1;
                min=1;
                continue;
            }
            // case - previous +, curr + -- max = prv_max *curr, min = curr
            //        previous -, curr + -- max = curr, min = prv_min*curr
            //        previous +, curr - -- max = curr, min = prv_max*curr
            //        previous -, curr - -- max = prv_min *curr, min = curr
            
            max = get_max(e*max, e*min, e); // second case is due to ... min is neg and n is also neg.
            min = get_min(e*tmp, e*min, e);  // -n * max = big negative, -n* min = small negative, -n ..if min is negative
            //System.out.println(max+" "+min);
            if(max>g_max)
                g_max = max;
        }
        return g_max;
    }
    
    long get_max(long a, long b, long c){
        if(a>=b && a>=c)
            return a;
        else if(b>=a && b>=c)
            return b;
        else
            return c;
    }
    
    long get_min(long a, long b, long c){
        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        else
            return c;
    }
    
    int max1(int[] arr){
        int m=Integer.MIN_VALUE;
        
        for(int e:arr){
            if(e>m)
                m=e;
        }
        return m;
    }
}
