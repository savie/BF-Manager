package l;

/* JADX INFO: renamed from: l.ۜ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6826 extends EnumC13820 {
    public /* synthetic */ C6826() {
        this("Rcdata", 2);
    }

    public C6826(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12681 = c3952.m12681();
        if (cM12681 == 0) {
            c13646.m33394(this);
            c3952.m12675();
            c13646.m33388((char) 65533);
        } else {
            if (cM12681 == '&') {
                c13646.m33391(EnumC13820.f43847);
                return;
            }
            if (cM12681 == '<') {
                c13646.m33391(EnumC13820.f43854);
            } else if (cM12681 == 65535) {
                c13646.m33390(new C9917());
            } else {
                c13646.m33389(c3952.m12674('&', '<', 0));
            }
        }
    }
}
