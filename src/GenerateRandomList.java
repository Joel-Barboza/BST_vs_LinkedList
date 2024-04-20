import java.util.ArrayList;
import java.util.Collections;

public class GenerateRandomList {
    private final ArrayList<Integer> list;

    public GenerateRandomList() {
        list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public ArrayList<Integer> getList(){
        return list;
    }
}
