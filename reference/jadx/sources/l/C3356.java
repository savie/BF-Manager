package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N660 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3356 extends AbstractC23114 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20291 f12425;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f12426;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f12427;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f12428;

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۙ */
    public final void mo2544(AbstractC20521 abstractC20521) {
        ArrayList arrayList = this.f12428;
        int size = arrayList.size();
        C9938[] c9938Arr = new C9938[size];
        for (int i = 0; i < size; i++) {
            c9938Arr[i] = ((C20291) arrayList.get(i)).m45782();
        }
        abstractC20521.mo35161(this.f12427, this.f12426, this.f12425.m45782(), c9938Arr);
        m51119(abstractC20521);
    }
}
