package l;

/* JADX INFO: renamed from: l.ۘۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3777 extends EnumC7306 {
    public /* synthetic */ C3777() {
        this("FORMAT_4RCC", 32);
    }

    public C3777(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int iM19496 = EnumC7306.m19496(i);
        if (iM19496 != 251) {
            throw new UnsupportedOperationException(String.valueOf(iM19496));
        }
        int iM19493 = EnumC7306.m19493(i);
        int i2 = interfaceC14985.read();
        int i3 = interfaceC14985.read();
        int i4 = interfaceC14985.read();
        C6517.m17725(iM19496);
        return new C15774(this, iM19496, i2, i3, iM19493, i4);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        EnumC7306.m19460(abstractC17806.m41390(), abstractC17806.mo1687());
        int iMo20931 = abstractC17806.mo20931();
        if (((-65536) & iMo20931) != 0) {
            throw new C19508("Register C out of range: ".concat(C22475.m49980(iMo20931)), null);
        }
        abstractC17806.mo37516();
        interfaceC21334.m47861();
    }
}
