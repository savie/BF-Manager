package l;

/* JADX INFO: renamed from: l.ᩳܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F71A */
/* JADX INFO: loaded from: classes5.dex */
public final class C19161 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C19161 f61997 = new C19161(true, 0, 0, true, true);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C19161 f61998 = new C19161(false, 0, 0, false, false);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C19161 f61999 = new C19161(false, 0, 0, false, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f62000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f62001;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f62002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f62003;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f62004;

    public C19161(boolean z, long j, long j2, boolean z2, boolean z3) {
        this.f62002 = z;
        this.f62003 = j;
        this.f62000 = j2;
        this.f62001 = z2;
        this.f62004 = z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19161 m44408(long j, long j2, boolean z, boolean z2) {
        if (j == 0 && j2 == 0 && !z) {
            return z2 ? f61999 : f61998;
        }
        return new C19161(false, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19161 m44409(String str) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                throw new IllegalArgumentException(C13645.m33382(cCharAt, "Non-ASCII start character: "));
            }
            if (cCharAt < '@') {
                j = (1 << cCharAt) | j;
            } else {
                j2 = (1 << (cCharAt - '@')) | j2;
            }
        }
        return m44408(j, j2, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19161 m44410(C19161 c19161) {
        if (!this.f62002) {
            boolean z = c19161.f62002;
            boolean z2 = c19161.f62004;
            boolean z3 = c19161.f62001;
            if (!z) {
                long j = c19161.f62003;
                long j2 = this.f62003;
                long j3 = j2 | j;
                long j4 = c19161.f62000;
                long j5 = this.f62000;
                long j6 = j5 | j4;
                boolean z4 = this.f62001;
                boolean z5 = z4 || z3;
                boolean z6 = this.f62004;
                boolean z7 = z6 || z2;
                if (j3 == j2 && j6 == j5 && z5 == z4 && z7 == z6) {
                    return this;
                }
                return (j3 == j && j6 == j4 && z5 == z3 && z7 == z2) ? c19161 : m44408(j3, j6, z5, z7);
            }
        }
        return f61997;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19161 m44414() {
        if (this.f62002 || !this.f62004) {
            return this;
        }
        return m44408(this.f62003, this.f62000, this.f62001, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44412(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return false;
        }
        if (this.f62002 || this.f62004) {
            return true;
        }
        if (i == length) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '@') {
            return ((1 << cCharAt) & this.f62003) != 0;
        }
        if (cCharAt < 128) {
            return ((1 << (cCharAt - '@')) & this.f62000) != 0;
        }
        return this.f62001;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m44416() {
        return this.f62002;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m44413() {
        return this.f62003;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m44417() {
        return this.f62000;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m44415() {
        return this.f62001;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44418() {
        return this.f62004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44411() {
        return !this.f62002 && this.f62003 == -1 && this.f62000 == -1 && this.f62001;
    }
}
