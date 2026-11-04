package l;

/* JADX INFO: renamed from: l.ᩳ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAY4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18951 extends AbstractC1359 implements InterfaceC22725 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C7764 f61458 = new C7764(InterfaceC22725.f73763, C0306.f1637);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable);

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo42813() {
        return !(this instanceof C3442);
    }

    @Override // l.AbstractC1359, l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5571 mo5005(InterfaceC1842 interfaceC1842) {
        return C21979.m49715(this, interfaceC1842);
    }

    @Override // l.AbstractC1359, l.InterfaceC11536
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC11536 mo5007(InterfaceC1842 interfaceC1842) {
        return C21979.m49716(this, interfaceC1842);
    }

    public AbstractC18951() {
        super(InterfaceC22725.f73763);
    }

    @Override // l.InterfaceC22725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25307 mo44007(AbstractC6317 abstractC6317) {
        return new C25307(this, abstractC6317);
    }

    @Override // l.InterfaceC22725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo44008(InterfaceC4825 interfaceC4825) {
        C15243.m36587((Object) interfaceC4825, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C25307) interfaceC4825).m56565();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C21892.m49586(this);
    }
}
