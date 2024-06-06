class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr1 = new int[score.length];
        for(int i= 0;i<score.length;i++){
            arr1[i] = score[i];
        }
        Arrays.sort(score);
        int count = score.length-1;
        int rank = 4;
        HashMap<Integer,String> hm = new HashMap<>();
        while(count>=0){
            if(count==score.length-1){
           hm.put(score[count],"Gold Medal");
            }
              else if(count==score.length-2){
           hm.put(score[count],"Silver Medal");
            }
            else  if(count==score.length-3){
           hm.put(score[count],"Bronze Medal");
            }
            else{
                 hm.put(score[count],Integer.toString(rank) );
                 rank++;
            }
          count--;

        }
    

        String[] arr = new String[arr1.length];
        for(int i = 0;i<score.length;i++){
            if(hm.containsKey(arr1[i])){
                arr[i] = hm.get(arr1[i]);
            }
        }
        return arr;
    }
}