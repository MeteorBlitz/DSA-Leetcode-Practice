// Last updated: 6/19/2025, 12:08:53 PM
class Solution{
    fun maxSubArray(nums:IntArray):Int{
        var maxsum = Int.MIN_VALUE
        var currentsum = 0

        for(i in nums){
            currentsum += i

            if(currentsum > maxsum){
                maxsum =currentsum
            }
            if(currentsum < 0){
                currentsum = 0
            }
        }
        return maxsum
        
    }
}