package l;

/* JADX INFO: renamed from: l.ܳܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14658 extends C7052 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6771 f47919;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14658(C6771 c6771, C11992 c11992) {
        super(c11992);
        this.f47919 = c6771;
    }

    @Override // l.C7052, l.InterfaceC2196
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10975 mo1014(InterfaceC10975 interfaceC10975) {
        if (interfaceC10975.mo2656() == 29) {
            InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
            C6771 c6771 = this.f47919;
            if (c6771.f22863.m42052(interfaceC20147.getType())) {
                return new C4654(c6771, this.f23690, interfaceC20147);
            }
        }
        return super.mo1014(interfaceC10975);
    }
}
