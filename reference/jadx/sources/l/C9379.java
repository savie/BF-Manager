package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.ۡ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4FG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9379 implements InterfaceC17649 {
    @Override // l.InterfaceC17649
    /* JADX INFO: renamed from: ۙ */
    public final C9444 mo19233(C4688 c4688) throws ProtocolException {
        InterfaceC2668 interfaceC2668M14560 = c4688.m14560();
        C19076 c19076M14556 = c4688.m14556();
        C14600 c14600M14557 = c4688.m14557();
        C7954 c7954M14558 = c4688.m14558();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c4688.m14562().getClass();
        interfaceC2668M14560.mo8831(c7954M14558);
        c4688.m14562().getClass();
        C1242 c1242Mo8827 = null;
        if (C15407.m36887(c7954M14558.m21651()) && c7954M14558.m21647() != null) {
            if ("100-continue".equalsIgnoreCase(c7954M14558.m21646("Expect"))) {
                interfaceC2668M14560.mo8832();
                c4688.m14562().getClass();
                c1242Mo8827 = interfaceC2668M14560.mo8827(true);
            }
            if (c1242Mo8827 == null) {
                c4688.m14562().getClass();
                InterfaceC11573 interfaceC11573M35106 = C14556.m35106(new C1177(interfaceC2668M14560.mo8828(c7954M14558, c7954M14558.m21647().mo26310())));
                c7954M14558.m21647().mo26311(interfaceC11573M35106);
                interfaceC11573M35106.close();
                c4688.m14562().getClass();
            } else if (!c14600M14557.m35247()) {
                c19076M14556.m44185();
            }
        }
        interfaceC2668M14560.mo8830();
        if (c1242Mo8827 == null) {
            c4688.m14562().getClass();
            c1242Mo8827 = interfaceC2668M14560.mo8827(false);
        }
        c1242Mo8827.m4485(c7954M14558);
        c1242Mo8827.m4484(c19076M14556.m44182().m35249());
        c1242Mo8827.m4491(jCurrentTimeMillis);
        c1242Mo8827.m4481(System.currentTimeMillis());
        C9444 c9444M4479 = c1242Mo8827.m4479();
        int iM24820 = c9444M4479.m24820();
        if (iM24820 == 100) {
            C1242 c1242Mo8828 = interfaceC2668M14560.mo8827(false);
            c1242Mo8828.m4485(c7954M14558);
            c1242Mo8828.m4484(c19076M14556.m44182().m35249());
            c1242Mo8828.m4491(jCurrentTimeMillis);
            c1242Mo8828.m4481(System.currentTimeMillis());
            c9444M4479 = c1242Mo8828.m4479();
            iM24820 = c9444M4479.m24820();
        }
        c4688.m14562().getClass();
        C1242 c1242M24824 = c9444M4479.m24824();
        c1242M24824.m4486(interfaceC2668M14560.mo8829(c9444M4479));
        C9444 c9444M44710 = c1242M24824.m4479();
        if ("close".equalsIgnoreCase(c9444M44710.m24826().m21646("Connection")) || "close".equalsIgnoreCase(c9444M44710.m24817("Connection"))) {
            c19076M14556.m44185();
        }
        if ((iM24820 != 204 && iM24820 != 205) || c9444M44710.m24818().mo9079() <= 0) {
            return c9444M44710;
        }
        StringBuilder sbM12235 = C3769.m12235(iM24820, "HTTP ", " had non-zero Content-Length: ");
        sbM12235.append(c9444M44710.m24818().mo9079());
        throw new ProtocolException(sbM12235.toString());
    }
}
