package l;

/* JADX INFO: renamed from: l.᩸᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K69S */
/* JADX INFO: loaded from: classes5.dex */
public final class C21814 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f70627 = new C15465();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f70628;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f70629;

    public C21814(EnumC0772 enumC0772, short s, int i) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f70628 = (byte) s;
        this.f70629 = i;
    }

    public C21814(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f70628 = (byte) (bArr[i + 1] & 255);
        this.f70629 = C14611.m35077(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f70628);
        c4651.m12839(this.f70629);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format31i;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f70628 & 255;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f70629;
    }
}
