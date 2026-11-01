package l;

/* JADX INFO: renamed from: l.۠ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8210 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28588;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14690 f28589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f28590 = new int[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21499(C6222 c6222) {
        this.f28589 = c6222.pattern();
        int iGroupCount = c6222.groupCount();
        this.f28588 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f28590.length < i) {
            this.f28590 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f28588; i2++) {
            int i3 = i2 * 2;
            this.f28590[i3] = c6222.start(i2);
            this.f28590[i3 + 1] = c6222.end(i2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14690 m21501() {
        return this.f28589;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21500() {
        return this.f28590[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21498() {
        return this.f28590[1];
    }
}
