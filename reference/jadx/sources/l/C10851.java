package l;

/* JADX INFO: renamed from: l.ۧ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10851 extends EnumC8422 {
    public /* synthetic */ C10851() {
        this("BeforeDoctypeName", 51);
    }

    public C10851(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7379()) {
            c8111.f28416.mo3991();
            c8111.m21353(EnumC8422.f29219);
            return;
        }
        char cM7382 = c2424.m7382();
        if (cM7382 == 0) {
            c8111.m21365(this);
            C1054 c1054 = c8111.f28416;
            c1054.mo3991();
            c1054.f4892.append((char) 65533);
            c8111.m21353(EnumC8422.f29219);
            return;
        }
        if (cM7382 != ' ') {
            if (cM7382 == 65535) {
                c8111.m21368(this);
                C1054 c1055 = c8111.f28416;
                c1055.mo3991();
                c1055.f4891 = true;
                c8111.m21363();
                c8111.m21353(EnumC8422.f29249);
                return;
            }
            if (cM7382 == '\t' || cM7382 == '\n' || cM7382 == '\f' || cM7382 == '\r') {
                return;
            }
            c8111.f28416.mo3991();
            c8111.f28416.f4892.append(cM7382);
            c8111.m21353(EnumC8422.f29219);
        }
    }
}
