package Programs;

import java.util.*;

public class ArrayShort {
    public void MaxMinArray() {
        int arr[] = {104, 45, 90, 06, 56};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maxxium Number :" + max);
        System.out.println("Minium Number :" + min);
    }

    public void arrayShort1(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(123);
        list.add(9);
        list.add(34);
        list.add(41);
        System.out.println("Before Sorting Array is :" +list);
        Collections.sort(list);
        System.out.println("After Sorting Array is :" +list);
        int max=Collections.max(list);
        System.out.println("Maxium Number Array is :" +max);
        int min=Collections.min(list);
        System.out.println("Minium Number Array is :" +min);
    }
    public void arrayShort2() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int arraySize=scanner.nextInt();
        int arr[]=new int[arraySize];
        System.out.println("Enter the array Elements :");
        for (int i=0;i<arraySize;i++) {
             arr[i]= scanner.nextInt();
        }

//        int arr[] = {23, 1, 54, 12, 62};
//        System.out.println("Before Sorting Array is :" +arr);
       for (int i=0;i<arr.length;i++){
           for (int j=i+1;j<arr.length;j++) {
               if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
        System.out.println("Sorted array:");
       for (int Num:arr){
           System.out.println(Num);
       }
       int fifthLargest=arr[arr.length-1];
       System.out.println("5th Largest is :" +fifthLargest);
    }
    public static void main(String[] args) {
       ArrayShort array=new ArrayShort();
//       array.MaxMinArray();
//       array.arrayShort1();
       array.arrayShort2();
    }

}
