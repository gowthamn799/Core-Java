package Practice;

import java.util.*;

public class Practice9 {
    public void countOccurance1(){
        String name="Rajath Patidhar Injury Replacement";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        int arr[]=new int[256];
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            arr[ch]++;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch!=0){
                System.out.println(ch+":"+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void countOccurance2(){
        String name="Vekantesh Iyer is Best Impact move on Royals Clash";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new HashMap<>();
        for (Character ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+":" +entry.getValue());
        }
    }
    public void removeDuplicate1(){
        String name="Shreyas Iyer is the Unbeaten Captain the IPL";
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
            if(j==i){
                System.out.println(ch);
            }

        }
    }
    public void removeDuplicate2(){
     String name="KL Rahul is First Indian to score 150 in IPL";
     name=name.replace(" ","");
     String str=name.toLowerCase();
     Set<Character>set=new HashSet<>();
     for (int i=0;i<str.length();i++){
         Character ch=str.charAt(i);
         set.add(ch);
     }
     for (Character set1:set){
         System.out.println(set1);
     }
    }
    public void findDuplicate1(){
        String name="Rahul Dravid is the Wall of Indian Cricket";
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
    public void findDiplicate2(){
        String name="Rahul Dravid is the Wall of Indian Cricket";
        Set<Character>set1=new LinkedHashSet<>();
        Set<Character>set2=new LinkedHashSet<>();
        for (Character ch:name.toCharArray()){
            if (!set1.add(ch)){
                set2.add(ch);
            }
        }
        System.out.println(set2);
    }
    public void reverseString1(){
        String name="Gowtham is Good Human";
        int num=1234;
//        String name=String.valueOf(num);
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
    public void reverseString2(){
        String name="Madhuri is good Girl";
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
        System.out.println("Before Swapping Number is "+a +" and " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping Number is "+a +" and " +b);
    }
    public void fibonicSeries() {
        int a = 0;
        int b = 1;
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
    public void bubbleShort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value of Array ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
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
        for (int num:arr){
            System.out.println("Ascending order Array "+num);
        }
        int secMax=arr[arr.length-2];
        int secMin=arr[arr.length-4];
        System.out.println("Second Maximum Array "+secMax);
        System.out.println("Second Minimum Arrays "+secMin);
    }
    public void MinMax(){
        int arr[]={10,202,450,321,90};
        int min=arr[0];
        int max=arr[1];
        for (int i=0;i<arr.length;i++){
            if (max>arr[i]){
                max=arr[i];
            }
            if (min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum Array "+max);
        System.out.println("Minimum Array "+min);
    }
    public void Collections(){
        Integer arr[]={10,202,450,321,90};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Given Array is "+list);
        Set<Integer>set=new TreeSet<>(list);
        System.out.println("After Removing Dplicates and Arranged in Ascending Order "+set);
        List<Integer>list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println("Arranged in Decending Order "+list1);
        System.out.println("Maximum Arrays is "+Collections.max(list1));
        System.out.println("Minimum Arrays is "+Collections.min(list1));

    }
    public static void main(String[] args) {
        Practice9 p9=new Practice9();
        p9.countOccurance1();
        System.out.println("---------*******--------");
        p9.countOccurance2();
        System.out.println("---------*******--------");
        p9.removeDuplicate1();
        System.out.println("---------*******--------");
        p9.removeDuplicate2();
        System.out.println("---------*******--------");
        p9.findDuplicate1();
        System.out.println("---------*******--------");
        p9.findDiplicate2();
        System.out.println("---------*******--------");
        p9.reverseString1();
        System.out.println("---------*******--------");
        p9.reverseString2();
        System.out.println("---------*******--------");
        p9.swapNumber();
        System.out.println("---------*******--------");
        p9.fibonicSeries();
        System.out.println("---------*******--------");
        p9.MinMax();
        System.out.println("---------*******--------");
        p9.Collections();
        System.out.println("---------*******--------");
        p9.bubbleShort();
        System.out.println("---------*******--------");
    }
}
