package Practice;

import java.net.Inet4Address;
import java.util.*;

public class Practice12 {
    public void countOccurance1(){
        String name="Salaga Single Elephant in the Jungle";
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
        String name="Lion is Single Share in Jungle";
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
        String name="Tiger is National Animal of India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int j;
            for (j=0;i<str.length();j++){
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
        String name="Gandaberounda is flying Bird of Karnataka state";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character ch:set){
            System.out.println(ch);
        }
    }
    public void findDuplicate1(){
        String name="Pecock is National Bird in India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        char ch[]=str.toCharArray();
        for (int i=0;i<str.length();i++){
            int count=1;
            for (int j=i+1;j<str.length();j++){
                if (ch[j]==ch[i]){
                    count++;
                    ch[j]=0;
                }
            }
            if (ch[i]!=0&&count>1){
                System.out.println(ch[i]);
            }
        }
    }
    public void findDuplicate2(){
        String name="KingKobra is Dengeours Snake in India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character>set1=new LinkedHashSet<>();
        Set<Character>set2=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            if (!set1.add(str.charAt(i))){
                set2.add(str.charAt(i));
            }
        }
        for (Character ch:set2){
            System.out.println(ch);
        }
    }
    public void reverseString1(){
        String name="Madhuri Ujjini Matth";
        int num=1245;
//      String name=String.valueOf(num);
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Gowtham Devanaga";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void swapNumber(){
        int a=10;
        int b=20;
        System.out.println("Before Swapping "+a +"&" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before Swapping "+a +"&" + b);
    }
    public void fobonicSeries(){
        int a=0;
        int b=1;
        int limit=10;
        for (int i=0;i<limit;i++){
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    public void MinMax(){
        int arr[]={23,89,78,34,10};
        int min=arr[0];
        int max=arr[1];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[0];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum Arrays is "+max);
        System.out.println("Minimum Arrays is "+min);
    }
    public void Collection(){
        Integer arr[]={23,89,78,34,10,23,34,10};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Given Arrays is "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("Removed the Duplicate ans Arranged in in Ascending Order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Decending Order Arrays is "+list1);
        System.out.println("Maximum Arrays is "+Collections.max(list1));
        System.out.println("Minimum Arrays is "+Collections.max(list1));
    }
    public void bubbleShort(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an Arrays ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value for an Arrays ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num:arr){
            System.out.println("Ascending Order arrays "+num);
        }
        int secmax=arr[arr.length-2];
        int secmin=arr[arr.length-4];
        System.out.println("SecondMax arrays "+secmax);
        System.out.println("SecondMin arrays "+secmin);
    }
    public static void main(String[] args) {
        Practice12 p12=new Practice12();
        p12.countOccurance1();
        System.out.println("---------*******--------");
        p12.countOccurance2();
        System.out.println("---------*******--------");
        p12.removeDuplicate1();
        System.out.println("---------*******--------");
        p12.removeDuplicate2();
        System.out.println("---------*******--------");
        p12.findDuplicate1();
        System.out.println("---------*******--------");
        p12.findDuplicate2();
        System.out.println("---------*******--------");
        p12.reverseString1();
        System.out.println("---------*******--------");
        p12.reverseString2();
        System.out.println("---------*******--------");
        p12.swapNumber();
        System.out.println("---------*******--------");
        p12.fobonicSeries();
        System.out.println("---------*******--------");
        p12.MinMax();
        System.out.println("---------*******--------");
        p12.Collection();
        System.out.println("---------*******--------");
        p12.bubbleShort();
    }
}
