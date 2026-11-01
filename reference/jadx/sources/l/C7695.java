package l;

/* JADX INFO: renamed from: l.۟᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7695 extends AbstractC16162 {
    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        if (c0617 == c0618) {
            return false;
        }
        for (C0617 c0617M2870 = c0618.m2870(); c0617M2870 != null; c0617M2870 = c0617M2870.m2870()) {
            if (this.f52228.mo2407(c0617, c0617M2870)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f52228);
    }
}
