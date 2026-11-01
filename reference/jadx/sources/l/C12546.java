package l;

/* JADX INFO: renamed from: l.۫ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f41997;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f41998;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15274 f41999;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17484 f42000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f42001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42002;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42003;

    public C12546(C17484 c17484, String str, int i, C15274 c15274) {
        this.f42000 = c17484;
        this.f41998 = str;
        this.f42003 = i;
        this.f41997 = c15274 == null ? -1L : c15274.f49780;
        if (c15274 == null || !c15274.m36576()) {
            return;
        }
        this.f41999 = c15274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31214(AbstractC16511 abstractC16511, AbstractC16511 abstractC16512) {
        C15274 c15274;
        int i = this.f42003;
        if (i >= abstractC16511.mo19929()) {
            if (i >= abstractC16512.mo19929()) {
                i = -1;
                break;
            }
        } else {
            C17484 c17484 = this.f42000;
            abstractC16511.m38827(i, c17484.f55624);
            int i2 = c17484.f55624.f1580;
            while (true) {
                if (i2 > c17484.f55624.f1587) {
                    i = -1;
                    break;
                }
                int iMo14959 = abstractC16512.mo14959(abstractC16511.mo14960(i2));
                if (iMo14959 != -1) {
                    i = abstractC16512.mo5920(iMo14959, c17484.f55627, false).f64168;
                    break;
                }
                i2++;
            }
        }
        this.f42003 = i;
        return i != -1 && ((c15274 = this.f41999) == null || abstractC16512.mo14959(c15274.f49778) != -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31213(int i, C15274 c15274) {
        if (c15274 == null) {
            return i == this.f42003;
        }
        long j = c15274.f49780;
        C15274 c15275 = this.f41999;
        if (c15275 == null) {
            return !c15274.m36576() && j == this.f41997;
        }
        return j == c15275.f49780 && c15274.f49779 == c15275.f49779 && c15274.f49782 == c15275.f49782;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31216(int i, C15274 c15274) {
        if (this.f41997 == -1 && i == this.f42003 && c15274 != null) {
            long j = c15274.f49780;
            if (j >= this.f42000.m40679()) {
                this.f41997 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31215(C19602 c19602) {
        C15274 c15274 = c19602.f62947;
        AbstractC16511 abstractC16511 = c19602.f62945;
        if (c15274 == null) {
            return this.f42003 != c19602.f62943;
        }
        long j = this.f41997;
        if (j == -1) {
            return false;
        }
        if (c15274.f49780 > j) {
            return true;
        }
        C15274 c15275 = this.f41999;
        if (c15275 == null) {
            return false;
        }
        int i = c15275.f49779;
        int iMo14959 = abstractC16511.mo14959(c15274.f49778);
        int iMo149510 = abstractC16511.mo14959(c15275.f49778);
        if (c15274.f49780 < c15275.f49780 || iMo14959 < iMo149510) {
            return false;
        }
        if (iMo14959 > iMo149510) {
            return true;
        }
        if (c15274.m36576()) {
            int i2 = c15274.f49779;
            int i3 = c15274.f49782;
            if (i2 <= i) {
                return i2 == i && i3 > c15275.f49782;
            }
            return true;
        }
        int i4 = c15274.f49781;
        return i4 == -1 || i4 > i;
    }
}
