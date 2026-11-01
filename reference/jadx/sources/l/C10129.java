package l;

/* JADX INFO: renamed from: l.ۤۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10129 extends EnumC7306 {
    public /* synthetic */ C10129() {
        this("FORMAT_22X", 8);
    }

    public C10129(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        return new C5895(this, EnumC7306.m19496(i), 0, 0, 0L, EnumC7306.m19493(i), interfaceC14985.read());
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        EnumC7306.m19460(abstractC17806.m41390(), abstractC17806.mo16133());
        int iMo16134 = abstractC17806.mo16134();
        if (((-65536) & iMo16134) == 0) {
            interfaceC21334.m47864();
            return;
        }
        throw new C19508("Register B out of range: ".concat(C22475.m49980(iMo16134)), null);
    }
}
