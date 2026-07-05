class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int n=set.size();
        int[] num=new int[n];
        int i=0;
        for(int s:set){
            num[i++]=s;
        }
        Arrays.sort(num);
        int maxi=1;
        int count=1;
        for(i=0;i<num.length;i++){
            while(i<num.length-1 && (num[i]+1)==num[i+1] ){
                count++;
                i++;
            }
            if(count>maxi){
                maxi=count;
            }
            count=1;
        }
        return maxi;
    }
}
