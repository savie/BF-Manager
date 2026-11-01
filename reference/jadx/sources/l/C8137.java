package l;

/* JADX INFO: renamed from: l.۠ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8137 extends EnumC21210 {
    public /* synthetic */ C8137() {
        this("AfterAttributeName", 35);
    }

    public C8137(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            c20692.f67307.m22518((char) 65533);
            c20692.m46532(EnumC21210.f69090);
            return;
        }
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
                if (cM32033 == '\t' || cM32033 == '\n' || cM32033 == '\f' || cM32033 == '\r') {
                    return;
                }
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
                        c20692.f67307.m22517();
                        c12931.m32040();
                        c20692.m46532(EnumC21210.f69090);
                        break;
                }
                return;
            }
            c20692.m46542(this);
            c20692.f67307.m22517();
            c20692.f67307.m22518(cM32033);
            c20692.m46532(EnumC21210.f69090);
        }
    }
}
