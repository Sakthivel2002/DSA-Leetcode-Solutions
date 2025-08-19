/* Steps to solve this problem
1. We extract the digits of x one by one
2. Build the reversed number in ans
3. Check for overflow before multiplying by 10. 
This runs in O(log n) Time and O(1) Space complexities. */
class Solution {
    public int reverse(int x) {
        int ans=0;
        while(x!=0){
            int rem = x%10;
            if( (ans > Integer.MAX_VALUE /10) || (ans < Integer.MIN_VALUE /10)){
                return 0;
            }
            ans = ans * 10 + rem;
            x/=10;
        } return ans;
    }
}
