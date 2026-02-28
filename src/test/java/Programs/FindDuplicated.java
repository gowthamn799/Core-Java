package Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicated {

    public void findDuplicateString1(){
        String name="hello Gowtham";
        name=name.replace(" ","");
        char[] ch=name.toCharArray();
        for (int i=0;i<ch.length;i++){
            int count=1;
            for (int j=i+1;j<ch.length;j++){

                if (ch[i]==ch[j]){
                    count++;
                    ch[j]=0;
                }
            }
            if (count>1 && ch[i]!=0){
                System.out.print(ch[i]+ " ");
            }
        }

    }
    public void findDuplicateString2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String ");
        String name=scanner.nextLine();
//        String name="Hello Gowtham";
        name=name.replace(" ","").toLowerCase();
//        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (Character ch:name.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
            if (entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        FindDuplicated fd = new FindDuplicated();
//        fd.findDuplicateString1();
        fd.findDuplicateString2();
    }
}
