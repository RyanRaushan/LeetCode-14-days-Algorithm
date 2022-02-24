class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.equals("")) {
            return 0;
        }
        
         HashSet<Character> ch = new HashSet<>();

        int index = 0;
        int max = 0;
        int removeIndex = 0;
        while (index < s.length()){
            if (ch.add(s.charAt(index))){
                index++;
                max = Math.max(max, ch.size());
            }else {
                ch.remove(s.charAt(removeIndex));
                removeIndex++;
            }
        }
        return max;
    }
}
