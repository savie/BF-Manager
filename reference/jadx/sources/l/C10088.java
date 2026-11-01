package l;

/* JADX INFO: renamed from: l.ۤۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10088 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f34445;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f34446;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8677 f34447;

    public C10088(int i, int i2, C8677 c8677) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c8677.m43640()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f34445 = i;
        this.f34446 = i2;
        this.f34447 = c8677;
    }

    public final int hashCode() {
        return this.f34447.hashCode() + (((this.f34445 * 31) + this.f34446) * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10088) && compareTo((C10088) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10088 c10088) {
        int i = c10088.f34445;
        int i2 = this.f34445;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c10088.f34446;
        int i4 = this.f34446;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f34447.compareTo(c10088.f34447);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m25500() {
        return this.f34445;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25498() {
        return this.f34446;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8677 m25501() {
        return this.f34447;
    }
}
