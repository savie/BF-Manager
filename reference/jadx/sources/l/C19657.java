package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19657 extends C22641 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Comparator f63329;

    @Override // l.C22641
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2546 mo45321(int i, Object[] objArr) {
        C18450.m42990(objArr.length, 0, i);
        return new C13732(objArr, 0, i, this.f73547, this.f63329);
    }

    public C19657(InterfaceC6847 interfaceC6847, long j, Comparator comparator) {
        super(interfaceC6847, j, 85);
        this.f63329 = comparator;
    }

    @Override // l.C22641, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f63329;
    }
}
