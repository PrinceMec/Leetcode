class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] alphabets = new int[26];
        
        for(char c : s.toCharArray()) 
            alphabets[c - 'a']++;
        
        for(char c : t.toCharArray())
            alphabets[c - 'a']--;
        
        for(int elem : alphabets) {
            if(elem != 0)
                return false;
        }
        
        return true;
    }
}
