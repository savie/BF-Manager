package l;

/* JADX INFO: renamed from: l.۫᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12654 implements InterfaceC5452 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11348 f42266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5452 f42267;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC12654(InterfaceC5452 interfaceC5452, InterfaceC15456 interfaceC15456) {
        C13465.m32966(interfaceC5452, "baseKey");
        this.f42266 = (AbstractC11348) interfaceC15456;
        this.f42267 = interfaceC5452 instanceof AbstractC12654 ? ((AbstractC12654) interfaceC5452).f42267 : interfaceC5452;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31452(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        return interfaceC5452 == this || this.f42267 == interfaceC5452;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۨ֡۠, l.ܶ᩶۠] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2629 m31451(AbstractC12405 abstractC12405) {
        return (InterfaceC2629) this.f42266.invoke(abstractC12405);
    }
}
