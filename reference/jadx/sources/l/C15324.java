package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 698A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15324 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        return !c11545M47970.m28794() && c21422.m47974("trash") && c11545M47970.m28814("local");
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("trash");
        c11545M47970.m28775("local");
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C22689.class);
        c10142.m25776(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25768("ARG_MSG_FROM", c21422.m47976());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25763();
    }
}
