package l;

/* JADX INFO: renamed from: l.۬֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13505 extends AbstractC24188 implements InterfaceC0321, InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f42948 = new C6794();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f42949;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f42950;

    public C13505(EnumC7779 enumC7779, short s, int i) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f42950 = (byte) s;
        this.f42949 = i;
    }

    public C13505(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f42950 = bArr[i + 1];
        this.f42949 = C12556.m31233(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f42950);
        int i2 = this.f42949;
        c24166.m54134(((i + i2) % 2) + i2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format31t;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f42950 & 255;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f42949;
    }
}
