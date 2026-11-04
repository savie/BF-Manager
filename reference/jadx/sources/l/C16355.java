package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ܶ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: VANM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16355 extends AbstractC18951 implements InterfaceC19654 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53100 = AtomicIntegerFieldUpdater.newUpdater(C16355.class, "runningWorkers$volatile");
    public volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC18951 f53101;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f53102;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f53103;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19654 f53104;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24561 f53105;

    /* JADX WARN: Multi-variable type inference failed */
    public C16355(AbstractC18951 abstractC18951, int i) {
        this.f53101 = abstractC18951;
        this.f53102 = i;
        InterfaceC19654 interfaceC19654 = abstractC18951 instanceof InterfaceC19654 ? (InterfaceC19654) abstractC18951 : null;
        this.f53104 = interfaceC19654 == null ? C22638.m51045() : interfaceC19654;
        this.f53105 = new C24561();
        this.f53103 = new Object();
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        this.f53105.m54851(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f53100;
        if (atomicIntegerFieldUpdater.get(this) < this.f53102) {
            synchronized (this.f53103) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f53102) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM38852 = m38852();
                if (runnableM38852 == null) {
                    return;
                }
                this.f53101.mo11210(this, new RunnableC17847(this, runnableM38852));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Runnable m38852() {
        while (true) {
            Runnable runnable = (Runnable) this.f53105.m54852();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f53103) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f53100;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f53105.m54853() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
