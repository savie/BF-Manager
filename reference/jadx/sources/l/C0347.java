package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB9Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1844;

    public C0347(int i) {
        InterfaceC16492 c3068;
        this.f1844 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f1844;
            if (i <= 3072) {
                c3068 = new C13770(i);
            } else {
                c3068 = new C3068();
            }
            arrayList.add(c3068);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2092(int i, int i2) {
        InterfaceC16492 c3068;
        int iMax = Math.max(i, i2) + 1;
        ArrayList arrayList = this.f1844;
        arrayList.ensureCapacity(iMax);
        for (int size = arrayList.size(); size < iMax; size++) {
            if (iMax <= 3072) {
                c3068 = new C13770(iMax);
            } else {
                c3068 = new C3068();
            }
            arrayList.add(c3068);
        }
        ((InterfaceC16492) arrayList.get(i)).add(i2);
        ((InterfaceC16492) arrayList.get(i2)).add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2093(int i, InterfaceC16492 interfaceC16492) {
        ArrayList arrayList = this.f1844;
        if (i < arrayList.size()) {
            interfaceC16492.mo10003((InterfaceC16492) arrayList.get(i));
        }
    }
}
