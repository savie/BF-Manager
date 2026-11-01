package l;

/* JADX INFO: renamed from: l.ۛܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6095 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC7506 f20635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f20640;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 f20639 = C21825.m48588();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC11678 f20637 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20638 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC9729 f20636 = EnumC9729.SPECULATIVE;

    public C6095(C20145 c20145) {
        this.f20640 = c20145;
        this.f20635 = c20145.f65411;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16586(AbstractC23903 abstractC23903, C11948 c11948) {
        this.f20639 = this.f20639.m48591(new C17384(this.f20640.f65437.f20637, abstractC23903, c11948, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16587(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        this.f20639 = this.f20639.m48591(new C17384(this.f20640.f65437.f20637, abstractC23903, null, abstractC16579));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12926 m16585(AbstractC23903 abstractC23903, C19524 c19524, C1116 c1116, C10391 c10391) {
        C12926 c12926Mo4575;
        C20145 c20145 = this.f20640;
        if (c1116 == null) {
            c12926Mo4575 = c20145.f65438.f20035;
        } else {
            c12926Mo4575 = c1116.f5037.mo4575();
        }
        C5870 c5870 = c20145.f65438;
        C13638.requireNonNull(c5870);
        return new C12926(c5870, this.f20636, abstractC23903, this.f20637, c19524, c12926Mo4575, c10391);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9729 m16584() {
        return this.f20636;
    }
}
