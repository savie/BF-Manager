package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15413 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50230;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f50231;

    public C15413(int[] iArr) {
        this.f50231 = iArr;
        this.f50230 = Arrays.hashCode(iArr);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15413) && Arrays.equals(this.f50231, ((C15413) obj).f50231);
    }

    public final int hashCode() {
        return this.f50230;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36892(int i) {
        return Arrays.binarySearch(this.f50231, i) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15413 m36891(C15413 c15413) {
        int i;
        int[] iArr = this.f50231;
        int length = iArr.length;
        int[] iArr2 = c15413.f50231;
        int[] iArr3 = c15413.f50231;
        int length2 = length + iArr2.length;
        int[] iArrCopyOf = new int[length2];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= iArr.length && i3 >= iArr3.length) {
                break;
            }
            if (i3 >= iArr3.length || (i2 < iArr.length && iArr[i2] < iArr3[i3])) {
                i = iArr[i2];
                i2++;
            } else if (i2 < iArr.length) {
                int i5 = iArr3[i3];
                i = iArr[i2];
                if (i5 < i) {
                    i = iArr3[i3];
                    i3++;
                } else {
                    i2++;
                    i3++;
                }
            } else {
                i = iArr3[i3];
                i3++;
            }
            iArrCopyOf[i4] = i;
            i4++;
        }
        if (i4 != length2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
        }
        return new C15413(iArrCopyOf);
    }
}
