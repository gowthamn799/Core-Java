package Practice;

import java.util.*;

public class Practice4 {
    public void countOccurance1() {
        String name = "PowerStar PunithRajkumar";
        name = name.replace(" ", "");
        String str = name.toLowerCase();
        int arr[] = new int[254];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (arr[ch] != 0) {
                System.out.println(ch + ":" + arr[ch]);
                arr[ch]=0;
            }
        }
    }

    public void countOccurance2() {
        String name = "Natasarvabovmma Rajkumara";
        name = name.replace(" ", "");
        String str = name.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
    for (Map.Entry<Character,Integer>entry:map.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
    }
    public void removeDuplicate1(){
        String name="Challenging Star Darshan";
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
        String name="Badshaa Kichha Sudeepa";
        name=name.replace(" ","");
        String str= name.toLowerCase();
        Set<Character> set= new LinkedHashSet<Character>();
        for (Character ch:str.toCharArray()){
            set.add(ch);
        }
        for (Character ch:set){
            System.out.println(ch);
        }
    }
    public void findDuplicate1(){
        String name="Sam Sum SamSung Song Sun Sam Sun";
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
            if (count>1 && ch[i]!=0){
                System.out.print(ch[i]+" ");
            }
        }
    }
    public void finDuplicate2(){
        String name="Gowtham gow gowthu gowthi Gowham";
        name=name.replace(" ","");
        String str=name.toLowerCase();
        Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for (Character ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()) {
            if (entry.getKey() > 1) {
                System.out.print(entry.getKey());
            }
        }
    }
    public void bubbleShot(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of the Array ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value for an Array ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        for (int value:arr){
            System.out.println(value);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public void MaxMin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the values for an Array ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
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
        System.out.println("Maxium value in an Array "+max);
        System.out.println("Minimum value in an Array "+min);
    }
    public void collections(){
        Integer arr[]={23,12,9,87,56,785,9,12};
        List<Integer>list= new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("Entered Array are "+list);
        Collections.sort(list);
        System.out.println("Asending order array is "+list);
        System.out.println("Maximum Array is "+Collections.max(list));
        System.out.println("Minimum Array is "+Collections.min(list));
        Collections.reverse(list);
        System.out.println("Decending Order Array "+list);
        System.out.println("4th Maximum array is "+list.get(3));
        System.out.println("2nd Minimum array is "+list.get(5));
        Set<Integer> set= new TreeSet<Integer>(list);
        System.out.println("Removing the Duplicates in an Array "+set);

    }
    public static void main(String[] args) {
        Practice4 p4= new Practice4();
        p4.countOccurance1();
        System.out.println("---------*******--------");
        p4.countOccurance2();
        System.out.println("---------*******--------");
        p4.removeDuplicate1();
        System.out.println("---------*******--------");
        p4.removeDuplicate2();
        System.out.println("---------*******--------");
        p4.findDuplicate1();
        System.out.println("---------*******--------");
        p4.finDuplicate2();
        System.out.println("---------*******--------");
        p4.bubbleShot();
        System.out.println("---------*******--------");
        p4.MaxMin();
        System.out.println("---------*******--------");
        p4.collections();
    }
}
