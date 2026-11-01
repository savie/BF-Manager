package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8268 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C16137 c16137M17154;
        C11545 c11545M47970 = c21422.m47970();
        if (c11545M47970.m28794()) {
            return false;
        }
        for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
            if ((interfaceC2557 instanceof C6151) && (c16137M17154 = ((C6151) interfaceC2557).m17154()) != null) {
                String lowerCase = c16137M17154.m38199().toLowerCase();
                if (lowerCase.startsWith("android/data/") || lowerCase.startsWith("android/obb/")) {
                    return false;
                }
            }
        }
        return c21422.m47974("trash") && c11545M47970.m28814("local");
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
        C10142 c10142 = new C10142(C18851.class);
        c10142.m25776(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25768("ARG_MSG_FROM", c21422.m47976());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("sourcePath", c21422.m47961());
        c10142.m25768("targetPath", c11545M47970.m28799());
        c10142.m25763();
    }
}
