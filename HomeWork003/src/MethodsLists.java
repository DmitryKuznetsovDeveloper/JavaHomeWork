import java.util.ArrayList;
import java.util.List;

public class MethodsLists {

    public static List<Integer> removeEvenNumbers(List<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public static int middlArifmetic(List<Integer> list) {
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i);
        }
        return res / list.size();
    }
}
