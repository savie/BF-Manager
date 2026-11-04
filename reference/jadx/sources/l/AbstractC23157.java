package l;

/* JADX INFO: renamed from: l.᩸᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4PA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23157 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14951 f75050;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo18849(int i, InterfaceC17189 interfaceC17189);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo18850(InterfaceC17189 interfaceC17189);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4254(C4511 c4511, String[] strArr);

    /* JADX INFO: renamed from: ᩷ */
    public abstract String[] mo9003();

    public AbstractC23157(C14951 c14951) {
        this.f75050 = c14951;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m52075(InterfaceC17189 interfaceC17189, int i, C20173 c20173) {
        Object objMo18850 = mo18850(interfaceC17189);
        if (interfaceC17189.mo9833(1) == i) {
            interfaceC17189.mo17444();
            this.f75050.f48822 = false;
            return objMo18850;
        }
        return mo32753(interfaceC17189, i, c20173);
    }

    /* JADX INFO: renamed from: ᩷ */
    public Object mo32753(InterfaceC17189 interfaceC17189, int i, C20173 c20173) throws C23903 {
        if (interfaceC17189.mo9833(2) == i) {
            C4511 c0782 = new C0782(i, interfaceC17189);
            interfaceC17189.mo17444();
            m52077(c0782);
            Object objMo18850 = mo18850(interfaceC17189);
            interfaceC17189.mo17444();
            return objMo18850;
        }
        if (c20173 != null) {
            if (c20173.m46403(1)) {
                C20173 c20173M52076 = m52076(true);
                c20173 = (C20173) c20173.clone();
                c20173.m46402(c20173M52076);
                if (this.f75050.f48819 >= 0) {
                    c20173.m46401();
                }
            }
            if (c20173.m46403(interfaceC17189.mo9833(1)) || c20173.m46403(1)) {
                Object objMo18849 = mo18849(i, interfaceC17189);
                C20919 c20919 = new C20919(i, interfaceC17189);
                c20919.f66938 = objMo18849;
                m52077(c20919);
                return objMo18849;
            }
        }
        throw new C23903(i, interfaceC17189);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52077(C4511 c4511) {
        C14951 c14951 = this.f75050;
        if (c14951.f48822) {
            return;
        }
        c14951.f48821++;
        c14951.f48822 = true;
        mo4254(c4511, mo9003());
    }

    /* JADX INFO: renamed from: ᩷ */
    public String mo9001(C4511 c4511, String[] strArr) {
        String message = c4511.getMessage();
        if (c4511 instanceof C0782) {
            C0782 c0782 = (C0782) c4511;
            int i = c0782.f77386;
            return "extraneous input " + mo11292(c0782.f16097) + " expecting " + (i != -1 ? strArr[i] : "EOF");
        }
        if (c4511 instanceof C20919) {
            int i2 = ((C20919) c4511).f77386;
            StringBuilder sbM51387 = C22783.m51387("missing ", i2 != -1 ? strArr[i2] : "EOF", " at ");
            sbM51387.append(mo11292(c4511.f16097));
            return sbM51387.toString();
        }
        if (c4511 instanceof C23903) {
            int i3 = ((C23903) c4511).f77386;
            return "mismatched input " + mo11292(c4511.f16097) + " expecting " + (i3 != -1 ? strArr[i3] : "EOF");
        }
        if (c4511 instanceof C3765) {
            C3765 c3765 = (C3765) c4511;
            int i4 = c3765.f12886;
            return "mismatched tree node: " + c3765.f16094 + " expecting " + (i4 != -1 ? strArr[i4] : "EOF");
        }
        if (c4511 instanceof C12714) {
            return "no viable alternative at input " + mo11292(c4511.f16097);
        }
        if (c4511 instanceof C11968) {
            return "required (...)+ loop did not match anything at input " + mo11292(c4511.f16097);
        }
        if (c4511 instanceof C16443) {
            return "mismatched input " + mo11292(c4511.f16097) + " expecting set null";
        }
        if (c4511 instanceof C17935) {
            return "mismatched input " + mo11292(c4511.f16097) + " expecting set null";
        }
        if (!(c4511 instanceof C25395)) {
            return message;
        }
        C25395 c25395 = (C25395) c4511;
        StringBuilder sb = new StringBuilder("rule ");
        sb.append(c25395.f81972);
        sb.append(" failed predicate: {");
        return C8947.m23910(sb, c25395.f81973, "}?");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52074() {
        return this.f75050.f48821;
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo11292(InterfaceC21665 interfaceC21665) {
        String text = interfaceC21665.getText();
        if (text == null) {
            if (interfaceC21665.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC21665.getType() + ">";
            }
        }
        return C14442.m34865("'", text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t"), "'");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52079(InterfaceC17189 interfaceC17189) {
        C14951 c14951 = this.f75050;
        if (c14951.f48823 == interfaceC17189.index()) {
            interfaceC17189.mo17444();
        }
        c14951.f48823 = interfaceC17189.index();
        C20173 c20173M52076 = m52076(false);
        int iMo9833 = interfaceC17189.mo9833(1);
        while (iMo9833 != -1 && !c20173M52076.m46403(iMo9833)) {
            interfaceC17189.mo17444();
            iMo9833 = interfaceC17189.mo9833(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20173 m52076(boolean z) {
        C14951 c14951 = this.f75050;
        C20173 c20173 = new C20173();
        for (int i = c14951.f48819; i >= 0; i--) {
            C20173 c20174 = c14951.f48820[i];
            c20173.m46402(c20174);
            if (z) {
                if (!c20174.m46403(1)) {
                    break;
                }
                if (i > 0) {
                    c20173.m46401();
                }
            }
        }
        return c20173;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52078(C20173 c20173) {
        C14951 c14951 = this.f75050;
        int i = c14951.f48819 + 1;
        C20173[] c20173Arr = c14951.f48820;
        if (i >= c20173Arr.length) {
            C20173[] c20173Arr2 = new C20173[c20173Arr.length * 2];
            System.arraycopy(c20173Arr, 0, c20173Arr2, 0, c20173Arr.length);
            c14951.f48820 = c20173Arr2;
        }
        C20173[] c20173Arr3 = c14951.f48820;
        int i2 = c14951.f48819 + 1;
        c14951.f48819 = i2;
        c20173Arr3[i2] = c20173;
    }
}
