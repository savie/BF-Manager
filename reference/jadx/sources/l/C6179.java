package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6179 extends AbstractC23114 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20291 f21047;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f21048;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f21049;

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۙ */
    public final void mo2544(AbstractC20521 abstractC20521) {
        ArrayList arrayList = this.f21048;
        ArrayList arrayList2 = this.f21049;
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList2.get(i)).intValue();
        }
        int size2 = arrayList.size();
        C9938[] c9938Arr = new C9938[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            c9938Arr[i2] = ((C20291) arrayList.get(i2)).m45782();
        }
        abstractC20521.mo35165(this.f21047.m45782(), iArr, c9938Arr);
        m51119(abstractC20521);
    }
}
