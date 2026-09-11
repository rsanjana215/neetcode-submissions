class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer > Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            Smap.put(s.charAt(i) , Smap.getOrDefault(s.charAt(i),0) + 1);
            Tmap.put(t.charAt(i) , Tmap.getOrDefault(t.charAt(i),0) + 1);    
        }

        return Smap.equals(Tmap);
    }
}
