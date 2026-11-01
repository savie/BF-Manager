package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L648 */
/* JADX INFO: loaded from: classes.dex */
public final class C22854 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f74351 = new int[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74353 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f74352 = f74351;

    public final int getSize() {
        return this.f74353;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50600() {
        return (this.f74353 + 7) / 8;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m50599(int i) {
        if (i > this.f74352.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f74352;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f74352 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50604(int i) {
        return ((1 << (i & 31)) & this.f74352[i / 32]) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50603(boolean z) {
        m50599(this.f74353 + 1);
        if (z) {
            int[] iArr = this.f74352;
            int i = this.f74353;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f74353++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50601(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.f74353;
        m50599(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.f74352;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.f74353 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50602(C22854 c22854) {
        int i = c22854.f74353;
        m50599(this.f74353 + i);
        for (int i2 = 0; i2 < i; i2++) {
            m50603(c22854.m50604(i2));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50605(C22854 c22854) {
        if (this.f74353 != c22854.f74353) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f74352;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c22854.f74352[i];
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22854)) {
            return false;
        }
        C22854 c22854 = (C22854) obj;
        return this.f74353 == c22854.f74353 && Arrays.equals(this.f74352, c22854.f74352);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f74352) + (this.f74353 * 31);
    }

    public final String toString() {
        int i = this.f74353;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f74353; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m50604(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f74352.clone();
        int i = this.f74353;
        C22854 c22854 = new C22854();
        c22854.f74352 = iArr;
        c22854.f74353 = i;
        return c22854;
    }
}
