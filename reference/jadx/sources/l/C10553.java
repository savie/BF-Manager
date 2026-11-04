package l;

/* JADX INFO: renamed from: l.ۤ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10553 extends EnumC13820 {
    public /* synthetic */ C10553() {
        this("RCDATAEndTagOpen", 11);
    }

    public C10553(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12684()) {
            c13646.m33387(false);
            AbstractC2460 abstractC2460 = c13646.f43330;
            char cM12681 = c3952.m12681();
            abstractC2460.getClass();
            abstractC2460.m8311(String.valueOf(cM12681));
            c13646.f43325.append(c3952.m12681());
            c13646.m33391(EnumC13820.f43870);
            return;
        }
        c13646.m33389("</");
        c13646.m33401(EnumC13820.f43834);
    }
}
