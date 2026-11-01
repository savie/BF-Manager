package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩶ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20072 extends C15839 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Comparator f65210;

    public C20072(Object[] objArr, int i, int i2, int i3, Comparator comparator) {
        super(i, i2, i3 | 20, objArr);
        this.f65210 = comparator;
    }

    @Override // l.C15839
    /* JADX INFO: renamed from: ۙ */
    public final C15839 mo37649(int i, int i2) {
        return new C20072(this.f51264, i, i2, this.f51266, this.f65210);
    }

    @Override // l.C15839, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f65210;
    }
}
