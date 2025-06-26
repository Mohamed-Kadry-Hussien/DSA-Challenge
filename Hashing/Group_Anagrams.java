//https://leetcode.com/problems/group-anagrams/?envType=problem-list-v2&envId=plakya4j&
//Convert each string to array of char
//sort each (array of char)
//convert again to string 
// use sorted string as key for all related anagrams strings
//if the string have same key => add in hashmap(in private key )(add string to the list)

import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String key  =new String(characters);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
                map.get(key).add(str);
            }
            else
            {
                map.get(key).add(str);
            }
        }
        return new ArrayList(map.values());


    }
}