package l;

/* JADX INFO: renamed from: l.᩸ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K5L0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21689 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f70365 = new C15340();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f70366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f70367;

    public C21689(EnumC0772 enumC0772, byte b, byte b2) {
        super(enumC0772);
        if (b >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (b2 < -8 || b2 >= 8) {
            throw new RuntimeException("The literal value must be between -8 and 7 inclusive");
        }
        this.f70366 = b;
        this.f70367 = b2;
    }

    public C21689(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        byte b = bArr[i + 1];
        this.f70366 = (byte) (b & 15);
        this.f70367 = (byte) (b >> 4);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f70367 << 4) | this.f70366);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format11n;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f70366;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f70367;
    }
}
