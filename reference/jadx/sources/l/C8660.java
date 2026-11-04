package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 026V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9405 f28270;

    public C8660(C9405 c9405) {
        this.f28270 = c9405;
        ArrayList arrayList = new ArrayList();
        this.f28269 = arrayList;
        arrayList.add(new C2694(c9405, new int[]{1}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23314(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f28269;
        int size = arrayList.size();
        C9405 c9405 = this.f28270;
        if (i >= size) {
            C2694 c2694M8860 = (C2694) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                c2694M8860 = c2694M8860.m8860(new C2694(c9405, new int[]{1, c9405.m24752(c9405.m24751() + (size2 - 1))}));
                arrayList.add(c2694M8860);
            }
        }
        C2694 c2694 = (C2694) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM8859 = new C2694(c9405, iArr2).m8857(i, 1).m8863(c2694)[1].m8859();
        int length2 = i - iArrM8859.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM8859, 0, iArr, length + length2, iArrM8859.length);
    }
}
