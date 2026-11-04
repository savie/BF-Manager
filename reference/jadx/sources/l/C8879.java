package l;

/* JADX INFO: renamed from: l.۠᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C8879 extends EnumC14757 {
    public /* synthetic */ C8879() {
        this("FORMAT_32X", 20);
    }

    public C8879(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        return new C9536(this, EnumC14757.m35466(i), 0, 0, EnumC14757.m35482(i), interfaceC16337.read(), interfaceC16337.read());
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        abstractC3659.getClass();
        int iMo2677 = abstractC3659.mo2677();
        if ((iMo2677 & (-65536)) != 0) {
            throw new C20288("Register A out of range: ".concat(C5306.m15937(iMo2677)), null);
        }
        int iMo4905 = abstractC3659.mo4905();
        if ((iMo4905 & (-65536)) != 0) {
            throw new C20288("Register B out of range: ".concat(C5306.m15937(iMo4905)), null);
        }
        interfaceC23797.m53084();
    }
}
