package l;

/* JADX INFO: renamed from: l.ᩴ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18984 extends AbstractC16162 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23944 f61446;

    public C18984(AbstractC4166 abstractC4166) {
        this.f52228 = abstractC4166;
        this.f61446 = new C23944(abstractC4166);
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        for (int i = 0; i < c0618.mo2831(); i++) {
            AbstractC14730 abstractC14730M35261 = c0618.m35261(i);
            if ((abstractC14730M35261 instanceof C0617) && this.f61446.m52779(c0618, (C0617) abstractC14730M35261) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f52228);
    }
}
