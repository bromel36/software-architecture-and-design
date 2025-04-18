package chapter5.ex2;

import java.util.List;

public interface Search<T> {
    int search(List<T> list, T key);
}
