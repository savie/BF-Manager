package l;

/* JADX INFO: renamed from: l.ۚۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5542 extends AbstractC14490 implements InterfaceC14512 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f19254 = new C12999();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f19255;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f19256;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f19257;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f19258;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte f19259;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f19260;

    public C5542(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(c24738, enumC7779, bArr, i);
        if (this.f19260 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f19260 = C12556.m31232(bArr[i2]);
        this.f19256 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f19259 = (byte) (b & 15);
        this.f19258 = C12556.m31232(b);
        byte b2 = bArr[i + 5];
        this.f19257 = (byte) (b2 & 15);
        this.f19255 = C12556.m31232(b2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f19260 << 4) | this.f19256);
        c24166.m54139(m35002().m27353());
        c24166.m54138((this.f19258 << 4) | this.f19259);
        c24166.m54138((this.f19255 << 4) | this.f19257);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format35s;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo16451() {
        return this.f19260;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo16452() {
        return this.f19256;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte mo16456() {
        return this.f19259;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte mo16453() {
        return this.f19258;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte mo16454() {
        return this.f19257;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte mo16455() {
        return this.f19255;
    }
}
