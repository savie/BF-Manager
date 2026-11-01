package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J244 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15093 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49290;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f49291;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49292;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49293;

    public C15093(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f49292 = i;
        this.f49293 = i2;
        int i3 = (i + 31) / 32;
        this.f49290 = i3;
        this.f49291 = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36166(int i, int i2) {
        return ((this.f49291[(i / 32) + (i2 * this.f49290)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36165(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f49293 || i5 > this.f49292) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f49290 * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f49291;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15093)) {
            return false;
        }
        C15093 c15093 = (C15093) obj;
        return this.f49292 == c15093.f49292 && this.f49293 == c15093.f49293 && this.f49290 == c15093.f49290 && Arrays.equals(this.f49291, c15093.f49291);
    }

    public final int hashCode() {
        int i = this.f49292;
        return Arrays.hashCode(this.f49291) + ((((C17922.m41614(i, 31, i, 31) + this.f49293) * 31) + this.f49290) * 31);
    }

    public final String toString() {
        int i = this.f49293;
        int i2 = this.f49292;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(m36166(i4, i3) ? "X " : EnumC19730.f63352);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Object clone() {
        int i = this.f49292;
        int i2 = this.f49293;
        int i3 = this.f49290;
        int[] iArr = (int[]) this.f49291.clone();
        C15093 c15093 = new C15093();
        c15093.f49292 = i;
        c15093.f49293 = i2;
        c15093.f49290 = i3;
        c15093.f49291 = iArr;
        return c15093;
    }
}
