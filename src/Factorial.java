public class Factorial {
    public static void main(String[] args) {
    int num=5;
        System.out.println(factorial(num));
    }
    public static long factorial(long num ){
        if (num==1)
            return 1;
        else
            return (num*factorial(num-1));
    }
}
