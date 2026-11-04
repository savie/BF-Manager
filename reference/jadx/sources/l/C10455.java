package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۢ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10455 extends AbstractC11946 {
    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ */
    public final Object mo25426(Object obj) throws IOException {
        InterfaceC0916 c9118;
        C9864 c9864 = (C9864) obj;
        boolean z = true;
        if (c9864.f31737 == 1) {
            C2407 c2407 = new C2407(!c9864.f31745, c9864);
            c2407.m8152(c9864.f31739);
            c9118 = c2407;
        } else {
            c9118 = new C9118(c9864);
        }
        String str = c9864.f31738;
        if (!str.equalsIgnoreCase(a.D) && !str.equalsIgnoreCase("UTF8")) {
            z = false;
        }
        c9118.m3693(str);
        Charset.forName(str);
        try {
            c9118.m3687(c9864.f31742, c9864.f31740);
            if (c9864.f31744) {
                c9118.m3686();
                if (c9118 instanceof C2407) {
                    C2407 c2408 = (C2407) c9118;
                    c2408.m46789();
                    c2408.m46790();
                }
            }
            try {
                String str2 = c9864.f31741;
                String str3 = c9864.f31743;
                if (str2.equals("anonymous") && str3.isEmpty()) {
                    str3 = "anonymous@";
                }
                if (!c9118.m3709(str2, str3)) {
                    StringBuilder sbM10405 = C3188.m10405(C21576.m49088(R.string.MT_Protector), ": ");
                    sbM10405.append(c9118.m3704());
                    throw new C3090(sbM10405.toString());
                }
                if (z) {
                    c9118.mo3694("OPTS", "UTF8 ON");
                }
                c9118.mo3701();
                if (c9118.m3713()) {
                    return c9118;
                }
                c9118.mo3698();
                throw null;
            } catch (Exception e) {
                throw new IOException(C16076.m38224(e, C3188.m10405(C21576.m49088(R.string.MT_Protector), ": ")), e);
            }
        } catch (Exception e2) {
            throw new IOException(C16076.m38224(e2, C3188.m10405(C21576.m49088(R.string.MT_Protector), ": ")), e2);
        }
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ */
    public final void mo25427(Object obj, InterfaceC17913 interfaceC17913) {
        try {
            InterfaceC0916 interfaceC0916 = (InterfaceC0916) interfaceC17913.mo14204();
            if (interfaceC0916.m3703()) {
                interfaceC0916.m3714();
            }
        } catch (Exception unused) {
        }
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC17913 mo25428(Object obj) {
        return new C4489((InterfaceC0916) obj);
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo25429(Object obj, InterfaceC17913 interfaceC17913) {
        InterfaceC0916 interfaceC0916 = (InterfaceC0916) interfaceC17913.mo14204();
        if (!interfaceC0916.m3702()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC17913.mo14206().toEpochMilli();
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
            return true;
        }
        try {
            return interfaceC0916.m3697();
        } catch (IOException unused) {
            return false;
        }
    }
}
