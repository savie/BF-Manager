package l;

/* JADX INFO: renamed from: l.ۨۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12329 extends EnumC13820 {
    public /* synthetic */ C12329() {
        this("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    public C12329(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            c13646.f43324.f61261.append((char) 65533);
            return;
        }
        if (cM12689 == '\"') {
            c13646.m33401(EnumC13820.f43835);
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
        c13646.f43324.f61261.append(cM12689);
    }
}
