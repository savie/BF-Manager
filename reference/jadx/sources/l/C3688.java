package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3688 extends C18506 {
    @Override // l.C18506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10854(C22823 c22823, HashSet hashSet) {
        AbstractC7923 abstractC7923M8886 = c22823.m50562().m8886(m24467(), true, C17178.f54761);
        if (abstractC7923M8886 != null) {
            hashSet.add(abstractC7923M8886);
        }
    }

    @Override // l.C18506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10855(C22823 c22823) {
        String lowerCase = m24477().toLowerCase();
        return c22823.m50562().f11191.equals(lowerCase) || ((ConcurrentMapC13783) c22823.m50563()).containsKey(lowerCase);
    }
}
