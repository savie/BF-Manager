package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12923 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20466[] f42945 = new C20466[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f42946 = new int[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32008(C17643 c17643) {
        ArrayList arrayList = c17643.f56084;
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f42945.length) {
            this.f42945 = new C20466[iHighestOneBit];
            this.f42946 = new int[iHighestOneBit];
        }
        int i = iHighestOneBit - 1;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                C20466 c20466 = (C20466) arrayList.get(i2);
                AbstractC2120 abstractC2120 = c20466.f66406;
                int i3 = c20466.f66405;
                int i4 = (abstractC2120.f7775 * 31) + c20466.f66408.f39421;
                int i5 = i4 ^ (i4 >>> 16);
                while (true) {
                    int i6 = i5 & i;
                    C20466[] c20466Arr = this.f42945;
                    C20466 c20467 = c20466Arr[i6];
                    if (c20467 == null) {
                        c20466Arr[i6] = c20466;
                        this.f42946[i6] = i3;
                        break;
                    }
                    if (c20467.f66406.f7775 == c20466.f66406.f7775 && c20467.f66408.equals(c20466.f66408)) {
                        int[] iArr = this.f42946;
                        iArr[i6] = Math.min(iArr[i6], i3);
                        break;
                    }
                    i5 = i6 + 1;
                }
            } catch (Throwable th) {
                Arrays.fill(this.f42945, 0, iHighestOneBit, (Object) null);
                throw th;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < iHighestOneBit; i8++) {
            C20466[] c20466Arr2 = this.f42945;
            if (c20466Arr2[i8] != null) {
                if (i7 == 0) {
                    i7 = this.f42946[i8];
                } else if (i7 != this.f42946[i8]) {
                    Arrays.fill(c20466Arr2, 0, iHighestOneBit, (Object) null);
                    return 0;
                }
            }
        }
        Arrays.fill(this.f42945, 0, iHighestOneBit, (Object) null);
        return i7;
    }
}
