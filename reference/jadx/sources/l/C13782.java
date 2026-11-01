package l;

/* JADX INFO: renamed from: l.ܰۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13782 extends EnumC21210 {
    public /* synthetic */ C13782() {
        this("ScriptDataEscapedDash", 22);
    }

    public C13782(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32043()) {
            c20692.m46544(this);
            c20692.m46532(EnumC21210.f69077);
            return;
        }
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            c20692.m46535((char) 65533);
            c20692.m46532(EnumC21210.f69063);
        } else if (cM32033 == '-') {
            c20692.m46535(cM32033);
            c20692.m46532(EnumC21210.f69074);
        } else if (cM32033 == '<') {
            c20692.m46532(EnumC21210.f69078);
        } else {
            c20692.m46535(cM32033);
            c20692.m46532(EnumC21210.f69063);
        }
    }
}
