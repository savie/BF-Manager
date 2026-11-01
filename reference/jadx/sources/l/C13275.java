package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f44085 = new int[128];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44086 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32759(int i, int i2) {
        int i3 = this.f44086;
        if (i3 != 0) {
            if (i - (i3 == 0 ? 0 : this.f44085[i3 - 2]) == i2 - (i3 != 0 ? this.f44085[i3 - 1] : 0)) {
                return;
            }
        }
        int i4 = i3 + 2;
        int length = this.f44085.length;
        while (i4 > length) {
            length <<= 1;
        }
        int[] iArr = this.f44085;
        if (length < iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length != iArr.length) {
            this.f44085 = Arrays.copyOf(iArr, length);
        }
        int[] iArr2 = this.f44085;
        int i5 = this.f44086;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        this.f44086 = i5 + 2;
    }
}
