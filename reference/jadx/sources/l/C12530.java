package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45FR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12530 extends C13817 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f41947;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f41948;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f41949;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31147(AbstractC20521 abstractC20521, boolean z) {
        ArrayList arrayList = this.f41948;
        int size = arrayList.size();
        C9938[] c9938Arr = new C9938[size];
        ArrayList arrayList2 = this.f41947;
        C9938[] c9938Arr2 = new C9938[arrayList2.size()];
        ArrayList arrayList3 = this.f41949;
        int[] iArr = new int[arrayList3.size()];
        for (int i = 0; i < size; i++) {
            c9938Arr[i] = ((C20291) arrayList.get(i)).m45782();
            c9938Arr2[i] = ((C20291) arrayList2.get(i)).m45782();
            iArr[i] = ((Integer) arrayList3.get(i)).intValue();
        }
        m36800(abstractC20521.mo33779(this.f45603, this.f45602, c9938Arr, c9938Arr2, iArr, this.f50028, z));
    }
}
