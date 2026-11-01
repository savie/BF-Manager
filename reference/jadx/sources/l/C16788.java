package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16788 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53780 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39441(C9548 c9548) {
        C18304.m42514(c9548, "range must not be empty, but was %s", !c9548.m24404());
        this.f53780.add(c9548);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39442(C16788 c16788) {
        Iterator it = c16788.f53780.iterator();
        while (it.hasNext()) {
            m39441((C9548) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17493 m39440() {
        ArrayList arrayList = this.f53780;
        C4793 c4793 = new C4793(arrayList.size());
        int i = C9548.f32245;
        Collections.sort(arrayList, C1785.f6936);
        InterfaceC23659 interfaceC23659M38722 = C16458.m38722(arrayList.iterator());
        while (true) {
            C19986 c19986 = (C19986) interfaceC23659M38722;
            if (!c19986.hasNext()) {
                break;
            }
            C9548 c9548M24402 = (C9548) c19986.next();
            while (c19986.hasNext()) {
                C9548 c9548 = (C9548) c19986.peek();
                if (!c9548M24402.m24408(c9548)) {
                    break;
                }
                C18304.m42518(c9548M24402.m24410(c9548).m24404(), "Overlapping ranges not permitted but found %s overlapping %s", c9548M24402, c9548);
                c9548M24402 = c9548M24402.m24402((C9548) c19986.next());
            }
            c4793.m52161((Object) c9548M24402);
        }
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        if (abstractC22433M13309.isEmpty()) {
            return C17493.m40758();
        }
        if (abstractC22433M13309.size() == 1 && ((C9548) C22808.m50467((Collection) abstractC22433M13309)).equals(C9548.m24392())) {
            return C17493.m40759();
        }
        return new C17493(abstractC22433M13309);
    }
}
