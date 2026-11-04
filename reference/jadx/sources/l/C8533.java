package l;

/* JADX INFO: renamed from: l.۠ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes4.dex */
public final class C8533 implements InterfaceC7829 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1314 f27876;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27877;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13753 f27878;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f27879;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19608 f27880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27881;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27882;

    public C8533(AbstractC13753 abstractC13753) {
        this.f27878 = abstractC13753;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m22846(int i, float f, int i2) {
        C19608 c19608M4796;
        AbstractC13753 abstractC13753 = this.f27878;
        C14540 c14540 = abstractC13753.f43640;
        if (i == i2) {
            return 0.0f;
        }
        if (this.f27881) {
            return c14540.m16218(abstractC13753.f43673, i, i2, f);
        }
        if (this.f27880 == null || i < this.f27882 || i2 > this.f27877) {
            C14366 c14366 = abstractC13753.f43643.get(abstractC13753.m33619(i, true));
            this.f27882 = c14366.f45295;
            int iM34799 = c14366.m34799();
            this.f27877 = iM34799;
            C1314 c1314 = this.f27876;
            if (c1314 == null) {
                c19608M4796 = abstractC13753.f43640.m16196(this.f27879, this.f27882, iM34799, 0.0f, (C0568) null);
            } else {
                c19608M4796 = c1314.m4796(this.f27882, iM34799, c14540, this.f27879);
            }
            this.f27880 = c19608M4796;
        }
        if (i >= this.f27882 && i2 <= this.f27877) {
            return this.f27880.m45254(Float.POSITIVE_INFINITY, i2) - this.f27880.m45254(Float.POSITIVE_INFINITY, i);
        }
        C1314 c1315 = this.f27876;
        return c1315 == null ? c14540.m16205(this.f27879, i, i2, f) : c1315.m4792(this.f27879, i, i2, f, abstractC13753.f43640);
    }
}
