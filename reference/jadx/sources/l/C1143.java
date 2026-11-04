package l;

/* JADX INFO: renamed from: l.֨ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C1143 extends EnumC13820 {
    public /* synthetic */ C1143() {
        this("CdataSection", 66);
    }

    public C1143(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        c13646.f43325.append(c3952.m12671());
        if (c3952.m12676("]]>") || c3952.m12696()) {
            String string = c13646.f43325.toString();
            C18122 c18122 = new C18122();
            c18122.m1679(string);
            c13646.m33390(c18122);
            c13646.m33401(EnumC13820.f43874);
        }
    }
}
