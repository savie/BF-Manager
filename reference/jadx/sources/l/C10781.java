package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۧۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C10781 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        return c21422.m47974(b.k) && c11545M47970.m28814("local") && !c11545M47970.m28794();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775("local");
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775("local");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C20658.class);
        c10142.m25779(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25773(c21422.m47960());
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25769("moveMode", false);
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27079(AbstractC12233 abstractC12233, C19616 c19616) {
        for (AbstractC10444 abstractC10444 : c19616.m44704()) {
            if (abstractC10444.m26387() && !m27079(abstractC12233, abstractC10444.mo23365())) {
                return false;
            }
        }
        try {
            String strM26362 = c19616.m26362();
            abstractC12233.mo10269(strM26362);
            if (abstractC12233.mo10263(strM26362, true).isEmpty()) {
                return abstractC12233.m30348(strM26362, true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
