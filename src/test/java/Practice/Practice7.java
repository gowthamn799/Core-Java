package Practice;

import Programs.CountCharcters;

import java.time.temporal.ChronoField;
import java.util.*;

public class Practice7 {
    public void countOccurance1(){
        String name="Romario Shefpered is not batsaman He is an Allrounder";
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
                System.out.println(ch+":"+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void countOccurance2(){
        String name="Tim Devid is Current Best Finisher";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for (Character ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public void removeDuplicate1(){
        String name="Rajat Patidhar is Durandhar of RCB";
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
            if(j==i){
                System.out.println(ch);
            }
        }
    }
    public void removeDuplicate2(){
        String name="Jacob Bethal Man i form from RCB";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character Set:set){
            System.out.println(Set);
        }
    }
    public void FindDuplicate1(){
        String name="Virat Kohli is Best Batsmam in Cricket";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        char ch[]=str.toCharArray();
        for (int i=0;i<str.length();i++){
            int count=1;
            for (int j=i+1;j<str.length();j++){
                if (ch[j]==ch[i]){
                    count++;
                }
            }
         if (count>1&&ch[i]!=0){
             System.out.println(ch[i]+ " ");
         }
        }
    }
    public void FindDuplicate2(){
        String name="Rohit Sharma is Best Captin of India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (Character ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getKey()>1){
                System.out.println(entry.getKey());
            }
        }
    }
    public void reverseString1(){
        int num=1234;
//        String name=String.valueOf(num);
        String name="Madhuri";
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Koragajja";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void bubbleShort(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for an Array ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int num:arr) {
            System.out.println("Ascending Order Array is " + num);
        }
        int secmax=arr[arr.length-2];
        int fourthMin=arr[arr.length-4];
        System.out.println("2nd Maximum is "+secmax);
        System.out.println("4th Minimum is "+fourthMin);
    }
    public void MinMax(){
        int arr[]={45,78,90,21,6};
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Value in an Array is "+max);
        System.out.println("Minimum Value in an Array is "+min);
    }
    public void fibbonicSeries(){
        int num1=0;
        int num2=1;
        int limit=15;
        for (int i=2;i<limit;i++){
            int num3=num1+num2;
            System.out.println(num3+" ");
            num1=num2;
            num2=num3;
        }
    }
    public void Collections(){
        Integer arr[]={45,78,90,21,6,78,21};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Given Input Array is "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("After Removing Duplicate and Arranged in Ascending Order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Decending Order Array "+list1);
        System.out.println("Maximum Array is "+Collections.max(list1));
        System.out.println("Minimum Array is "+Collections.min(list1));
    }
    public static void main(String[] args) {
       Practice7 p7=new Practice7();
       p7.countOccurance1();
       System.out.println("---------*******--------");
       p7.countOccurance2();
       System.out.println("---------*******--------");
       p7.removeDuplicate1();
       System.out.println("---------*******--------");
       p7.removeDuplicate2();
       System.out.println("---------*******--------");
       p7.FindDuplicate1();
       System.out.println("---------*******--------");
       p7.FindDuplicate2();
       System.out.println("---------*******--------");
       p7.reverseString1();
       System.out.println("---------*******--------");
       p7.reverseString2();
       System.out.println("---------*******--------");
       p7.MinMax();
       System.out.println("---------*******--------");
       p7.fibbonicSeries();
       System.out.println("---------*******--------");
       p7.Collections();
       System.out.println("---------*******--------");
       p7.bubbleShort();
    }
}
