package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22211 f17636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15303(Set set) {
        C22211 c22211 = this.f17636;
        c22211.f71550.clear();
        c22211.f71553.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf == -1) {
                c22211.f71553.add(str);
            } else {
                c22211.m50237(str.substring(0, iLastIndexOf)).f71553.add(str.substring(iLastIndexOf + 1));
            }
        }
        c22211.m50238();
    }
}
