class Solution:
    def countWays(self,n,k):
        
        dp = [0]*(n+1)
        
        if n==1:
            return k
        # index of dp signifies length of fence
        
        # for length 1.. dont know
        # main logic is
        # last to fence colors -- either both same or both diff
        
        same = k
        diff = k*(k-1)
        dp[2]=same + diff
        mod = 1000000007
        for i in range(3,n+1):
            same = (diff)%mod
            diff = (dp[i-1]*(k-1))%mod
            dp[i] = (same + diff)%mod
        
        return dp[n]
