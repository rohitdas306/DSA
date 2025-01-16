class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
    //Last value of index
            int result=hm.get(s.charAt(s.length()-1));
    //Loop start from 2nd Last to 0(Zero) index
            for(int i=s.length()-2;i>=0;i--){
    //Compare 2nd last valur to LAST VALUE (1 ---> 5 result 5-1=4)
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                result-= hm.get(s.charAt(i));
            }else{
                result+=hm.get(s.charAt(i));
            }
        }
        return result;
    }
}