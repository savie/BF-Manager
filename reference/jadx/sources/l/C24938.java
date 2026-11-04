package l;

/* JADX INFO: renamed from: l.᩻ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes.dex */
public final class C24938 extends RuntimeException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f80713;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f80714;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f80715;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f80716;

    public C24938(C16732 c16732, String str, boolean z) {
        this.f80716 = c16732.f54028;
        this.f80715 = c16732.f54025;
        this.f80714 = z;
        this.f80713 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f80714;
        String str = this.f80713;
        int i = this.f80716;
        if (z) {
            return "Parse error [" + i + ":eol] " + str;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Parse error [", ":");
        sbM12235.append(this.f80715);
        sbM12235.append("] ");
        sbM12235.append(str);
        return sbM12235.toString();
    }
}
