package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MASO */
/* JADX INFO: loaded from: classes3.dex */
public class C12000 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23289 f40218;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f40220;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0875 f40221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40219 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40222 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29891(AbstractC7060 abstractC7060) {
        if (this.f40219) {
            return;
        }
        this.f40219 = true;
        InterfaceC19761 interfaceC19761M18920 = abstractC7060.m18920();
        String strM29887 = m29887(interfaceC19761M18920);
        C0875 c0875M18921 = abstractC7060.m18921();
        StringBuilder sbM30914 = C12441.m30914("extraneous input ", strM29887, " expecting ");
        sbM30914.append(c0875M18921.m3501(abstractC7060.mo5089()));
        abstractC7060.m18911(interfaceC19761M18920, sbM30914.toString(), (C21877) null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29892(AbstractC7060 abstractC7060, C21877 c21877) {
        String string;
        if (this.f40219) {
            return;
        }
        this.f40219 = true;
        if (!(c21877 instanceof C4237)) {
            if (c21877 instanceof C5649) {
                C21877 c21878 = (C5649) c21877;
                abstractC7060.m18911(c21878.m48663(), "mismatched input " + m29887(c21878.m48663()) + " expecting " + c21878.m48660().m3501(abstractC7060.mo5089()), c21878);
                return;
            }
            if (!(c21877 instanceof C2826)) {
                System.err.println("unknown recognition error type: ".concat(c21877.getClass().getName()));
                abstractC7060.m18911(c21877.m48663(), c21877.getMessage(), c21877);
                return;
            }
            C21877 c21879 = (C2826) c21877;
            StringBuilder sbM30914 = C12441.m30914("rule ", abstractC7060.mo9135()[abstractC7060.f23706.mo1058()], " ");
            sbM30914.append(c21879.getMessage());
            abstractC7060.m18911(c21879.m48663(), sbM30914.toString(), c21879);
            return;
        }
        C4237 c4237 = (C4237) c21877;
        C4943 c4943 = abstractC7060.f23703;
        if (c4943 == null) {
            string = "<unknown input>";
        } else if (c4237.m11892().getType() == -1) {
            string = "<EOF>";
        } else {
            InterfaceC19761 interfaceC19761M11892 = c4237.m11892();
            InterfaceC19761 interfaceC19761M48663 = c4237.m48663();
            c4943.getClass();
            if (interfaceC19761M11892 == null || interfaceC19761M48663 == null) {
                string = "";
            } else {
                C22043 c22043M48958 = C22043.m48958(interfaceC19761M11892.mo22511(), interfaceC19761M48663.mo22511());
                ArrayList arrayList = c4943.f17275;
                int i = c22043M48958.f71443;
                int size = c22043M48958.f71444;
                if (i < 0 || size < 0) {
                    string = "";
                } else {
                    c4943.m13725(size);
                    if (size >= arrayList.size()) {
                        size = arrayList.size() - 1;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i <= size) {
                        InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayList.get(i);
                        if (interfaceC19761.getType() == -1) {
                            break;
                        }
                        sb.append(interfaceC19761.getText());
                        i++;
                    }
                    string = sb.toString();
                }
            }
        }
        abstractC7060.m18911(c4237.m48663(), "no viable alternative at input " + m29886(string), c4237);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29889() {
        this.f40219 = false;
        this.f40221 = null;
        this.f40222 = -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C0875 m29888(AbstractC7060 abstractC7060) {
        C16233 c16233 = ((C1499) abstractC7060.f61618).f48446;
        C0875 c0875 = new C0875(new int[0]);
        for (C23289 c23289 = abstractC7060.f23706; c23289 != null; c23289 = c23289.f29378) {
            int i = c23289.f29377;
            if (i < 0) {
                break;
            }
            c0875.m3504(c16233.m38341(((C23018) ((AbstractC2120) c16233.f52365.get(i)).m6671(0)).f74809));
        }
        c0875.m3506();
        return c0875;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo27093(AbstractC7060 abstractC7060) {
        AbstractC2120 abstractC2120 = (AbstractC2120) ((C1499) abstractC7060.f61618).f48446.f52365.get(abstractC7060.m43800());
        if (this.f40219) {
            return;
        }
        int iMo11332 = abstractC7060.f23703.mo11332(1);
        C0875 c0875M38341 = abstractC7060.mo5091().m38341(abstractC2120);
        if (c0875M38341.m3508(iMo11332)) {
            this.f40218 = null;
            this.f40220 = -1;
            return;
        }
        if (c0875M38341.m3508(-2)) {
            if (this.f40218 == null) {
                this.f40218 = abstractC7060.f23706;
                this.f40220 = abstractC7060.m43800();
                return;
            }
            return;
        }
        int iMo2265 = abstractC2120.mo2265();
        if (iMo2265 != 3 && iMo2265 != 4 && iMo2265 != 5) {
            switch (iMo2265) {
                case 9:
                case 11:
                    m29891(abstractC7060);
                    C0875 c0875M18921 = abstractC7060.m18921();
                    C0875 c0875M29888 = m29888(abstractC7060);
                    C0875 c0875 = new C0875(new int[0]);
                    c0875.m3504(c0875M18921);
                    c0875.m3504(c0875M29888);
                    int iMo11333 = abstractC7060.f23703.mo11332(1);
                    while (iMo11333 != -1 && !c0875.m3508(iMo11333)) {
                        abstractC7060.mo18924();
                        iMo11333 = abstractC7060.f23703.mo11332(1);
                    }
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m29890(abstractC7060) == null) {
            throw new C5649(abstractC7060);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo27095(AbstractC7060 abstractC7060, C21877 c21877) {
        C0875 c0875;
        if (this.f40222 == abstractC7060.f23703.index() && (c0875 = this.f40221) != null && c0875.m3508(abstractC7060.m43800())) {
            abstractC7060.mo18924();
        }
        this.f40222 = abstractC7060.f23703.index();
        if (this.f40221 == null) {
            this.f40221 = new C0875(new int[0]);
        }
        this.f40221.m3502(abstractC7060.m43800());
        C0875 c0875M29888 = m29888(abstractC7060);
        int iMo11332 = abstractC7060.f23703.mo11332(1);
        while (iMo11332 != -1 && !c0875M29888.m3508(iMo11332)) {
            abstractC7060.mo18924();
            iMo11332 = abstractC7060.f23703.mo11332(1);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC19761 mo27094(AbstractC7060 abstractC7060) {
        String str;
        InterfaceC19761 interfaceC19761M29890 = m29890(abstractC7060);
        if (interfaceC19761M29890 != null) {
            abstractC7060.mo18924();
            return interfaceC19761M29890;
        }
        if (((C1499) abstractC7060.f61618).f48446.m38342(((AbstractC2120) ((C1499) abstractC7060.f61618).f48446.f52365.get(abstractC7060.m43800())).m6671(0).f55272, abstractC7060.f23706).m3508(abstractC7060.f23703.mo11332(1))) {
            if (!this.f40219) {
                this.f40219 = true;
                InterfaceC19761 interfaceC19761M18920 = abstractC7060.m18920();
                abstractC7060.m18911(interfaceC19761M18920, "missing " + abstractC7060.m18921().m3501(abstractC7060.mo5089()) + " at " + m29887(interfaceC19761M18920), (C21877) null);
            }
            InterfaceC19761 interfaceC19761M18921 = abstractC7060.m18920();
            C0875 c0875M18921 = abstractC7060.m18921();
            int iM3500 = !c0875M18921.m3507() ? c0875M18921.m3500() : 0;
            if (iM3500 == -1) {
                str = "<missing EOF>";
            } else {
                str = "<missing " + abstractC7060.mo5089().m47629(iM3500) + ">";
            }
            String str2 = str;
            InterfaceC19761 interfaceC19761Mo13724 = abstractC7060.f23703.mo13724(-1);
            if (interfaceC19761M18921.getType() == -1 && interfaceC19761Mo13724 != null) {
                interfaceC19761M18921 = interfaceC19761Mo13724;
            }
            return abstractC7060.f23703.f17277.mo4951().mo9048(new C3697(interfaceC19761M18921.mo22513(), interfaceC19761M18921.mo22513().getInputStream()), iM3500, str2, 0, -1, -1, interfaceC19761M18921.getLine(), interfaceC19761M18921.mo22509());
        }
        if (this.f40218 != null) {
            int i = this.f40220;
            C5649 c5649 = new C5649(abstractC7060, abstractC7060.f23703, this.f40218);
            c5649.m48661(i);
            c5649.m48662(abstractC7060.m18920());
            throw c5649;
        }
        throw new C5649(abstractC7060);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19761 m29890(AbstractC7060 abstractC7060) {
        if (!abstractC7060.m18921().m3508(abstractC7060.f23703.mo11332(2))) {
            return null;
        }
        m29891(abstractC7060);
        abstractC7060.mo18924();
        InterfaceC19761 interfaceC19761M18920 = abstractC7060.m18920();
        this.f40219 = false;
        this.f40221 = null;
        this.f40222 = -1;
        return interfaceC19761M18920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29887(InterfaceC19761 interfaceC19761) {
        if (interfaceC19761 == null) {
            return "<no token>";
        }
        String text = interfaceC19761.getText();
        if (text == null) {
            if (interfaceC19761.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC19761.getType() + ">";
            }
        }
        return m29886(text);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29886(String str) {
        return C16523.m38890("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }
}
