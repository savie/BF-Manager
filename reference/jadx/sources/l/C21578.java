package l;

/* JADX INFO: renamed from: l.᩶᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 87AH */
/* JADX INFO: loaded from: classes.dex */
public final class C21578 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C21578 f68936 = new C21578(-1, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f68937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f68938;

    public C21578(long j, long j2) {
        this.f68937 = j < 0 ? -1L : j;
        this.f68938 = j2 <= 0 ? 0L : j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21578 m49094(long j, long j2) {
        C21578 c21578 = new C21578(j, j2);
        return c21578.m49098() ? c21578 : f68936;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21578 m49095(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386 == null) {
            return f68936;
        }
        return m49094(interfaceC2386.mo8090() ? interfaceC2386.getSize() : -1L, interfaceC2386.getTime());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21578 m49096(AbstractC22044 abstractC22044) {
        long jMo4286;
        if (abstractC22044 == null) {
            return f68936;
        }
        long jMo4285 = -1;
        try {
            if (abstractC22044.mo4304()) {
                jMo4285 = abstractC22044.mo4285();
            }
        } catch (RuntimeException unused) {
        }
        try {
            jMo4286 = abstractC22044.mo4286();
        } catch (RuntimeException unused2) {
            jMo4286 = 0;
        }
        return m49094(jMo4285, jMo4286);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49097() {
        return this.f68937;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m49100() {
        return this.f68938;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m49101() {
        return this.f68937 >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m49099() {
        return this.f68938 > 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m49098() {
        return m49101() || m49099();
    }
}
