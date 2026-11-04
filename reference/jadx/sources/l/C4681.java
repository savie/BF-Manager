package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۙۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C4681 {
    public static Collection unmodifiableCollection(Collection collection) {
        return new C8233(collection);
    }

    public static Set unmodifiableSet(Set set) {
        return new C21791(set);
    }

    public static List unmodifiableList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C9723(list);
        }
        return new C14176(list);
    }

    public static Map unmodifiableMap(Map map) {
        return new C22908(map);
    }

    public static SortedMap unmodifiableSortedMap(SortedMap sortedMap) {
        return new C22537(sortedMap);
    }

    public static Set synchronizedSet(Set set) {
        return new C4504(set);
    }

    public static Set bridge_synchronizedSet(Set set, Object obj) {
        return new C4504(set, obj);
    }

    public static List synchronizedList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C17182(list);
        }
        return new C12707(list);
    }

    public static Map synchronizedMap(Map map) {
        return new C23896(map);
    }
}
