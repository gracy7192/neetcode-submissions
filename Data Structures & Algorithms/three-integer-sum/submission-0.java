class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l2=new ArrayList<>();
        if(nums.length<3){
            return l2;
        }
        int k=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
           
            while(left<right){
                 List<Integer> l1=new ArrayList<>();
                 int sum=nums[i]+nums[right]+nums[left];
                 if(sum<0){
                    left++;
                 }else if(sum>0){
                    right--;
                 }else{
                    l1.add(nums[i]);
                    l1.add(nums[right]);
                    l1.add(nums[left]);
                    l2.add(l1);
                    left++;
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                 }
            }
        }
        return l2;
    }
}
