package l;

/* JADX INFO: renamed from: l.۠ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C8784 extends EnumC15717 {
    public /* synthetic */ C8784() {
        this("Initial", 0);
    }

    public C8784(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (EnumC15717.m37586(abstractC0802)) {
            return true;
        }
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (!abstractC0802.m3215()) {
            c4310.m13765(EnumC15717.f51051);
            return c4310.mo13758(abstractC0802);
        }
        C20939 c20939 = (C20939) abstractC0802;
        C22210 c22210 = new C22210(c4310.f24095.m46442(c20939.f66991.toString()), c20939.f66989.toString(), c20939.f66988.toString());
        c22210.m50236(c20939.f66990);
        c4310.f24096.m37084(c22210);
        c4310.m20062(c22210, abstractC0802);
        if (c20939.f66992) {
            c4310.f24096.m15295(EnumC14092.quirks);
        }
        c4310.m13765(EnumC15717.f51051);
        return true;
    }
}
