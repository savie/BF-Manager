package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IAR9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5109 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f17800 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f17801 = f17800;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14224(int i) {
        int[] iArr = this.f17801;
        int length = iArr.length;
        int i2 = this.f17802;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.f17801 = Arrays.copyOf(this.f17801, length2);
        }
        int[] iArr2 = this.f17801;
        int i4 = this.f17802;
        iArr2[i4] = i;
        this.f17802 = i4 + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m14227(int i) {
        if (i < 0 || i >= this.f17802) {
            throw new IndexOutOfBoundsException();
        }
        return this.f17801[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m14226(int i) {
        int iM14227 = m14227(i);
        int[] iArr = this.f17801;
        System.arraycopy(iArr, i + 1, iArr, i, (this.f17802 - i) - 1);
        int[] iArr2 = this.f17801;
        int i2 = this.f17802 - 1;
        iArr2[i2] = 0;
        this.f17802 = i2;
        return iM14227;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14228() {
        return this.f17802 == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m14225() {
        return this.f17802;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14223() {
        Arrays.fill(this.f17801, 0, this.f17802, 0);
        this.f17802 = 0;
    }

    public final String toString() {
        int[] iArrCopyOf;
        int i = this.f17802;
        if (i == 0) {
            iArrCopyOf = f17800;
        } else {
            iArrCopyOf = Arrays.copyOf(this.f17801, i);
        }
        return Arrays.toString(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5109)) {
            return false;
        }
        C5109 c5109 = (C5109) obj;
        if (this.f17802 != c5109.f17802) {
            return false;
        }
        for (int i = 0; i < this.f17802; i++) {
            if (this.f17801[i] != c5109.f17801[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17802; i2++) {
            i = (i * 31) + this.f17801[i2];
        }
        return i;
    }
}
