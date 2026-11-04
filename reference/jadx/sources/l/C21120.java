package l;

/* JADX INFO: renamed from: l.᩶ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1YC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21120 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f67468;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f67469;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f67470;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f67471;

    public C21120(C20348 c20348) {
        this.f67471 = c20348.m46758();
        this.f67470 = c20348.m46758();
        this.f67468 = C14584.m35193(c20348.m46758(), new String[0]);
        this.f67469 = c20348.readLong();
    }

    public C21120(AbstractC22044 abstractC22044, String str, String str2) {
        this.f67471 = str;
        this.f67470 = str2;
        this.f67468 = abstractC22044;
        this.f67469 = abstractC22044.mo4286();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48218() {
        this.f67469 = this.f67468.mo4286();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m48217() {
        return this.f67469;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48219() {
        AbstractC22044 abstractC22044 = this.f67468;
        return abstractC22044.mo2934() && abstractC22044.mo4286() != this.f67469;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m48221() {
        return this.f67471;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48220() {
        return this.f67470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m48215() {
        return this.f67468;
    }

    public final String toString() {
        return this.f67471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48216(C6178 c6178) {
        c6178.m17800(this.f67471);
        c6178.m17800(this.f67470);
        c6178.m17800(this.f67468.mo4294());
        c6178.m17803(this.f67469);
    }
}
