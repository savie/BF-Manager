package l;

/* JADX INFO: renamed from: l.ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8817 extends EnumC8422 {
    public /* synthetic */ C8817() {
        this("RcdataLessthanSign", 10);
    }

    public C8817(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7390('/')) {
            c8111.m21364();
            c8111.m21360(EnumC8422.f29208);
            return;
        }
        if (c2424.m7379() && c8111.m21354() != null && !c2424.m7375(c8111.m21367())) {
            AbstractC22928 abstractC22928M21355 = c8111.m21355(false);
            abstractC22928M21355.m50744(c8111.m21354());
            c8111.f28411 = abstractC22928M21355;
            c8111.m21369();
            c8111.m21353(EnumC8422.f29255);
            return;
        }
        c8111.m21357("<");
        c8111.m21353(EnumC8422.f29218);
    }
}
