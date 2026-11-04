package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17449 extends AbstractC9070 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f56753;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f56754;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5517 f56755;

    @Override // l.AbstractC9070
    /* JADX INFO: renamed from: ۙ */
    public final void mo6249(AbstractC15037 abstractC15037) {
        ArrayList arrayList = this.f56753;
        ArrayList arrayList2 = this.f56754;
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList2.get(i)).intValue();
        }
        int size2 = arrayList.size();
        C10562[] c10562Arr = new C10562[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            c10562Arr[i2] = ((C5517) arrayList.get(i2)).m16430();
        }
        abstractC15037.mo10802(this.f56755.m16430(), iArr, c10562Arr);
        m24207(abstractC15037);
    }
}
