package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩵ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20617 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f66139 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47238(AbstractC22044 abstractC22044) {
        if (abstractC22044 == null || !(abstractC22044 instanceof C18379)) {
            return;
        }
        this.f66139.add(abstractC22044.mo42890());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47239() {
        if (!C13903.m33865()) {
            return true;
        }
        Iterator it = this.f66139.iterator();
        while (it.hasNext()) {
            String strM42887 = ((C18379) it.next()).m42887();
            C4209 c4209 = C18379.f59876;
            if (!C4209.m13460(strM42887)) {
                C18379.f59879.mo40348(new AtomicReference(strM42887));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m47240() {
        if (!C13903.m33865()) {
            return Collections.EMPTY_LIST;
        }
        return (List) C1170.stream(this.f66139).filter(new C14005(1)).sorted().collect(C2025.toList());
    }
}
