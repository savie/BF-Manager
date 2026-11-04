package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ܳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AW3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15178 extends C1440 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49501 = AtomicIntegerFieldUpdater.newUpdater(C15178.class, "_decision$volatile");
    public volatile /* synthetic */ int _decision$volatile;

    @Override // l.C1440, l.C15374
    /* JADX INFO: renamed from: ᩸ */
    public final void mo5179(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f49501;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C13808.m33718((InterfaceC4825) null);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // l.C1440, l.C15374
    /* JADX INFO: renamed from: ۤ */
    public final void mo5177(Object obj) {
        mo5179(obj);
    }
}
