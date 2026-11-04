package l;

/* JADX INFO: renamed from: l.᩸ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3IXR */
/* JADX INFO: loaded from: classes.dex */
public final class C22867 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f74321 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f74322;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f74323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f74324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3767 f74325;

    public C22867(C3767 c3767, C25237 c25237, int i) {
        this.f74325 = c3767;
        this.f74323 = i;
        this.f74324 = c25237.f81551;
        this.f74322 = c25237.f81549;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22867 m51586(C3767 c3767, C25237 c25237, int i) {
        ThreadLocal threadLocal = f74321;
        C22867 c22867 = (C22867) threadLocal.get();
        threadLocal.set(new C22867(c3767, c25237, i));
        return c22867;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51587(C22867 c22867) {
        ThreadLocal threadLocal = f74321;
        if (c22867 == null) {
            threadLocal.remove();
        } else {
            threadLocal.set(c22867);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22867 m51585() throws C10186 {
        C22867 c22867 = (C22867) f74321.get();
        if (c22867 != null) {
            return c22867;
        }
        throw C10186.m26305("TRANSFER_CONTEXT_REQUIRED", "An authenticated HTTP request is required.");
    }
}
