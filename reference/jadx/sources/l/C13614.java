package l;

/* JADX INFO: renamed from: l.ܰۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C13614 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6222 f44918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11497 f44919;

    public C13614(C11497 c11497, C6222 c6222) {
        this.f44919 = c11497;
        this.f44918 = c6222;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4440 m33293(CharSequence charSequence, String str) {
        C6222 c6222 = this.f44918;
        c6222.m17276reset(charSequence);
        boolean zMatches = "exact".equals(this.f44919.f38671) ? c6222.matches() : c6222.find();
        m33295();
        if (zMatches) {
            return new C4440(str, c6222.start(), c6222.end(), charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33296(CharSequence charSequence, C6557 c6557) throws C12731 {
        C6222 c6222 = this.f44918;
        c6222.m17276reset(charSequence);
        if ("exact".equals(this.f44919.f38671)) {
            boolean zMatches = c6222.matches();
            m33295();
            if (zMatches) {
                c6557.m17782(new C4440("dexString", c6222.start(), c6222.end(), charSequence));
                return;
            }
            return;
        }
        while (c6222.find()) {
            m33295();
            c6557.m17782(new C4440("dexString", c6222.start(), c6222.end(), charSequence));
        }
        m33295();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4440 m33292(int i, int i2, CharSequence charSequence) throws C12731 {
        C6222 c6222 = this.f44918;
        c6222.m17276reset(charSequence);
        while (c6222.find()) {
            m33295();
            if (c6222.start() < i2 && c6222.end() > i) {
                return new C4440("dexClassName", c6222.start(), c6222.end(), charSequence);
            }
        }
        m33295();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33295() throws C12731 {
        C6222 c6222 = this.f44918;
        if (c6222.m17270()) {
            throw C12731.m31629(null, "REGEX_TIMEOUT", "Regex matching timed out.", "fatal");
        }
        if (c6222.m17258()) {
            throw C12731.m31629(null, "REGEX_RESOURCE_LIMIT", "Regex matching exceeded its execution memory limit.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6222 m33294(C14795 c14795) {
        C6222 c6222 = this.f44918;
        c6222.m17276reset((CharSequence) c14795);
        return c6222;
    }
}
