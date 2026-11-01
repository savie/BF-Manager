package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21375 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23679[] f69510;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69511;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f69512;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f69513;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[][][] f69514;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23679 f69515;

    public C21375(int[] iArr, C23679[] c23679Arr, int[] iArr2, int[][][] iArr3, C23679 c23679) {
        this.f69512 = iArr;
        this.f69510 = c23679Arr;
        this.f69514 = iArr3;
        this.f69513 = iArr2;
        this.f69515 = c23679;
        this.f69511 = iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47908() {
        return this.f69511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47909(int i) {
        return this.f69512[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23679 m47913(int i) {
        return this.f69510[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47911(int i, int i2, int i3) {
        return this.f69514[i][i2][i3] & 7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47910(int i, int i2) {
        C23679[] c23679Arr = this.f69510;
        int i3 = c23679Arr[i].m52136(i2).f54864;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (m47911(i, i2, i6) == 4) {
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
            String str2 = c23679Arr[i].m52136(i2).m40159(iArrCopyOf[i4]).f25265;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z |= !C13638.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f69514[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z ? Math.min(iMin, this.f69513[i]) : iMin;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23679 m47912() {
        return this.f69515;
    }
}
