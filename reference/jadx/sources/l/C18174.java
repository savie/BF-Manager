package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74QP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18174 extends AbstractC23114 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f58070;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f58071;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f58072;

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۙ */
    public final void mo2544(AbstractC20521 abstractC20521) {
        ArrayList arrayList = this.f58072;
        ArrayList arrayList2 = this.f58070;
        int i = this.f58071;
        if (i == -1 || i == 0) {
            abstractC20521.mo33782(i, arrayList2.size(), arrayList.size(), m42296(arrayList2), m42296(arrayList));
        } else {
            if (i == 1) {
                abstractC20521.mo33782(i, arrayList2.size(), 0, m42296(arrayList2), (Object[]) null);
                return;
            }
            if (i == 2) {
                abstractC20521.mo33782(i, arrayList2.size(), 0, (Object[]) null, (Object[]) null);
            } else if (i == 3) {
                abstractC20521.mo33782(i, 0, 0, (Object[]) null, (Object[]) null);
            } else {
                if (i == 4) {
                    abstractC20521.mo33782(i, 0, 1, (Object[]) null, m42296(arrayList));
                    return;
                }
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m42296(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objM45782 = arrayList.get(i);
            if (objM45782 instanceof C20291) {
                objM45782 = ((C20291) objM45782).m45782();
            }
            objArr[i] = objM45782;
        }
        return objArr;
    }
}
