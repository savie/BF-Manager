package l;

/* JADX INFO: renamed from: l.ۗۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3197 extends EnumC21210 {
    public /* synthetic */ C3197() {
        this("BeforeDoctypeName", 51);
    }

    public C3197(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32038()) {
            c20692.f67294.mo19432();
            c20692.m46532(EnumC21210.f69046);
            return;
        }
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            C17869 c17869 = c20692.f67294;
            c17869.mo19432();
            c17869.f56577.append((char) 65533);
            c20692.m46532(EnumC21210.f69046);
            return;
        }
        if (cM32033 != ' ') {
            if (cM32033 == 65535) {
                c20692.m46544(this);
                C17869 c178610 = c20692.f67294;
                c178610.mo19432();
                c178610.getClass();
                c20692.m46531();
                c20692.m46532(EnumC21210.f69077);
                return;
            }
            if (cM32033 == '\t' || cM32033 == '\n' || cM32033 == '\f' || cM32033 == '\r') {
                return;
            }
            c20692.f67294.mo19432();
            c20692.f67294.f56577.append(cM32033);
            c20692.m46532(EnumC21210.f69046);
        }
    }
}
