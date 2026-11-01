package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 026V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28140;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17914 f28141;

    public C8037(C17914 c17914) {
        this.f28141 = c17914;
        ArrayList arrayList = new ArrayList();
        this.f28140 = arrayList;
        arrayList.add(new C18620(c17914, new int[]{1}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21145(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f28140;
        int size = arrayList.size();
        C17914 c17914 = this.f28141;
        if (i >= size) {
            C18620 c18620M43064 = (C18620) C19084.m43861(arrayList, 1);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                c18620M43064 = c18620M43064.m43064(new C18620(c17914, new int[]{1, c17914.m41601(c17914.m41600() + (size2 - 1))}));
                arrayList.add(c18620M43064);
            }
        }
        C18620 c18620 = (C18620) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM43063 = new C18620(c17914, iArr2).m43061(i, 1).m43067(c18620)[1].m43063();
        int length2 = i - iArrM43063.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM43063, 0, iArr, length + length2, iArrM43063.length);
    }
}
