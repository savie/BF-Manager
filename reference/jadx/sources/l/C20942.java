package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20942 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67004 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20942 m47872(ArrayList arrayList) {
        C20942 c20942 = new C20942();
        c20942.f67004.addAll(arrayList);
        return c20942;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47874(C14228 c14228) {
        this.f67004.add(c14228);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m47876() {
        return this.f67004;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m47877() {
        return this.f67004.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m47873() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f67004;
            if (i < arrayList.size()) {
                if (i != 0) {
                    sb.append('\n');
                }
                sb.append(((C14228) arrayList.get(i)).m34537());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m47875() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f67004.iterator();
        while (it.hasNext()) {
            C5280 c5280M34539 = ((C14228) it.next()).m34539();
            if (c5280M34539 != null) {
                arrayList.add(c5280M34539);
            }
        }
        return arrayList;
    }
}
