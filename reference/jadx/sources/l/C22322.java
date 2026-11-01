package l;

/* JADX INFO: renamed from: l.᩹ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22322 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f72893;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f72894;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72895;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f72896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f72897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f72898;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f72899;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m49491() {
        return this.f72894;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m49496() {
        return this.f72899;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m49494() {
        return this.f72898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49492() {
        if (this.f72893 == null) {
            return this.f72899;
        }
        return this.f72899 + " = " + this.f72893;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m49493() {
        return this.f72896;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m49495() {
        return this.f72895;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m49490() {
        return this.f72894 + ":" + this.f72899;
    }

    public final String toString() {
        String str = this.f72894 + ":" + this.f72899;
        if (this.f72893 == null) {
            return str;
        }
        StringBuilder sbM8976 = C3012.m8976(str, " = ");
        sbM8976.append(this.f72893);
        return sbM8976.toString();
    }
}
