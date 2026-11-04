package l;

/* JADX INFO: renamed from: l.᩵֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBJF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20193 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C20193 f64825 = new C20193(false, false);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C20193 f64826 = new C20193(true, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f64827;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f64828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46443() {
        return this.f64828;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46441() {
        return this.f64827;
    }

    public C20193(boolean z, boolean z2) {
        this.f64828 = z;
        this.f64827 = z2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m46442(String str) {
        String strTrim = str.trim();
        return !this.f64828 ? C15300.m36731(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46439(String str) {
        String strTrim = str.trim();
        return !this.f64827 ? C15300.m36731(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46440(C10363 c10363) {
        if (c10363 == null || this.f64827) {
            return;
        }
        c10363.normalize();
    }
}
