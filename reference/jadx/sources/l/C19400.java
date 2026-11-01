package l;

/* JADX INFO: renamed from: l.᩵ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19400 extends EnumC8422 {
    public /* synthetic */ C19400() {
        this("TagName", 9);
    }

    public C19400(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        c8111.f28411.m50750(c2424.m7377());
        char cM7382 = c2424.m7382();
        if (cM7382 != 0) {
            if (cM7382 != ' ') {
                if (cM7382 == '/') {
                    c8111.m21353(EnumC8422.f29220);
                    return;
                }
                if (cM7382 == '<') {
                    c2424.m7397();
                    c8111.m21365(this);
                } else if (cM7382 != '>') {
                    if (cM7382 == 65535) {
                        c8111.m21368(this);
                        c8111.m21353(EnumC8422.f29249);
                        return;
                    } else if (cM7382 != '\t' && cM7382 != '\n' && cM7382 != '\f' && cM7382 != '\r') {
                        AbstractC22928 abstractC22928 = c8111.f28411;
                        abstractC22928.getClass();
                        abstractC22928.m50750(String.valueOf(cM7382));
                        return;
                    }
                }
                c8111.m21369();
                c8111.m21353(EnumC8422.f29249);
                return;
            }
            c8111.m21353(EnumC8422.f29199);
            return;
        }
        c8111.f28411.m50750(EnumC8422.f29244);
    }
}
