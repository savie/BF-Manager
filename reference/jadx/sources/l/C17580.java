package l;

/* JADX INFO: renamed from: l.ܿ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L69I */
/* JADX INFO: loaded from: classes5.dex */
public final class C17580 extends AbstractC4300 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f55874 = new C12642();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f55875;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f55876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f55877;

    public C17580(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f55876 = (byte) (bArr[i + 1] & 255);
        this.f55877 = (short) C14611.m35087(i + 2, bArr);
        this.f55875 = (short) C14611.m35087(i + 4, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f55876);
        c4651.m12833(this.f55877);
        c4651.m12833(this.f55875);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format3rms;
    }
}
