package Practice;

import Programs.CountCharcters;

import java.util.*;

public class Practice10 {
    public void countOccurance1(){
        String name="Korragajja Swamy Prasana";
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
    public void countOccrance2(){
        String name="Punjurli daiva in Tulunadu";
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
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public void removeDuplicate1(){
        String name="Guliga daiva is Kshetrapala of Punjurli daiva";
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
        String name="Sri kateelu DurgaParameshwari Temple";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character>set1=new LinkedHashSet<>();
       for (int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           set1.add(ch);
       }
       for (Character set:set1){
           System.out.println(set);
       }
    }
    public void findDuplicate1(){
        String name="Kantara will start the Tulunadu Daiva Story to Entire World";
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
            if (count>1&&ch[i]!=0){
                System.out.println(ch[i]);
            }
        }
    }
    public void findDuplicate2(){
        String name="Rishab Shetty is Divine Star id Indian Film Industry";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Set<Character>set1=new LinkedHashSet<>();
        Set<Character>set2=new LinkedHashSet<>();
        for (Character ch:str.toCharArray()){
            if (!set1.add(ch)){
                set2.add(ch);
            }
        }
        System.out.println(set2);
    }
    public void reverseString1(){
        String name="Madhuri is good girl";
        String reverse="";
        int num=1234;
//      String name=String.valueOf(num);
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Gowtham is Good Human";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);
    }
    public void SwapNumber(){
        int a=10;
        int b=30;
        System.out.println("Befoure Swapping "+a + b);
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("After Swapping "+a + b);
    }
    public void fibonicSeries(){
        int num1=0;
        int num2=1;
        int limit=10;
        for (int i=2;i<limit;i++){
            int num3=num1+num2;
            System.out.println(num3 +" ");
            num2=num3;
            num1=num2;
        }
    }
    public void bubbleShort(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an Arrays ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value of an Array ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (Integer num:arr){
            System.out.println("Ascending Order Array is "+num);
        }
        int secMax=arr[arr.length-2];
        int secMin=arr[arr.length-4];
        System.out.println("Second Maximum Array is "+secMax);
        System.out.println("Second Minimum Array is "+secMin);
    }
    public void MinMax(){
        int arr[]={56,89,2,45,67};
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
        System.out.println("Maximum Array is "+max);
        System.out.println("Minimum Array is "+min);
    }
    public void Collection(){
        Integer arr[]={56,89,2,45,67};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Given Arrays "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("After Removing Duplicate and Arranged Ascending order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Decending Order "+list1);
        System.out.println("Maximum Array is "+Collections.max(list1));
        System.out.println("Minimum Array is "+Collections.min(list1));
    }
    public static void main(String[] args) {
        Practice10 p10=new Practice10();
        p10.countOccurance1();
        System.out.println("---------*******--------");
        p10.countOccrance2();
        System.out.println("---------*******--------");
        p10.removeDuplicate1();
        System.out.println("---------*******--------");
        p10.removeDuplicate2();
        System.out.println("---------*******--------");
        p10.findDuplicate1();
        System.out.println("---------*******--------");
        p10.findDuplicate2();
        System.out.println("---------*******--------");
        p10.reverseString1();
        System.out.println("---------*******--------");
        p10.reverseString2();
        System.out.println("---------*******--------");
        p10.SwapNumber();
        System.out.println("---------*******--------");
        p10.fibonicSeries();
        System.out.println("---------*******--------");
        p10.MinMax();
        System.out.println("---------*******--------");
        p10.Collection();
        System.out.println("---------*******--------");
        p10.bubbleShort();

    }
}
