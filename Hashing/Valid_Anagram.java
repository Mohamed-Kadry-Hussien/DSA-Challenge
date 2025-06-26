//https://leetcode.com/problems/valid-anagram/?envType=problem-list-v2&envId=plakya4j&
class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int len1=s.length(); 
        int len2=t.length();
        if(len1!= len2 )
            return false;
        
        int[] chars = new int[26];
        
        for(int i = 0; i < s.length(); i++) 
        {
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        
        for(int i=0 ; i<26 ; i++) {
            if(chars[i]!= 0)
            return false;
        }

        return true;
    }
}