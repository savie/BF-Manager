package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13732 extends C7021 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Comparator f43587;

    public C13732(Object[] objArr, int i, int i2, int i3, Comparator comparator) {
        super(i, i2, i3 | 20, objArr);
        this.f43587 = comparator;
    }

    @Override // l.C7021
    /* JADX INFO: renamed from: ۙ */
    public final C7021 mo19332(int i, int i2) {
        return new C13732(this.f23153, i, i2, this.f23155, this.f43587);
    }

    @Override // l.C7021, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f43587;
    }
}
