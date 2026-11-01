package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.۬ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13035 extends AbstractC22207 implements InterfaceC19241, InterfaceC4464 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo37338(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo37340(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo37342(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Character.valueOf(mo37341());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Character.valueOf(mo37343());
    }

    @Override // l.AbstractC22207, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return mo8794();
    }

    @Override // l.AbstractC22207, l.InterfaceC9321, java.util.Map
    public final InterfaceC18660 entrySet() {
        return mo8794();
    }

    @Override // l.InterfaceC9321
    /* JADX INFO: renamed from: ᩹ */
    public /* bridge */ /* synthetic */ InterfaceC18660 mo8794() {
        return mo8794();
    }
}
