package l;

/* JADX INFO: renamed from: l.۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7405 extends EnumC8422 {
    public /* synthetic */ C7405() {
        this("RCDATAEndTagName", 12);
    }

    public C7405(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7379()) {
            String strM7365 = c2424.m7365();
            c8111.f28411.m50750(strM7365);
            c8111.f28405.append(strM7365);
            return;
        }
        char cM7382 = c2424.m7382();
        if (cM7382 == '\t' || cM7382 == '\n' || cM7382 == '\f' || cM7382 == '\r' || cM7382 == ' ') {
            if (c8111.m21351()) {
                c8111.m21353(EnumC8422.f29199);
                return;
            } else {
                m19752(c8111, c2424);
                return;
            }
        }
        if (cM7382 == '/') {
            if (c8111.m21351()) {
                c8111.m21353(EnumC8422.f29220);
                return;
            } else {
                m19752(c8111, c2424);
                return;
            }
        }
        if (cM7382 == '>') {
            if (c8111.m21351()) {
                c8111.m21369();
                c8111.m21353(EnumC8422.f29249);
                return;
            } else {
                m19752(c8111, c2424);
                return;
            }
        }
        m19752(c8111, c2424);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m19752(C8111 c8111, C2424 c2424) {
        c8111.m21357("</");
        c8111.m21359(c8111.f28405);
        c2424.m7397();
        c8111.m21353(EnumC8422.f29218);
    }
}
