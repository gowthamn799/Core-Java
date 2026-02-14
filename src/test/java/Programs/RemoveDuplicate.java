package Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public void removeduplicate1(){
        String name="Virat kohli is a Rum machine";
        name=name.replace(" ","");
        for (int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            int j;
            for (j=0;j<i;j++){
                if(name.charAt(j)==ch){
                    break;
                }
                }
            if(j==i){
                System.out.println(ch);
            }
        }
    }
    public void removeDuplicate2(){
        String name="sdfghjytrfghg";
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        for (int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }
        for (char ch:set){
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        RemoveDuplicate Duplicate=new RemoveDuplicate();
//        Duplicate.removeduplicate1();
        Duplicate.removeDuplicate2();
    }
}
