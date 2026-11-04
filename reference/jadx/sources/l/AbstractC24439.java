package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.᩺ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24439 extends AbstractC12504 implements InterfaceC10442, InterfaceC16613 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo19865(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo19864(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo19860(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Character.valueOf(mo19862());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Character.valueOf(mo19861());
    }

    @Override // l.AbstractC12504, java.util.Map
    public final Set entrySet() {
        return mo19859();
    }

    @Override // l.AbstractC12504, l.InterfaceC11934, java.util.Map
    public final InterfaceC7767 entrySet() {
        return mo19859();
    }

    /* JADX INFO: renamed from: ܳ */
    public /* bridge */ /* synthetic */ InterfaceC7767 mo19859() {
        return mo19859();
    }
}
