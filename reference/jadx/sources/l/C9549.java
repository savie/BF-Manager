package l;

/* JADX INFO: renamed from: l.ۢۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9549 extends EnumC21210 {
    public /* synthetic */ C9549() {
        this("Doctype", 50);
    }

    public C9549(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == '\t' || cM32033 == '\n' || cM32033 == '\f' || cM32033 == '\r' || cM32033 == ' ') {
            c20692.m46532(EnumC21210.f69058);
            return;
        }
        if (cM32033 != '>') {
            if (cM32033 == 65535) {
                c20692.m46544(this);
            } else {
                c20692.m46542(this);
                c20692.m46532(EnumC21210.f69058);
                return;
            }
        }
        c20692.m46542(this);
        C17869 c17869 = c20692.f67294;
        c17869.mo19432();
        c17869.getClass();
        c20692.m46531();
        c20692.m46532(EnumC21210.f69077);
    }
}
