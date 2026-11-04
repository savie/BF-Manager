package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2762 extends C23120 {
    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo9135(AbstractC14694 abstractC14694) {
        return true;
    }

    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9133(C14168 c14168, HashSet hashSet) {
        String lowerCase = m35359().toLowerCase();
        if (c14168.m34408().f69056.equalsIgnoreCase(lowerCase)) {
            hashSet.addAll(c14168.m34408().m49145(m35354(), m35348(), C3137.f10167));
        } else {
            if (c14168.m34433().containsKey(lowerCase)) {
                new C5220(m35359(), EnumC24021.TYPE_PTR, m35354(), m35348()).mo9133(c14168, hashSet);
                return;
            }
            Iterator it = ((ConcurrentMapC17249) c14168.m34445()).values().iterator();
            while (it.hasNext()) {
                m52052(c14168, hashSet, (C17307) ((AbstractC12457) it.next()));
            }
        }
    }

    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9134(C14168 c14168) {
        String lowerCase = m35359().toLowerCase();
        return c14168.m34408().f69056.equals(lowerCase) || ((ConcurrentMapC17249) c14168.m34445()).containsKey(lowerCase);
    }
}
