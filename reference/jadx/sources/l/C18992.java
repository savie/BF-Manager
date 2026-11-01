package l;

/* JADX INFO: renamed from: l.ᩴ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E67Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18992 extends AbstractC4300 implements InterfaceC21940, InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f61470 = new C18286();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f61472;

    public C18992(EnumC0772 enumC0772, short s, int i) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f61472 = (byte) s;
        this.f61471 = i;
    }

    public C18992(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f61472 = bArr[i + 1];
        this.f61471 = C14611.m35077(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f61472);
        int i2 = this.f61471;
        c4651.m12839(((i + i2) % 2) + i2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format31t;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f61472 & 255;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ */
    public final int mo11553() {
        return this.f61471;
    }
}
