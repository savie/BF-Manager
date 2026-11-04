package l;

/* JADX INFO: renamed from: l.ܶ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C15774 extends EnumC13820 {
    public /* synthetic */ C15774() {
        this("ScriptDataEscaped", 21);
    }

    public C15774(String str, int i) {
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
        char cM12681 = c3952.m12681();
        if (cM12681 == 0) {
            c13646.m33394(this);
            c3952.m12675();
            c13646.m33388((char) 65533);
        } else if (cM12681 == '-') {
            c13646.m33388('-');
            c13646.m33391(EnumC13820.f43865);
        } else if (cM12681 == '<') {
            c13646.m33391(EnumC13820.f43875);
        } else {
            c13646.m33389(c3952.m12674('-', '<', 0));
        }
    }
}
