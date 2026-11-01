package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۙ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4927 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f17257;

    public C4927(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f17257 = str;
        m12944();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        if (!c21422.m47974(this.f17257) || !c11545M47970.m28814(b.k) || c11545M47970.m28794()) {
            return false;
        }
        AbstractC11462 abstractC11462M47960 = c21422.m47960();
        if (abstractC11462M47960 instanceof C9183) {
            C9183 c9183 = (C9183) abstractC11462M47960;
            C9183 c9184 = (C9183) c11545M47970.m28817();
            if (c9183.m23639() == c9184.m23639()) {
                return !c9183.m28629().equals(c9184.m28629());
            }
        }
        return true;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        String str = this.f17257;
        c21422.m47963(str);
        c11545M47970.m28775(b.k);
        if (str.equals(b.k)) {
            if (((AbstractC12233) c21422.m47960().mo13029()).f40874.f40385 != ((AbstractC12233) c21422.m47970().m28817().mo13029()).f40874.f40385) {
                DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, c21422.m47980(), "network_transfer_warn");
            }
        }
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(this.f17257);
        c11545M47970.m28775(b.k);
        AbstractC9677 abstractC9677Mo13029 = c21422.m47960().mo13029();
        AbstractC12233 abstractC12233 = (AbstractC12233) c21422.m47970().m28817().mo13029();
        String strTrim = abstractC12233.f40874.mo4704().trim();
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C3018.class);
        c10142.m25779(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25770("ARG_STATELESS_VISITOR", abstractC9677Mo13029.m24619());
        c10142.m25770("ARG_STATELESS_VISITOR2", abstractC12233.m24619());
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", c11545M47970.m28826());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25768("descPath", strTrim);
        c10142.m25763();
    }
}
