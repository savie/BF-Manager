package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MASO */
/* JADX INFO: loaded from: classes3.dex */
public class C12472 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14907 f40060;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f40061;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7998 f40063;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40059 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40062 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30970(AbstractC0540 abstractC0540) {
        if (this.f40059) {
            return;
        }
        this.f40059 = true;
        InterfaceC8743 interfaceC8743M2520 = abstractC0540.m2520();
        String strM30966 = m30966(interfaceC8743M2520);
        C14907 c14907M2525 = abstractC0540.m2525();
        StringBuilder sbM51387 = C22783.m51387("extraneous input ", strM30966, " expecting ");
        sbM51387.append(c14907M2525.m35857(abstractC0540.mo6640()));
        abstractC0540.m2513(interfaceC8743M2520, sbM51387.toString(), (C10234) null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30971(AbstractC0540 abstractC0540, C10234 c10234) {
        String string;
        if (this.f40059) {
            return;
        }
        this.f40059 = true;
        if (!(c10234 instanceof C18439)) {
            if (c10234 instanceof C24407) {
                C10234 c10235 = (C24407) c10234;
                abstractC0540.m2513(c10235.m26371(), "mismatched input " + m30966(c10235.m26371()) + " expecting " + c10235.m26368().m35857(abstractC0540.mo6640()), c10235);
                return;
            }
            if (!(c10234 instanceof C6507)) {
                System.err.println("unknown recognition error type: ".concat(c10234.getClass().getName()));
                abstractC0540.m2513(c10234.m26371(), c10234.getMessage(), c10234);
                return;
            }
            C10234 c10236 = (C6507) c10234;
            StringBuilder sbM51387 = C22783.m51387("rule ", abstractC0540.mo6683()[abstractC0540.f2262.mo1229()], " ");
            sbM51387.append(c10236.getMessage());
            abstractC0540.m2513(c10236.m26371(), sbM51387.toString(), c10236);
            return;
        }
        C18439 c18439 = (C18439) c10234;
        C3523 c3523 = abstractC0540.f2260;
        if (c3523 == null) {
            string = "<unknown input>";
        } else if (c18439.m42964().getType() == -1) {
            string = "<EOF>";
        } else {
            InterfaceC8743 interfaceC8743M42964 = c18439.m42964();
            InterfaceC8743 interfaceC8743M26371 = c18439.m26371();
            c3523.getClass();
            if (interfaceC8743M42964 == null || interfaceC8743M26371 == null) {
                string = "";
            } else {
                C4467 c4467M14163 = C4467.m14163(interfaceC8743M42964.mo23438(), interfaceC8743M26371.mo23438());
                ArrayList arrayList = c3523.f12106;
                int i = c4467M14163.f15984;
                int size = c4467M14163.f15985;
                if (i < 0 || size < 0) {
                    string = "";
                } else {
                    c3523.m11528(size);
                    if (size >= arrayList.size()) {
                        size = arrayList.size() - 1;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i <= size) {
                        InterfaceC8743 interfaceC8743 = (InterfaceC8743) arrayList.get(i);
                        if (interfaceC8743.getType() == -1) {
                            break;
                        }
                        sb.append(interfaceC8743.getText());
                        i++;
                    }
                    string = sb.toString();
                }
            }
        }
        abstractC0540.m2513(c18439.m26371(), "no viable alternative at input " + m30965(string), c18439);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30968() {
        this.f40059 = false;
        this.f40060 = null;
        this.f40062 = -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C14907 m30967(AbstractC0540 abstractC0540) {
        C11002 c11002 = ((C17671) abstractC0540.f30727).f55481;
        C14907 c14907 = new C14907(new int[0]);
        for (C7998 c7998 = abstractC0540.f2262; c7998 != null; c7998 = c7998.f9157) {
            int i = c7998.f9156;
            if (i < 0) {
                break;
            }
            c14907.m35860(c11002.m27844(((C7976) ((AbstractC17715) c11002.f34748.get(i)).m41478(0)).f26510));
        }
        c14907.m35861();
        return c14907;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo29438(AbstractC0540 abstractC0540) {
        AbstractC17715 abstractC17715 = (AbstractC17715) ((C17671) abstractC0540.f30727).f55481.f34748.get(abstractC0540.m24870());
        if (this.f40059) {
            return;
        }
        int iMo11537 = abstractC0540.f2260.mo11537(1);
        C14907 c14907M27844 = abstractC0540.mo6669().m27844(abstractC17715);
        if (c14907M27844.m35864(iMo11537)) {
            this.f40063 = null;
            this.f40061 = -1;
            return;
        }
        if (c14907M27844.m35864(-2)) {
            if (this.f40063 == null) {
                this.f40063 = abstractC0540.f2262;
                this.f40061 = abstractC0540.m24870();
                return;
            }
            return;
        }
        int iMo2479 = abstractC17715.mo2479();
        if (iMo2479 != 3 && iMo2479 != 4 && iMo2479 != 5) {
            switch (iMo2479) {
                case 9:
                case 11:
                    m30970(abstractC0540);
                    C14907 c14907M2525 = abstractC0540.m2525();
                    C14907 c14907M30967 = m30967(abstractC0540);
                    C14907 c14907 = new C14907(new int[0]);
                    c14907.m35860(c14907M2525);
                    c14907.m35860(c14907M30967);
                    int iMo11538 = abstractC0540.f2260.mo11537(1);
                    while (iMo11538 != -1 && !c14907.m35864(iMo11538)) {
                        abstractC0540.mo2527();
                        iMo11538 = abstractC0540.f2260.mo11537(1);
                    }
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m30969(abstractC0540) == null) {
            throw new C24407(abstractC0540);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo29437(AbstractC0540 abstractC0540, C10234 c10234) {
        C14907 c14907;
        if (this.f40062 == abstractC0540.f2260.index() && (c14907 = this.f40060) != null && c14907.m35864(abstractC0540.m24870())) {
            abstractC0540.mo2527();
        }
        this.f40062 = abstractC0540.f2260.index();
        if (this.f40060 == null) {
            this.f40060 = new C14907(new int[0]);
        }
        this.f40060.m35858(abstractC0540.m24870());
        C14907 c14907M30967 = m30967(abstractC0540);
        int iMo11537 = abstractC0540.f2260.mo11537(1);
        while (iMo11537 != -1 && !c14907M30967.m35864(iMo11537)) {
            abstractC0540.mo2527();
            iMo11537 = abstractC0540.f2260.mo11537(1);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC8743 mo29436(AbstractC0540 abstractC0540) {
        String str;
        InterfaceC8743 interfaceC8743M30969 = m30969(abstractC0540);
        if (interfaceC8743M30969 != null) {
            abstractC0540.mo2527();
            return interfaceC8743M30969;
        }
        if (((C17671) abstractC0540.f30727).f55481.m27845(((AbstractC17715) ((C17671) abstractC0540.f30727).f55481.f34748.get(abstractC0540.m24870())).m41478(0).f20405, abstractC0540.f2262).m35864(abstractC0540.f2260.mo11537(1))) {
            if (!this.f40059) {
                this.f40059 = true;
                InterfaceC8743 interfaceC8743M2520 = abstractC0540.m2520();
                abstractC0540.m2513(interfaceC8743M2520, "missing " + abstractC0540.m2525().m35857(abstractC0540.mo6640()) + " at " + m30966(interfaceC8743M2520), (C10234) null);
            }
            InterfaceC8743 interfaceC8743M2521 = abstractC0540.m2520();
            C14907 c14907M2525 = abstractC0540.m2525();
            int iM35856 = !c14907M2525.m35863() ? c14907M2525.m35856() : 0;
            if (iM35856 == -1) {
                str = "<missing EOF>";
            } else {
                str = "<missing " + abstractC0540.mo6640().m50198(iM35856) + ">";
            }
            String str2 = str;
            InterfaceC8743 interfaceC8743Mo5263 = abstractC0540.f2260.mo5263(-1);
            if (interfaceC8743M2521.getType() == -1 && interfaceC8743Mo5263 != null) {
                interfaceC8743M2521 = interfaceC8743Mo5263;
            }
            return abstractC0540.f2260.f12104.mo34038().mo19894(new C18637(interfaceC8743M2521.mo23439(), interfaceC8743M2521.mo23439().getInputStream()), iM35856, str2, 0, -1, -1, interfaceC8743M2521.getLine(), interfaceC8743M2521.mo23437());
        }
        if (this.f40063 != null) {
            int i = this.f40061;
            C24407 c24407 = new C24407(abstractC0540, abstractC0540.f2260, this.f40063);
            c24407.m26369(i);
            c24407.m26370(abstractC0540.m2520());
            throw c24407;
        }
        throw new C24407(abstractC0540);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8743 m30969(AbstractC0540 abstractC0540) {
        if (!abstractC0540.m2525().m35864(abstractC0540.f2260.mo11537(2))) {
            return null;
        }
        m30970(abstractC0540);
        abstractC0540.mo2527();
        InterfaceC8743 interfaceC8743M2520 = abstractC0540.m2520();
        this.f40059 = false;
        this.f40060 = null;
        this.f40062 = -1;
        return interfaceC8743M2520;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30966(InterfaceC8743 interfaceC8743) {
        if (interfaceC8743 == null) {
            return "<no token>";
        }
        String text = interfaceC8743.getText();
        if (text == null) {
            if (interfaceC8743.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC8743.getType() + ">";
            }
        }
        return m30965(text);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30965(String str) {
        return C14442.m34865("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }
}
