package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ܽ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16922 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        if (c21422.m47974(b.k) && c11545M47970.m28814(b.k) && !c11545M47970.m28794()) {
            return (((AbstractC12233) c21422.m47960().mo13029()).f40874.f40385 == ((AbstractC12233) c11545M47970.m28827()).f40874.f40385 && c21422.m47959().equals(c21422.m47970().m28798())) ? false : true;
        }
        return false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775(b.k);
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
        DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, c21422.m47980(), "network_transfer_warn");
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775(b.k);
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C0693.class);
        c10142.m25779(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25773(c21422.m47960());
        c10142.m25770("ARG_STATELESS_VISITOR2", c21422.m47970().m28827().m24619());
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25769("streamMode", true);
        c10142.m25763();
    }
}
