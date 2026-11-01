package l;

/* JADX INFO: renamed from: l.֡ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0363 implements InterfaceC13855 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12359 f1810;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13190 f1812;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12936 f1813;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f1814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f1816;

    public C0363(AbstractC12359 abstractC12359) {
        this.f1810 = abstractC12359;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m2080(int i, float f, int i2) {
        C12936 c12936M32625;
        AbstractC12359 abstractC12359 = this.f1810;
        C1590 c1590 = abstractC12359.f41286;
        if (i == i2) {
            return 0.0f;
        }
        if (!this.f1815) {
            if (this.f1813 == null || i < this.f1811 || i2 > this.f1814) {
                C14435 c14435 = abstractC12359.f41308.get(abstractC12359.m30733(i, true));
                this.f1811 = c14435.f47316;
                int iM34708 = c14435.m34708();
                this.f1814 = iM34708;
                C13190 c13190 = this.f1812;
                if (c13190 == null) {
                    c12936M32625 = abstractC12359.f41286.m17860(this.f1816, this.f1811, iM34708, 0.0f, (C2605) null);
                } else {
                    c12936M32625 = c13190.m32625(this.f1816, this.f1811, iM34708, c1590);
                }
                this.f1813 = c12936M32625;
            }
            if (i >= this.f1811 && i2 <= this.f1814) {
                return this.f1813.m32047(Float.POSITIVE_INFINITY, i2) - this.f1813.m32047(Float.POSITIVE_INFINITY, i);
            }
        }
        C13190 c13191 = this.f1812;
        return c13191 == null ? c1590.m17871(this.f1816, i, i2, f) : c13191.m32623(this.f1816, i, i2, f, abstractC12359.f41286);
    }
}
