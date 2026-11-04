package l;

/* JADX INFO: renamed from: l.ܺܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17001 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17001 f55549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17001 f55551;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f55552;

    public C17001() {
    }

    public C17001(int i) {
        this.f55552 = i;
        this.f55550 = -1073741824;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17001 m40062() {
        if ((this.f55550 & 1073741824) != 0) {
            return null;
        }
        return this.f55551;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17001 m40069() {
        if ((this.f55550 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f55549;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m40068() {
        return (this.f55550 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m40066() {
        return (this.f55550 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40065(boolean z) {
        if (z) {
            this.f55550 |= 1073741824;
        } else {
            this.f55550 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40067(boolean z) {
        if (z) {
            this.f55550 |= Integer.MIN_VALUE;
        } else {
            this.f55550 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40064(C17001 c17001) {
        this.f55550 |= 1073741824;
        this.f55551 = c17001;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40072(C17001 c17001) {
        this.f55550 |= Integer.MIN_VALUE;
        this.f55549 = c17001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40063(int i) {
        this.f55550 = (i & 255) | (this.f55550 & (-256));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17001 m40071() {
        C17001 c17001 = this.f55549;
        if ((this.f55550 & Integer.MIN_VALUE) == 0) {
            while ((c17001.f55550 & 1073741824) == 0) {
                c17001 = c17001.f55551;
            }
        }
        return c17001;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17001 m40070() {
        C17001 c17001 = this.f55551;
        if ((this.f55550 & 1073741824) == 0) {
            while ((c17001.f55550 & Integer.MIN_VALUE) == 0) {
                c17001 = c17001.f55549;
            }
        }
        return c17001;
    }

    public final C17001 clone() {
        try {
            C17001 c17001 = (C17001) super.clone();
            c17001.f55552 = this.f55552;
            c17001.f55550 = this.f55550;
            return c17001;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17001) && this.f55552 == ((C17001) obj).f55552;
    }

    public final int hashCode() {
        return this.f55552;
    }

    public final String toString() {
        return String.valueOf(this.f55552);
    }
}
