class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String st : strs)
        {
            int[] fre = new int[26];
            for(char c : st.toCharArray())
            {
                fre[c - 'a']++;
            }
            String k = Arrays.toString(fre);
            if(!mp.containsKey(k))
            {
                mp.put(k, new ArrayList<>());
            }
            mp.get(k).add(st);
        }
        return new ArrayList<>(mp.values());
    }
}