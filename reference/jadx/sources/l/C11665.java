package l;

/* JADX INFO: renamed from: l.ۨۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11665 extends EnumC21210 {
    public /* synthetic */ C11665() {
        this("ScriptDataEscapedDashDash", 23);
    }

    public C11665(String str, int i) {
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
        } else {
            if (cM32033 == '-') {
                c20692.m46535(cM32033);
                return;
            }
            if (cM32033 == '<') {
                c20692.m46532(EnumC21210.f69078);
            } else if (cM32033 == '>') {
                c20692.m46535(cM32033);
                c20692.m46532(EnumC21210.f69030);
            } else {
                c20692.m46535(cM32033);
                c20692.m46532(EnumC21210.f69063);
            }
        }
    }
}
