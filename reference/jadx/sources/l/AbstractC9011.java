package l;

/* JADX INFO: renamed from: l.ۡܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H586 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9011 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12063 f30808;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f30807 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30809 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo6315(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo6317();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6319(C4651 c4651);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6320(C13825 c13825, C6187 c6187);

    public AbstractC9011(C12063 c12063) {
        this.f30808 = c12063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23324(C13825 c13825, int i, C6187 c6187) {
        try {
            this.f30807 = c13825.m33639();
            this.f30809 = i;
            mo6320(c13825, c6187);
        } catch (Exception e) {
            throw C11708.m29248(mo6317(), e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m23326(int i, int i2) {
        try {
            this.f30807 = i;
            this.f30809 = i2;
            return mo6315(i);
        } catch (Exception e) {
            throw C11708.m29248(mo6317(), e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23328(C4651 c4651) {
        try {
            c4651.m12840();
            mo6319(c4651);
            c4651.m12834();
        } catch (Exception e) {
            throw C11708.m29248(mo6317(), e);
        }
    }

    public final String toString() {
        return mo6317();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m23325() {
        return this.f30809;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12063 m23327() {
        return this.f30808;
    }
}
