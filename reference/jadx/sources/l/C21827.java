package l;

/* JADX INFO: renamed from: l.᩸᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21827 extends EnumC8422 {
    public /* synthetic */ C21827() {
        this("PLAINTEXT", 6);
    }

    public C21827(String str, int i) {
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
        } else if (cM7392 == 65535) {
            c8111.m21361(new C13050());
        } else {
            c8111.m21357(c2424.m7371((char) 0));
        }
    }
}
