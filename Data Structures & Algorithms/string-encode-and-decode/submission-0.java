class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String s : strs){
            encoded += s.length() + "#" + s;
        }

        return encoded;
    }

    public List<String> decode(String str) {
    List<String> list = new ArrayList<>();

    int idx = 0;

    while(idx < str.length()) {

        int hash = str.indexOf('#', idx);

        int n = Integer.parseInt(str.substring(idx, hash));

        int start = hash + 1;
        int end = start + n;

        String sub = str.substring(start, end);

        list.add(sub);

        idx = end;
    }

    return list;
    
    }
}
