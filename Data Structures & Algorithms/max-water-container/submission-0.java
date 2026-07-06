class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxi=Integer.MIN_VALUE;
        while(left<right){
            int prod=1;
            int length=right-left;
            if(arr[left]<arr[right]){
                prod=arr[left]*length;
                left++;
            }else{
                if(arr[left]>arr[right]){
                    prod=arr[right]*length;
                    right--;
                }else{
                    prod=arr[right]*length;
                    left++;
                    right--;
                }
            }
            maxi=Math.max(maxi,prod);
        }
      return maxi;
    }
}
