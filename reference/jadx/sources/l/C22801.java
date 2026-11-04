package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩸۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes.dex */
public final class C22801 extends AbstractC13104 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f73927;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18606 f73928;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12816 f73929;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC25320 f73930;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f73931;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22801(ComponentCallbacksC11612 componentCallbacksC11612, InterfaceC12816 interfaceC12816, AtomicReference atomicReference, AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        super(0);
        this.f73927 = componentCallbacksC11612;
        this.f73929 = interfaceC12816;
        this.f73931 = atomicReference;
        this.f73928 = abstractC18606;
        this.f73930 = interfaceC25320;
    }

    @Override // l.AbstractC13104
    /* JADX INFO: renamed from: ۙ */
    public final void mo9062() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f73927;
        this.f73931.set(((AbstractC12639) this.f73929.mo27601(null)).m31420(componentCallbacksC11612.generateActivityResultKey(), componentCallbacksC11612, this.f73928, this.f73930));
    }
}
