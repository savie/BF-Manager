package l;

/* JADX INFO: renamed from: l.ܶ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91FI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15522 extends C8466 {
    @Override // l.C8466, l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public final void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        boolean z;
        if (interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        InterfaceC9961 value = interfaceC3609.getValue();
        if (value.mo25185() && !value.mo25187().mo11445() && value.mo25187().getValue().isEmpty()) {
            z = true;
        } else if (value.mo25192() != 18) {
            super.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
            return;
        } else {
            if (value.getValue() != 0) {
                super.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
                return;
            }
            z = false;
        }
        interfaceC9380.mo24062("id");
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        if (z) {
            interfaceC9380.mo24061("explicit", "true");
        }
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        interfaceC9380.mo24060("id");
    }
}
