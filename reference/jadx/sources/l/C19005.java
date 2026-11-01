package l;

/* JADX INFO: renamed from: l.ᩴ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19005 extends EnumC8422 {
    public /* synthetic */ C19005() {
        this("EndTagOpen", 8);
    }

    public C19005(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7394()) {
            c8111.m21368(this);
            c8111.m21357("</");
            c8111.m21353(EnumC8422.f29249);
        } else if (c2424.m7379()) {
            c8111.m21355(false);
            c8111.m21353(EnumC8422.f29212);
        } else {
            if (c2424.m7390('>')) {
                c8111.m21365(this);
                c8111.m21360(EnumC8422.f29249);
                return;
            }
            c8111.m21365(this);
            C22222 c22222 = c8111.f28423;
            c22222.mo3991();
            c22222.f72666 = true;
            c22222.m49336('/');
            c8111.m21353(EnumC8422.f29258);
        }
    }
}
