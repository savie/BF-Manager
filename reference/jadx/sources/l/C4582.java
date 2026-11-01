package l;

/* JADX INFO: renamed from: l.ۙۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBJF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4582 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16237;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f16238;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C4582 f16236 = new C4582(false, false);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C4582 f16235 = new C4582(true, true);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12730() {
        return this.f16238;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12728() {
        return this.f16237;
    }

    public C4582(boolean z, boolean z2) {
        this.f16238 = z;
        this.f16237 = z2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m12729(String str) {
        String strTrim = str.trim();
        return !this.f16238 ? C1323.m4722(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12726(String str) {
        String strTrim = str.trim();
        return !this.f16237 ? C1323.m4722(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12727(C15436 c15436) {
        if (c15436 == null || this.f16237) {
            return;
        }
        c15436.normalize();
    }
}
