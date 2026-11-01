package l;

/* JADX INFO: renamed from: l.֫᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB02 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2069 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2629 m6577(AbstractC12405 abstractC12405, InterfaceC5452 interfaceC5452) {
        InterfaceC2629 interfaceC2629M31451;
        C13465.m32966(interfaceC5452, "key");
        if (interfaceC5452 instanceof AbstractC12654) {
            AbstractC12654 abstractC12654 = (AbstractC12654) interfaceC5452;
            if (!abstractC12654.m31452(abstractC12405.getKey()) || (interfaceC2629M31451 = abstractC12654.m31451(abstractC12405)) == null) {
                return null;
            }
            return interfaceC2629M31451;
        }
        C9832 c9832 = InterfaceC3480.f12775;
        if (C9832.f33604 == interfaceC5452) {
            return abstractC12405;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22386 m6578(AbstractC12405 abstractC12405, InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        if (interfaceC5452 instanceof AbstractC12654) {
            AbstractC12654 abstractC12654 = (AbstractC12654) interfaceC5452;
            if (!abstractC12654.m31452(abstractC12405.getKey()) || abstractC12654.m31451(abstractC12405) == null) {
                return abstractC12405;
            }
        } else {
            C9832 c9832 = InterfaceC3480.f12775;
            if (C9832.f33604 != interfaceC5452) {
                return abstractC12405;
            }
        }
        return C1218.f5350;
    }
}
