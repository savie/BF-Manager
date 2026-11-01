package l;

/* JADX INFO: renamed from: l.۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7322 extends EnumC8422 {
    public /* synthetic */ C7322() {
        this("MarkupDeclarationOpen", 43);
    }

    public C7322(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7391("--")) {
            c8111.f28423.mo3991();
            c8111.m21353(EnumC8422.f29247);
            return;
        }
        if (c2424.m7383("DOCTYPE")) {
            c8111.m21353(EnumC8422.f29215);
            return;
        }
        if (c2424.m7391("[CDATA[")) {
            c8111.m21364();
            c8111.m21353(EnumC8422.f29228);
            return;
        }
        c8111.m21365(this);
        C22222 c22222 = c8111.f28423;
        c22222.mo3991();
        c22222.f72666 = true;
        c8111.m21353(EnumC8422.f29258);
    }
}
