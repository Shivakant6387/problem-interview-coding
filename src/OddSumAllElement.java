public class OddSumAllElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        oddSumAllElement(arr,n);
    }
    public static void oddSumAllElement(int arr[],int n){
        int sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==1){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
