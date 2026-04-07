class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int l=0;
        int maxf=0,res=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxf=Math.max(maxf,mp.get(ch));
            while((r-l+1)-maxf>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
    return res;
    }
}
