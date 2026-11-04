package l;

/* JADX INFO: renamed from: l.ۘܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4317 extends EnumC14757 {
    public /* synthetic */ C4317() {
        this("FORMAT_22X", 8);
    }

    public C4317(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        return new C9536(this, EnumC14757.m35466(i), 0, 0, 0L, EnumC14757.m35482(i), interfaceC16337.read());
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        EnumC14757.m35480(abstractC3659.m11863(), abstractC3659.mo2677());
        int iMo4905 = abstractC3659.mo4905();
        if (((-65536) & iMo4905) == 0) {
            interfaceC23797.m53082();
            return;
        }
        throw new C20288("Register B out of range: ".concat(C5306.m15937(iMo4905)), null);
    }
}
