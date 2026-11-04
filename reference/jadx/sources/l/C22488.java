package l;

/* JADX INFO: renamed from: l.᩸֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22488 extends EnumC13820 {
    public /* synthetic */ C22488() {
        this("RCDATAEndTagName", 12);
    }

    public C22488(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12684()) {
            String strM12683 = c3952.m12683();
            c13646.f43330.m8311(strM12683);
            c13646.f43325.append(strM12683);
            return;
        }
        char cM12689 = c3952.m12689();
        if (cM12689 == '\t' || cM12689 == '\n' || cM12689 == '\f' || cM12689 == '\r' || cM12689 == ' ') {
            if (c13646.m33396()) {
                c13646.m33401(EnumC13820.f43853);
                return;
            } else {
                m50721(c13646, c3952);
                return;
            }
        }
        if (cM12689 == '/') {
            if (c13646.m33396()) {
                c13646.m33401(EnumC13820.f43832);
                return;
            } else {
                m50721(c13646, c3952);
                return;
            }
        }
        if (cM12689 == '>') {
            if (c13646.m33396()) {
                c13646.m33397();
                c13646.m33401(EnumC13820.f43874);
                return;
            } else {
                m50721(c13646, c3952);
                return;
            }
        }
        m50721(c13646, c3952);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50721(C13646 c13646, C3952 c3952) {
        c13646.m33389("</" + c13646.f43325.toString());
        c3952.m12688();
        c13646.m33401(EnumC13820.f43834);
    }
}
