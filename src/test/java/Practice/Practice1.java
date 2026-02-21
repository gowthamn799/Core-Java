package Practice;

import Programs.CountCharcters;

import java.util.*;

public class Practice1 {

    public void countOccurance1(){
        String name="Virat is an Run Machine";
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
                System.out.println(ch+ " = "+arr[ch]);
                arr[ch]=0;
            }
        }
    }
    public void countOccurance2(){
        String name="Dhurandhar is Indian SPY Movie";
        name=name.replace(" ","");
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for (char ch:name.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
    public void removeDuplicates1(){
        String name="Dhurandhar is Indian SPY Movie";
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
    public void removeDuplicates2(){
      String name="Kantara is Divine Movie";
      name=name.replace(" ","");
        Set<Character>set=new LinkedHashSet<>();
        for (int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }
        for (Character ch:set){
            System.out.println(ch);
        }
    }
    public void  bubbleSort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size pf an Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the values for an Array ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Asending order sorting");
        for (int values:arr){
            System.out.println(" " +values);
        }
        int secMAX=arr[arr.length-3];
        System.out.println("2nd Maxium Array "+secMAX);
        int thirdMin=arr[arr.length-3];
        System.out.println("3rd Minium Array "+thirdMin);

    }
    public void MaxMin(){
        int arr[]={23,56,9,25};
        int max=arr[0];
        int min=arr[1];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maxium Array is "+max);
        System.out.println("Minium Array is "+min);
    }
    public void UsingCollection(){
        Integer arr[]={564,11,97,43,11,2,25,2};
        List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("Before sorting Array is "+list);
//        Set<Integer>set=new LinkedHashSet<>(list);
        Set<Integer>set=new TreeSet<>(list);
//        list=new ArrayList<>(set);
        System.out.println("Removing the Duplicates "+set);
//        Collections.sort(list);
//        System.out.println("After sorting Array in Ascending order "+list);
        System.out.println("Maxium Array is "+Collections.max(list));
        System.out.println("Minium Array is "+Collections.min(list));
        System.out.println("2nd Minium Array is "+list.get(1));
        System.out.println("4th Maxium Array is "+list.get(2));
        Collections.reverse(list);
        System.out.println("Descending order Array "+list);
    }
    public static void main(String[] args) {
        Practice1 p1=new Practice1();
//        p1.countOccurance1();
//        p1.countOccurance2();
//        p1.removeDuplicates1();
//        p1.removeDuplicates2();
//        p1.bubbleSort();
//        p1.MaxMin();
        p1.UsingCollection();
    }
}
