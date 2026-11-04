package l;

/* JADX INFO: renamed from: l.᩻֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C24726 extends EnumC13820 {
    public /* synthetic */ C24726() {
        this("Data", 0);
    }

    public C24726(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12681 = c3952.m12681();
        if (cM12681 == 0) {
            c13646.m33394(this);
            c13646.m33388(c3952.m12689());
        } else {
            if (cM12681 == '&') {
                c13646.m33391(EnumC13820.f43819);
                return;
            }
            if (cM12681 == '<') {
                c13646.m33391(EnumC13820.f43826);
            } else if (cM12681 == 65535) {
                c13646.m33390(new C9917());
            } else {
                c13646.m33389(c3952.m12679());
            }
        }
    }
}
