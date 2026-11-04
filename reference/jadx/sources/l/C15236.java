package l;

/* JADX INFO: renamed from: l.ܳۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15236 extends AbstractC24188 implements InterfaceC14512 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f49708 = new C19712();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f49709;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f49710;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f49711;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f49712;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte f49713;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f49714;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f49715;

    public C15236(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        int i2 = i + 1;
        this.f49715 = C12556.m31232(bArr[i2]);
        this.f49710 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f49713 = (byte) (b & 15);
        this.f49712 = C12556.m31232(b);
        byte b2 = bArr[i + 5];
        this.f49711 = (byte) (b2 & 15);
        this.f49709 = C12556.m31232(b2);
        this.f49714 = (short) C12556.m31238(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f49715 << 4) | this.f49710);
        c24166.m54139(this.f49714);
        c24166.m54138((this.f49712 << 4) | this.f49713);
        c24166.m54138((this.f49709 << 4) | this.f49711);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format35ms;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ֫ */
    public final byte mo16451() {
        return this.f49715;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۙ */
    public final byte mo16452() {
        return this.f49710;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩸ */
    public final byte mo16456() {
        return this.f49713;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۫ */
    public final byte mo16453() {
        return this.f49712;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ܳ */
    public final byte mo16454() {
        return this.f49711;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo16455() {
        return this.f49709;
    }
}
