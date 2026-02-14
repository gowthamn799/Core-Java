package Programs;

public class ReverseString {
    public void reverseString1(){
        String name="Gowtham";
        System.out.println("Before Reverse the String :" +name);
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);    //approch 1

        }
        System.out.println("After Reverse the String :" +reverse);
    }
    public void reverseString2(){
        String name="Virat Kohli";
        name=name.replace(" ","");
        System.out.println("Before Reverse the String :" +name);
        String reverse="";
        char s[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+s[i];
        }
        System.out.println("After Reverse the String :" +reverse);
    }
    public static void main(String[] args) {
        ReverseString reverse=new ReverseString();
        reverse.reverseString1();
        reverse.reverseString2();
    }
}
