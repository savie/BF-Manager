package l;

/* JADX INFO: renamed from: l.ܶۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 764J */
/* JADX INFO: loaded from: classes5.dex */
public final class C15982 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f51895 = new C17474();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f51896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f51897;

    public C15982(EnumC7779 enumC7779, short s, long j) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f51896 = (byte) s;
        this.f51897 = j;
    }

    public C15982(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f51896 = (byte) (bArr[i + 1] & 255);
        this.f51897 = (((long) bArr[i + 9]) << 56) | (((long) bArr[i + 2]) & 255) | ((((long) bArr[i + 3]) & 255) << 8) | ((((long) bArr[i + 4]) & 255) << 16) | ((((long) bArr[i + 5]) & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 32) | ((((long) bArr[i + 7]) & 255) << 40) | ((((long) bArr[i + 8]) & 255) << 48);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f51896);
        c24166.m54132(this.f51897);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format51l;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f51896 & 255;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f51897;
    }
}
