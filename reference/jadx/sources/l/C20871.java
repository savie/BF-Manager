package l;

/* JADX INFO: renamed from: l.᩷۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20871 extends AbstractC11348 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0763 f67802;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20871(C0763 c0763) {
        super(2);
        this.f67802 = c0763;
    }

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        InterfaceC22386 interfaceC22386 = (InterfaceC22386) obj;
        InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
        if (!(interfaceC2629 instanceof InterfaceC10288)) {
            return interfaceC22386.mo4417(interfaceC2629);
        }
        C0763 c0763 = this.f67802;
        if (((InterfaceC22386) c0763.f3078).mo4416(interfaceC2629.getKey()) == null) {
            return interfaceC22386.mo4417(((InterfaceC10288) interfaceC2629).m26096());
        }
        c0763.f3078 = ((InterfaceC22386) c0763.f3078).mo4418(interfaceC2629.getKey());
        return interfaceC22386.mo4417(((InterfaceC10288) interfaceC2629).m26095());
    }
}
