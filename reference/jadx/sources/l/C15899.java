package l;

/* JADX INFO: renamed from: l.ܺۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15899 extends EnumC21210 {
    public /* synthetic */ C15899() {
        this("AfterAttributeValue_quoted", 40);
    }

    public C15899(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == '\t' || cM32033 == '\n' || cM32033 == '\f' || cM32033 == '\r' || cM32033 == ' ') {
            c20692.m46532(EnumC21210.f69025);
            return;
        }
        if (cM32033 == '/') {
            c20692.m46532(EnumC21210.f69047);
            return;
        }
        if (cM32033 == '>') {
            c20692.m46540();
            c20692.m46532(EnumC21210.f69077);
        } else if (cM32033 == 65535) {
            c20692.m46544(this);
            c20692.m46532(EnumC21210.f69077);
        } else {
            c20692.m46542(this);
            c12931.m32040();
            c20692.m46532(EnumC21210.f69025);
        }
    }
}
