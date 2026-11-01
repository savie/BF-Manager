package l;

/* JADX INFO: renamed from: l.᩻ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes2.dex */
public final class C23653 extends AbstractC11348 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17302 f76578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23653(C17302 c17302) {
        super(2);
        this.f76578 = c17302;
    }

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
        InterfaceC5452 key = interfaceC2629.getKey();
        InterfaceC2629 interfaceC2629Mo4416 = this.f76578.f55079.mo4416(key);
        if (key != InterfaceC11138.f37788) {
            return Integer.valueOf(interfaceC2629 != interfaceC2629Mo4416 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC11138 interfaceC11138 = (InterfaceC11138) interfaceC2629Mo4416;
        InterfaceC11138 parent = (InterfaceC11138) interfaceC2629;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC11138 || !(parent instanceof C10621)) {
                    break;
                }
                InterfaceC15227 interfaceC15227M7110 = ((C10621) parent).m7110();
                parent = interfaceC15227M7110 != null ? interfaceC15227M7110.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent != interfaceC11138) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC11138 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (interfaceC11138 != null) {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }
}
