package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18619 implements Serializable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C18619 f60539 = new C18619();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60540;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f60541;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f60542;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f60543;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f60544;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f60545;

    public C18619(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f60541 = i;
        this.f60540 = i2;
        this.f60544 = i3;
        this.f60545 = i4;
        this.f60542 = i5;
        this.f60543 = i6;
    }

    public C18619() {
        this.f60543 = -1;
        this.f60542 = -1;
        this.f60545 = -1;
        this.f60544 = -1;
        this.f60540 = -1;
        this.f60541 = -1;
    }

    public final String toString() {
        int i = this.f60541;
        if (i == -1) {
            return "?";
        }
        StringBuilder sb = new StringBuilder(15);
        sb.append(i + 1);
        int i2 = this.f60540;
        if (i2 != -1) {
            sb.append(':');
            sb.append(i2 + 1);
        }
        int i3 = this.f60545;
        if (i3 != -1) {
            int i4 = this.f60542;
            if (i3 != i) {
                sb.append('-');
                sb.append(i3 + 1);
                if (i4 != -1) {
                    sb.append(':');
                    sb.append(i4 + 1);
                } else if (i2 != -1) {
                    sb.append(":?");
                }
            } else if (i4 != -1 && i4 != i2) {
                sb.append('-');
                sb.append(i4 + 1);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18619)) {
            return false;
        }
        C18619 c18619 = (C18619) obj;
        return c18619.f60541 == this.f60541 && c18619.f60540 == this.f60540 && c18619.f60544 == this.f60544 && c18619.f60545 == this.f60545 && c18619.f60542 == this.f60542 && c18619.f60543 == this.f60543;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f60541), Integer.valueOf(this.f60540), Integer.valueOf(this.f60544), Integer.valueOf(this.f60545), Integer.valueOf(this.f60542), Integer.valueOf(this.f60543));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43315() {
        return this.f60541;
    }
}
