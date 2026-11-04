package l;

/* JADX INFO: renamed from: l.ۘۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3968 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13577;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f13578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24106 f13579;

    public C3968(int i, int i2, C24106 c24106) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c24106.m46489()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f13578 = i;
        this.f13577 = i2;
        this.f13579 = c24106;
    }

    public final int hashCode() {
        return this.f13579.hashCode() + (((this.f13578 * 31) + this.f13577) * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3968) && compareTo((C3968) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3968 c3968) {
        int i = c3968.f13578;
        int i2 = this.f13578;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c3968.f13577;
        int i4 = this.f13577;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f13579.compareTo(c3968.f13579);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m12749() {
        return this.f13578;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12747() {
        return this.f13577;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24106 m12750() {
        return this.f13579;
    }
}
