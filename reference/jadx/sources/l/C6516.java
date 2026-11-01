package l;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۜۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C6516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f21950 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17721(C3693 c3693) {
        long[] jArr = c3693.f13479;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f21950;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c3693.f13479[0]), c3693);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3693 m17720() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C3693 c3693 : this.f21950.values()) {
            arrayList.add(c3693.f13476);
            arrayList2.add(c3693.f13474);
            arrayList3.add(c3693.f13478);
            arrayList4.add(c3693.f13479);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        C18304.m42512(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C3693(iArr3, C23390.m51533((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C23390.m51533((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C23390.m51533((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17722() {
        return this.f21950.size();
    }
}
