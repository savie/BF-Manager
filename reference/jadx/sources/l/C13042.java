package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13042 implements InterfaceC22920 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f43487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22920 f43488;

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo1829(int i) {
    }

    public C13042(InterfaceC22920 interfaceC22920, AtomicReference atomicReference) {
        this.f43488 = interfaceC22920;
        this.f43487 = atomicReference;
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ۙ */
    public final void mo1828(int i) {
        this.f43488.mo1828(i);
    }

    @Override // l.InterfaceC22920
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo1827() {
        return this.f43487.get() != null || this.f43488.mo1827();
    }
}
