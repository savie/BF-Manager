package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6N7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22367 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22937[] f72413 = new C22937[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean[] f72414 = new boolean[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22937[] f72412 = new C22937[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50443(EnumC14687 enumC14687, C5783 c5783) {
        int i;
        C22937[] c22937Arr;
        C22937 c22937;
        ArrayList arrayList = c5783.f19856;
        if (EnumC14687.m35322(c5783)) {
            return true;
        }
        if (enumC14687 == EnumC14687.SLL && c5783.f19857) {
            return EnumC14687.m35323(enumC14687, c5783);
        }
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f72413.length) {
            this.f72413 = new C22937[iHighestOneBit];
            this.f72414 = new boolean[iHighestOneBit];
        }
        int i2 = iHighestOneBit - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                C22937 c22938 = (C22937) arrayList.get(i4);
                int i5 = c22938.f74514.f58209;
                int i6 = (i5 >>> 16) ^ i5;
                while (true) {
                    i = i6 & i2;
                    c22937Arr = this.f72413;
                    c22937 = c22937Arr[i];
                    if (c22937 == null || c22937.f74514.f58209 == i5) {
                        break;
                    }
                    i6 = i + 1;
                }
                if (c22937 == null) {
                    c22937Arr[i] = c22938;
                    this.f72414[i] = false;
                    i3++;
                } else {
                    boolean[] zArr = this.f72414;
                    if (!zArr[i] && c22937.f74512 != c22938.f74512) {
                        zArr[i] = true;
                        i3--;
                    }
                }
            } catch (Throwable th) {
                Arrays.fill(this.f72413, 0, iHighestOneBit, (Object) null);
                C22937[] c22937Arr2 = this.f72412;
                Arrays.fill(c22937Arr2, 0, Math.min(iHighestOneBit, c22937Arr2.length), (Object) null);
                throw th;
            }
        }
        if (i3 != 0) {
            Arrays.fill(this.f72413, 0, iHighestOneBit, (Object) null);
            C22937[] c22937Arr3 = this.f72412;
            Arrays.fill(c22937Arr3, 0, Math.min(iHighestOneBit, c22937Arr3.length), (Object) null);
            return false;
        }
        if (iHighestOneBit > this.f72412.length) {
            this.f72412 = new C22937[iHighestOneBit];
        }
        for (int i7 = 0; i7 < size; i7++) {
            C22937 c22939 = (C22937) arrayList.get(i7);
            int i8 = (c22939.f74514.f58209 * 31) + c22939.f74515.f40013;
            int i9 = i8 ^ (i8 >>> 16);
            while (true) {
                int i10 = i9 & i2;
                C22937[] c22937Arr4 = this.f72412;
                C22937 c229310 = c22937Arr4[i10];
                if (c229310 == null) {
                    c22937Arr4[i10] = c22939;
                    break;
                }
                if (c229310.f74514.f58209 == c22939.f74514.f58209 && c229310.f74515.equals(c22939.f74515)) {
                    if (c229310.f74512 == c22939.f74512) {
                        break;
                    }
                    Arrays.fill(this.f72413, 0, iHighestOneBit, (Object) null);
                    C22937[] c22937Arr5 = this.f72412;
                    Arrays.fill(c22937Arr5, 0, Math.min(iHighestOneBit, c22937Arr5.length), (Object) null);
                    return true;
                }
                i9 = i10 + 1;
            }
        }
        Arrays.fill(this.f72413, 0, iHighestOneBit, (Object) null);
        C22937[] c22937Arr6 = this.f72412;
        Arrays.fill(c22937Arr6, 0, Math.min(iHighestOneBit, c22937Arr6.length), (Object) null);
        return false;
    }
}
