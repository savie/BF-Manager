package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۡ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B964 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9642 extends AbstractC13372 implements InterfaceC25072 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31167 = AtomicIntegerFieldUpdater.newUpdater(AbstractC9642.class, "cleanedAndPointers$volatile");
    public volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f31168;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo25151();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo25152(int i, InterfaceC11536 interfaceC11536);

    public AbstractC9642(long j, C10631 c10631, int i) {
        super(c10631);
        this.f31168 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // l.AbstractC13372
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo25155() {
        return f31167.get(this) == mo25151() && m32960() != null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m25153() {
        return f31167.addAndGet(this, -65536) == mo25151() && m32960() != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25154() {
        if (f31167.incrementAndGet(this) == C8662.f28287) {
            m32961();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m25156() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f31167;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo25151() && m32960() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
