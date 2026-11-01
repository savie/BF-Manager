package l;

/* JADX INFO: renamed from: l.۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8028 extends EnumC8422 {
    public /* synthetic */ C8028() {
        this("AttributeValue_unquoted", 39);
    }

    public C8028(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        String strM7387 = c2424.m7387(EnumC8422.f29253);
        if (strM7387.length() > 0) {
            c8111.f28411.m50752(strM7387);
        }
        char cM7382 = c2424.m7382();
        if (cM7382 != 0) {
            if (cM7382 != ' ') {
                if (cM7382 != '\"' && cM7382 != '`') {
                    if (cM7382 == 65535) {
                        c8111.m21368(this);
                        c8111.m21353(EnumC8422.f29249);
                        return;
                    }
                    if (cM7382 != '\t' && cM7382 != '\n' && cM7382 != '\f' && cM7382 != '\r') {
                        if (cM7382 == '&') {
                            int[] iArrM21362 = c8111.m21362((Character) '>', true);
                            if (iArrM21362 != null) {
                                c8111.f28411.m50748(iArrM21362);
                                return;
                            } else {
                                c8111.f28411.m50751('&');
                                return;
                            }
                        }
                        if (cM7382 != '\'') {
                            switch (cM7382) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c8111.m21369();
                                    c8111.m21353(EnumC8422.f29249);
                                    break;
                                default:
                                    c8111.f28411.m50751(cM7382);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c8111.m21365(this);
                c8111.f28411.m50751(cM7382);
                return;
            }
            c8111.m21353(EnumC8422.f29199);
            return;
        }
        c8111.m21365(this);
        c8111.f28411.m50751((char) 65533);
    }
}
