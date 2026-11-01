package l;

/* JADX INFO: renamed from: l.ۜۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6600 extends EnumC7306 {
    public /* synthetic */ C6600() {
        this("FORMAT_PACKED_SWITCH_PAYLOAD", 33);
    }

    public C6600(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int iM50410 = interfaceC14985.m50410() - 1;
        int i2 = interfaceC14985.read();
        int i3 = interfaceC14985.readInt();
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = interfaceC14985.readInt() + iM50410;
        }
        return new C0250(this, i, i3, iArr);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        int[] iArrM1686 = ((C0250) abstractC17806).m1686();
        interfaceC21334.m50410();
        interfaceC21334.m47859();
        EnumC7306.m19499(iArrM1686.length);
        interfaceC21334.m47859();
        interfaceC21334.m47866();
        for (int i : iArrM1686) {
            interfaceC21334.m47866();
        }
    }
}
