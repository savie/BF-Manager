package l;

import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܶ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14928 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        if (!c11545M47970.m28794() && c21422.m47974("local") && c11545M47970.m28814("local")) {
            return !c21422.m47966().equals(c11545M47970.m28801()) || c21422.m47975() == 1;
        }
        return false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("local");
        c11545M47970.m28775("local");
        if (!c21422.m47977() && c21422.m47966().equals(c11545M47970.m28801())) {
            c21422.m47963("local");
            final InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
            C7872.m20771(c21422.m47980(), interfaceC2557M47981, c21422.m47959(), new InterfaceC18455() { // from class: l.᩸֫᩹
                @Override // l.InterfaceC18455
                /* JADX INFO: renamed from: ۙ */
                public final void mo42803(String str) {
                    int i = C20725.f67443;
                    C10142 c10142 = new C10142(C22689.class);
                    InterfaceC2557 interfaceC2557 = interfaceC2557M47981;
                    c10142.m25779(Collections.singletonList(interfaceC2557));
                    C21422 c21423 = c21422;
                    c10142.m25780(c21423);
                    c10142.m25768("ARG_MSG_FROM", interfaceC2557.getName());
                    if (interfaceC2557.isDirectory()) {
                        c10142.m25768("ARG_MSG_TO", str);
                    }
                    c10142.m25768("targetPath", c21423.m47959());
                    c10142.m25768("replacedName", str);
                    c10142.m25763();
                }
            });
            return;
        }
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C22689.class);
        c10142.m25779(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35677(String... strArr) {
        for (String str : strArr) {
            if (C8272.m21690(str) != null) {
                return true;
            }
        }
        return false;
    }
}
