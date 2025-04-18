package chapter5.ex2;

import java.util.Collections;
import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {
    @Override
    public int search(List<T> list, T key) {
        Collections.sort(list);
        if (list.isEmpty()){
            return -1;
        }
        int left = 0;
        int right = list.size() - 1;
        int mid = 0;
        int cmp = 0;
        while (left <= right){
            mid = (left + right) / 2;
            cmp = list.get(mid).compareTo(key);
            if (cmp == 0){
                return mid;
            }
            else if (cmp < 0){
                left = mid + 1;
            }
            else if (cmp > 0){
                right = mid - 1;
            }
        }
        return -1;
    }
}
