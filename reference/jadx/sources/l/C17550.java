package l;

/* JADX INFO: renamed from: l.ܽۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17550 extends EnumC13820 {
    public /* synthetic */ C17550() {
        this("BeforeDoctypeName", 51);
    }

    public C17550(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12684()) {
            c13646.f43324.mo1678();
            c13646.m33401(EnumC13820.f43831);
            return;
        }
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            C18868 c18868 = c13646.f43324;
            c18868.mo1678();
            c18868.f61262.append((char) 65533);
            c13646.m33401(EnumC13820.f43831);
            return;
        }
        if (cM12689 != ' ') {
            if (cM12689 == 65535) {
                c13646.m33399(this);
                C18868 c18869 = c13646.f43324;
                c18869.mo1678();
                c18869.getClass();
                c13646.m33400();
                c13646.m33401(EnumC13820.f43874);
                return;
            }
            if (cM12689 == '\t' || cM12689 == '\n' || cM12689 == '\f' || cM12689 == '\r') {
                return;
            }
            c13646.f43324.mo1678();
            c13646.f43324.f61262.append(cM12689);
            c13646.m33401(EnumC13820.f43831);
        }
    }
}
