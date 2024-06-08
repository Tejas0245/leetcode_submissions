import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* First find the accumulate sum of array
 Find duplicated sum%k values, then that the sub array between
     those two indexes will actually be the solution.

i.e.
[4, 1, 2, 3] and 6

if we get the accumulated sum, it looks like this [4, 5, 7, 10]
if we make it accumulated sum % k, it looks like this [4, 5, 1, 4]
notice that there is duplicated 4's.
 The diffference between these two sums in theory must be a multiple of 6
  since we've only been storing the num%k.
*/
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      int sum = 0;
      for(int i = 0;i<nums.length;i++){
        sum += nums[i];
        sum = sum%k;

        if(sum == 0 && i>0 ){
            return true; //if sum is divisible  by k and has length = or more than 2
        }
        
        if(hm.containsKey(sum)){ 
        //if two duplicate numbers are present the sum of their subarray  is divisible by k
            if(i - hm.get(sum)>= 2){// check if the distance between this subbarray is atleast two
                return true;
            }

        }
        else{
            hm.put(sum,i);
        }

      }
      return false;
    }
}
