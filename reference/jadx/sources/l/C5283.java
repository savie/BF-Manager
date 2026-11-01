package l;

/* JADX INFO: renamed from: l.ۚۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R3P1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5283 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5283 f18286 = new C5283(-1, -1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18287;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f18288;

    static {
        new C5283(0, 0);
    }

    public C5283(int i, int i2) {
        C2023.m6507((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f18288 = i;
        this.f18287 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m14575() {
        return this.f18288;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14574() {
        return this.f18287;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5283) {
            C5283 c5283 = (C5283) obj;
            if (this.f18288 == c5283.f18288 && this.f18287 == c5283.f18287) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f18288 + "x" + this.f18287;
    }

    public final int hashCode() {
        int i = this.f18288;
        return ((i >>> 16) | (i << 16)) ^ this.f18287;
    }
}
