package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAR9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24605 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f79706 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f79707 = f79706;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f79708;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54929(int i) {
        int[] iArr = this.f79707;
        int length = iArr.length;
        int i2 = this.f79708;
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
            this.f79707 = Arrays.copyOf(this.f79707, length2);
        }
        int[] iArr2 = this.f79707;
        int i4 = this.f79708;
        iArr2[i4] = i;
        this.f79708 = i4 + 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54932(int i) {
        if (i < 0 || i >= this.f79708) {
            throw new IndexOutOfBoundsException();
        }
        return this.f79707[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54931(int i) {
        int iM54932 = m54932(i);
        int[] iArr = this.f79707;
        System.arraycopy(iArr, i + 1, iArr, i, (this.f79708 - i) - 1);
        int[] iArr2 = this.f79707;
        int i2 = this.f79708 - 1;
        iArr2[i2] = 0;
        this.f79708 = i2;
        return iM54932;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54933() {
        return this.f79708 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54930() {
        return this.f79708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54928() {
        Arrays.fill(this.f79707, 0, this.f79708, 0);
        this.f79708 = 0;
    }

    public final String toString() {
        int[] iArrCopyOf;
        int i = this.f79708;
        if (i == 0) {
            iArrCopyOf = f79706;
        } else {
            iArrCopyOf = Arrays.copyOf(this.f79707, i);
        }
        return Arrays.toString(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24605)) {
            return false;
        }
        C24605 c24605 = (C24605) obj;
        if (this.f79708 != c24605.f79708) {
            return false;
        }
        for (int i = 0; i < this.f79708; i++) {
            if (this.f79707[i] != c24605.f79707[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f79708; i2++) {
            i = (i * 31) + this.f79707[i2];
        }
        return i;
    }
}
