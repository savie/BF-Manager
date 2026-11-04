package l;

/* JADX INFO: renamed from: l.ܽܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17741 extends EnumC14757 {
    public /* synthetic */ C17741() {
        this("FORMAT_SPARSE_SWITCH_PAYLOAD", 34);
    }

    public C17741(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM41671 = interfaceC16337.m41671() - 1;
        int i2 = interfaceC16337.read();
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = interfaceC16337.readInt();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[i4] = interfaceC16337.readInt() + iM41671;
        }
        return new C10282(this, i, iArr, iArr2);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        C10282 c10282 = (C10282) abstractC3659;
        int[] iArrM26496 = c10282.m26496();
        int[] iArrM26497 = c10282.m26497();
        interfaceC23797.m41671();
        interfaceC23797.m53077();
        EnumC14757.m35484(iArrM26497.length);
        interfaceC23797.m53077();
        for (int i : iArrM26496) {
            interfaceC23797.m53086();
        }
        for (int i2 : iArrM26497) {
            interfaceC23797.m53086();
        }
    }
}
