package Practice;

import java.util.*;

public class Practice11 {
    public void countOccurance1(){
        String name="Appa Amma ne Nijavada Devaru";
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
        String name="I Love you My Mother India";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (Character ch:str.toCharArray()){
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
        String name="Koragajja Vinayaka Ullaya";
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
        String name="Panjurli Daiva Gulliga Swaamy";
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
        String name="Sri Guru Raghavendra Swammy";
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
            if (count>1&&ch[i]!=0){
                System.out.println(ch[i]);
            }
        }
    }
    public void findDuplicate2(){
        String name="Om Namo Narayanaya Govinda";
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
        int num=1234;
        String name="Gowtham";
//      String name=String.valueOf(num);
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Shiva";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void SwapNumber(){
        int a=10;
        int b=20;
        System.out.println("befour Swapping "+a +" and " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after Swapping "+a +" and " +b);
    }
    public void fibonicSeries(){
        int a=0;
        int b=1;
        int limit=10;
        for (int i=0;i<limit;i++){
            int c=a+b;
            System.out.println(c +" ");
            a=b;
            b=c;
        }
    }
    public void MinMax(){
        int arr[]={45,78,90,2,445,87};
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
        System.out.println("Maximum Arrays is "+max);
        System.out.println("Minimum Arrays is "+min);
    }
    public void collections(){
        Integer arr[]={45,78,90,2,445,8,45,2,78};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Given Array is "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("Removed the Duplicates and Arranged in Ascending Order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Descending order Arrays "+ list1);
        System.out.println("Maximum Arrays is "+Collections.max(list1));
        System.out.println("Minimum Arrays is "+Collections.min(list));
    }
    public void bubbleSort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Arrays ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for an Arrays ");
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
            System.out.println("Ascending Order Arrays "+num);
        }
        int secmax=arr[arr.length-2];
        int secmin=arr[arr.length-4];
        System.out.println("Second maximum is "+secmax);
        System.out.println("Second Minimum is "+secmin);
    }
    public static void main(String[] args) {
     Practice11 p11=new Practice11();
     p11.countOccurance1();
     System.out.println("---------*******--------");
     p11.countOccurance2();
     System.out.println("---------*******--------");
     p11.removeDuplicate1();
     System.out.println("---------*******--------");
     p11.removeDuplicate2();
     System.out.println("---------*******--------");
     p11.findDuplicate1();
     System.out.println("---------*******--------");
     p11.findDuplicate2();
     System.out.println("---------*******--------");
     p11.reverseString1();
     System.out.println("---------*******--------");
     p11.reverseString2();
     System.out.println("---------*******--------");
     p11.fibonicSeries();
     System.out.println("---------*******--------");
     p11.SwapNumber();
     System.out.println("---------*******--------");
     p11.MinMax();
     System.out.println("---------*******--------");
     p11.collections();
     System.out.println("---------*******--------");
     p11.bubbleSort();
    }
}
