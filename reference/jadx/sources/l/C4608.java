package l;

/* JADX INFO: renamed from: l.ۙۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4608 extends EnumC21210 {
    public /* synthetic */ C4608() {
        this("ScriptDataEscaped", 21);
    }

    public C4608(String str, int i) {
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
        char cM32027 = c12931.m32027();
        if (cM32027 == 0) {
            c20692.m46542(this);
            c12931.m32024();
            c20692.m46535((char) 65533);
        } else if (cM32027 == '-') {
            c20692.m46535('-');
            c20692.m46538(EnumC21210.f69085);
        } else if (cM32027 == '<') {
            c20692.m46538(EnumC21210.f69078);
        } else {
            c20692.m46536(c12931.m32023('-', '<', 0));
        }
    }
}
