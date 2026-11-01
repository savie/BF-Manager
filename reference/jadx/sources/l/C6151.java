package l;

/* JADX INFO: renamed from: l.ۛܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I97X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6151 extends C15404 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C16137 f21006;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f21007;

    public C6151(C16137 c16137) {
        super(c16137.m38201(), "/" + c16137.m38204() + "/", null, c16137.size(), c16137.m38208(), !c16137.m38200());
        this.f21006 = c16137;
        this.f21007 = C5553.m15313("$RECYCLE.BIN$/" + c16137.m38204() + "/" + c16137.m38201(), new String[0]);
    }

    public C6151(AbstractC20745 abstractC20745, String str) {
        super(abstractC20745.getName(), str, null, abstractC20745.mo33964(), abstractC20745.mo33991(), !abstractC20745.mo33974());
        this.f21006 = null;
        this.f21007 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16137 m17155() {
        return this.f21006;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16137 m17154() {
        C16137 c16137 = this.f21006;
        if (c16137 != null) {
            return c16137;
        }
        String parent = getParent();
        int iIndexOf = parent.indexOf(47, 1);
        if (iIndexOf != -1) {
            return C20370.m46017(parent.substring(1, iIndexOf));
        }
        return null;
    }

    @Override // l.C15404
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15712() {
        return this.f21006 != null;
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ᩷ܰ */
    public final AbstractC20745 mo7989() {
        return this.f21007;
    }
}
