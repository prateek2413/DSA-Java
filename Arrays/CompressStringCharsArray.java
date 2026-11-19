class Solution {
    public int compress(char[] chars) {
        if(chars.length==0){
            return 0;
        }
        int count=1;
        int write=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }else{
                chars[write]=chars[i];
                write++;
                if(count>1){
                    String countStr = String.valueOf(count);
                    for (int j = 0; j < countStr.length(); j++) {
                        chars[write] = countStr.charAt(j);
                        write++;
                    }
                }
                count=1;
            }
        }
        chars[write]=chars[chars.length-1];
        write++;
        if(count>1){
            String countStr = String.valueOf(count);
            for (int j = 0; j < countStr.length(); j++) {
                chars[write] = countStr.charAt(j);
                write++;
            }
        }
        return write;
    }
}
