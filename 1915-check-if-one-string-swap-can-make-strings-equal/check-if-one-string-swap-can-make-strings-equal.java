class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        int f1=-1,f2=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(f1==-1){
                    f1=i;
                }else if(f2==-1){
                    f2=i;
                }else{
                    return false;
                }
            }
        }
        return (f2!=-1 && s1.charAt(f1)==s2.charAt(f2) && s1.charAt(f2)==s2.charAt(f1));
    }
}