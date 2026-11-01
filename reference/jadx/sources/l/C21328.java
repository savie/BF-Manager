package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21328 extends C18506 {
    @Override // l.C18506
    /* JADX INFO: renamed from: ۙ */
    public final void mo10854(C22823 c22823, HashSet hashSet) {
        String lowerCase = m24477().toLowerCase();
        if (c22823.m50562().f11191.equalsIgnoreCase(lowerCase)) {
            hashSet.addAll(c22823.m50562().m8884(m24475(), m24468(), C17178.f54761));
        } else if (c22823.m50552().containsKey(lowerCase)) {
            new C14979(m24477(), EnumC14357.TYPE_PTR, m24475(), m24468()).mo10854(c22823, hashSet);
        } else {
            m42899(c22823, hashSet, (C0244) ((ConcurrentMapC13783) c22823.m50563()).get(lowerCase));
        }
    }

    @Override // l.C18506
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10855(C22823 c22823) {
        String lowerCase = m24477().toLowerCase();
        return c22823.m50562().f11191.equals(lowerCase) || ((ConcurrentMapC13783) c22823.m50563()).containsKey(lowerCase);
    }
}
