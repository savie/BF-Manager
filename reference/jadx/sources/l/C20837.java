package l;

/* JADX INFO: renamed from: l.᩷ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20837 extends EnumC21210 {
    public /* synthetic */ C20837() {
        this("AttributeValue_unquoted", 39);
    }

    public C20837(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        String strM32034 = c12931.m32034(EnumC21210.f69069);
        if (strM32034.length() > 0) {
            c20692.f67307.m22526(strM32034);
        }
        char cM32033 = c12931.m32033();
        if (cM32033 != 0) {
            if (cM32033 != ' ') {
                if (cM32033 != '\"' && cM32033 != '`') {
                    if (cM32033 == 65535) {
                        c20692.m46544(this);
                        c20692.m46532(EnumC21210.f69077);
                        return;
                    }
                    if (cM32033 != '\t' && cM32033 != '\n' && cM32033 != '\f' && cM32033 != '\r') {
                        if (cM32033 == '&') {
                            int[] iArrM46539 = c20692.m46539('>', true);
                            if (iArrM46539 != null) {
                                c20692.f67307.m22520(iArrM46539);
                                return;
                            } else {
                                c20692.f67307.m22525('&');
                                return;
                            }
                        }
                        if (cM32033 != '\'') {
                            switch (cM32033) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c20692.m46540();
                                    c20692.m46532(EnumC21210.f69077);
                                    break;
                                default:
                                    c20692.f67307.m22525(cM32033);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c20692.m46542(this);
                c20692.f67307.m22525(cM32033);
                return;
            }
            c20692.m46532(EnumC21210.f69025);
            return;
        }
        c20692.m46542(this);
        c20692.f67307.m22525((char) 65533);
    }
}
