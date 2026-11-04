package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۜܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7237 extends C23120 {
    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ */
    public final void mo9133(C14168 c14168, HashSet hashSet) {
        AbstractC20136 abstractC20136M49147 = c14168.m34408().m49147(m35360(), true, C3137.f10167);
        if (abstractC20136M49147 != null) {
            hashSet.add(abstractC20136M49147);
        }
    }

    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9134(C14168 c14168) {
        String lowerCase = m35359().toLowerCase();
        return c14168.m34408().f69056.equals(lowerCase) || ((ConcurrentMapC17249) c14168.m34445()).containsKey(lowerCase);
    }
}
