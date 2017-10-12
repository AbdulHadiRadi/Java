import java.util.ArrayList;
import java.util.Scanner;

public class CycleLength {
    private static ArrayList<Integer> numb = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give us 2 input values between 1 to 10000");
        String numbers = scan.nextLine();
        String [] numbs = numbers.split(" ");
        int n = Integer.parseInt(numbs[0]);
        int m = Integer.parseInt(numbs[1]);
        int length = 0;
        for (int i = n; i<=m; i++){
            getTheCycle(i);
            length=(numb.size()>length? numb.size():length);
            numb.clear();
        }
        System.out.println("Cycle length is "+length);
    }
    public static int getTheCycle(int n){
        numb.add(n);
        System.out.println(n);
        if(n==1) {
            return 1;
        }
        else if(n%2==0){
            return getTheCycle(n/2);
        }
        else {
            return getTheCycle(3*n+1);
        }
    }

}


