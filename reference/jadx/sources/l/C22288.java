package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0644 */
/* JADX INFO: loaded from: classes.dex */
public final class C22288 extends AbstractC13116 {
    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ۙ */
    public final int mo4142() {
        return 0;
    }

    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13116 mo4144(Comparable comparable, Comparable comparable2) {
        return m49455(comparable.compareTo(comparable2));
    }

    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13116 mo4145(Object obj, Object obj2, Comparator comparator) {
        return m49455(comparator.compare(obj, obj2));
    }

    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13116 mo4143(int i, int i2) {
        return m49455(Integer.compare(i, i2));
    }

    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC13116 mo4147(boolean z, boolean z2) {
        return m49455(Boolean.compare(z2, z));
    }

    @Override // l.AbstractC13116
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13116 mo4146(boolean z, boolean z2) {
        return m49455(Boolean.compare(z, z2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13116 m49455(int i) {
        if (i < 0) {
            return AbstractC13116.f43691;
        }
        return i > 0 ? AbstractC13116.f43692 : AbstractC13116.f43690;
    }
}
