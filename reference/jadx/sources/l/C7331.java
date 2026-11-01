package l;

/* JADX INFO: renamed from: l.۟۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C7331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10154[] f24366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f24367;

    public C7331(int i, C10154... c10154Arr) {
        this.f24367 = i;
        this.f24366 = c10154Arr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m19601() {
        return this.f24367;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19600() {
        int iM25797 = 0;
        for (C10154 c10154 : this.f24366) {
            iM25797 += c10154.m25797();
        }
        return iM25797;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m19598() {
        return m19600() * this.f24367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10154[] m19599() {
        return this.f24366;
    }
}
