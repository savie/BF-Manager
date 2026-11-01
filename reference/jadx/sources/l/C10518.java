package l;

/* JADX INFO: renamed from: l.ۤ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10518 extends AbstractC16162 {
    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        if (c0617 == c0618) {
            return false;
        }
        for (C0617 c0617Mo2849 = c0618.mo2849(); c0617Mo2849 != null; c0617Mo2849 = c0617Mo2849.mo2849()) {
            if (this.f52228.mo2407(c0617, c0617Mo2849)) {
                return true;
            }
            if (c0617Mo2849 == c0617) {
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.f52228);
    }
}
