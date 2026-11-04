package l;

/* JADX INFO: renamed from: l.᩷֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55LT */
/* JADX INFO: loaded from: classes.dex */
public final class C21710 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f69284 = new C4556();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f69285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f69286;

    public C21710(EnumC7779 enumC7779, byte b, byte b2) {
        super(enumC7779);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f69286 = b;
        this.f69285 = b2;
    }

    public C21710(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        byte b = bArr[i + 1];
        this.f69286 = (byte) (b & 15);
        this.f69285 = C12556.m31232(b);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f69285 << 4) | this.f69286);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format12x;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f69286;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m49280() {
        return this.f69285;
    }
}
