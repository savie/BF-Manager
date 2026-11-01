package l;

/* JADX INFO: renamed from: l.ۗ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3088 extends EnumC8422 {
    public /* synthetic */ C3088() {
        this("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    public C3088(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7382 = c2424.m7382();
        if (cM7382 == 0) {
            c8111.m21365(this);
            c8111.f28416.f4890.append((char) 65533);
            return;
        }
        if (cM7382 == '\"') {
            c8111.m21353(EnumC8422.f29225);
            return;
        }
        if (cM7382 == '>') {
            c8111.m21365(this);
            c8111.f28416.f4891 = true;
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
            return;
        }
        if (cM7382 == 65535) {
            c8111.m21368(this);
            c8111.f28416.f4891 = true;
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
            return;
        }
        c8111.f28416.f4890.append(cM7382);
    }
}
