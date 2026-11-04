package l;

/* JADX INFO: renamed from: l.ۡᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9561 implements InterfaceC1842 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13006 f30953;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1842 f30954;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC9561(InterfaceC1842 interfaceC1842, InterfaceC3071 interfaceC3071) {
        C15243.m36590(interfaceC1842, "baseKey");
        this.f30953 = (AbstractC13006) interfaceC3071;
        this.f30954 = interfaceC1842 instanceof AbstractC9561 ? ((AbstractC9561) interfaceC1842).f30954 : interfaceC1842;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24985(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        return interfaceC1842 == this || this.f30954 == interfaceC1842;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۗ֨᩵, l.۫ۡ᩵] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5571 m24984(AbstractC18951 abstractC18951) {
        return (InterfaceC5571) this.f30953.invoke(abstractC18951);
    }
}
