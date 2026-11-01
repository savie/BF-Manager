package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܺۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XC7C */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15921 extends AbstractC18036 implements Cloneable, InterfaceC9302, InterfaceC22810 {
    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo5899(float f);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != ((C1808) this).f6965) {
            return false;
        }
        if (set instanceof InterfaceC9302) {
            return mo28525((InterfaceC9302) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C1808 c1808 = (C1808) this;
        int i = c1808.f6965;
        C23682 c23682 = new C23682(c1808);
        int iFloatToRawIntBits = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits += Float.floatToRawIntBits(c23682.nextFloat());
            i = i2;
        }
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6889(float f) {
        return mo5899(f);
    }
}
