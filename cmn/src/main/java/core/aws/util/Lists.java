package core.aws.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author neo
 */
public final class Lists {
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }
}
