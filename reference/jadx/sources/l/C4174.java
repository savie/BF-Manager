package l;

/* JADX INFO: renamed from: l.ۘ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T590 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4174 extends AbstractC4300 implements InterfaceC21940 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f15222 = new C13348();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15223;

    public C4174(EnumC0772 enumC0772, int i) {
        super(enumC0772);
        this.f15223 = i;
    }

    public C4174(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f15223 = C14611.m35077(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(0);
        c4651.m12839(this.f15223);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format30t;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ */
    public final int mo11553() {
        return this.f15223;
    }
}
