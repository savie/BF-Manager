package l;

/* JADX INFO: renamed from: l.᩷᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C21123 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f68791 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68792 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68790 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47548(C2455 c2455) {
        C12107 entry = c2455.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            this.f68791 = false;
            this.f68792 = false;
            return;
        }
        try {
            C20945 c20945M47094 = C20945.m47094(c2455.m7471(entry));
            this.f68791 = C20240.m45752(c20945M47094);
            this.f68792 = C20240.m45748(c20945M47094);
        } catch (Throwable unused) {
            this.f68791 = false;
            this.f68792 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47549(byte[] bArr) {
        try {
            C20945 c20945M47103 = C20945.m47103(bArr);
            this.f68791 = C20240.m45752(c20945M47103);
            this.f68792 = C20240.m45748(c20945M47103);
        } catch (Exception unused) {
            this.f68791 = false;
            this.f68792 = false;
        }
    }
}
