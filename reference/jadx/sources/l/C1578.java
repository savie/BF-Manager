package l;

/* JADX INFO: renamed from: l.֫ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1578 extends EnumC7306 {
    public /* synthetic */ C1578() {
        this("FORMAT_31T", 22);
    }

    public C1578(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int iM50412 = interfaceC14985.m50412() - 1;
        int iM19496 = EnumC7306.m19496(i);
        int iM19493 = EnumC7306.m19493(i);
        int i2 = interfaceC14985.readInt() + iM50412;
        if (iM19496 == 43 || iM19496 == 44) {
            interfaceC14985.m50411();
        }
        return new C20007(this, iM19496, 0, i2, 0L, iM19493);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        int iM41385 = abstractC17806.m41385(interfaceC21334.m50412());
        EnumC7306.m19460(abstractC17806.m41390(), abstractC17806.mo16133());
        EnumC7306.m19494(iM41385);
        EnumC7306.m19457(iM41385);
        interfaceC21334.m47863();
    }
}
