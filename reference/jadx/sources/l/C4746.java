package l;

/* JADX INFO: renamed from: l.ۙܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4746 implements InterfaceC8400 {
    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        InterfaceC22386 interfaceC22386 = (InterfaceC22386) obj;
        InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
        C13465.m32966(interfaceC22386, "acc");
        C13465.m32966(interfaceC2629, "element");
        InterfaceC22386 interfaceC22386Mo4418 = interfaceC22386.mo4418(interfaceC2629.getKey());
        C1218 c1218 = C1218.f5350;
        if (interfaceC22386Mo4418 == c1218) {
            return interfaceC2629;
        }
        C9832 c9832 = InterfaceC3480.f12775;
        C9832 c9833 = C9832.f33604;
        InterfaceC3480 interfaceC3480 = (InterfaceC3480) interfaceC22386Mo4418.mo4416(c9833);
        if (interfaceC3480 == null) {
            return new C23943(interfaceC2629, interfaceC22386Mo4418);
        }
        InterfaceC22386 interfaceC22386Mo4419 = interfaceC22386Mo4418.mo4418(c9833);
        return interfaceC22386Mo4419 == c1218 ? new C23943(interfaceC3480, interfaceC2629) : new C23943(interfaceC3480, new C23943(interfaceC2629, interfaceC22386Mo4419));
    }
}
