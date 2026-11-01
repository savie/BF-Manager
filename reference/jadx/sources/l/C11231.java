package l;

/* JADX INFO: renamed from: l.ۧ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 764J */
/* JADX INFO: loaded from: classes4.dex */
public final class C11231 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f38003 = new C6291();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f38004;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f38005;

    public C11231(EnumC0772 enumC0772, short s, long j) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f38004 = (byte) s;
        this.f38005 = j;
    }

    public C11231(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f38004 = (byte) (bArr[i + 1] & 255);
        this.f38005 = (((long) bArr[i + 9]) << 56) | (((long) bArr[i + 2]) & 255) | ((((long) bArr[i + 3]) & 255) << 8) | ((((long) bArr[i + 4]) & 255) << 16) | ((((long) bArr[i + 5]) & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 32) | ((((long) bArr[i + 7]) & 255) << 40) | ((((long) bArr[i + 8]) & 255) << 48);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f38004);
        c4651.m12836(this.f38005);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format51l;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f38004 & 255;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f38005;
    }
}
