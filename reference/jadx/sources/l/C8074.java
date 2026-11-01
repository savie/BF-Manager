package l;

/* JADX INFO: renamed from: l.۠ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8074 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28292;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28293;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f28294;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f28295;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f28296;

    public C8074(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C8074(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f28295 = str;
        this.f28293 = i2;
        this.f28294 = i3;
        this.f28292 = Integer.MIN_VALUE;
        this.f28296 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21286() {
        int i = this.f28292;
        this.f28292 = i == Integer.MIN_VALUE ? this.f28293 : i + this.f28294;
        this.f28296 = this.f28295 + this.f28292;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21287() {
        int i = this.f28292;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m21288() {
        if (this.f28292 != Integer.MIN_VALUE) {
            return this.f28296;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
