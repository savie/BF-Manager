package l;

/* JADX INFO: renamed from: l.ܺܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C16995 extends EnumC14757 {
    public /* synthetic */ C16995() {
        this("FORMAT_PACKED_SWITCH_PAYLOAD", 33);
    }

    public C16995(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM41671 = interfaceC16337.m41671() - 1;
        int i2 = interfaceC16337.read();
        int i3 = interfaceC16337.readInt();
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = interfaceC16337.readInt() + iM41671;
        }
        return new C8046(this, i, i3, iArr);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        int[] iArrM21935 = ((C8046) abstractC3659).m21935();
        interfaceC23797.m41671();
        interfaceC23797.m53077();
        EnumC14757.m35484(iArrM21935.length);
        interfaceC23797.m53077();
        interfaceC23797.m53086();
        for (int i : iArrM21935) {
            interfaceC23797.m53086();
        }
    }
}
