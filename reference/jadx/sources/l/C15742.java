package l;

/* JADX INFO: renamed from: l.ܶ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5BD */
/* JADX INFO: loaded from: classes5.dex */
public final class C15742 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f51185 = new C17234();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f51186;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f51187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f51188;

    public C15742(EnumC7779 enumC7779, short s, short s2, byte b) {
        super(enumC7779);
        if (s >= 256 || s2 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f51186 = (byte) s;
        this.f51188 = (byte) s2;
        this.f51187 = b;
    }

    public C15742(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f51186 = bArr[i + 1];
        this.f51188 = bArr[i + 2];
        this.f51187 = bArr[i + 3];
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f51186);
        c24166.m54138(this.f51188);
        c24166.m54138(this.f51187);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22b;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f51186 & 255;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m37646() {
        return this.f51188 & 255;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f51187;
    }
}
