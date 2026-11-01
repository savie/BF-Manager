package l;

/* JADX INFO: renamed from: l.ۧ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11312 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11312 f38175 = new C11312(null, -1, -1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38176;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17432 f38177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38178;

    public C11312(C17432 c17432, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f38177 = c17432;
        this.f38176 = i;
        this.f38178 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C17432 c17432 = this.f38177;
        if (c17432 != null) {
            sb.append(c17432.mo2376());
            sb.append(":");
        }
        int i = this.f38178;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f38176;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(C22475.m49982(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f38177;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof l.C11312
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            l.ۧ᩺ܶ r5 = (l.C11312) r5
            int r2 = r4.f38176
            int r3 = r5.f38176
            if (r2 != r3) goto L27
            int r2 = r4.f38178
            int r3 = r5.f38178
            if (r2 != r3) goto L27
            l.ܿܶܶ r5 = r5.f38177
            l.ܿܶܶ r2 = r4.f38177
            if (r2 == r5) goto L26
            if (r2 == 0) goto L27
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
        L26:
            return r0
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11312.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f38177.hashCode() + this.f38176 + this.f38178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28313(C11312 c11312) {
        return this.f38178 == c11312.f38178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28312() {
        return this.f38178;
    }
}
