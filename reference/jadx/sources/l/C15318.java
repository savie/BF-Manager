package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܶܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15318 extends C23079 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16481 f49905;

    @Override // l.C23079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11790 mo36682(int i, int[] iArr) {
        C7000.m18807(iArr.length, 0, i);
        return new C22373(iArr, 0, i, this.f74979, this.f49905);
    }

    public C15318(InterfaceC21191 interfaceC21191, long j, InterfaceC16481 interfaceC16481) {
        super(interfaceC21191, j, 341);
        this.f49905 = interfaceC16481;
    }

    @Override // l.C23079, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f49905;
    }

    @Override // l.C23079, l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        return this.f49905;
    }
}
