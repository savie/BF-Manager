package l;

/* JADX INFO: renamed from: l.᩵ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20718 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C20718 f66396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3564 f66398;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3564 f66399;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f66397 = C10363.m26645("jsoup.sourceRange");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f66395 = C10363.m26645("jsoup.endSourceRange");

    static {
        C3564 c3564 = new C3564(-1, -1, -1);
        f66396 = new C20718(c3564, c3564);
    }

    public C20718(C3564 c3564, C3564 c3565) {
        this.f66399 = c3564;
        this.f66398 = c3565;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3564 m47386() {
        return this.f66399;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3564 m47384() {
        return this.f66398;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47387() {
        return this != f66396;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20718 m47383(AbstractC17734 abstractC17734, boolean z) {
        String str = z ? f66397 : f66395;
        if (!abstractC17734.mo41539(str)) {
            return f66396;
        }
        Object objM26659 = abstractC17734.mo37069().m26659(str);
        if (objM26659 != null) {
            return (C20718) objM26659;
        }
        throw new C21552("Object must not be null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47385(AbstractC17734 abstractC17734, boolean z) {
        abstractC17734.mo37069().m26652(z ? f66397 : f66395, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20718.class != obj.getClass()) {
            return false;
        }
        C20718 c20718 = (C20718) obj;
        if (this.f66399.equals(c20718.f66399)) {
            return this.f66398.equals(c20718.f66398);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66398.hashCode() + (this.f66399.hashCode() * 31);
    }

    public final String toString() {
        return C20196.m46451(String.valueOf(this.f66399), "-", String.valueOf(this.f66398));
    }
}
