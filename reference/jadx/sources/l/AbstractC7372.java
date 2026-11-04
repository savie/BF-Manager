package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۜ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XC7C */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7372 extends AbstractC0660 implements Cloneable, InterfaceC11431, InterfaceC14375 {
    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo6579(float f);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != ((C1911) this).f6438) {
            return false;
        }
        if (set instanceof InterfaceC11431) {
            return mo2886((InterfaceC11431) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C1911 c1911 = (C1911) this;
        int i = c1911.f6438;
        C13097 c13097 = new C13097(c1911);
        int iFloatToRawIntBits = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits += Float.floatToRawIntBits(c13097.nextFloat());
            i = i2;
        }
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    @Deprecated
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2883(float f) {
        return mo6579(f);
    }
}
