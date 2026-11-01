package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20901 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20466[] f67927 = new C20466[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean[] f67928 = new boolean[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20466[] f67926 = new C20466[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47009(EnumC1144 enumC1144, C17643 c17643) {
        int i;
        C20466[] c20466Arr;
        C20466 c20466;
        ArrayList arrayList = c17643.f56084;
        if (EnumC1144.m4181(c17643)) {
            return true;
        }
        if (enumC1144 == EnumC1144.SLL && c17643.f56080) {
            return EnumC1144.m4180(enumC1144, c17643);
        }
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f67927.length) {
            this.f67927 = new C20466[iHighestOneBit];
            this.f67928 = new boolean[iHighestOneBit];
        }
        int i2 = iHighestOneBit - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                C20466 c20467 = (C20466) arrayList.get(i4);
                int i5 = c20467.f66406.f7775;
                int i6 = (i5 >>> 16) ^ i5;
                while (true) {
                    i = i6 & i2;
                    c20466Arr = this.f67927;
                    c20466 = c20466Arr[i];
                    if (c20466 == null || c20466.f66406.f7775 == i5) {
                        break;
                    }
                    i6 = i + 1;
                }
                if (c20466 == null) {
                    c20466Arr[i] = c20467;
                    this.f67928[i] = false;
                    i3++;
                } else {
                    boolean[] zArr = this.f67928;
                    if (!zArr[i] && c20466.f66405 != c20467.f66405) {
                        zArr[i] = true;
                        i3--;
                    }
                }
            } catch (Throwable th) {
                Arrays.fill(this.f67927, 0, iHighestOneBit, (Object) null);
                C20466[] c20466Arr2 = this.f67926;
                Arrays.fill(c20466Arr2, 0, Math.min(iHighestOneBit, c20466Arr2.length), (Object) null);
                throw th;
            }
        }
        if (i3 != 0) {
            Arrays.fill(this.f67927, 0, iHighestOneBit, (Object) null);
            C20466[] c20466Arr3 = this.f67926;
            Arrays.fill(c20466Arr3, 0, Math.min(iHighestOneBit, c20466Arr3.length), (Object) null);
            return false;
        }
        if (iHighestOneBit > this.f67926.length) {
            this.f67926 = new C20466[iHighestOneBit];
        }
        for (int i7 = 0; i7 < size; i7++) {
            C20466 c20468 = (C20466) arrayList.get(i7);
            int i8 = (c20468.f66406.f7775 * 31) + c20468.f66408.f39421;
            int i9 = i8 ^ (i8 >>> 16);
            while (true) {
                int i10 = i9 & i2;
                C20466[] c20466Arr4 = this.f67926;
                C20466 c20469 = c20466Arr4[i10];
                if (c20469 == null) {
                    c20466Arr4[i10] = c20468;
                    break;
                }
                if (c20469.f66406.f7775 == c20468.f66406.f7775 && c20469.f66408.equals(c20468.f66408)) {
                    if (c20469.f66405 == c20468.f66405) {
                        break;
                    }
                    Arrays.fill(this.f67927, 0, iHighestOneBit, (Object) null);
                    C20466[] c20466Arr5 = this.f67926;
                    Arrays.fill(c20466Arr5, 0, Math.min(iHighestOneBit, c20466Arr5.length), (Object) null);
                    return true;
                }
                i9 = i10 + 1;
            }
        }
        Arrays.fill(this.f67927, 0, iHighestOneBit, (Object) null);
        C20466[] c20466Arr6 = this.f67926;
        Arrays.fill(c20466Arr6, 0, Math.min(iHighestOneBit, c20466Arr6.length), (Object) null);
        return false;
    }
}
