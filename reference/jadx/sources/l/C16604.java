package l;

/* JADX INFO: renamed from: l.ܽۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16604 extends EnumC21210 {
    public /* synthetic */ C16604() {
        this("MarkupDeclarationOpen", 43);
    }

    public C16604(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32025("--")) {
            c20692.f67298.mo19432();
            c20692.m46532(EnumC21210.f69075);
        } else if (c12931.m32036("DOCTYPE")) {
            c20692.m46532(EnumC21210.f69042);
        } else if (c12931.m32025("[CDATA[")) {
            c20692.m46543();
            c20692.m46532(EnumC21210.f69056);
        } else {
            c20692.m46542(this);
            c20692.m46538(EnumC21210.f69086);
        }
    }
}
