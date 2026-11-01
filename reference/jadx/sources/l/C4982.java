package l;

/* JADX INFO: renamed from: l.ۙ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4982 extends EnumC21210 {
    public /* synthetic */ C4982() {
        this("DoctypeName", 52);
    }

    public C4982(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32038()) {
            c20692.f67294.f56577.append(c12931.m32042());
            return;
        }
        char cM32033 = c12931.m32033();
        if (cM32033 != 0) {
            if (cM32033 != ' ') {
                if (cM32033 == '>') {
                    c20692.m46531();
                    c20692.m46532(EnumC21210.f69077);
                    return;
                }
                if (cM32033 == 65535) {
                    c20692.m46544(this);
                    c20692.f67294.getClass();
                    c20692.m46531();
                    c20692.m46532(EnumC21210.f69077);
                    return;
                }
                if (cM32033 != '\t' && cM32033 != '\n' && cM32033 != '\f' && cM32033 != '\r') {
                    c20692.f67294.f56577.append(cM32033);
                    return;
                }
            }
            c20692.m46532(EnumC21210.f69067);
            return;
        }
        c20692.m46542(this);
        c20692.f67294.f56577.append((char) 65533);
    }
}
