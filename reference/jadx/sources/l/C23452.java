package l;

/* JADX INFO: renamed from: l.᩻ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes.dex */
public final enum C23452 extends EnumC7306 {
    public /* synthetic */ C23452() {
        this("FORMAT_32X", 20);
    }

    public C23452(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        return new C5895(this, EnumC7306.m19496(i), 0, 0, EnumC7306.m19493(i), interfaceC14985.read(), interfaceC14985.read());
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        abstractC17806.getClass();
        int iMo16133 = abstractC17806.mo16133();
        if ((iMo16133 & (-65536)) != 0) {
            throw new C19508("Register A out of range: ".concat(C22475.m49980(iMo16133)), null);
        }
        int iMo16134 = abstractC17806.mo16134();
        if ((iMo16134 & (-65536)) != 0) {
            throw new C19508("Register B out of range: ".concat(C22475.m49980(iMo16134)), null);
        }
        interfaceC21334.m47863();
    }
}
