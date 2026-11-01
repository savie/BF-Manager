package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.۫ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12549 extends AbstractC14666 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42011 = AtomicIntegerFieldUpdater.newUpdater(C12549.class, "_invoked");
    public volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC3375 f42012;

    @Override // l.InterfaceC15456
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12440((Throwable) obj);
        return C7321.f24318;
    }

    public C12549(AbstractC3375 abstractC3375) {
        this.f42012 = abstractC3375;
    }

    @Override // l.AbstractC19460
    /* JADX INFO: renamed from: ܰ */
    public final void mo12440(Throwable th) {
        if (f42011.compareAndSet(this, 0, 1)) {
            this.f42012.invoke(th);
        }
    }
}
