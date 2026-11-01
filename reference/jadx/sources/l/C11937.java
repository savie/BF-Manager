package l;

/* JADX INFO: renamed from: l.ۨ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11937 extends AbstractC4300 implements InterfaceC21940, InterfaceC3594 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f40039 = new C14054();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f40040;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f40041;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f40042;

    public C11937(EnumC0772 enumC0772, byte b, byte b2, short s) {
        super(enumC0772);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (s == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f40042 = b;
        this.f40041 = b2;
        this.f40040 = s;
    }

    public C11937(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        byte b = bArr[i + 1];
        this.f40042 = (byte) (b & 15);
        this.f40041 = C14611.m35076(b);
        this.f40040 = C14611.m35089(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f40041 << 4) | this.f40042);
        c4651.m12833(this.f40040);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22t;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f40042;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m29732() {
        return this.f40041;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ */
    public final int mo11553() {
        return this.f40040;
    }
}
