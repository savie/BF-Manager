package l;

/* JADX INFO: renamed from: l.۠֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8282 extends AbstractC19709 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16747 f27240;

    public C8282(AbstractC0078 abstractC0078) {
        this.f63447 = abstractC0078;
        this.f27240 = new C16747(abstractC0078);
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        for (int i = 0; i < c15497.mo9543(); i++) {
            AbstractC17734 abstractC17734M41527 = c15497.m41527(i);
            if ((abstractC17734M41527 instanceof C15496) && this.f27240.m39521(c15497, (C15496) abstractC17734M41527) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f63447);
    }
}
