package l;

/* JADX INFO: renamed from: l.ᩴۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19741 implements InterfaceC23955 {
    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        InterfaceC11536 interfaceC11536 = (InterfaceC11536) obj;
        InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
        C15243.m36590(interfaceC11536, "acc");
        C15243.m36590(interfaceC5571, "element");
        InterfaceC11536 interfaceC11536Mo5007 = interfaceC11536.mo5007(interfaceC5571.getKey());
        C24963 c24963 = C24963.f80840;
        if (interfaceC11536Mo5007 == c24963) {
            return interfaceC5571;
        }
        C10790 c10790 = InterfaceC22725.f73763;
        C10790 c10791 = C10790.f34250;
        InterfaceC22725 interfaceC22725 = (InterfaceC22725) interfaceC11536Mo5007.mo5005(c10791);
        if (interfaceC22725 == null) {
            return new C14036(interfaceC5571, interfaceC11536Mo5007);
        }
        InterfaceC11536 interfaceC11536Mo5008 = interfaceC11536Mo5007.mo5007(c10791);
        return interfaceC11536Mo5008 == c24963 ? new C14036(interfaceC22725, interfaceC5571) : new C14036(interfaceC22725, new C14036(interfaceC5571, interfaceC11536Mo5008));
    }
}
