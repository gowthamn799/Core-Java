package Practice;

import java.util.*;

public class Practice8 {
    public void Countoccurance1(){
        String name="Landon Bridge is a Beeautifull city";
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
                System.out.println(ch+":"+arr[ch]);;
                arr[ch]=0;
            }
        }
    }
    public void CountOccurance2(){
        String name="Money is World Best Perfume";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<>();
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
    public void removeDuplicate1(){
        String name="Rajath Patidhar is the Durandhar of Bengaluru";
        name=name.replace(" ","");
        String str= name.toLowerCase();
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
        String name="Kl Rahul does the Kantara Celebration in Bengaluru";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character>set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character ch:set){
            System.out.println(ch);
        }
    }
    public void findDuplicate1(){
        String name="Rohit Sharma is Best Opener in WorldCup 2023";
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
                System.out.println(ch[i]);
            }
        }
    }
    public void findDuplicate2(){
        String name="KGF is the Mother ans Son promise Stroy";
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
        String name="Virat Kohli";
        String name1=String.valueOf(num);
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="AB Devillears";
        char ch[]=name.toCharArray();
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void swapnNumber(){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"and "+b);
    }
    public void fibonicSeries(){
        int num=5;
        int a=0;
        int b=1;
        for (int i=2;i<num;i++){
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    public void bubbleShort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for an Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for an Array ");
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
        for (Integer num:arr){
            System.out.println("Ascending Order Array "+num);
        }
        int SecMax=arr[arr.length-2];
        System.out.println("Second Maximum Array is "+SecMax);
        int SecMin=arr[arr.length-4];
        System.out.println("Second Minimum Array is "+SecMin);
    }
    public void MaxMin(){
        int arr[]={34,67,90,56,12,7};
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
        System.out.println("Maximum Arrays is "+max);
        System.out.println("Minimum Arrays is "+min);
    }
    public void Collections(){
        Integer arr[]={34,67,90,56,12,7,67,7,12};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Input Given Arrays is "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("After Removing Duplicate and Arranged in Ascending Order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Decending Order Arrays is "+list1);
        System.out.println("Maximum Arrays is "+Collections.max(list1));
        System.out.println("Minimum Arrays is "+Collections.min(list1));
    }
    public static void main(String[] args) {
        Practice8 p8=new Practice8();
        p8.Countoccurance1();
        System.out.println("---------*******--------");
        p8.CountOccurance2();
        System.out.println("---------*******--------");
        p8.removeDuplicate1();
        System.out.println("---------*******--------");
        p8.removeDuplicate2();
        System.out.println("---------*******--------");
        p8.findDuplicate1();
        System.out.println("---------*******--------");
        p8.findDuplicate2();
        System.out.println("---------*******--------");
        p8.reverseString1();
        System.out.println("---------*******--------");
        p8.reverseString2();
        System.out.println("---------*******--------");
        p8.swapnNumber();
        System.out.println("---------*******--------");
        p8.fibonicSeries();
        System.out.println("---------*******--------");
        p8.MaxMin();
        System.out.println("---------*******--------");
        p8.Collections();
        System.out.println("---------*******--------");
        p8.bubbleShort();


    }
}
