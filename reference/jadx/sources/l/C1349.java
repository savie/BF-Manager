package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.֨᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1349 implements InterfaceC12639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6309 f5681;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10918 f5682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC12639 f5683;

    @Override // l.InterfaceC12639
    public final InterfaceC0769 getEntry() {
        return null;
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12639 mo4751(ReferenceQueue referenceQueue, Object obj, InterfaceC0769 interfaceC0769) {
        return this;
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4753() {
        return true;
    }

    public C1349() {
        this(ConcurrentMapC21937.f71143);
    }

    public C1349(InterfaceC12639 interfaceC12639) {
        this.f5682 = C10918.m27373();
        this.f5681 = C6309.m17407();
        this.f5683 = interfaceC12639;
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo4754() {
        return this.f5683.mo4754();
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4755() {
        return this.f5683.mo4755();
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4752(Object obj) {
        if (obj != null) {
            this.f5682.mo14563(obj);
        } else {
            this.f5683 = ConcurrentMapC21937.f71143;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [l.᩹᩶ܶ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceFutureC12329 m4750(Object obj, AbstractC18864 abstractC18864) {
        InterfaceFutureC12329 interfaceFutureC12329M19716;
        try {
            this.f5681.m17409();
            if (this.f5683.get() == null) {
                Object objMo11816 = abstractC18864.mo11816(obj);
                return this.f5682.mo14563(objMo11816) ? this.f5682 : C7389.m19715(objMo11816);
            }
            abstractC18864.getClass();
            obj.getClass();
            return C7389.m19717(C7389.m19715(abstractC18864.mo11816(obj)), new InterfaceC11955() { // from class: l.᩹᩶ܶ
                @Override // l.InterfaceC11955
                public final Object apply(Object obj2) {
                    this.f73486.f5682.mo14563(obj2);
                    return obj2;
                }
            }, C5978.m16274());
        } catch (Throwable th) {
            if (!this.f5682.mo14564(th)) {
                interfaceFutureC12329M19716 = C7389.m19716(th);
            } else {
                interfaceFutureC12329M19716 = this.f5682;
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return interfaceFutureC12329M19716;
        }
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object mo4749() {
        return C14446.m34846(this.f5682);
    }

    @Override // l.InterfaceC12639
    public final Object get() {
        return this.f5683.get();
    }
}
