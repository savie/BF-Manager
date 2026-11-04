package l;

/* JADX INFO: renamed from: l.ܿ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18012 extends EnumC13820 {
    public /* synthetic */ C18012() {
        this("ScriptDataDoubleEscapedDashDash", 30);
    }

    public C18012(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            c13646.m33388((char) 65533);
            c13646.m33401(EnumC13820.f43882);
            return;
        }
        if (cM12689 == '-') {
            c13646.m33388(cM12689);
            return;
        }
        if (cM12689 == '<') {
            c13646.m33388(cM12689);
            c13646.m33401(EnumC13820.f43852);
        } else if (cM12689 == '>') {
            c13646.m33388(cM12689);
            c13646.m33401(EnumC13820.f43828);
        } else if (cM12689 == 65535) {
            c13646.m33399(this);
            c13646.m33401(EnumC13820.f43874);
        } else {
            c13646.m33388(cM12689);
            c13646.m33401(EnumC13820.f43882);
        }
    }
}
