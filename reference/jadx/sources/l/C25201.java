package l;

/* JADX INFO: renamed from: l.᩻ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes.dex */
public final enum C25201 extends EnumC14757 {
    public /* synthetic */ C25201() {
        this("FORMAT_4RCC", 32);
    }

    public C25201(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int iM35466 = EnumC14757.m35466(i);
        if (iM35466 != 251) {
            throw new UnsupportedOperationException(String.valueOf(iM35466));
        }
        int iM35482 = EnumC14757.m35482(i);
        int i2 = interfaceC16337.read();
        int i3 = interfaceC16337.read();
        int i4 = interfaceC16337.read();
        C17083.m40217(iM35466);
        return new C18487(this, iM35466, i2, i3, iM35482, i4);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        EnumC14757.m35480(abstractC3659.m11863(), abstractC3659.mo2678());
        int iMo4904 = abstractC3659.mo4904();
        if (((-65536) & iMo4904) != 0) {
            throw new C20288("Register C out of range: ".concat(C5306.m15937(iMo4904)), null);
        }
        abstractC3659.mo11862();
        interfaceC23797.m53079();
    }
}
