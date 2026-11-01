package l;

/* JADX INFO: renamed from: l.ܽܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16751 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f53629 = new C0522();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f53630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f53631;

    public C16751(EnumC0772 enumC0772, short s, short s2) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f53630 = (byte) s;
        this.f53631 = s2;
    }

    public C16751(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f53630 = bArr[i + 1];
        this.f53631 = C14611.m35089(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f53630);
        c4651.m12833(this.f53631);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format21s;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f53630 & 255;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f53631;
    }
}
