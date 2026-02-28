package Practice;

import java.util.*;

public class Ptractice2 {
    public void countOccurance1(){
        String name="Dhurandhar is a Indian Spy Movie";
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
                System.out.println(ch+"="+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void countOccurance2(){
        String name="Major is Biopic Movie of major SandeepUnniKrishnan";
        name=name.replace(" ","");
        Map<Character,Integer>map=new LinkedHashMap<>();

        for (char ch:name.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey() +"="+entry.getValue());
        }
    }
    public void removeDuplicated1(){
        String name="Major is Biopic Movie of major SandeepUnniKrishnan";
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
        String name="Dhurandhar is a Indian Spy Movie";
        name=name.replace(" ","");
        Set<Character>set=new LinkedHashSet<>();
        for (int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }
        System.out.println(set);
        for (Character ch:set){
            System.out.println(ch);
        }
    }
     public void bubbleShort(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of an Array");
         int size=sc.nextInt();
         System.out.println("Enter the value of an Array");
         int arr[]=new int[size];
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
             System.out.println("Asending Order Array " +arr[i]);
         }
         int Fourthmax=arr[arr.length-4];
         int ThirdMin=arr[arr.length-4];
         System.out.println("4th Maxium is "+Fourthmax);
         System.out.println("3rd Minium is "+ThirdMin);
         }

         public void MinMax(){
        int arr[]={34,21,17,98,57};
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }if (arr[i]<min){
                min=arr[i];
            }
        }
             System.out.println("Maxium Array is "+max);
             System.out.println("Minium Array is "+min);
         }
         public void Collection(){
             Integer arr[]={34,21,17,98,57,17,98};
             List<Integer>list=new ArrayList<>(Arrays.asList(arr));
             System.out.println("Original Array is "+list);
             Set<Integer>set=new TreeSet<>(list);
             System.out.println("Asending Order Array is "+set);
             Collections.reverse(list);
             System.out.println("Decending Order Array is "+list);
             System.out.println("Maxium Array is "+Collections.max(list));
             System.out.println("Minium Array is "+Collections.min(list));
             System.out.println("2nd Maxium Array is "+list.get(5));
             System.out.println("5th Minium Array is "+list.get(6));

         }
         public void reverseString(){
        String name="Gowtham";
        String reverse="";
        char ch[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
//            reverse=reverse+name.charAt(i);
              reverse=reverse+ch[i];
        }
             System.out.println(reverse);
         }
        public static void main(String[] args) {
        Ptractice2 p2=new Ptractice2();
//        p2.Collection();
//            p2.MinMax();
//            p2.bubbleShort();
//            p2.countOccurance1();
//            p2.countOccurance2();
//            p2.removeDuplicate2();
//            p2.removeDuplicated1();
p2.reverseString();


    }
}
