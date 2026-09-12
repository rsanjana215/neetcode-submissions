class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            for(int i=0;i<s.length();i++){
                count[s.charAt(i) - 'a']++;
            }

            String c = Arrays.toString(count);
            res.putIfAbsent(c , new ArrayList<>());
            res.get(c).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
