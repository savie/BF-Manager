package l;

/* JADX INFO: renamed from: l.۫ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13244 extends AbstractC6511 {
    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final long mo18363(Object obj) {
        C8002 c8002 = (C8002) obj;
        if (c8002.m21813()) {
            return 0L;
        }
        return c8002.m21838();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۙ */
    public final void mo18366(long j, Object obj) {
        ((C8002) obj).m21818(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final long mo18367(Object obj) {
        return ((C8002) obj).getSize();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final void mo18369(long j, Object obj) {
        ((C8002) obj).setTime(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final String mo18370(Object obj) {
        return ((C8002) obj).getName();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18372(long j, Object obj) {
        ((C8002) obj).m21854(j);
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ᩸ */
    public final long mo18373(Object obj) {
        return ((C8002) obj).getTime();
    }

    @Override // l.AbstractC6511
    /* JADX INFO: renamed from: ۤ */
    public final Object mo18368(String str) {
        return new C8002(str);
    }
}
