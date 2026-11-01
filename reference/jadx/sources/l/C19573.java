package l;

/* JADX INFO: renamed from: l.᩵ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 55LT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19573 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f62884 = new C8284();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f62885;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62886;

    public C19573(EnumC0772 enumC0772, byte b, byte b2) {
        super(enumC0772);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f62886 = b;
        this.f62885 = b2;
    }

    public C19573(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        byte b = bArr[i + 1];
        this.f62886 = (byte) (b & 15);
        this.f62885 = C14611.m35076(b);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f62885 << 4) | this.f62886);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format12x;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f62886;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m44678() {
        return this.f62885;
    }
}
