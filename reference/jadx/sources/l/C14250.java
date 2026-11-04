package l;

/* JADX INFO: renamed from: l.ܰ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5BC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14250 extends AbstractC24188 implements InterfaceC0321, InterfaceC10015 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f45050 = new C3810();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f45051;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f45052;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f45053;

    public C14250(EnumC7779 enumC7779, byte b, byte b2, short s) {
        super(enumC7779);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (s == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f45052 = b;
        this.f45051 = b2;
        this.f45053 = s;
    }

    public C14250(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        byte b = bArr[i + 1];
        this.f45052 = (byte) (b & 15);
        this.f45051 = C12556.m31232(b);
        this.f45053 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f45051 << 4) | this.f45052);
        c24166.m54139(this.f45053);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22t;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f45052;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m34591() {
        return this.f45051;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f45053;
    }
}
