class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder res = new StringBuilder();

        for(String s : strs){
            res.append(s.length()).append('#').append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        int idx = 0;
        List<String> list = new ArrayList<>();
        while(idx < str.length()){
            int hash = str.indexOf('#',idx);

            int len = Integer.parseInt(str.substring(idx,hash));

            int start = hash + 1;
            int end = start + len;

            list.add(str.substring(start, end));

            idx = end;
        }

        return list;
    }
}
