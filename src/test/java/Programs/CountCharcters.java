package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountCharcters {
    public void countCharactersInString(){
        String name="Gowtham";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        int arr[]=new int[256];
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            arr[ch]++;
        }
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            System.out.println(ch +" = " +arr[ch]);
            arr[ch]=0;
        }
    }
    public void countCharctersString2(){
        String name="Gowtham";
        String input=name.toLowerCase();
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
        for (char ch:input.toCharArray()){
           if(hs.containsKey(ch)){
               hs.put(ch,hs.get(ch)+1);
        }  else {
            hs.put(ch,1);
           }
        }
        for (Map.Entry<Character,Integer>entry:hs.entrySet()){
             System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
    public static void main(String[] args) {
     CountCharcters charcter=new CountCharcters();
//     charcter.countCharactersInString();
        charcter.countCharctersString2();
    }
}
