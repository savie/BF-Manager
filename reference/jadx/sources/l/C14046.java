package l;

/* JADX INFO: renamed from: l.ܰ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14046 extends AbstractC4166 {
    public final String toString() {
        return ":matchText";
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        if (c0618 instanceof C9791) {
            return true;
        }
        for (AbstractC14730 abstractC14730 : c0618.m2872()) {
            C9791 c9791 = new C9791(C11639.m29046(c0618.m2837(), C4582.f16235), c0618.mo2853(), c0618.mo2839());
            abstractC14730.m35263(c9791);
            c9791.m2855(abstractC14730);
        }
        return false;
    }
}
