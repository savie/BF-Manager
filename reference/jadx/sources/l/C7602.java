package l;

/* JADX INFO: renamed from: l.۟ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S1VF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7602 extends AbstractC21803 implements InterfaceC23145, InterfaceC21733 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8889 f25145;

    public C7602(C8889 c8889) {
        super(2);
        this.f25145 = c8889;
    }

    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        if (this.f25145.m23034(c12417.m2211())) {
            return;
        }
        c12417.mo2194((Object) c12417.m2211());
    }

    @Override // l.AbstractC21803, l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5128(C12417 c12417, C17355 c17355) {
        if (this.f25145.m23037(c17355.m39114())) {
            return;
        }
        String strM39114 = c17355.m39114();
        InterfaceC18911 interfaceC18911M36802 = C15364.m36802(c17355);
        if (!(interfaceC18911M36802 instanceof C4073)) {
            interfaceC18911M36802.mo2194(new C4073(strM39114));
        } else {
            ((C4073) interfaceC18911M36802).mo2194(strM39114);
        }
    }

    @Override // l.AbstractC21803, l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5127(C12417 c12417, C11006 c11006) {
        if (!EnumC15236.NATIVE.m36501(c11006.m39119())) {
            if (this.f25145.m23037(c11006.m39114())) {
                return;
            }
            m20125(c11006);
        } else {
            c12417.mo2194((Object) c12417.m2211());
            m20125(c11006);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20125(AbstractC6066 abstractC6066) {
        String strM39114 = abstractC6066.m39114();
        if (C1791.m5871(strM39114)) {
            return;
        }
        InterfaceC18911 interfaceC18911M36802 = C15364.m36802(abstractC6066);
        if (!(interfaceC18911M36802 instanceof C4073)) {
            interfaceC18911M36802.mo2194(new C4073(strM39114));
        } else {
            ((C4073) interfaceC18911M36802).mo2194(strM39114);
        }
    }
}
