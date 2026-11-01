package l;

/* JADX INFO: renamed from: l.ܰᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14000 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f46011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46012;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f46013;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f46014;

    public C14000(String str, String str2) {
        this.f46012 = str;
        this.f46014 = str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33843() {
        this.f46013 = ApplicationC0716.f2992.getString(this.f46012, null);
        this.f46011 = ApplicationC0716.f2992.getString(this.f46014, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33841() {
        return this.f46013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33842(String str) {
        this.f46013 = str;
        ApplicationC0716.f2992.edit().putString(this.f46012, str).apply();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m33844() {
        return this.f46011;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33845(String str) {
        this.f46011 = str;
        ApplicationC0716.f2992.edit().putString(this.f46014, str).apply();
    }
}
