package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2267 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        return c21422.m47974("local") && c11545M47970.m28814("local") && !c11545M47970.m28794() && !c21422.m47966().equals(c11545M47970.m28801());
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("local");
        c11545M47970.m28775("local");
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C11441.class);
        c10142.m25772(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("sourcePath", c21422.m47961());
        c10142.m25768("targetPath", c11545M47970.m28799());
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6948(AbstractC10444 abstractC10444) {
        if (abstractC10444.m26387()) {
            C19616 c19616Mo23365 = abstractC10444.mo23365();
            Iterator it = c19616Mo23365.m44704().iterator();
            while (it.hasNext()) {
                m6948((AbstractC10444) it.next());
            }
            AbstractC10868 abstractC10868Mo33989 = c19616Mo23365.m26380().mo33989();
            if (abstractC10868Mo33989.mo1799(EnumC17217.DELETE_EMPTY_DIRECTORY) == EnumC16512.UNSUPPORTED) {
                return;
            }
            try {
                abstractC10868Mo33989.mo8390();
            } catch (C20040 e) {
                if (e.m45399() != EnumC15807.DIRECTORY_NOT_EMPTY) {
                    EnumC15807 enumC15807 = EnumC15807.NOT_FOUND;
                }
            }
        }
    }
}
