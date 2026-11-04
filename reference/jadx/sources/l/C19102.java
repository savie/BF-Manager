package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L648 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19102 implements Cloneable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f61827 = new int[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61829 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f61828 = f61827;

    public final int getSize() {
        return this.f61829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44216() {
        return (this.f61829 + 7) / 8;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44215(int i) {
        if (i > this.f61828.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f61828;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f61828 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44220(int i) {
        return ((1 << (i & 31)) & this.f61828[i / 32]) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44219(boolean z) {
        m44215(this.f61829 + 1);
        if (z) {
            int[] iArr = this.f61828;
            int i = this.f61829;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f61829++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44217(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.f61829;
        m44215(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.f61828;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.f61829 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44218(C19102 c19102) {
        int i = c19102.f61829;
        m44215(this.f61829 + i);
        for (int i2 = 0; i2 < i; i2++) {
            m44219(c19102.m44220(i2));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44221(C19102 c19102) {
        if (this.f61829 != c19102.f61829) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f61828;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c19102.f61828[i];
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19102)) {
            return false;
        }
        C19102 c19102 = (C19102) obj;
        return this.f61829 == c19102.f61829 && Arrays.equals(this.f61828, c19102.f61828);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f61828) + (this.f61829 * 31);
    }

    public final String toString() {
        int i = this.f61829;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f61829; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m44220(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f61828.clone();
        int i = this.f61829;
        C19102 c19102 = new C19102();
        c19102.f61828 = iArr;
        c19102.f61829 = i;
        return c19102;
    }
}
