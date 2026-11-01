package l;

/* JADX INFO: renamed from: l.ܳ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14199 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f46569;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f46570;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4962 f46571;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4962 f46572;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f46573;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f46573.compareTo(((C14199) obj).f46573);
    }

    public C14199(String str, String str2, C4962 c4962) {
        this.f46573 = str;
        this.f46570 = str2;
        this.f46571 = c4962;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34298() {
        return this.f46573;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m34291() {
        return this.f46570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4962 m34293() {
        return this.f46571;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34294(String str) {
        this.f46569 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34295(C4962 c4962) {
        this.f46572 = c4962;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m34296() {
        return this.f46569;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m34292() {
        C4962 c4962 = this.f46572;
        if (c4962 == null) {
            c4962 = this.f46571;
        }
        if ((c4962.f17317 & 1) != 0) {
            return c4962.f17313;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m34297() {
        C4962 c4962 = this.f46572;
        if (c4962 == null) {
            c4962 = this.f46571;
        }
        if ((c4962.f17317 & 8) != 0) {
            return ((long) c4962.f17316) * 1000;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m34299() {
        C4962 c4962 = this.f46572;
        if (c4962 == null) {
            c4962 = this.f46571;
        }
        return c4962.m13760();
    }

    public final String toString() {
        return this.f46570;
    }
}
