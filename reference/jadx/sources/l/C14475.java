package l;

/* JADX INFO: renamed from: l.ܰ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14475 extends AbstractC13006 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24941 f45555;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14475(C24941 c24941) {
        super(2);
        this.f45555 = c24941;
    }

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        InterfaceC11536 interfaceC11536 = (InterfaceC11536) obj;
        InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
        if (!(interfaceC5571 instanceof InterfaceC24173)) {
            return interfaceC11536.mo5006(interfaceC5571);
        }
        C24941 c24941 = this.f45555;
        if (((InterfaceC11536) c24941.f80717).mo5005(interfaceC5571.getKey()) == null) {
            return interfaceC11536.mo5006(((InterfaceC24173) interfaceC5571).m54149());
        }
        c24941.f80717 = ((InterfaceC11536) c24941.f80717).mo5007(interfaceC5571.getKey());
        return interfaceC11536.mo5006(((InterfaceC24173) interfaceC5571).m54150());
    }
}
