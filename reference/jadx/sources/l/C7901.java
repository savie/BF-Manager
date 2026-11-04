package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7901 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22937[] f26253 = new C22937[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f26254 = new int[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21440(C5783 c5783) {
        ArrayList arrayList = c5783.f19856;
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f26253.length) {
            this.f26253 = new C22937[iHighestOneBit];
            this.f26254 = new int[iHighestOneBit];
        }
        int i = iHighestOneBit - 1;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                C22937 c22937 = (C22937) arrayList.get(i2);
                AbstractC17715 abstractC17715 = c22937.f74514;
                int i3 = c22937.f74512;
                int i4 = (abstractC17715.f58209 * 31) + c22937.f74515.f40013;
                int i5 = i4 ^ (i4 >>> 16);
                while (true) {
                    int i6 = i5 & i;
                    C22937[] c22937Arr = this.f26253;
                    C22937 c22938 = c22937Arr[i6];
                    if (c22938 == null) {
                        c22937Arr[i6] = c22937;
                        this.f26254[i6] = i3;
                        break;
                    }
                    if (c22938.f74514.f58209 == c22937.f74514.f58209 && c22938.f74515.equals(c22937.f74515)) {
                        int[] iArr = this.f26254;
                        iArr[i6] = Math.min(iArr[i6], i3);
                        break;
                    }
                    i5 = i6 + 1;
                }
            } catch (Throwable th) {
                Arrays.fill(this.f26253, 0, iHighestOneBit, (Object) null);
                throw th;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < iHighestOneBit; i8++) {
            C22937[] c22937Arr2 = this.f26253;
            if (c22937Arr2[i8] != null) {
                if (i7 == 0) {
                    i7 = this.f26254[i8];
                } else if (i7 != this.f26254[i8]) {
                    Arrays.fill(c22937Arr2, 0, iHighestOneBit, (Object) null);
                    return 0;
                }
            }
        }
        Arrays.fill(this.f26253, 0, iHighestOneBit, (Object) null);
        return i7;
    }
}
