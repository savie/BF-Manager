package l;

/* JADX INFO: renamed from: l.᩷ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22232 extends EnumC8806 {
    public /* synthetic */ C22232() {
        this("MarkupDeclarationOpen", 43);
    }

    public C22232(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54687("--")) {
            c8260.f27175.mo3216();
            c8260.m22269(EnumC8806.f28758);
            return;
        }
        if (c24448.m54670("DOCTYPE")) {
            c8260.m22269(EnumC8806.f28724);
            return;
        }
        if (c24448.m54687("[CDATA[")) {
            c8260.m22261();
            c8260.m22269(EnumC8806.f28705);
            return;
        }
        c8260.m22262(this);
        C14225 c14225 = c8260.f27175;
        c14225.mo3216();
        c14225.f44949 = true;
        c8260.m22269(EnumC8806.f28733);
    }
}
