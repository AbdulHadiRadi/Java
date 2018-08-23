/**
 * Created by abdul on 8/11/2018.
 */
//fionacci seq - 1,1,2,3,5,8,13,21,34,55,89.......
public class Fibonacci {
    private int number;
    private int limit;

    public Fibonacci(){

    }

    public Fibonacci(int limit){
        this.limit = limit;
    }

    // recursive function for nth fibonacci number
    public long nthfiboNumbRecursion(int n){
        if (n<=1) return 1;
        else return nthfiboNumbRecursion(n-1) + nthfiboNumbRecursion(n-2);
    }

    // iterative function for nth fibonacci number
    public long nthfiboNumbIteration(int n){
        if (n<2) return n;
        long first = 0;
        long second = 1;
        long sum = 0;
        for(int i=1; i<=n; i++){
            sum = first+second;
            first = second;
            second = sum;
        }
        return sum;
    }

    //sum of nth fibonacci numbers
    public long sumOfNthFibo(int number){
        if(number<2) return number;

        //first two even valued fibo
        long fib1=0;
        long fib2=1;
        long sum = fib1 + fib2;
        for (int i=1; i<number; i++){
            long fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            sum += fib3;
        }
        return sum;
    }

    //sum of nth even-valued fibonacci numbers
    public long sumOfNthEvenValues(int number){
        if (number <2) return 0;
        //first two even valued fibo
        long fib1=0;
        long fib2=2;
        long sum = fib1 + fib2;
        for (int i=1; i<number; i++){
            long nextEven= (4*fib2)+fib1;
            fib1 = fib2;
            fib2 = nextEven;
            sum += nextEven;
        }
        return sum;
    }

    //sum of even-valued fibonacci numbers with a limit
    public long sumOfLimitedEvenValues(int limit){
        if (limit <2) return 0;
        //first two even valued fibo
        long fib1=0;
        long fib2=2;
        long sum = fib1 + fib2;
        while(fib2<=limit){
            long nextEven= (4*fib2)+fib1;
            if(nextEven>limit) break;
            fib1 = fib2;
            fib2 = nextEven;
            sum += nextEven;
        }
        return sum;
    }

    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.nthfiboNumbRecursion(14));
        System.out.println(fib.nthfiboNumbIteration(14));
        System.out.println(fib.sumOfNthFibo(6));
        System.out.println(fib.sumOfNthEvenValues(4));
        System.out.println(fib.sumOfLimitedEvenValues(400));
    }
}
