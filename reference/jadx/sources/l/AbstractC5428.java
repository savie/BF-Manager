package l;

/* JADX INFO: renamed from: l.ۚۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5428 implements InterfaceC6919 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12885 f18918 = new C12885(null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f18919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo16159(InterfaceC5075 interfaceC5075, boolean z, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C4192 c4192, C1083 c1083);

    public AbstractC5428(C22010 c22010) {
        this.f18919 = c22010;
    }

    @Override // l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16157(C3168 c3168, C4192 c4192, C14769 c14769, C14769 c147610, C1083 c1083) {
        Object obj;
        boolean zM46507 = c4192.f15333.m46507();
        AbstractC8036 abstractC8036 = ((C7768) c3168.f10272).f25563;
        if (abstractC8036 == null) {
            abstractC8036 = c3168.f10273;
        }
        AbstractC8036 abstractC8037 = abstractC8036;
        C14769 c14769M28327 = C11239.m28327(abstractC8037);
        C2596 c2596 = c4192.f15335;
        InterfaceC5075 interfaceC5075 = null;
        AbstractC22664 abstractC22664 = zM46507 ? (AbstractC22664) c147610.last() : null;
        if (abstractC22664 == null && c14769.m35551() != c147610.m35551()) {
            m16158(abstractC8037, EnumC4572.ARITY_MISMATCH, c2596, new Object[0]);
            throw null;
        }
        C14769 c147611 = c14769;
        C14769 c147612 = c147610;
        C14769 c147613 = c14769M28327;
        while (c147611.m35550() && (obj = c147612.f48335) != abstractC22664) {
            InterfaceC5075 interfaceC5076 = c147613 != null ? (InterfaceC5075) c147613.f48335 : interfaceC5075;
            C14769 c147614 = c147613;
            mo16159(interfaceC5076, false, (AbstractC22664) c147611.f48335, (AbstractC22664) obj, c4192, c1083);
            c147611 = c147611.f48336;
            c147612 = c147612.f48336;
            c147613 = c147614 != null ? c147614.f48336 : c147614;
            interfaceC5075 = null;
        }
        C14769 c147615 = c147613;
        if (c147612.f48335 != abstractC22664) {
            m16158(abstractC8037, EnumC4572.ARITY_MISMATCH, c2596, new Object[0]);
            throw null;
        }
        if (zM46507) {
            AbstractC22664 abstractC22664M55120 = this.f18919.f71021.m55120(abstractC22664);
            while (c147611.m35550()) {
                mo16159(c147615 != null ? (InterfaceC5075) c147615.f48335 : null, true, (AbstractC22664) c147611.f48335, abstractC22664M55120, c4192, c1083);
                c147611 = c147611.f48336;
                if (c147615 != null) {
                    c147615 = c147615.f48336;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16158(InterfaceC5075 interfaceC5075, EnumC4572 enumC4572, C2596 c2596, Object... objArr) {
        Object[] objArr2;
        C22010 c22010 = this.f18919;
        C14528 c14528 = c22010.f71036;
        C7312 c7312 = c22010.f71001;
        boolean z = c2596 != c14528.f45700;
        if (!z || enumC4572.f16260.equals(enumC4572.f16259)) {
            objArr2 = objArr;
        } else {
            Object[] objArr3 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr3, 1, objArr.length);
            objArr3[0] = c2596.f8340;
            objArr2 = objArr3;
        }
        String str = z ? enumC4572.f16260 : enumC4572.f16259;
        if (z) {
            C14528 c14529 = c22010.f71036;
            C17007 c17007M45978 = c22010.f71000.m45978(EnumC22229.FRAGMENT, c7312.m34514(), interfaceC5075, str, objArr2);
            c14529.getClass();
            throw C14528.m35046(c17007M45978);
        }
        C17007 c17007M45979 = c22010.f71000.m45978(EnumC22229.FRAGMENT, c7312.m34514(), interfaceC5075, str, objArr2);
        C12885 c12885 = this.f18918;
        c12885.f77853 = c17007M45979;
        throw c12885;
    }

    @Override // l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6919 mo16156(C14769 c14769) {
        return this.f18919.f71011;
    }
}
