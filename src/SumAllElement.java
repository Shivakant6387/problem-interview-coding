public class SumAllElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,9,8,7,6};
        int n=arr.length;
        sumAllElement(arr,n);
    }
    public static void sumAllElement(int arr[],int n){
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
