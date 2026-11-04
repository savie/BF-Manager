package l;

/* JADX INFO: renamed from: l.ܽܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17630 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23183 f57971;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f57972;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23183 f57973;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f57974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f57975;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f57975.compareTo(((C17630) obj).f57975);
    }

    public C17630(String str, String str2, C23183 c23183) {
        this.f57975 = str;
        this.f57972 = str2;
        this.f57973 = c23183;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m41279() {
        return this.f57975;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m41277() {
        return this.f57972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23183 m41273() {
        return this.f57973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41274(String str) {
        this.f57974 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41275(C23183 c23183) {
        this.f57971 = c23183;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m41278() {
        return this.f57974;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m41272() {
        C23183 c23183 = this.f57971;
        if (c23183 == null) {
            c23183 = this.f57973;
        }
        if ((c23183.f75120 & 1) != 0) {
            return c23183.f75121;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m41276() {
        C23183 c23183 = this.f57971;
        if (c23183 == null) {
            c23183 = this.f57973;
        }
        if ((c23183.f75120 & 8) != 0) {
            return ((long) c23183.f75123) * 1000;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41280() {
        C23183 c23183 = this.f57971;
        if (c23183 == null) {
            c23183 = this.f57973;
        }
        return c23183.m52108();
    }

    public final String toString() {
        return this.f57972;
    }
}
