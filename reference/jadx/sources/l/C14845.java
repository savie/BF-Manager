package l;

/* JADX INFO: renamed from: l.ܰ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C14845 extends EnumC14757 {
    public /* synthetic */ C14845() {
        this("FORMAT_21H", 11);
    }

    public C14845(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM35466 = EnumC14757.m35466(i);
        return new C0588(this, iM35466, 0, 0, ((long) ((short) interfaceC16337.read())) << (iM35466 == 21 ? (char) 16 : '0'), EnumC14757.m35482(i));
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        EnumC14757.m35480(abstractC3659.m11863(), abstractC3659.mo2677());
        interfaceC23797.m53082();
    }
}
