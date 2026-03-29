class Solution {
    public boolean isPalindrome(String s) {
        List<Character> li = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)) {
                li.add(Character.toLowerCase(c));}
        }
        int i=0,j=li.size()-1;
        while(i<j){
            if(li.get(i)!=li.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
