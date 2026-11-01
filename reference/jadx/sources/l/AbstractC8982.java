package l;

/* JADX INFO: renamed from: l.ۡܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8982 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30753;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f30754;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo6258(C0617 c0617);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo6259();

    public AbstractC8982(int i, int i2) {
        this.f30753 = i;
        this.f30754 = i2;
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        C0617 c0617Mo2849 = c0618.mo2849();
        if (c0617Mo2849 == null || (c0617Mo2849 instanceof C10497)) {
            return false;
        }
        int iMo6258 = mo6258(c0618);
        int i = this.f30754;
        int i2 = this.f30753;
        if (i2 == 0) {
            return iMo6258 == i;
        }
        int i3 = iMo6258 - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public String toString() {
        int i = this.f30754;
        int i2 = this.f30753;
        if (i2 == 0) {
            return String.format(":%s(%d)", mo6259(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", mo6259(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", mo6259(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
