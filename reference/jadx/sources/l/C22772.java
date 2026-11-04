package l;

/* JADX INFO: renamed from: l.᩸ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22772 extends EnumC13820 {
    public /* synthetic */ C22772() {
        this("MarkupDeclarationOpen", 43);
    }

    public C22772(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12676("--")) {
            c13646.f43329.mo1678();
            c13646.m33401(EnumC13820.f43883);
        } else if (c3952.m12692("DOCTYPE")) {
            c13646.m33401(EnumC13820.f43849);
        } else if (c3952.m12676("[CDATA[")) {
            c13646.m33398();
            c13646.m33401(EnumC13820.f43829);
        } else {
            c13646.m33394(this);
            c13646.m33391(EnumC13820.f43858);
        }
    }
}
