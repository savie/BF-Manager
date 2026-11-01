package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB9Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C20337 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65865;

    public C20337(int i) {
        Object c18241;
        this.f65865 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f65865;
            if (i <= 3072) {
                c18241 = new C1991(i);
            } else {
                c18241 = new C18241();
            }
            arrayList.add(c18241);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45902(int i, int i2) {
        Object c18241;
        int iMax = Math.max(i, i2) + 1;
        ArrayList arrayList = this.f65865;
        arrayList.ensureCapacity(iMax);
        for (int size = arrayList.size(); size < iMax; size++) {
            if (iMax <= 3072) {
                c18241 = new C1991(iMax);
            } else {
                c18241 = new C18241();
            }
            arrayList.add(c18241);
        }
        ((InterfaceC6952) arrayList.get(i)).add(i2);
        ((InterfaceC6952) arrayList.get(i2)).add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45903(int i, InterfaceC6952 interfaceC6952) {
        ArrayList arrayList = this.f65865;
        if (i < arrayList.size()) {
            interfaceC6952.mo6407((InterfaceC6952) arrayList.get(i));
        }
    }
}
