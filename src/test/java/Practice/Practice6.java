package Practice;

import java.util.*;

public class Practice6 {

    public void countOccurance1(){
        String name="Power star Punith Rajkumar";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        int arr[]=new int[256];
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
    public void countOccurance2(){
        String name="Elephan is the Karnataka Stata Animal";
        name=name.replace(" ","");
        String input=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (Character ch:input.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entery:map.entrySet()){
            System.out.println(entery.getKey()+":"+entery.getValue());
        }
    }
    public void removeDuplicate1(){
        String name="Gandaberunda is State Bird of Karnataka";
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
        String name="Vibhav Suryavamshi is the youngest Cricketer in the IPL";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (char ch:set){
            System.out.println(ch);
        }
    }
    public void findDuplicate1(){
        String name="Rcb Dhurandhar is Rajath Patidhar";
        name=name.replace(" ","");
        String str= name.toLowerCase();
        char ch[]=str.toCharArray();
        for (int i=0;i<str.length();i++){
            int count=1;
            for (int j=i+1;j<str.length();j++){
                if (ch[i]==ch[j]){
                    count++;
                }
            }
            if(count>1&&ch[i]!=0){
                System.out.println(ch[i]);
            }
        }
    }
    public void findDuplicate2(){
        String name="Virat Kohli is the King of the IPL";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map= new LinkedHashMap<>();
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
        String name="Shreyas Iyer";
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Kannur Lokesh Rahul";
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
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    public void bubbleShort(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of an Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value for an Array ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
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
        for (int num:arr){
            System.out.println("Ascending Order Array is "+num);
        }
        int secmax=arr[arr.length-2];
        int secmin=arr[arr.length-4];
        System.out.println("Second Maximum is "+secmax);
        System.out.println("Second Minimum is "+secmin);
    }
    public void MinMax(){
        int arr[]={45,89,23,7,51,890};
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximun Array is "+max);
        System.out.println("Minimum  Array is "+min);
    }
    public void collection(){
        Integer arr[]={45,89,23,7,51,890,89,7};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Input Assigne Array is "+list);
        Set<Integer>set= new TreeSet<>(list);
        System.out.println("After Removing Duplicate and Arranged in Ascending Order " +set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println("Maximum Array is "+Collections.max(list1));
        System.out.println("Minimum Array is "+Collections.min(list1));
    }
    public static void main(String[] args) {
     Practice6 p6=new Practice6();
     p6.countOccurance1();
     System.out.println("---------*******--------");
     p6.countOccurance2();
     System.out.println("---------*******--------");
     p6.removeDuplicate1();
     System.out.println("---------*******--------");
     p6.removeDuplicate2();
     System.out.println("---------*******--------");
     p6.findDuplicate1();
     System.out.println("---------*******--------");
     p6.findDuplicate2();
     System.out.println("---------*******--------");
     p6.reverseString1();
     System.out.println("---------*******--------");
     p6.reverseString2();
     System.out.println("---------*******--------");
     p6.reverseNumber();
     System.out.println("---------*******--------");
     p6.bubbleShort();
     System.out.println("---------*******--------");
     p6.MinMax();
     System.out.println("---------*******--------");
     p6.collection();
     System.out.println("---------*******--------");
    }
}
