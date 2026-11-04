package l;

/* JADX INFO: renamed from: l.᩸ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58X */
/* JADX INFO: loaded from: classes.dex */
public final class C22696 extends AbstractC14490 implements InterfaceC14512 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f73679 = new C10761();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f73680;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f73681;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f73682;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f73683;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte f73684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f73685;

    public C22696(EnumC7779 enumC7779, int i, byte b, byte b2, byte b3, byte b4, byte b5, AbstractC10739 abstractC10739) {
        super(enumC7779, abstractC10739);
        if (i > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        if (b >= 16 || b2 >= 16 || b3 >= 16 || b4 >= 16 || b5 >= 16) {
            throw new RuntimeException("All register args must fit in 4 bits");
        }
        this.f73685 = (byte) i;
        this.f73681 = b5;
        this.f73684 = b;
        this.f73683 = b2;
        this.f73682 = b3;
        this.f73680 = b4;
    }

    public C22696(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(c24738, enumC7779, bArr, i);
        if (this.f73685 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f73685 = C12556.m31232(bArr[i2]);
        this.f73681 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f73684 = (byte) (b & 15);
        this.f73683 = C12556.m31232(b);
        byte b2 = bArr[i + 5];
        this.f73682 = (byte) (b2 & 15);
        this.f73680 = C12556.m31232(b2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f73685 << 4) | this.f73681);
        c24166.m54139(m35002().m27353());
        c24166.m54138((this.f73683 << 4) | this.f73684);
        c24166.m54138((this.f73680 << 4) | this.f73682);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format35c;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ֫ */
    public final byte mo16451() {
        return this.f73685;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۙ */
    public final byte mo16452() {
        return this.f73681;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩸ */
    public final byte mo16456() {
        return this.f73684;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ۫ */
    public final byte mo16453() {
        return this.f73683;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ܳ */
    public final byte mo16454() {
        return this.f73682;
    }

    @Override // l.InterfaceC14512
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo16455() {
        return this.f73680;
    }
}
