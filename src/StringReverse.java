public class StringReverse {
    public static void main(String[] args) {
        String str="Teesa";
        char ch=0;
        String res="";
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            res+=ch;
        }

        System.out.println(res);
    }
}
