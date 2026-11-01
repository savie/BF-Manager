package l;

/* JADX INFO: renamed from: l.ۗᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F71A */
/* JADX INFO: loaded from: classes2.dex */
public final class C3399 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f12543;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f12544;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f12545;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f12546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f12547;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C3399 f12541 = new C3399(true, 0, 0, true, true);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C3399 f12540 = new C3399(false, 0, 0, false, false);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C3399 f12542 = new C3399(false, 0, 0, false, true);

    public C3399(boolean z, long j, long j2, boolean z2, boolean z3) {
        this.f12545 = z;
        this.f12547 = j;
        this.f12544 = j2;
        this.f12546 = z2;
        this.f12543 = z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3399 m10074(long j, long j2, boolean z, boolean z2) {
        if (j == 0 && j2 == 0 && !z) {
            return z2 ? f12542 : f12540;
        }
        return new C3399(false, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3399 m10075(String str) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                throw new IllegalArgumentException(C8479.m22141(cCharAt, "Non-ASCII start character: "));
            }
            if (cCharAt < '@') {
                j = (1 << cCharAt) | j;
            } else {
                j2 = (1 << (cCharAt - '@')) | j2;
            }
        }
        return m10074(j, j2, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3399 m10078(C3399 c3399) {
        if (!this.f12545) {
            boolean z = c3399.f12545;
            boolean z2 = c3399.f12543;
            boolean z3 = c3399.f12546;
            if (!z) {
                long j = c3399.f12547;
                long j2 = this.f12547;
                long j3 = j2 | j;
                long j4 = c3399.f12544;
                long j5 = this.f12544;
                long j6 = j5 | j4;
                boolean z4 = this.f12546;
                boolean z5 = z4 || z3;
                boolean z6 = this.f12543;
                boolean z7 = z6 || z2;
                if (j3 == j2 && j6 == j5 && z5 == z4 && z7 == z6) {
                    return this;
                }
                return (j3 == j && j6 == j4 && z5 == z3 && z7 == z2) ? c3399 : m10074(j3, j6, z5, z7);
            }
        }
        return f12541;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3399 m10076() {
        if (this.f12545 || !this.f12543) {
            return this;
        }
        return m10074(this.f12547, this.f12544, this.f12546, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10080(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return false;
        }
        if (this.f12545 || this.f12543) {
            return true;
        }
        if (i == length) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '@') {
            return ((1 << cCharAt) & this.f12547) != 0;
        }
        if (cCharAt < 128) {
            return ((1 << (cCharAt - '@')) & this.f12544) != 0;
        }
        return this.f12546;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m10081() {
        return this.f12545;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m10082() {
        return this.f12547;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m10083() {
        return this.f12544;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m10084() {
        return this.f12546;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m10077() {
        return this.f12543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10079() {
        return !this.f12545 && this.f12547 == -1 && this.f12544 == -1 && this.f12546;
    }
}
