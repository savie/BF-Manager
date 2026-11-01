package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7318 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f24312 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19524(AbstractC20745 abstractC20745) {
        if (abstractC20745 == null || !(abstractC20745 instanceof C17196)) {
            return;
        }
        this.f24312.add(abstractC20745.mo40129());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19525() {
        if (!C14063.m34008()) {
            return true;
        }
        Iterator it = this.f24312.iterator();
        while (it.hasNext()) {
            String strM40128 = ((C17196) it.next()).m40128();
            C0262 c0262 = C17196.f54822;
            if (!C0262.m1763(strM40128)) {
                C17196.f54827.mo23641(new AtomicReference(strM40128));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m19526() {
        if (!C14063.m34008()) {
            return Collections.EMPTY_LIST;
        }
        return (List) C9030.stream(this.f24312).filter(new C13439(1)).sorted().collect(C1890.toList());
    }
}
