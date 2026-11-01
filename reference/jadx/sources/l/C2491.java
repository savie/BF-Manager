package l;

/* JADX INFO: renamed from: l.ۖۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2491 extends EnumC21210 {
    public /* synthetic */ C2491() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C2491(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32038()) {
            c20692.m46543();
            c20692.f67309.append(c12931.m32027());
            c20692.m46536("<" + c12931.m32027());
            c20692.m46538(EnumC21210.f69052);
            return;
        }
        if (c12931.m32035('/')) {
            c20692.m46543();
            c20692.m46538(EnumC21210.f69041);
        } else {
            c20692.m46535('<');
            c20692.m46532(EnumC21210.f69063);
        }
    }
}
