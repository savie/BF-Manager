package l;

/* JADX INFO: renamed from: l.ۢܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9696 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f32674 = new C1933();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f32675;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f32676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f32677;

    public C9696(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        byte b = bArr[i + 1];
        this.f32676 = (byte) (b & 15);
        this.f32675 = C14611.m35076(b);
        this.f32677 = (short) C14611.m35087(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f32675 << 4) | this.f32676);
        c4651.m12833(this.f32677);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22cs;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f32676;
    }
}
