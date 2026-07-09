class Solution {
    public boolean check(int[] freq,int[] need){
        for(int i=0;i<26;i++){
            if(freq[i]!=need[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        int[] need=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int left=0;
        for(int i=0;i<s2.length();i++){
        need[s2.charAt(i)-'a']++;
        while(i-left+1>s1.length()){
           need[s2.charAt(left)-'a']--;
           left++;
        }
            if(i-left+1==s1.length()){
                if(check(freq,need)){
                   return true;
                }
            
        }
        }
        return false;
    }
}
