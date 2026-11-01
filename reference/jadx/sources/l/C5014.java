package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۚ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5014 extends AbstractC12776 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f17461;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC22654 f17462;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11568 f17463;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15636 f17464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3639 f17465;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5014(ComponentCallbacksC22654 componentCallbacksC22654, InterfaceC11568 interfaceC11568, AtomicReference atomicReference, AbstractC15636 abstractC15636, InterfaceC3639 interfaceC3639) {
        super(0);
        this.f17462 = componentCallbacksC22654;
        this.f17463 = interfaceC11568;
        this.f17461 = atomicReference;
        this.f17464 = abstractC15636;
        this.f17465 = interfaceC3639;
    }

    @Override // l.AbstractC12776
    /* JADX INFO: renamed from: ۙ */
    public final void mo6659() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f17462;
        this.f17461.set(((AbstractC7874) this.f17463.mo6807(null)).m20780(componentCallbacksC22654.generateActivityResultKey(), componentCallbacksC22654, this.f17464, this.f17465));
    }
}
