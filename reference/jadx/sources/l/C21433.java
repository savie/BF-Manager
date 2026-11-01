package l;

/* JADX INFO: renamed from: l.᩸۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21433 extends EnumC8422 {
    public /* synthetic */ C21433() {
        this("AttributeValue_doubleQuoted", 37);
    }

    public C21433(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        String strM7372 = c2424.m7372(false);
        if (strM7372.length() > 0) {
            c8111.f28411.m50752(strM7372);
        } else {
            c8111.f28411.m50754();
        }
        char cM7382 = c2424.m7382();
        if (cM7382 == 0) {
            c8111.m21365(this);
            c8111.f28411.m50751((char) 65533);
            return;
        }
        if (cM7382 == '\"') {
            c8111.m21353(EnumC8422.f29190);
            return;
        }
        if (cM7382 != '&') {
            if (cM7382 == 65535) {
                c8111.m21368(this);
                c8111.m21353(EnumC8422.f29249);
                return;
            } else {
                c8111.f28411.m50751(cM7382);
                return;
            }
        }
        int[] iArrM21362 = c8111.m21362((Character) '\"', true);
        if (iArrM21362 != null) {
            c8111.f28411.m50748(iArrM21362);
        } else {
            c8111.f28411.m50751('&');
        }
    }
}
