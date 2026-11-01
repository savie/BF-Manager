package l;

/* JADX INFO: renamed from: l.ᩴ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18611 extends EnumC8422 {
    public /* synthetic */ C18611() {
        this("Rcdata", 2);
    }

    public C18611(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7392 = c2424.m7392();
        if (cM7392 == 0) {
            c8111.m21365(this);
            c2424.m7374();
            c8111.m21356((char) 65533);
        } else {
            if (cM7392 == '&') {
                c8111.m21360(EnumC8422.f29209);
                return;
            }
            if (cM7392 == '<') {
                c8111.m21360(EnumC8422.f29200);
            } else if (cM7392 == 65535) {
                c8111.m21361(new C13050());
            } else {
                c8111.m21357(c2424.m7367());
            }
        }
    }
}
