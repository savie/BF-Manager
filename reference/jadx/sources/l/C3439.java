package l;

/* JADX INFO: renamed from: l.ۗ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3439 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12665;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f12666;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f12667;

    public C3439(int i, int i2, int i3) {
        this.f12666 = i;
        this.f12667 = i2;
        this.f12665 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10146() {
        return this.f12666;
    }

    public final String toString() {
        return this.f12667 + "," + this.f12665 + ":" + this.f12666;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3439.class == obj.getClass()) {
            C3439 c3439 = (C3439) obj;
            if (this.f12666 == c3439.f12666 && this.f12667 == c3439.f12667 && this.f12665 == c3439.f12665) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12666 * 31) + this.f12667) * 31) + this.f12665;
    }
}
