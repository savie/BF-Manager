package l;

/* JADX INFO: renamed from: l.ۧۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37396;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f37397;

    public C10980(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f37397 = i;
        this.f37396 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27731() {
        return this.f37397;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27730() {
        return this.f37396;
    }
}
