package l;

/* JADX INFO: renamed from: l.۠᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31EV */
/* JADX INFO: loaded from: classes3.dex */
public class C8466 implements InterfaceC1409 {
    @Override // l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        if (interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        InterfaceC9961 value = interfaceC3609.getValue();
        String strMo13720 = mo13720(value);
        interfaceC9380.mo24062(strMo13720);
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        C7054.m18903(interfaceC9380, C7054.m18900(c22577, value));
        interfaceC9380.mo24060(strMo13720);
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo13720(InterfaceC9961 interfaceC9961) {
        return C7054.m18902(interfaceC9961);
    }
}
