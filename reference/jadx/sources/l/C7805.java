package l;

/* JADX INFO: renamed from: l.۟᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7805 extends EnumC21210 {
    public /* synthetic */ C7805() {
        this("EndTagOpen", 8);
    }

    public C7805(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32043()) {
            c20692.m46544(this);
            c20692.m46536("</");
            c20692.m46532(EnumC21210.f69077);
        } else if (c12931.m32038()) {
            c20692.m46534(false);
            c20692.m46532(EnumC21210.f69039);
        } else if (c12931.m32035('>')) {
            c20692.m46542(this);
            c20692.m46538(EnumC21210.f69077);
        } else {
            c20692.m46542(this);
            c20692.m46538(EnumC21210.f69086);
        }
    }
}
