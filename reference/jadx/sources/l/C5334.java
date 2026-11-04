package l;

/* JADX INFO: renamed from: l.ۚ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5334 extends EnumC13820 {
    public /* synthetic */ C5334() {
        this("ScriptDataLessthanSign", 16);
    }

    public C5334(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12689 = c3952.m12689();
        if (cM12689 == '!') {
            c13646.m33389("<!");
            c13646.m33401(EnumC13820.f43848);
        } else if (cM12689 == '/') {
            c13646.m33398();
            c13646.m33401(EnumC13820.f43820);
        } else {
            c13646.m33389("<");
            c3952.m12688();
            c13646.m33401(EnumC13820.f43828);
        }
    }
}
