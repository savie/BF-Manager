package l;

/* JADX INFO: renamed from: l.ܺ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16488 extends AbstractC24188 implements InterfaceC0321, InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f53456 = new C24694();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public short f53457;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f53458;

    public C16488(EnumC7779 enumC7779, short s, short s2) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (s2 == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f53458 = (byte) s;
        this.f53457 = s2;
    }

    public C16488(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f53458 = bArr[i + 1];
        this.f53457 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f53458);
        c24166.m54139(this.f53457);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format21t;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f53458 & 255;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f53457;
    }
}
