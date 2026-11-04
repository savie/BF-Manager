package l;

/* JADX INFO: renamed from: l.ۡ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9012 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9012 f29360 = new C9012(null, -1, -1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29361;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9976 f29362;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29363;

    public C9012(C9976 c9976, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f29362 = c9976;
        this.f29361 = i;
        this.f29363 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C9976 c9976 = this.f29362;
        if (c9976 != null) {
            sb.append(c9976.mo1843());
            sb.append(":");
        }
        int i = this.f29363;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f29361;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(C5306.m15934(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f29362;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof l.C9012
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            l.ۡ֡ܺ r5 = (l.C9012) r5
            int r2 = r4.f29361
            int r3 = r5.f29361
            if (r2 != r3) goto L27
            int r2 = r4.f29363
            int r3 = r5.f29363
            if (r2 != r3) goto L27
            l.ۢ۟ܺ r5 = r5.f29362
            l.ۢ۟ܺ r2 = r4.f29362
            if (r2 == r5) goto L26
            if (r2 == 0) goto L27
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
        L26:
            return r0
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9012.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f29362.hashCode() + this.f29361 + this.f29363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24068(C9012 c9012) {
        return this.f29363 == c9012.f29363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24067() {
        return this.f29363;
    }
}
