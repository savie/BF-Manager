package l;

/* JADX INFO: renamed from: l.ۤ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11134 extends AbstractC13006 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13614 f35099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11134(C13614 c13614) {
        super(2);
        this.f35099 = c13614;
    }

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
        InterfaceC1842 key = interfaceC5571.getKey();
        InterfaceC5571 interfaceC5571Mo5005 = this.f35099.f43244.mo5005(key);
        if (key != InterfaceC9211.f30029) {
            return Integer.valueOf(interfaceC5571 != interfaceC5571Mo5005 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC9211 interfaceC9211 = (InterfaceC9211) interfaceC5571Mo5005;
        InterfaceC9211 parent = (InterfaceC9211) interfaceC5571;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC9211 || !(parent instanceof C1440)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent != interfaceC9211) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC9211 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (interfaceC9211 != null) {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }
}
