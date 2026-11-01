package l;

/* JADX INFO: renamed from: l.֨᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 455Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1352 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f5684 = new C22520();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f5685;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f5686;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f5687;

    public C1352(EnumC0772 enumC0772, short s, short s2, short s3) {
        super(enumC0772);
        if (s >= 256 || s2 >= 256 || s3 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f5687 = (byte) s;
        this.f5686 = (byte) s2;
        this.f5685 = (byte) s3;
    }

    public C1352(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f5687 = bArr[i + 1];
        this.f5686 = bArr[i + 2];
        this.f5685 = bArr[i + 3];
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f5687);
        c4651.m12841(this.f5686);
        c4651.m12841(this.f5685);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format23x;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4757() {
        return this.f5687 & 255;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m4761() {
        return this.f5686 & 255;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m4760() {
        return this.f5685 & 255;
    }
}
