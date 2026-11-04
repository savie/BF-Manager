package l;

/* JADX INFO: renamed from: l.۟ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7780 extends AbstractC6511 {
    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ long mo18363(Object obj) {
        return 0L;
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo18366(long j, Object obj) {
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final long mo18367(Object obj) {
        return ((C7450) obj).m20449();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final void mo18369(long j, Object obj) {
        C7450 c7450 = (C7450) obj;
        c7450.getClass();
        c7450.m20427(C21813.fromMillis(j));
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final String mo18370(Object obj) {
        C7450 c7450 = (C7450) obj;
        String strM20456 = c7450.m20456();
        return (strM20456.endsWith("/") || !c7450.m20450()) ? strM20456 : strM20456.concat("/");
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18372(long j, Object obj) {
        ((C7450) obj).m20452(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩸ */
    public final long mo18373(Object obj) {
        return ((C7450) obj).m20445().getTime();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final Object mo18368(String str) {
        return new C7450(str);
    }
}
