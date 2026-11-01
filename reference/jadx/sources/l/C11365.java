package l;

/* JADX INFO: renamed from: l.ۨ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11365 implements InterfaceC11568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC22654 f38327;

    public C11365(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f38327 = componentCallbacksC22654;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC11568
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6807(AbstractC20745 abstractC20745) {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f38327;
        Object obj = componentCallbacksC22654.mHost;
        if (obj instanceof InterfaceC19163) {
            return ((InterfaceC19163) obj).mo4078();
        }
        return componentCallbacksC22654.requireActivity().mo4078();
    }
}
