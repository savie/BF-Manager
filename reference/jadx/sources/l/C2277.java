package l;

/* JADX INFO: renamed from: l.֫᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C2277 implements InterfaceC6006 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7421;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f7422;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f7423;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7719(C2277 c2277, C7453 c7453) {
        String strM56003;
        int iM56029 = c7453.m56029() + c7453.m56002();
        c7453.m56021(4);
        c7453.m56021(4);
        c7453.m56021(2);
        c2277.f7422 = c7453.m56017();
        int iM56017 = c7453.m56017();
        int iM56018 = c7453.m56017();
        int iM56019 = c7453.m56017();
        int iM560110 = c7453.m56017();
        c2277.f7421 = c7453.m56012() == 0;
        int iM560210 = c7453.m56029();
        if (iM56018 > 0) {
            c7453.m56027(iM56017 + iM560210);
            strM56003 = c7453.m56003(iM56018 / 2, C22150.f71349);
        } else {
            strM56003 = null;
        }
        c7453.m56027(iM560210);
        c2277.f7423 = strM56003;
        int iM560211 = c7453.m56029();
        if (iM560110 > 0) {
            c7453.m56027(iM56019 + iM560211);
            c7453.m56003(iM560110 / 2, C22150.f71349);
        }
        c7453.m56027(iM560211);
        c7453.m56027(iM56029);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7721() {
        return this.f7421;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m7722() {
        return this.f7422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7720() {
        return this.f7423;
    }
}
