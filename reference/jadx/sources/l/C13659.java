package l;

/* JADX INFO: renamed from: l.ܰۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes3.dex */
public final class C13659 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13659 f45045;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f45046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13659 f45047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45048;

    public C13659() {
    }

    public C13659(int i) {
        this.f45048 = i;
        this.f45046 = -1073741824;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13659 m33352() {
        if ((this.f45046 & 1073741824) != 0) {
            return null;
        }
        return this.f45045;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13659 m33361() {
        if ((this.f45046 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f45047;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m33351() {
        return (this.f45046 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m33359() {
        return (this.f45046 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33355(boolean z) {
        if (z) {
            this.f45046 |= 1073741824;
        } else {
            this.f45046 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33358(boolean z) {
        if (z) {
            this.f45046 |= Integer.MIN_VALUE;
        } else {
            this.f45046 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33354(C13659 c13659) {
        this.f45046 |= 1073741824;
        this.f45045 = c13659;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33360(C13659 c13659) {
        this.f45046 |= Integer.MIN_VALUE;
        this.f45047 = c13659;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33353(int i) {
        this.f45046 = (i & 255) | (this.f45046 & (-256));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13659 m33357() {
        C13659 c13659 = this.f45047;
        if ((this.f45046 & Integer.MIN_VALUE) == 0) {
            while ((c13659.f45046 & 1073741824) == 0) {
                c13659 = c13659.f45045;
            }
        }
        return c13659;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13659 m33356() {
        C13659 c13659 = this.f45045;
        if ((this.f45046 & 1073741824) == 0) {
            while ((c13659.f45046 & Integer.MIN_VALUE) == 0) {
                c13659 = c13659.f45047;
            }
        }
        return c13659;
    }

    public final C13659 clone() {
        try {
            C13659 c13659 = (C13659) super.clone();
            c13659.f45048 = this.f45048;
            c13659.f45046 = this.f45046;
            return c13659;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13659) && this.f45048 == ((C13659) obj).f45048;
    }

    public final int hashCode() {
        return this.f45048;
    }

    public final String toString() {
        return String.valueOf(this.f45048);
    }
}
