package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11185 extends C23120 {
    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ */
    public final void mo9133(C14168 c14168, HashSet hashSet) {
        m52052(c14168, hashSet, (C17307) ((ConcurrentMapC17249) c14168.m34445()).get(m35359().toLowerCase()));
    }

    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9134(C14168 c14168) {
        String lowerCase = m35359().toLowerCase();
        return c14168.m34408().f69056.equals(lowerCase) || ((ConcurrentMapC17249) c14168.m34445()).containsKey(lowerCase);
    }
}
