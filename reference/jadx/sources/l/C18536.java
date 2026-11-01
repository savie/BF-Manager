package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.ᩴۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L4FG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18536 implements InterfaceC1738 {
    @Override // l.InterfaceC1738
    /* JADX INFO: renamed from: ۙ */
    public final C18485 mo5785(C7247 c7247) throws ProtocolException {
        InterfaceC7953 interfaceC7953M19372 = c7247.m19372();
        C15009 c15009M19374 = c7247.m19374();
        C0896 c0896M19373 = c7247.m19373();
        C22719 c22719M19366 = c7247.m19366();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c7247.m19367().getClass();
        interfaceC7953M19372.mo20991(c22719M19366);
        c7247.m19367().getClass();
        C17779 c17779Mo20988 = null;
        if (C12123.m30173(c22719M19366.m50359()) && c22719M19366.m50358() != null) {
            if ("100-continue".equalsIgnoreCase(c22719M19366.m50357("Expect"))) {
                interfaceC7953M19372.mo20992();
                c7247.m19367().getClass();
                c17779Mo20988 = interfaceC7953M19372.mo20988(true);
            }
            if (c17779Mo20988 == null) {
                c7247.m19367().getClass();
                InterfaceC10983 interfaceC10983M3436 = C0834.m3436(new C17830(interfaceC7953M19372.mo20987(c22719M19366, c22719M19366.m50358().mo4375())));
                c22719M19366.m50358().mo4376(interfaceC10983M3436);
                interfaceC10983M3436.close();
                c7247.m19367().getClass();
            } else if (!c0896M19373.m3586()) {
                c15009M19374.m36002();
            }
        }
        interfaceC7953M19372.mo20990();
        if (c17779Mo20988 == null) {
            c7247.m19367().getClass();
            c17779Mo20988 = interfaceC7953M19372.mo20988(false);
        }
        c17779Mo20988.m41349(c22719M19366);
        c17779Mo20988.m41345(c15009M19374.m36003().m3587());
        c17779Mo20988.m41352(jCurrentTimeMillis);
        c17779Mo20988.m41342(System.currentTimeMillis());
        C18485 c18485M41340 = c17779Mo20988.m41340();
        int iM42858 = c18485M41340.m42858();
        if (iM42858 == 100) {
            C17779 c17779Mo20989 = interfaceC7953M19372.mo20988(false);
            c17779Mo20989.m41349(c22719M19366);
            c17779Mo20989.m41345(c15009M19374.m36003().m3587());
            c17779Mo20989.m41352(jCurrentTimeMillis);
            c17779Mo20989.m41342(System.currentTimeMillis());
            c18485M41340 = c17779Mo20989.m41340();
            iM42858 = c18485M41340.m42858();
        }
        c7247.m19367().getClass();
        C17779 c17779M42864 = c18485M41340.m42864();
        c17779M42864.m41347(interfaceC7953M19372.mo20989(c18485M41340));
        C18485 c18485M41341 = c17779M42864.m41340();
        if ("close".equalsIgnoreCase(c18485M41341.m42866().m50357("Connection")) || "close".equalsIgnoreCase(c18485M41341.m42859("Connection"))) {
            c15009M19374.m36002();
        }
        if ((iM42858 != 204 && iM42858 != 205) || c18485M41341.m42860().mo5212() <= 0) {
            return c18485M41341;
        }
        StringBuilder sbM40153 = C17214.m40153(iM42858, "HTTP ", " had non-zero Content-Length: ");
        sbM40153.append(c18485M41341.m42860().mo5212());
        throw new ProtocolException(sbM40153.toString());
    }
}
