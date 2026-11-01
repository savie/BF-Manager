package l;

/* JADX INFO: renamed from: l.ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9523 extends EnumC8422 {
    public /* synthetic */ C9523() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C9523(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7379()) {
            c8111.m21364();
            c8111.f28405.append(c2424.m7392());
            c8111.m21357("<");
            c8111.m21356(c2424.m7392());
            c8111.m21360(EnumC8422.f29224);
            return;
        }
        if (c2424.m7390('/')) {
            c8111.m21364();
            c8111.m21360(EnumC8422.f29214);
        } else {
            c8111.m21356('<');
            c8111.m21353(EnumC8422.f29235);
        }
    }
}
