package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֫ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0644 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1993 extends AbstractC25114 {
    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6824() {
        return 0;
    }

    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC25114 mo6826(Comparable comparable, Comparable comparable2) {
        return m6823(comparable.compareTo(comparable2));
    }

    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC25114 mo6827(Object obj, Object obj2, Comparator comparator) {
        return m6823(comparator.compare(obj, obj2));
    }

    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC25114 mo6825(int i, int i2) {
        return m6823(Integer.compare(i, i2));
    }

    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC25114 mo6829(boolean z, boolean z2) {
        return m6823(Boolean.compare(z2, z));
    }

    @Override // l.AbstractC25114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC25114 mo6828(boolean z, boolean z2) {
        return m6823(Boolean.compare(z, z2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC25114 m6823(int i) {
        if (i < 0) {
            return AbstractC25114.f81221;
        }
        return i > 0 ? AbstractC25114.f81222 : AbstractC25114.f81220;
    }
}
