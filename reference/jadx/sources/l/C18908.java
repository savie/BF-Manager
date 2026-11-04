package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ᩳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18908 extends AbstractC8466 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f61355 = AtomicIntegerFieldUpdater.newUpdater(C18908.class, "_invoked$volatile");
    public volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC7721 f61356;

    public C18908(InterfaceC7721 interfaceC7721) {
        this.f61356 = interfaceC7721;
    }

    @Override // l.InterfaceC7721
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1765(Throwable th) {
        if (f61355.compareAndSet(this, 0, 1)) {
            this.f61356.mo1765(th);
        }
    }
}
