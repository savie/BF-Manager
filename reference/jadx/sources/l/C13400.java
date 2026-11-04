package l;

/* JADX INFO: renamed from: l.۫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13400 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42704;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18415 f42705;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f42706 = new int[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33039(C4245 c4245) {
        this.f42705 = c4245.pattern();
        int iGroupCount = c4245.groupCount();
        this.f42704 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f42706.length < i) {
            this.f42706 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f42704; i2++) {
            int i3 = i2 * 2;
            this.f42706[i3] = c4245.start(i2);
            this.f42706[i3 + 1] = c4245.end(i2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18415 m33041() {
        return this.f42705;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m33040() {
        return this.f42706[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33038() {
        return this.f42706[1];
    }
}
