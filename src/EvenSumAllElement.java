public class EvenSumAllElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        evenSumAllElement(arr,n);
    }
    public static void evenSumAllElement(int arr[],int n){
        int sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
