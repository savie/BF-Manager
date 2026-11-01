package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13838 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f45658;

    public C13838(ArrayList arrayList) {
        this.f45658 = new int[arrayList.size()];
        int iMo5436 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            this.f45658[i] = iMo5436;
            iMo5436 += ((InterfaceC1594) arrayList.get(i)).mo5436();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33659(int i, boolean z) {
        int iBinarySearch = Arrays.binarySearch(this.f45658, i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z) {
            throw new C4664(null, "No instruction at offset %d", Integer.valueOf(i));
        }
        return (~iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33658(int i) {
        if (i >= 0) {
            int[] iArr = this.f45658;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new C2902(null, "Instruction index out of bounds: %d", Integer.valueOf(i));
    }
}
