package l;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۢۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T7TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9915 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31843 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25737(C18866 c18866) {
        long[] jArr = c18866.f61254;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f31843;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c18866.f61254[0]), c18866);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18866 m25736() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C18866 c18866 : this.f31843.values()) {
            arrayList.add(c18866.f61255);
            arrayList2.add(c18866.f61257);
            arrayList3.add(c18866.f61256);
            arrayList4.add(c18866.f61254);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        C12128.m30304(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C18866(iArr3, C19190.m44462((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C19190.m44462((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C19190.m44462((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25738() {
        return this.f31843.size();
    }
}
