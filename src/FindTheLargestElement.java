import java.util.Arrays;

public class FindTheLargestElement {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        findLargestElement(arr,n);
    }
    public static void findLargestElement(int arr[],int n){
        int largest=0;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            largest=arr[i];
        }
        System.out.println(largest);
    }
}
