package Programs;

public class FibbonicSeries {
    public static void main(String[] args) {
        int num=10;
        int first=0;
        int sec=1;
        for(int i=2;i<num;i++){
            int next=first+sec;
            System.out.print(next+" ");
            first=sec;
            sec=next;
        }
    }

}
