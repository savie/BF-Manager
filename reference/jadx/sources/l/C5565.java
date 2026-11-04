package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۚۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5565 implements InterfaceC24957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f19341;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24957 f19342;

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo13157(int i) {
    }

    public C5565(InterfaceC24957 interfaceC24957, AtomicReference atomicReference) {
        this.f19342 = interfaceC24957;
        this.f19341 = atomicReference;
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۙ */
    public final void mo13155(int i) {
        this.f19342.mo13155(i);
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo13156() {
        return this.f19341.get() != null || this.f19342.mo13156();
    }
}
