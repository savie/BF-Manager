package l;

/* JADX INFO: renamed from: l.۫᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12647 extends AbstractC9990 {
    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۖ */
    public final long mo3898(Object obj) {
        return ((C10049) obj).m25429().getTime();
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ long mo3899(Object obj) {
        return 0L;
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo3900(long j, Object obj) {
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final long mo3901(Object obj) {
        return ((C10049) obj).m25417();
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final void mo3903(long j, Object obj) {
        C10049 c10049 = (C10049) obj;
        c10049.getClass();
        c10049.m25411(C16502.fromMillis(j));
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ܰ */
    public final String mo3904(Object obj) {
        C10049 c10049 = (C10049) obj;
        String strM25433 = c10049.m25433();
        return (strM25433.endsWith("/") || !c10049.m25430()) ? strM25433 : strM25433.concat("/");
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ܰ */
    public final void mo3905(long j, Object obj) {
        ((C10049) obj).m25426(j);
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final Object mo3902(String str) {
        return new C10049(str);
    }
}
