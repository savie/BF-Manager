package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N660 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6263 extends AbstractC9070 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21236;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f21237;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5517 f21239;

    @Override // l.AbstractC9070
    /* JADX INFO: renamed from: ۙ */
    public final void mo6249(AbstractC15037 abstractC15037) {
        ArrayList arrayList = this.f21237;
        int size = arrayList.size();
        C10562[] c10562Arr = new C10562[size];
        for (int i = 0; i < size; i++) {
            c10562Arr[i] = ((C5517) arrayList.get(i)).m16430();
        }
        abstractC15037.mo10790(this.f21238, this.f21236, this.f21239.m16430(), c10562Arr);
        m24207(abstractC15037);
    }
}
