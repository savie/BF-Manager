package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J244 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10151 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32509;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f32510;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32511;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32512;

    public C10151(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f32509 = i;
        this.f32512 = i2;
        int i3 = (i + 31) / 32;
        this.f32511 = i3;
        this.f32510 = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26262(int i, int i2) {
        return ((this.f32510[(i / 32) + (i2 * this.f32511)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26261(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f32512 || i5 > this.f32509) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f32511 * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f32510;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10151)) {
            return false;
        }
        C10151 c10151 = (C10151) obj;
        return this.f32509 == c10151.f32509 && this.f32512 == c10151.f32512 && this.f32511 == c10151.f32511 && Arrays.equals(this.f32510, c10151.f32510);
    }

    public final int hashCode() {
        int i = this.f32509;
        return Arrays.hashCode(this.f32510) + ((((C18176.m42345(i, 31, i, 31) + this.f32512) * 31) + this.f32511) * 31);
    }

    public final String toString() {
        int i = this.f32512;
        int i2 = this.f32509;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(m26262(i4, i3) ? "X " : EnumC7687.f25319);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Object clone() {
        int i = this.f32509;
        int i2 = this.f32512;
        int i3 = this.f32511;
        int[] iArr = (int[]) this.f32510.clone();
        C10151 c10151 = new C10151();
        c10151.f32509 = i;
        c10151.f32512 = i2;
        c10151.f32511 = i3;
        c10151.f32510 = iArr;
        return c10151;
    }
}
