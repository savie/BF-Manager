package l;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩸ۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public class C21541 extends C22953 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((NavigableMap) ((C15192) this).f74624).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((NavigableMap) ((C15192) this).f74624).firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((NavigableMap) ((C15192) this).f74624).lastKey();
    }
}
