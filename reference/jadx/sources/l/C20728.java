package l;

/* JADX INFO: renamed from: l.᩷۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20728 extends EnumC8422 {
    public /* synthetic */ C20728() {
        this("CommentStart", 44);
    }

    public C20728(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        char cM7382 = c2424.m7382();
        if (cM7382 == 0) {
            c8111.m21365(this);
            c8111.f28423.m49336((char) 65533);
            c8111.m21353(EnumC8422.f29260);
            return;
        }
        if (cM7382 == '-') {
            c8111.m21353(EnumC8422.f29213);
            return;
        }
        if (cM7382 == '>') {
            c8111.m21365(this);
            c8111.m21352();
            c8111.m21353(EnumC8422.f29249);
        } else if (cM7382 == 65535) {
            c8111.m21368(this);
            c8111.m21352();
            c8111.m21353(EnumC8422.f29249);
        } else {
            c2424.m7397();
            c8111.m21353(EnumC8422.f29260);
        }
    }
}
