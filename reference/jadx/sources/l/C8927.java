package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8927 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29118;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f29119;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3356 f29120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f29121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[][][] f29122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3356[] f29123;

    public C8927(int[] iArr, C3356[] c3356Arr, int[] iArr2, int[][][] iArr3, C3356 c3356) {
        this.f29121 = iArr;
        this.f29123 = c3356Arr;
        this.f29122 = iArr3;
        this.f29119 = iArr2;
        this.f29120 = c3356;
        this.f29118 = iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23834() {
        return this.f29118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23835(int i) {
        return this.f29121[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3356 m23839(int i) {
        return this.f29123[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23837(int i, int i2, int i3) {
        return this.f29122[i][i2][i3] & 7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23836(int i, int i2) {
        C3356[] c3356Arr = this.f29123;
        int i3 = c3356Arr[i].m11056(i2).f53567;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (m23837(i, i2, i6) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        int iMin = 16;
        String str = null;
        boolean z = false;
        int i7 = 0;
        while (i4 < iArrCopyOf.length) {
            String str2 = c3356Arr[i].m11056(i2).m39194(iArrCopyOf[i4]).f50848;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z |= !C17359.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f29122[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z ? Math.min(iMin, this.f29119[i]) : iMin;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3356 m23838() {
        return this.f29120;
    }
}
