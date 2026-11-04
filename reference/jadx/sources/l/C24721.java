package l;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩻֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes.dex */
public class C24721 extends C1600 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((NavigableMap) ((C11294) this).f5499).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((NavigableMap) ((C11294) this).f5499).firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((NavigableMap) ((C11294) this).f5499).lastKey();
    }
}
