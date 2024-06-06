class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];\


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<k;i++){ // go till k
            pq.add(nums[i]);
        }

        for(int i = k;i<nums.length;i++){ // go from k to end of array
           if(pq.peek()<nums[i]){  //check if the new element if bigger than the top most element in queue
              pq.poll();  //if yes remove that element as we want the k largest to be at the top
              pq.add(nums[i]);  //add the kth largest element
           }
        }
        return pq.peek();
    }
}