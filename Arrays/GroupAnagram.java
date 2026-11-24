class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();   
            Arrays.sort(chars);                 
            String key = new String(chars);
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(strs[i]);     
        }
        return new ArrayList<>(hm.values());
        

    }
}
