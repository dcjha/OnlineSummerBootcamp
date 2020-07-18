import java.util.*;


class Anagram {
    
    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap<Character,Integer> hms1 = new HashMap<>();

        for(int i = 0 ; i < s1.length(); i++){
            if(hms1.containsKey(s1.charAt(i))){
                hms1.put(s1.charAt(i), hms1.get(s1.charAt(i))+1);
            }else{
                hms1.put(s1.charAt(i),1);
            }   
        }
        
        for(int i = 0 ; i < s2.length(); i++){
            if(hms1.containsKey(s2.charAt(i))){
                hms1.put(s2.charAt(i),   hms1.get(s2.charAt(i))-1);
                if(hms1.get(s2.charAt(i))==0){
                    hms1.remove(s2.charAt(i));
                }
            }else{
                return false;
            }
        }

        if(hms1.size() !=0 ){
            return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        boolean ans = isAnagram("apple","pappple");
        System.out.println(ans);

    }

    
}