package l;

/* JADX INFO: renamed from: l.ۛ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public class C6346 implements InterfaceC2196 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11992 f21406;

    public C6346(C11992 c11992) {
        this.f21406 = c11992;
    }

    @Override // l.InterfaceC2196
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceC1594 mo1014(InterfaceC1594 interfaceC1594) {
        if (!(interfaceC1594 instanceof InterfaceC13859)) {
            return interfaceC1594;
        }
        switch (C19753.f63475[interfaceC1594.mo5435().f35328.ordinal()]) {
            case 1:
                return new C7758(this, (InterfaceC19503) interfaceC1594);
            case 2:
                return new C21163(this, (InterfaceC10331) interfaceC1594);
            case 3:
                return new C16225(this, (InterfaceC16681) interfaceC1594);
            case 4:
                return new C20458(this, (InterfaceC1863) interfaceC1594);
            case 5:
                return new C0701(this, (InterfaceC13797) interfaceC1594);
            case 6:
                return new C16930(this, (InterfaceC5329) interfaceC1594);
            case 7:
                return new C12697(this, (InterfaceC13091) interfaceC1594);
            case 8:
                return new C17635(this, (InterfaceC3917) interfaceC1594);
            default:
                throw new IllegalArgumentException(interfaceC1594.mo5435().f35326);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7446 m17452(C6346 c6346, int i, InterfaceC7446 interfaceC7446) {
        C11992 c11992 = c6346.f21406;
        switch (i) {
            case 0:
                return (InterfaceC7446) c11992.m29871().mo1014((InterfaceC20852) interfaceC7446);
            case 1:
                return new C18425(c11992.m29872(), (InterfaceC15914) interfaceC7446);
            case 2:
                return (InterfaceC7446) c11992.m29867().mo1014((InterfaceC18735) interfaceC7446);
            case 3:
                return (InterfaceC7446) c11992.m29873().mo1014((InterfaceC8858) interfaceC7446);
            case 4:
                return new C9959(c11992.m29872(), (InterfaceC19441) interfaceC7446);
            case 5:
                C12200 c12200M29866 = c11992.m29866();
                c12200M29866.getClass();
                return new C16433(c12200M29866, (InterfaceC18029) interfaceC7446);
            case 6:
                return C15604.m37272((InterfaceC8152) interfaceC7446, c11992);
            default:
                throw new C20749(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
