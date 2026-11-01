package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.֡ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C0561 {
    public static Collection unmodifiableCollection(Collection collection) {
        return new C18824(collection);
    }

    public static Set unmodifiableSet(Set set) {
        return new C20457(set);
    }

    public static List unmodifiableList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C10358(list);
        }
        return new C21162(list);
    }

    public static Map unmodifiableMap(Map map) {
        return new C17413(map);
    }

    public static SortedMap unmodifiableSortedMap(SortedMap sortedMap) {
        return new C16929(sortedMap);
    }

    public static Set synchronizedSet(Set set) {
        return new C6829(set);
    }

    public static Set bridge_synchronizedSet(Set set, Object obj) {
        return new C6829(set, obj);
    }

    public static List synchronizedList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C4712(list);
        }
        return new C1184(list);
    }

    public static Map synchronizedMap(Map map) {
        return new C2595(map);
    }
}
