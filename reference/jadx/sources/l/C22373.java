package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22373 extends C5439 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16481 f73050;

    public C22373(int[] iArr, int i, int i2, int i3, InterfaceC16481 interfaceC16481) {
        super(i, i2, i3 | 20, iArr);
        this.f73050 = interfaceC16481;
    }

    @Override // l.C5439
    /* JADX INFO: renamed from: ۙ */
    public final C5439 mo15039(int i, int i2) {
        return new C22373(this.f18754, i, i2, this.f18756, this.f73050);
    }

    @Override // l.C5439, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f73050;
    }

    @Override // l.C5439, l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        return this.f73050;
    }
}
