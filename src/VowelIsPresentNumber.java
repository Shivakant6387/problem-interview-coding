public class VowelIsPresentNumber {
    public static void main(String[] args) {
        String str="test";
        System.out.println(vowelIsPresentOrNot(str));
    }
    public static boolean vowelIsPresentOrNot(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }

}
