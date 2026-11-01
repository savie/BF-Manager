package l;

/* JADX INFO: renamed from: l.᩺ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes.dex */
public final enum C22829 extends EnumC7306 {
    public /* synthetic */ C22829() {
        this("FORMAT_SPARSE_SWITCH_PAYLOAD", 34);
    }

    public C22829(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int iM50410 = interfaceC14985.m50410() - 1;
        int i2 = interfaceC14985.read();
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = interfaceC14985.readInt();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[i4] = interfaceC14985.readInt() + iM50410;
        }
        return new C12246(this, i, iArr, iArr2);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        C12246 c12246 = (C12246) abstractC17806;
        int[] iArrM30452 = c12246.m30452();
        int[] iArrM30453 = c12246.m30453();
        interfaceC21334.m50410();
        interfaceC21334.m47859();
        EnumC7306.m19499(iArrM30453.length);
        interfaceC21334.m47859();
        for (int i : iArrM30452) {
            interfaceC21334.m47866();
        }
        for (int i2 : iArrM30453) {
            interfaceC21334.m47866();
        }
    }
}
