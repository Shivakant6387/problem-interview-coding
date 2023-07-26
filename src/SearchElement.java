public class SearchElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=9;
        searchingElement(arr,key);
    }
    public static void searchingElement(int arr[],int key){
        int n=arr.length;
        for (int i=0;i<n;i++)
            if (key==arr[i]){
                System.out.println(arr[i]+"is found");
                System.exit(0);
            }
        System.out.println("Not found");
    }
}
