public class Palindrome {
    public static void main(String[] args) {
    String str="RaR";
        System.out.println(PalidromeNumber(str));
    }
    public static boolean PalidromeNumber(String str){
    boolean res=true;
    int n=str.length();
    for (int i=0;i<n/2;i++){
        if (str.charAt(i)!=str.charAt(n-i-1)){
            res=false;
            break;
        }
    }
    return res;
    }
}
