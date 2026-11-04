package l;

/* JADX INFO: renamed from: l.ۚ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M62C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6000 extends AbstractC2493 implements InterfaceC25392 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25392 f20527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20528;

    public C6000(int i, InterfaceC25392 interfaceC25392) {
        this.f20528 = i;
        this.f20527 = interfaceC25392;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6000 m17432(InterfaceC6813 interfaceC6813) {
        InterfaceC25392 interfaceC25392M33096;
        if (interfaceC6813 instanceof C6000) {
            return (C6000) interfaceC6813;
        }
        int iMo17433 = interfaceC6813.mo17433();
        switch (iMo17433) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC25392M33096 = C13457.m33096((InterfaceC8304) interfaceC6813.mo17434());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC25392M33096 = C11965.m29941((InterfaceC4859) interfaceC6813.mo17434());
                break;
            default:
                throw new C23044(null, "Invalid method handle type: %d", Integer.valueOf(iMo17433));
        }
        return new C6000(iMo17433, interfaceC25392M33096);
    }

    @Override // l.InterfaceC6813
    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final int mo17433() {
        return this.f20528;
    }

    @Override // l.InterfaceC6813
    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10824 mo17434() {
        return this.f20527;
    }
}
