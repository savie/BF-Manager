package l;

/* JADX INFO: renamed from: l.ܰ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14067 extends EnumC8422 {
    public /* synthetic */ C14067() {
        this("AfterDoctypePublicIdentifier", 58);
    }

    public C14067(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7382 = c2424.m7382();
        if (cM7382 == '\t' || cM7382 == '\n' || cM7382 == '\f' || cM7382 == '\r' || cM7382 == ' ') {
            c8111.m21353(EnumC8422.f29205);
            return;
        }
        if (cM7382 == '\"') {
            c8111.m21365(this);
            c8111.m21353(EnumC8422.f29237);
            return;
        }
        if (cM7382 == '\'') {
            c8111.m21365(this);
            c8111.m21353(EnumC8422.f29252);
            return;
        }
        if (cM7382 == '>') {
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
        } else {
            if (cM7382 == 65535) {
                c8111.m21368(this);
                c8111.f28416.f4891 = true;
                c8111.m21363();
                c8111.m21353(EnumC8422.f29249);
                return;
            }
            c8111.m21365(this);
            c8111.f28416.f4891 = true;
            c8111.m21353(EnumC8422.f29193);
        }
    }
}
