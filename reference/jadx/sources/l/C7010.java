package l;

/* JADX INFO: renamed from: l.ۜ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7010 extends EnumC8422 {
    public /* synthetic */ C7010() {
        this("BogusDoctype", 65);
    }

    public C7010(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7382 = c2424.m7382();
        if (cM7382 == '>') {
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
        } else {
            if (cM7382 != 65535) {
                return;
            }
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
        }
    }
}
