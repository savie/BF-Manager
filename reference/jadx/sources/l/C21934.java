package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0766 f71139;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48752(Set set) {
        C0766 c0766 = this.f71139;
        c0766.f3084.clear();
        c0766.f3087.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf == -1) {
                c0766.f3087.add(str);
            } else {
                c0766.m3295(str.substring(0, iLastIndexOf)).f3087.add(str.substring(iLastIndexOf + 1));
            }
        }
        c0766.m3296();
    }
}
