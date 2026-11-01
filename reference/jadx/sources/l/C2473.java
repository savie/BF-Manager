package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D7S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2473 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9831 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2473 m7581(ArrayList arrayList) {
        C2473 c2473 = new C2473();
        c2473.f9831.addAll(arrayList);
        return c2473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7584(C11647 c11647) {
        this.f9831.add(c11647);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m7586() {
        return this.f9831;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m7582() {
        return this.f9831.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7583() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9831;
            if (i < arrayList.size()) {
                if (i != 0) {
                    sb.append('\n');
                }
                sb.append(((C11647) arrayList.get(i)).m29102());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m7585() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9831.iterator();
        while (it.hasNext()) {
            C0316 c0316M29104 = ((C11647) it.next()).m29104();
            if (c0316M29104 != null) {
                arrayList.add(c0316M29104);
            }
        }
        return arrayList;
    }
}
