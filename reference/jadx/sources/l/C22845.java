package l;

/* JADX INFO: renamed from: l.᩺۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22845 extends EnumC8422 {
    public /* synthetic */ C22845() {
        this("AfterAttributeName", 35);
    }

    public C22845(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7382 = c2424.m7382();
        if (cM7382 == 0) {
            c8111.m21365(this);
            c8111.f28411.m50746((char) 65533);
            c8111.m21353(EnumC8422.f29262);
            return;
        }
        if (cM7382 != ' ') {
            if (cM7382 != '\"' && cM7382 != '\'') {
                if (cM7382 == '/') {
                    c8111.m21353(EnumC8422.f29220);
                    return;
                }
                if (cM7382 == 65535) {
                    c8111.m21368(this);
                    c8111.m21353(EnumC8422.f29249);
                    return;
                }
                if (cM7382 == '\t' || cM7382 == '\n' || cM7382 == '\f' || cM7382 == '\r') {
                    return;
                }
                switch (cM7382) {
                    case '<':
                        break;
                    case '=':
                        c8111.m21353(EnumC8422.f29203);
                        break;
                    case '>':
                        c8111.m21369();
                        c8111.m21353(EnumC8422.f29249);
                        break;
                    default:
                        c8111.f28411.m50753();
                        c2424.m7397();
                        c8111.m21353(EnumC8422.f29262);
                        break;
                }
                return;
            }
            c8111.m21365(this);
            c8111.f28411.m50753();
            c8111.f28411.m50746(cM7382);
            c8111.m21353(EnumC8422.f29262);
        }
    }
}
