package cheapter5.ex2;

import java.util.List;

public class LinearSearch<T> implements Search<T> {
    @Override
    public int search(List<T> list, T key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(key)){
                return i;
            }
        }
        return -1;
    }
}
