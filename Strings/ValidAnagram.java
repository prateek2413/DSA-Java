class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> hm= new HashMap<>();
       HashMap<Character, Integer> hmt=new HashMap<>();
       if(s.length()!=t.length()){
        return false;
       }
       for(int i=0;i<s.length();i++){
        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        hmt.put(t.charAt(i), hmt.getOrDefault(t.charAt(i),0)+1);
       }
       for(int i=0;i<s.length();i++){
        if(!hm.get(s.charAt(i)).equals(hmt.get(s.charAt(i)))){
            return false;
        }
       }
       return true;
    }
}
