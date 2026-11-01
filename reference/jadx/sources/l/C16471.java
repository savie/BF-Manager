package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16471 implements InterfaceC7814, InterfaceC3183 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f52930;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52931;

    public /* synthetic */ C16471(ArrayList arrayList, ArrayList arrayList2) {
        this.f52930 = arrayList;
        this.f52931 = arrayList2;
    }

    public /* synthetic */ C16471(C10907 c10907, ArrayList arrayList) {
        this.f52931 = c10907;
        this.f52930 = arrayList;
    }

    @Override // l.InterfaceC7814
    /* JADX INFO: renamed from: ۙ */
    public void mo20516(int i, int i2, int i3) {
        C10907.m27337((C10907) this.f52931, this.f52930, i, i2, i3);
    }

    @Override // l.InterfaceC3183
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1619(String str) {
        ArrayList arrayList = (ArrayList) this.f52931;
        Iterator it = this.f52930.iterator();
        while (it.hasNext()) {
            if (((C12238) it.next()).m30440(str)) {
                return false;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((C12238) it2.next()).m30440(str)) {
                return true;
            }
        }
        return arrayList.isEmpty();
    }
}
