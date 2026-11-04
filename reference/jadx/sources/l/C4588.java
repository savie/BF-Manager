package l;

/* JADX INFO: renamed from: l.ۙ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4588 extends EnumC13820 {
    public /* synthetic */ C4588() {
        this("TagName", 9);
    }

    public C4588(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        c13646.f43330.m8311(c3952.m12677());
        char cM12689 = c3952.m12689();
        if (cM12689 != 0) {
            if (cM12689 != ' ') {
                if (cM12689 == '/') {
                    c13646.m33401(EnumC13820.f43832);
                    return;
                }
                if (cM12689 == '>') {
                    c13646.m33397();
                    c13646.m33401(EnumC13820.f43874);
                    return;
                }
                if (cM12689 == 65535) {
                    c13646.m33399(this);
                    c13646.m33401(EnumC13820.f43874);
                    return;
                } else if (cM12689 != '\t' && cM12689 != '\n' && cM12689 != '\f' && cM12689 != '\r') {
                    AbstractC2460 abstractC2460 = c13646.f43330;
                    abstractC2460.getClass();
                    abstractC2460.m8311(String.valueOf(cM12689));
                    return;
                }
            }
            c13646.m33401(EnumC13820.f43853);
            return;
        }
        c13646.f43330.m8311(EnumC13820.f43818);
    }
}
