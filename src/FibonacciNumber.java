public class FibonacciNumber {
    public static void main(String[] args) {
    int number=20;
    fibonacciNumber(number);
    }
    public static void fibonacciNumber(int number){
        int a=0,b=1,c=1;
        for (int i=0;i<number;i++){
            System.out.print(a+", ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
