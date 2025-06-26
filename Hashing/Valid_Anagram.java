//https://leetcode.com/problems/valid-anagram/?envType=problem-list-v2&envId=plakya4j&
//Solution by Hashing
class Solution {
    public boolean isAnagram(String s, String t) 
    {
       Map <Character,Integer> count = new HashMap<>();
       char [] str1 = s.toCharArray();
       char [] str2 = t.toCharArray();
       for(char x : str1)
       {
         count.put(x ,count.getOrDefault(x,0)+1); //if char (is element in HashMap) =>  return frequency of it and (freq +1)
       }  
       for(char x : str2)
       {
         count.put(x ,count.getOrDefault(x,0)-1); //if char (is element in HashMap) =>  return frequency of it and (freq -1) 
       } 
       for(int val : count.values())
       {
         if(val!=0)
         return false;
       }  
        return true ;    
    }
}