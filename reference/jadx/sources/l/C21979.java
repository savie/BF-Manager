package l;

/* JADX INFO: renamed from: l.᩷ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB02 */
/* JADX INFO: loaded from: classes.dex */
public final class C21979 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5571 m49715(AbstractC18951 abstractC18951, InterfaceC1842 interfaceC1842) {
        InterfaceC5571 interfaceC5571M24984;
        C15243.m36590(interfaceC1842, "key");
        if (interfaceC1842 instanceof AbstractC9561) {
            AbstractC9561 abstractC9561 = (AbstractC9561) interfaceC1842;
            if (!abstractC9561.m24985(abstractC18951.getKey()) || (interfaceC5571M24984 = abstractC9561.m24984(abstractC18951)) == null) {
                return null;
            }
            return interfaceC5571M24984;
        }
        C10790 c10790 = InterfaceC22725.f73763;
        if (C10790.f34250 == interfaceC1842) {
            return abstractC18951;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC11536 m49716(AbstractC18951 abstractC18951, InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        if (interfaceC1842 instanceof AbstractC9561) {
            AbstractC9561 abstractC9561 = (AbstractC9561) interfaceC1842;
            if (!abstractC9561.m24985(abstractC18951.getKey()) || abstractC9561.m24984(abstractC18951) == null) {
                return abstractC18951;
            }
        } else {
            C10790 c10790 = InterfaceC22725.f73763;
            if (C10790.f34250 != interfaceC1842) {
                return abstractC18951;
            }
        }
        return C24963.f80840;
    }
}
