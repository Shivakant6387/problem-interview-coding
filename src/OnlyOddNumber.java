import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumber {
    public static boolean onlyOddNumber(List<Integer>list){
        for (int i:list){
            if (i%2==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer>number=new ArrayList<>();
        number.add(29);
        System.out.println(onlyOddNumber(number));
    }
}
