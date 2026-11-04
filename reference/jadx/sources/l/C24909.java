package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45FR */
/* JADX INFO: loaded from: classes2.dex */
public final class C24909 extends C4025 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f80619;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f80620;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f80621;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55493(AbstractC15037 abstractC15037, boolean z) {
        ArrayList arrayList = this.f80619;
        int size = arrayList.size();
        C10562[] c10562Arr = new C10562[size];
        ArrayList arrayList2 = this.f80621;
        C10562[] c10562Arr2 = new C10562[arrayList2.size()];
        ArrayList arrayList3 = this.f80620;
        int[] iArr = new int[arrayList3.size()];
        for (int i = 0; i < size; i++) {
            c10562Arr[i] = ((C5517) arrayList.get(i)).m16430();
            c10562Arr2[i] = ((C5517) arrayList2.get(i)).m16430();
            iArr[i] = ((Integer) arrayList3.get(i)).intValue();
        }
        m7998(abstractC15037.mo10785(this.f13732, this.f13733, c10562Arr, c10562Arr2, iArr, this.f7610, z));
    }
}
