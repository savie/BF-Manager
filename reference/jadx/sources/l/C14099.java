package l;

/* JADX INFO: renamed from: l.۬᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14099 extends EnumC14757 {
    public /* synthetic */ C14099() {
        this("FORMAT_31T", 22);
    }

    public C14099(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM41673 = interfaceC16337.m41673() - 1;
        int iM35466 = EnumC14757.m35466(i);
        int iM35482 = EnumC14757.m35482(i);
        int i2 = interfaceC16337.readInt() + iM41673;
        if (iM35466 == 43 || iM35466 == 44) {
            interfaceC16337.m41672();
        }
        return new C0588(this, iM35466, 0, i2, 0L, iM35482);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        int iM11856 = abstractC3659.m11856(interfaceC23797.m41673());
        EnumC14757.m35480(abstractC3659.m11863(), abstractC3659.mo2677());
        EnumC14757.m35471(iM11856);
        EnumC14757.m35467(iM11856);
        interfaceC23797.m53084();
    }
}
