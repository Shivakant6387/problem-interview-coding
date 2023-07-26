import java.util.Arrays;

public class SecondLargestNumber {
    public  static void secondLargestNumber(int arr[],int n){
        Arrays.sort(arr);
        int second=0;
        for (int i=0;i<n-1;i++){
            second=arr[i];
        }
        System.out.println(second);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,1,2,3,4};
        int n=arr.length;
        secondLargestNumber(arr,n);
    }
}
