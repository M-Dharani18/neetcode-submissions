class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int l=0;
        int mc=0;
        for(int r=0;r<s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            mc=Math.max(mc,(r-l+1));
            }
        return mc;
        }
    }
