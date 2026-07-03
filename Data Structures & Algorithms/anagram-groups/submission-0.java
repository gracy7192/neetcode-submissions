class Solution {
    public static boolean isAnagram(String s,String t){
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
          if(arr1[i]!=arr2[i]){
            return false;
          }
        }
        return true;
    }

    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> set=new HashSet<>();
        List<List<String>> l=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> li=new ArrayList<>();
            if(!set.contains(strs[i])){
            li.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    li.add(strs[j]);
                    set.add(strs[j]);
                }
            }
            l.add(li);
        }
        }
        return l;
    }
}
