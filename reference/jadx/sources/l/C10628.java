package l;

/* JADX INFO: renamed from: l.ۤ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10628 extends EnumC21210 {
    public /* synthetic */ C10628() {
        this("TagOpen", 7);
    }

    public C10628(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32027 = c12931.m32027();
        if (cM32027 == '!') {
            c20692.m46538(EnumC21210.f69068);
            return;
        }
        if (cM32027 == '/') {
            c20692.m46538(EnumC21210.f69017);
            return;
        }
        if (cM32027 == '?') {
            c20692.m46538(EnumC21210.f69086);
            return;
        }
        if (c12931.m32038()) {
            c20692.m46534(true);
            c20692.m46532(EnumC21210.f69039);
        } else {
            c20692.m46542(this);
            c20692.m46535('<');
            c20692.m46532(EnumC21210.f69077);
        }
    }
}
