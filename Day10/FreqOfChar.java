import java.util.*;

class FreqOfChar{


    private static char giveMaxFreqChar(String str) {
       
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c, 1);
            }
        }

        ArrayList<Character> keys = new ArrayList<>(hm.keySet());
        char maxc = str.charAt(0);
        for(int i = 0 ; i < keys.size();i++ ){
            if(hm.get(maxc) < hm.get(keys.get(i))){
                maxc = keys.get(i);
            }
        }

        return maxc ;
    }


    public static void main(String[] args) {
        
        String str = "aaaaabbbbbbbbbbbbddcggbb";

        char ans = giveMaxFreqChar(str);  
        
        System.out.println(ans);

    }

  


}