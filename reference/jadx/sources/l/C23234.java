package l;

/* JADX INFO: renamed from: l.᩹֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23234 extends EnumC13820 {
    public /* synthetic */ C23234() {
        this("ScriptDataEscapedDash", 22);
    }

    public C23234(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12696()) {
            c13646.m33399(this);
            c13646.m33401(EnumC13820.f43874);
            return;
        }
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            c13646.m33388((char) 65533);
            c13646.m33401(EnumC13820.f43863);
        } else if (cM12689 == '-') {
            c13646.m33388(cM12689);
            c13646.m33401(EnumC13820.f43861);
        } else if (cM12689 == '<') {
            c13646.m33401(EnumC13820.f43875);
        } else {
            c13646.m33388(cM12689);
            c13646.m33401(EnumC13820.f43863);
        }
    }
}
