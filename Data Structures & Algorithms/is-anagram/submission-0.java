class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        int[] freq1 = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char c:t.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=freq1[i]) return false;
        }
        return true;
    }
}
