package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: PIV4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23786 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77041;

    public C23786(ArrayList arrayList) {
        this.f77041 = arrayList;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C25278.f81645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23786 m53056(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3648.m11819((List) it.next()));
        }
        return new C23786(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m53057() {
        return this.f77041;
    }

    public final String toString() {
        return this.f77041.toString();
    }
}
