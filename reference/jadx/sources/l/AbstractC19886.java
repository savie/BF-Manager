package l;

/* JADX INFO: renamed from: l.᩶ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4PA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19886 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0917 f63756;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo7067(int i, InterfaceC14242 interfaceC14242);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo7068(InterfaceC14242 interfaceC14242);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36669(C22085 c22085, String[] strArr);

    /* JADX INFO: renamed from: ܰ */
    public abstract String[] mo24821();

    public AbstractC19886(C0917 c0917) {
        this.f63756 = c0917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m45144(InterfaceC14242 interfaceC14242, int i, C0129 c0129) {
        Object objMo7068 = mo7068(interfaceC14242);
        if (interfaceC14242.mo21038(1) == i) {
            interfaceC14242.mo34375();
            this.f63756.f3674 = false;
            return objMo7068;
        }
        return mo30314(interfaceC14242, i, c0129);
    }

    /* JADX INFO: renamed from: ܰ */
    public Object mo30314(InterfaceC14242 interfaceC14242, int i, C0129 c0129) throws C2951 {
        if (interfaceC14242.mo21038(2) == i) {
            C22085 c6562 = new C6562(i, interfaceC14242);
            interfaceC14242.mo34375();
            m45147(c6562);
            Object objMo7068 = mo7068(interfaceC14242);
            interfaceC14242.mo34375();
            return objMo7068;
        }
        if (c0129 != null) {
            if (c0129.m1195(1)) {
                C0129 c0129M45145 = m45145(true);
                c0129 = (C0129) c0129.clone();
                c0129.m1194(c0129M45145);
                if (this.f63756.f3671 >= 0) {
                    c0129.m1193();
                }
            }
            if (c0129.m1195(interfaceC14242.mo21038(1)) || c0129.m1195(1)) {
                Object objMo7067 = mo7067(i, interfaceC14242);
                C13619 c13619 = new C13619(i, interfaceC14242);
                c13619.f44937 = objMo7067;
                m45147(c13619);
                return objMo7067;
            }
        }
        throw new C2951(i, interfaceC14242);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45147(C22085 c22085) {
        C0917 c0917 = this.f63756;
        if (c0917.f3674) {
            return;
        }
        c0917.f3672++;
        c0917.f3674 = true;
        mo36669(c22085, mo24821());
    }

    /* JADX INFO: renamed from: ܰ */
    public String mo30315(C22085 c22085, String[] strArr) {
        String message = c22085.getMessage();
        if (c22085 instanceof C6562) {
            C6562 c6562 = (C6562) c22085;
            int i = c6562.f11055;
            return "extraneous input " + mo24775(c6562.f71539) + " expecting " + (i != -1 ? strArr[i] : "EOF");
        }
        if (c22085 instanceof C13619) {
            int i2 = ((C13619) c22085).f11055;
            StringBuilder sbM30914 = C12441.m30914("missing ", i2 != -1 ? strArr[i2] : "EOF", " at ");
            sbM30914.append(mo24775(c22085.f71539));
            return sbM30914.toString();
        }
        if (c22085 instanceof C2951) {
            int i3 = ((C2951) c22085).f11055;
            return "mismatched input " + mo24775(c22085.f71539) + " expecting " + (i3 != -1 ? strArr[i3] : "EOF");
        }
        if (c22085 instanceof C4445) {
            C4445 c4445 = (C4445) c22085;
            int i4 = c4445.f15834;
            return "mismatched tree node: " + c4445.f71536 + " expecting " + (i4 != -1 ? strArr[i4] : "EOF");
        }
        if (c22085 instanceof C11502) {
            return "no viable alternative at input " + mo24775(c22085.f71539);
        }
        if (c22085 instanceof C10714) {
            return "required (...)+ loop did not match anything at input " + mo24775(c22085.f71539);
        }
        if (c22085 instanceof C9303) {
            return "mismatched input " + mo24775(c22085.f71539) + " expecting set null";
        }
        if (c22085 instanceof C1540) {
            return "mismatched input " + mo24775(c22085.f71539) + " expecting set null";
        }
        if (!(c22085 instanceof C23414)) {
            return message;
        }
        C23414 c23414 = (C23414) c22085;
        StringBuilder sb = new StringBuilder("rule ");
        sb.append(c23414.f75821);
        sb.append(" failed predicate: {");
        return C22697.m50267(sb, c23414.f75820, "}?");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45143() {
        return this.f63756.f3672;
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo24775(InterfaceC12913 interfaceC12913) {
        String text = interfaceC12913.getText();
        if (text == null) {
            if (interfaceC12913.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC12913.getType() + ">";
            }
        }
        return C16523.m38890("'", text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t"), "'");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45148(InterfaceC14242 interfaceC14242) {
        C0917 c0917 = this.f63756;
        if (c0917.f3670 == interfaceC14242.index()) {
            interfaceC14242.mo34375();
        }
        c0917.f3670 = interfaceC14242.index();
        C0129 c0129M45145 = m45145(false);
        int iMo21038 = interfaceC14242.mo21038(1);
        while (iMo21038 != -1 && !c0129M45145.m1195(iMo21038)) {
            interfaceC14242.mo34375();
            iMo21038 = interfaceC14242.mo21038(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0129 m45145(boolean z) {
        C0917 c0917 = this.f63756;
        C0129 c0129 = new C0129();
        for (int i = c0917.f3671; i >= 0; i--) {
            C0129 c01210 = c0917.f3673[i];
            c0129.m1194(c01210);
            if (z) {
                if (!c01210.m1195(1)) {
                    break;
                }
                if (i > 0) {
                    c0129.m1193();
                }
            }
        }
        return c0129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45146(C0129 c0129) {
        C0917 c0917 = this.f63756;
        int i = c0917.f3671 + 1;
        C0129[] c0129Arr = c0917.f3673;
        if (i >= c0129Arr.length) {
            C0129[] c0129Arr2 = new C0129[c0129Arr.length * 2];
            System.arraycopy(c0129Arr, 0, c0129Arr2, 0, c0129Arr.length);
            c0917.f3673 = c0129Arr2;
        }
        C0129[] c0129Arr3 = c0917.f3673;
        int i2 = c0917.f3671 + 1;
        c0917.f3671 = i2;
        c0129Arr3[i2] = c0129;
    }
}
