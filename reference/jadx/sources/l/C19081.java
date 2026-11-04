package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19081 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61796 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44195(C2346 c2346) {
        C12128.m30306(c2346, "range must not be empty, but was %s", !c2346.m7917());
        this.f61796.add(c2346);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44196(C19081 c19081) {
        Iterator it = c19081.f61796.iterator();
        while (it.hasNext()) {
            m44195((C2346) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1182 m44194() {
        ArrayList arrayList = this.f61796;
        C22811 c22811 = new C22811(arrayList.size());
        int i = C2346.f7567;
        Collections.sort(arrayList, C9057.f29455);
        InterfaceC9802 interfaceC9802M20913 = C7676.m20913(arrayList.iterator());
        while (true) {
            C18117 c18117 = (C18117) interfaceC9802M20913;
            if (!c18117.hasNext()) {
                break;
            }
            C2346 c2346M7924 = (C2346) c18117.next();
            while (c18117.hasNext()) {
                C2346 c2346 = (C2346) c18117.peek();
                if (!c2346M7924.m7921(c2346)) {
                    break;
                }
                C12128.m30310(c2346M7924.m7923(c2346).m7917(), "Overlapping ranges not permitted but found %s overlapping %s", c2346M7924, c2346);
                c2346M7924 = c2346M7924.m7924((C2346) c18117.next());
            }
            c22811.m19805((Object) c2346M7924);
        }
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        if (abstractC1928M51441.isEmpty()) {
            return C1182.m4355();
        }
        if (abstractC1928M51441.size() == 1 && ((C2346) C16625.m39331((Collection) abstractC1928M51441)).equals(C2346.m7915())) {
            return C1182.m4356();
        }
        return new C1182(abstractC1928M51441);
    }
}
