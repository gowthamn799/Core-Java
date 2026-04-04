package Practice;

import java.util.*;

public class Practice5 {

    public void countOccurance1(){
        String name="Virat Kohli is Run Machine of India";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        int arr[]=new int[264];
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            arr[ch]++;
        }
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if (arr[ch]!=0){
                System.out.println(ch+":"+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void countOcuurance2(){
        String name="Rohit Sharma is Hitman of India";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (char ch:input.toCharArray()){
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
    public void removeDuplicate1(){
        String name="Yorker Specilist Jasprith Bumbrah";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            int j;
            for (j=0;j<input.length();j++){
                if (input.charAt(j)==ch){
                    break;
                }
            }
            if (j==i){
                System.out.println(ch);
            }
        }
    }
    public void removeDuplicate2(){
        String name="KL Rahul is Best Middle Order Batsman";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        Set<Character>set=new LinkedHashSet<>();
        for (int i=0;i<input.length();i++){
            set.add(input.charAt(i));
        }
        for (Character Set:set){
            System.out.println(Set);
        }
    }
    public void FindDuplicates1(){
        String name="Rajasthan Royals is the Winner of Innurgral IPL ";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        char ch[]=input.toCharArray();
        for (int i=0;i<input.length();i++){
            int count=1;
            for (int j=i+1;j<input.length();j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]=0;
                }
            }
            if (count>1&&ch[i]!=0){
                System.out.println(ch[i]+" ");
            }
        }
    }
    public void FindDuplicate2(){
        String name="Royal Challengers Won the IPL after 18 Long Years";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (Character ch:input.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
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
        String name="ViratKohli";
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="RahulDravid";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void reverseNumber(){
        int num=1234;
        String str=String.valueOf(num);
        String reverse="";
        for (int i=str.length()-1;i>0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    public void bubbleSort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value of an Array ");
        for (int i=0;i<size;i++){
            int value=sc.nextInt();
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
            System.out.println(num);
        }
        int SecMax=arr[arr.length-3];
        int SecMin=arr[arr.length-1];
        System.out.println(SecMax+" and "+SecMin);
    }
    public void MinMax(){
        int arr[]={10,20,30,40,50};
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max+"and"+min);
    }
    public void Collections() {
        Integer arr[] = {34, 12, 89, 56, 987, 12, 67, 34};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        Set<Integer>set=new TreeSet<>(list);
        System.out.println(set);
        List<Integer>list1=new ArrayList<>(set);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

    }
    public static void main(String[] args) {
        Practice5 p5=new Practice5();
        p5.countOccurance1();
        System.out.println("---------*******--------");
        p5.countOcuurance2();
        System.out.println("---------*******--------");
        p5.removeDuplicate1();
        System.out.println("---------*******--------");
        p5.removeDuplicate2();
        System.out.println("---------*******--------");
        p5.FindDuplicates1();
        System.out.println("---------*******--------");
        p5.FindDuplicate2();
        System.out.println("---------*******--------");
        p5.reverseString1();
        System.out.println("---------*******--------");
        p5.reverseString2();
        System.out.println("---------*******--------");
        p5.bubbleSort();
        System.out.println("---------*******--------");
        p5.MinMax();
        System.out.println("---------*******--------");
        p5.Collections();
    }
}
