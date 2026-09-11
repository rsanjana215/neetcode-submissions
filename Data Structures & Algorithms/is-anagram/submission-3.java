class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] Sfreq =  new int[26];
        int[] Tfreq = new int[26];
 
        for(int i=0;i<s.length();i++){
            Sfreq[s.charAt(i) - 'a']++;
            Tfreq[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(Sfreq , Tfreq);
    }
}
