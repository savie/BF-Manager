package l;

/* JADX INFO: renamed from: l.᩶ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21280 extends EnumC13820 {
    public /* synthetic */ C21280() {
        this("AfterDoctypeSystemKeyword", 60);
    }

    public C21280(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12689 = c3952.m12689();
        if (cM12689 == '\t' || cM12689 == '\n' || cM12689 == '\f' || cM12689 == '\r' || cM12689 == ' ') {
            c13646.m33401(EnumC13820.f43881);
            return;
        }
        if (cM12689 == '\"') {
            c13646.m33394(this);
            c13646.m33401(EnumC13820.f43856);
            return;
        }
        if (cM12689 == '\'') {
            c13646.m33394(this);
            c13646.m33401(EnumC13820.f43877);
            return;
        }
        if (cM12689 == '>') {
            c13646.m33394(this);
            c13646.f43324.getClass();
            c13646.m33400();
            c13646.m33401(EnumC13820.f43874);
            return;
        }
        if (cM12689 == 65535) {
            c13646.m33399(this);
            c13646.f43324.getClass();
            c13646.m33400();
            c13646.m33401(EnumC13820.f43874);
            return;
        }
        c13646.m33394(this);
        c13646.f43324.getClass();
        c13646.m33400();
    }
}
