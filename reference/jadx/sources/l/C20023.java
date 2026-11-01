package l;

/* JADX INFO: renamed from: l.᩶۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20023 extends EnumC8422 {
    public /* synthetic */ C20023() {
        this("Comment", 46);
    }

    public C20023(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7392 = c2424.m7392();
        if (cM7392 == 0) {
            c8111.m21365(this);
            c2424.m7374();
            c8111.f28423.m49336((char) 65533);
        } else if (cM7392 == '-') {
            c8111.m21360(EnumC8422.f29245);
        } else {
            if (cM7392 == 65535) {
                c8111.m21368(this);
                c8111.m21352();
                c8111.m21353(EnumC8422.f29249);
                return;
            }
            c8111.f28423.m49337(c2424.m7373('-', 0));
        }
    }
}
