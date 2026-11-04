package l;

/* JADX INFO: renamed from: l.ۨ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12013 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f38742 = new C20218();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f38743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f38744;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f38745;

    public C12013(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        byte b = bArr[i + 1];
        this.f38743 = (byte) (b & 15);
        this.f38745 = C12556.m31232(b);
        this.f38744 = (short) C12556.m31238(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f38745 << 4) | this.f38743);
        c24166.m54139(this.f38744);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22cs;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f38743;
    }
}
