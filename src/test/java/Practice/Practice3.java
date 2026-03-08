package Practice;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Practice3 {
    public void CountOccurance1(){
        String name="Karnataka is DivineCity in India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        int arr[]=new int[256];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch]++;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (arr[ch]!=0){
                System.out.println(ch +" : "+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void CountOccurance2(){
        String name="Bengaluru is Capital of Karnataka";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for (char ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public void removeDuplicate(){
        String name="Nammaskara Karnataka";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int j;
            for (j=0;j<str.length();j++){
                if (str.charAt(j)==ch){
                    break;
                }
            }
            if (j==i){
                System.out.println(ch);
            }
        }
    }
    public void removeDuplicate2(){
        String name="RCB is won the Cup after 18 yeras";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character> set=new LinkedHashSet<Character>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for ( Character ch:set){
            System.out.println(ch);
        }
    }
    public void findDuplicate1(){
        String name="Hello Gowtham";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        char ch[]=str.toCharArray();
        for (int i=0;i<str.length();i++){
            int count=1;
            for (int j=i+1;j<str.length();j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]=0;
                }
            }
            if (count>1 && ch[i]!=0 ) {
                System.out.println(ch[i]+" ");
            }
        }
    }
    public void findDuplicate2(){
        String name="Hello Gowtham";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for (char ch :str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
    public void bubbleShort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value of Array ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int Number:arr){
            System.out.println(Number);
        }
       int secondMax= arr[arr.length-2];
        System.out.println("Second Maxium is "+secondMax);
    }
    public void MinMax(){
        int arr[]={23,67,90,13,7};
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum in an array "+max);
        System.out.println("minium in an array "+min);
    }
    public void collection(){
        Integer arr[]={56,89,21,45,7,9,7,21,945,59};
        List<Integer>list=new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("after adding the value to list is "+list);
        Set<Integer>set=new LinkedHashSet<>(list);
        System.out.println("Removing duplicates "+set);
        Collections.sort(list);
        System.out.println("Asending order " +list);
        Collections.reverse(list);
        System.out.println("Decending Order "+list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
    public static void main(String[] args) {
    Practice3 p3=new Practice3();
    p3.bubbleShort();
    p3.collection();
    p3.CountOccurance1();
    p3.removeDuplicate();
    p3.CountOccurance2();
    p3.findDuplicate1();
    p3.removeDuplicate2();
    p3.findDuplicate2();
    p3.MinMax();
    }
}
