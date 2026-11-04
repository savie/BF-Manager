package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6834 extends AbstractC9070 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f22704;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f22705;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f22706;

    @Override // l.AbstractC9070
    /* JADX INFO: renamed from: ۙ */
    public final void mo6249(AbstractC15037 abstractC15037) {
        ArrayList arrayList = this.f22705;
        ArrayList arrayList2 = this.f22706;
        int i = this.f22704;
        if (i == -1 || i == 0) {
            abstractC15037.mo10789(i, arrayList2.size(), arrayList.size(), m19050(arrayList2), m19050(arrayList));
        } else {
            if (i == 1) {
                abstractC15037.mo10789(i, arrayList2.size(), 0, m19050(arrayList2), (Object[]) null);
                return;
            }
            if (i == 2) {
                abstractC15037.mo10789(i, arrayList2.size(), 0, (Object[]) null, (Object[]) null);
            } else if (i == 3) {
                abstractC15037.mo10789(i, 0, 0, (Object[]) null, (Object[]) null);
            } else {
                if (i == 4) {
                    abstractC15037.mo10789(i, 0, 1, (Object[]) null, m19050(arrayList));
                    return;
                }
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m19050(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objM16430 = arrayList.get(i);
            if (objM16430 instanceof C5517) {
                objM16430 = ((C5517) objM16430).m16430();
            }
            objArr[i] = objM16430;
        }
        return objArr;
    }
}
