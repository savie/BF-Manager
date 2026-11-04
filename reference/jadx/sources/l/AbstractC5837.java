package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: FBSP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5837 extends AbstractC13711 implements Cloneable, InterfaceC7811, InterfaceC14375 {
    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo11667(long j);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        if (set instanceof InterfaceC7811) {
            return mo6353((InterfaceC7811) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int size = size();
        InterfaceC12285 it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = it.nextLong();
            i += (int) (jNextLong ^ (jNextLong >>> 32));
            size = i2;
        }
    }

    @Override // l.InterfaceC5574
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16517(long j) {
        return mo11667(j);
    }
}
