package l;

/* JADX INFO: renamed from: l.ۛۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6120 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20870;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f20871;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20872;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f20873;

    public C6120(String str, String str2) {
        this.f20870 = str;
        this.f20872 = str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17669() {
        this.f20871 = ApplicationC17729.f58258.getString(this.f20870, null);
        this.f20873 = ApplicationC17729.f58258.getString(this.f20872, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17667() {
        return this.f20871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17668(String str) {
        this.f20871 = str;
        ApplicationC17729.f58258.edit().putString(this.f20870, str).apply();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17670() {
        return this.f20873;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17671(String str) {
        this.f20873 = str;
        ApplicationC17729.f58258.edit().putString(this.f20872, str).apply();
    }
}
