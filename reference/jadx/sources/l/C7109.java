package l;

/* JADX INFO: renamed from: l.ۜۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7109 extends EnumC13820 {
    public /* synthetic */ C7109() {
        this("EndTagOpen", 8);
    }

    public C7109(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12696()) {
            c13646.m33399(this);
            c13646.m33389("</");
            c13646.m33401(EnumC13820.f43874);
        } else if (c3952.m12684()) {
            c13646.m33387(false);
            c13646.m33401(EnumC13820.f43886);
        } else if (c3952.m12691('>')) {
            c13646.m33394(this);
            c13646.m33391(EnumC13820.f43874);
        } else {
            c13646.m33394(this);
            c13646.m33391(EnumC13820.f43858);
        }
    }
}
