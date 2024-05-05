class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
           
        hs.add(nums[i]);

        
     if(hs.contains(nums[i]*-1)){
      if(nums[i]>0){
      max = Math.max(nums[i],max);
     }
     else{
        max = Math.max(nums[i]*-1,max);

}
}


}
if(max==Integer.MIN_VALUE){
return -1;
}
return max;
    }
}