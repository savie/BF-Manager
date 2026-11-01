package l;

/* JADX INFO: renamed from: l.ۡ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BA4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9175 extends AbstractC10794 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20671 f31218;

    public C9175(C17143 c17143, C11312 c11312, C0727 c0727, C20671 c20671) {
        super(c17143, c11312, c0727);
        if (c20671 == null) {
            throw new NullPointerException("target == null");
        }
        this.f31218 = c20671;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8570(C17143 c17143) {
        return new C9175(c17143, m38701(), m38695(), this.f31218);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C9175(m38693(), m38701(), c0727, this.f31218);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20671 m23590() {
        return this.f31218;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23588() {
        return this.f31218.m38698();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m23589() {
        return this.f31218.m38698() - m38698();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m23587() {
        return m38699() && this.f31218.m38699();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        C20671 c20671 = this.f31218;
        return c20671 == null ? "????" : c20671.m38704();
    }
}
