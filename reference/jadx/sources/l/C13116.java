package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O6FE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13116 extends AbstractC22878 {
    @Override // l.InterfaceC6470
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18295(C11624 c11624) {
        C18959 c18959 = this.f74337;
        AbstractC1566 abstractC1566M29192 = c11624.m29192(c18959.m44027());
        Iterator it = c18959.m44026().iterator();
        while (it.hasNext()) {
            if (!c11624.m29192((AbstractC16481) it.next()).equals(abstractC1566M29192)) {
                return false;
            }
        }
        return true;
    }
}
