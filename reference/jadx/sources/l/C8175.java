package l;

/* JADX INFO: renamed from: l.۟᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8175 extends AbstractC6511 {
    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final long mo18363(Object obj) {
        return ((C1997) obj).m6832();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final void mo18366(long j, Object obj) {
        ((C1997) obj).m6833(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final long mo18367(Object obj) {
        return ((C1997) obj).m6834();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final void mo18369(long j, Object obj) {
        ((C1997) obj).m6836(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final String mo18370(Object obj) {
        C1997 c1997 = (C1997) obj;
        String strM6840 = c1997.m6840();
        return (strM6840.endsWith("/") || !c1997.m6837()) ? strM6840 : strM6840.concat("/");
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18372(long j, Object obj) {
        ((C1997) obj).m6842(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩸ */
    public final long mo18373(Object obj) {
        return ((C1997) obj).m6831();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final Object mo18368(String str) {
        if (!C0878.m3579(str, "/", false)) {
            throw new RuntimeException();
        }
        C8002 c8002 = new C8002(str);
        String strM21843 = c8002.m21843();
        int i = C2494.f7991;
        String parent = c8002.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        C15243.m36586((Object) strM21843);
        C15243.m36586((Object) strConcat);
        return new C1997(-1, str, strM21843, strConcat, true, false, -1L, -1L, 0L, 0, null);
    }
}
