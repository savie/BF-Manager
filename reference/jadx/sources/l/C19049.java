package l;

/* JADX INFO: renamed from: l.ᩴ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19049 extends C11994 {
    @Override // l.C11994, l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public final void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        int iMo25192;
        if (!interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
            int iMo25193 = interfaceC9961.mo25193();
            if (iMo25193 < 16777220 || iMo25193 > 16777225 || ((iMo25192 = interfaceC9961.mo25192()) != 0 && iMo25192 != 1 && iMo25192 != 2 && iMo25192 != 3)) {
                super.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
                return;
            }
        }
        interfaceC9380.mo24062("plurals");
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        for (InterfaceC9961 interfaceC9962 : interfaceC3609.values()) {
            interfaceC9380.mo24062("item");
            interfaceC9380.mo24061("quantity", InterfaceC9961.f34034[interfaceC9962.mo25193() - 16777220]);
            C7054.m18903(interfaceC9380, C7054.m18900(c22577, interfaceC9962));
            interfaceC9380.mo24060("item");
        }
        interfaceC9380.mo24060("plurals");
    }
}
