package l;

/* JADX INFO: renamed from: l.ܳ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14379 extends EnumC8422 {
    public /* synthetic */ C14379() {
        this("AfterDoctypeName", 53);
    }

    public C14379(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7394()) {
            c8111.m21368(this);
            c8111.f28416.f4891 = true;
            c8111.m21363();
            c8111.m21353(EnumC8422.f29249);
            return;
        }
        if (c2424.m7384('\t', '\n', '\r', '\f', ' ')) {
            c2424.m7374();
            return;
        }
        if (c2424.m7390('>')) {
            c8111.m21363();
            c8111.m21360(EnumC8422.f29249);
            return;
        }
        if (c2424.m7383("PUBLIC")) {
            c8111.f28416.f4894 = "PUBLIC";
            c8111.m21353(EnumC8422.f29242);
        } else if (c2424.m7383("SYSTEM")) {
            c8111.f28416.f4894 = "SYSTEM";
            c8111.m21353(EnumC8422.f29221);
        } else {
            c8111.m21365(this);
            c8111.f28416.f4891 = true;
            c8111.m21360(EnumC8422.f29193);
        }
    }
}
