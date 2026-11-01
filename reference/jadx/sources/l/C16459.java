package l;

/* JADX INFO: renamed from: l.ܽۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16459 extends EnumC21210 {
    public /* synthetic */ C16459() {
        this("RCDATAEndTagName", 12);
    }

    public C16459(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32038()) {
            String strM32042 = c12931.m32042();
            c20692.f67307.m22523(strM32042);
            c20692.f67309.append(strM32042);
            return;
        }
        char cM32033 = c12931.m32033();
        if (cM32033 == '\t' || cM32033 == '\n' || cM32033 == '\f' || cM32033 == '\r' || cM32033 == ' ') {
            if (c20692.m46545()) {
                c20692.m46532(EnumC21210.f69025);
                return;
            } else {
                m38726(c20692, c12931);
                return;
            }
        }
        if (cM32033 == '/') {
            if (c20692.m46545()) {
                c20692.m46532(EnumC21210.f69047);
                return;
            } else {
                m38726(c20692, c12931);
                return;
            }
        }
        if (cM32033 == '>') {
            if (c20692.m46545()) {
                c20692.m46540();
                c20692.m46532(EnumC21210.f69077);
                return;
            } else {
                m38726(c20692, c12931);
                return;
            }
        }
        m38726(c20692, c12931);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38726(C20692 c20692, C12931 c12931) {
        c20692.m46536("</" + c20692.f67309.toString());
        c12931.m32040();
        c20692.m46532(EnumC21210.f69045);
    }
}
