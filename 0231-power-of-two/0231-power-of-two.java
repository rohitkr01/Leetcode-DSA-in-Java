class Solution {
     
    // Method -2 : Bit manipulation , Time: O(1)
    public boolean isPowerOfTwo(int n) {
        if(n<1) 
            return false;
        if((n&(n-1))==0)   
            return true;
        else 
            return false;
    }
}