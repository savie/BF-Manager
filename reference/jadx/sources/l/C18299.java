package l;

/* JADX INFO: renamed from: l.ᩳ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18299 extends EnumC8422 {
    public /* synthetic */ C18299() {
        this("TagOpen", 7);
    }

    public C18299(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7392 = c2424.m7392();
        if (cM7392 == '!') {
            c8111.m21360(EnumC8422.f29240);
            return;
        }
        if (cM7392 == '/') {
            c8111.m21360(EnumC8422.f29191);
            return;
        }
        if (cM7392 != '?') {
            if (c2424.m7379()) {
                c8111.m21355(true);
                c8111.m21353(EnumC8422.f29212);
                return;
            } else {
                c8111.m21365(this);
                c8111.m21356('<');
                c8111.m21353(EnumC8422.f29249);
                return;
            }
        }
        C22222 c22222 = c8111.f28423;
        c22222.mo3991();
        c22222.f72666 = true;
        c8111.m21353(EnumC8422.f29258);
    }
}
