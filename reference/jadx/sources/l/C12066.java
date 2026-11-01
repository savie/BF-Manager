package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12066 implements Serializable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C12066 f40376 = new C12066();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40377;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f40378;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f40379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f40380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f40381;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40382;

    public C12066(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f40378 = i;
        this.f40380 = i2;
        this.f40381 = i3;
        this.f40382 = i4;
        this.f40379 = i5;
        this.f40377 = i6;
    }

    public C12066() {
        this.f40377 = -1;
        this.f40379 = -1;
        this.f40382 = -1;
        this.f40381 = -1;
        this.f40380 = -1;
        this.f40378 = -1;
    }

    public final String toString() {
        int i = this.f40378;
        if (i == -1) {
            return "?";
        }
        StringBuilder sb = new StringBuilder(15);
        sb.append(i + 1);
        int i2 = this.f40380;
        if (i2 != -1) {
            sb.append(':');
            sb.append(i2 + 1);
        }
        int i3 = this.f40382;
        if (i3 != -1) {
            int i4 = this.f40379;
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
        if (!(obj instanceof C12066)) {
            return false;
        }
        C12066 c12066 = (C12066) obj;
        return c12066.f40378 == this.f40378 && c12066.f40380 == this.f40380 && c12066.f40381 == this.f40381 && c12066.f40382 == this.f40382 && c12066.f40379 == this.f40379 && c12066.f40377 == this.f40377;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f40378), Integer.valueOf(this.f40380), Integer.valueOf(this.f40381), Integer.valueOf(this.f40382), Integer.valueOf(this.f40379), Integer.valueOf(this.f40377));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29982() {
        return this.f40378;
    }
}
