package l;

/* JADX INFO: renamed from: l.᩺᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B65P */
/* JADX INFO: loaded from: classes.dex */
public final class C23226 extends AbstractC11357 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f75355 = new C6997();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f75356;

    public C23226(EnumC0772 enumC0772, short s, C14655 c14655) {
        super(enumC0772, c14655);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f75356 = (byte) s;
    }

    public C23226(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        this.f75356 = bArr[i + 1];
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f75356);
        c4651.m12839(m28439().m23325());
    }

    @Override // l.AbstractC11357
    /* JADX INFO: renamed from: ۙ */
    public final int mo28437(int i, byte[] bArr) {
        return C14611.m35077(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format31c;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f75356 & 255;
    }
}
