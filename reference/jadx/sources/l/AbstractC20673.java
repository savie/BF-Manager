package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.᩷ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20673 extends AbstractC10090 implements InterfaceC4485, InterfaceC4464 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo8943(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo8950(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo8952(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Integer.valueOf(mo8951());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Integer.valueOf(mo8953());
    }

    @Override // l.AbstractC10090, java.util.Map
    public final Set entrySet() {
        return mo8949();
    }

    @Override // l.AbstractC10090, l.InterfaceC9612, java.util.Map
    public final InterfaceC18660 entrySet() {
        return mo8949();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX INFO: renamed from: ۬ */
    public /* bridge */ /* synthetic */ InterfaceC18660 mo8949() {
        return mo8949();
    }
}
