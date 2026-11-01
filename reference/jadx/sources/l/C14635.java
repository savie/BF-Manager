package l;

/* JADX INFO: renamed from: l.ܳܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 25GH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14635 extends AbstractC11357 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f47865 = new C23807();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f47866;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f47867;

    public C14635(EnumC0772 enumC0772, byte b, byte b2, AbstractC9011 abstractC9011) {
        super(enumC0772, abstractC9011);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f47867 = b;
        this.f47866 = b2;
    }

    public C14635(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        byte b = bArr[i + 1];
        this.f47867 = (byte) (b & 15);
        this.f47866 = C14611.m35076(b);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f47866 << 4) | this.f47867);
        c4651.m12833(m28439().m23325());
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22c;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f47867;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m35140() {
        return this.f47866;
    }
}
