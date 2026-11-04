package l;

/* JADX INFO: renamed from: l.᩵֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20250 extends EnumC13820 {
    public /* synthetic */ C20250() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C20250(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12684()) {
            c13646.m33398();
            c13646.f43325.append(c3952.m12681());
            c13646.m33389("<" + c3952.m12681());
            c13646.m33391(EnumC13820.f43846);
            return;
        }
        if (c3952.m12691('/')) {
            c13646.m33398();
            c13646.m33391(EnumC13820.f43824);
        } else {
            c13646.m33388('<');
            c13646.m33401(EnumC13820.f43863);
        }
    }
}
