package l;

/* JADX INFO: renamed from: l.ۨ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBHJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12586 implements InterfaceC17238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4383 f40405;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f40406;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24698 f40407;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f40408;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f40409;

    public C12586(int i, int i2, int i3, C24698 c24698, C4383 c4383) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int size = c24698.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c24698.get(i4) < 0) {
                StringBuilder sbM12235 = C3769.m12235(i4, "successors[", "] == ");
                sbM12235.append(c24698.get(i4));
                throw new IllegalArgumentException(sbM12235.toString());
            }
        }
        if (c4383 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f40406 = i;
        this.f40409 = i2;
        this.f40408 = i3;
        this.f40407 = c24698;
        this.f40405 = c4383;
    }

    public final String toString() {
        return "{" + C5306.m15934(this.f40406) + ": " + C5306.m15934(this.f40409) + ".." + C5306.m15934(this.f40408) + '}';
    }

    @Override // l.InterfaceC17238
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo31292() {
        return this.f40406;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m31296() {
        return this.f40409;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m31293() {
        return this.f40408;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24698 m31294() {
        return this.f40407;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4383 m31295() {
        return this.f40405;
    }
}
