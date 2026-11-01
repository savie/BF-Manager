package l;

/* JADX INFO: renamed from: l.ۙ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9449 f17185;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3097 f17187;

    public C4902(int i, C9449 c9449) {
        this.f17186 = i;
        this.f17185 = c9449;
    }

    public C4902(int i, C3097 c3097) {
        this.f17186 = i;
        this.f17187 = c3097;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4902.class == obj.getClass()) {
            C4902 c4902 = (C4902) obj;
            C3097 c3097 = c4902.f17187;
            C9449 c9449 = c4902.f17185;
            if (this.f17186 != c4902.f17186) {
                return false;
            }
            C9449 c94410 = this.f17185;
            if (c94410 == null ? c9449 != null : !c94410.equals(c9449)) {
                return false;
            }
            C3097 c3098 = this.f17187;
            if (c3098 != null) {
                return c3098.equals(c3097);
            }
            if (c3097 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17186 * 31;
        C9449 c9449 = this.f17185;
        int iHashCode = (i + (c9449 != null ? c9449.hashCode() : 0)) * 31;
        C3097 c3097 = this.f17187;
        return iHashCode + (c3097 != null ? c3097.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m13626() {
        return this.f17186;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9449 m13625() {
        return this.f17185;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3097 m13627() {
        return this.f17187;
    }
}
