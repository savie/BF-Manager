package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.۠ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8448 extends AbstractC9193 implements InterfaceC25207, InterfaceC16613 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo13472(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo13473(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo13475(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Integer.valueOf(mo13474());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Integer.valueOf(mo13469());
    }

    @Override // l.AbstractC9193, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return mo13468();
    }

    @Override // l.AbstractC9193, l.InterfaceC11868, java.util.Map, java.util.SortedMap
    public final InterfaceC7767 entrySet() {
        return mo13468();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX INFO: renamed from: ۚ */
    public /* bridge */ /* synthetic */ InterfaceC7767 mo13468() {
        return mo13468();
    }
}
