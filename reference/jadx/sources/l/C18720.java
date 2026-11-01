package l;

/* JADX INFO: renamed from: l.ᩴۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18720 extends EnumC21210 {
    public /* synthetic */ C18720() {
        this("AttributeName", 34);
    }

    public C18720(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        c20692.f67307.m22519(c12931.m32034(EnumC21210.f69081));
        char cM32033 = c12931.m32033();
        if (cM32033 != 0) {
            if (cM32033 != ' ') {
                if (cM32033 != '\"' && cM32033 != '\'') {
                    if (cM32033 == '/') {
                        c20692.m46532(EnumC21210.f69047);
                        return;
                    }
                    if (cM32033 == 65535) {
                        c20692.m46544(this);
                        c20692.m46532(EnumC21210.f69077);
                        return;
                    }
                    if (cM32033 != '\t' && cM32033 != '\n' && cM32033 != '\f' && cM32033 != '\r') {
                        switch (cM32033) {
                            case '<':
                                break;
                            case '=':
                                c20692.m46532(EnumC21210.f69029);
                                break;
                            case '>':
                                c20692.m46540();
                                c20692.m46532(EnumC21210.f69077);
                                break;
                            default:
                                c20692.f67307.m22518(cM32033);
                                break;
                        }
                        return;
                    }
                }
                c20692.m46542(this);
                c20692.f67307.m22518(cM32033);
                return;
            }
            c20692.m46532(EnumC21210.f69079);
            return;
        }
        c20692.m46542(this);
        c20692.f67307.m22518((char) 65533);
    }
}
