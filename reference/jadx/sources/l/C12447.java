package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f40010;

    public C12447(ArrayList arrayList) {
        this.f40010 = new int[arrayList.size()];
        int iMo3033 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            this.f40010[i] = iMo3033;
            iMo3033 += ((InterfaceC23331) arrayList.get(i)).mo3033();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30917(int i, boolean z) {
        int iBinarySearch = Arrays.binarySearch(this.f40010, i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z) {
            throw new C20652(null, "No instruction at offset %d", Integer.valueOf(i));
        }
        return (~iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30916(int i) {
        if (i >= 0) {
            int[] iArr = this.f40010;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new C3498(null, "Instruction index out of bounds: %d", Integer.valueOf(i));
    }
}
