package l;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ۘܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4256 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15484 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f15488;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f15489;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Throwable f15490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f15485 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f15483 = new ReferenceQueue();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f15487 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f15492 = new FutureC23690();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f15486 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public FutureC23690 f15491 = FutureC23690.m52928(null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C24394 m13590() {
        if (this.f15489) {
            return null;
        }
        this.f15488++;
        return new C24394(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4256 m13584(InterfaceC24329 interfaceC24329) {
        C4256 c4256;
        InterfaceC24329 interfaceC24329Normalize = interfaceC24329.toAbsolutePath().normalize();
        synchronized (f15485) {
            while (true) {
                C6494 c6494 = (C6494) f15483.poll();
                if (c6494 == null) {
                    break;
                }
                C11392.remove(f15485, c6494.f21812, c6494);
            }
            HashMap map = f15485;
            C6494 c6495 = (C6494) map.get(interfaceC24329Normalize);
            c4256 = c6495 == null ? null : (C4256) c6495.get();
            if (c4256 == null) {
                c4256 = new C4256();
                if (C3445.exists(interfaceC24329Normalize, EnumC20599.NOFOLLOW_LINKS)) {
                    c4256.m13588();
                }
                map.put(interfaceC24329Normalize, new C6494(interfaceC24329Normalize, c4256));
            }
        }
        return c4256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m13588() {
        boolean z;
        FutureC23690 futureC23690;
        synchronized (this) {
            z = true;
            this.f15489 = true;
            if (this.f15488 != 0) {
                z = false;
            }
        }
        if (z) {
            m13587();
        }
        synchronized (this) {
            futureC23690 = this.f15491;
        }
        return this.f15492.m52943((InterfaceC25138) new C9492(1, futureC23690)).m52949((InterfaceC25138) new C20664());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m13589(final InterfaceC19106 interfaceC19106, ThreadPoolExecutor threadPoolExecutor) {
        final FutureC23690 futureC23690;
        synchronized (this) {
            futureC23690 = (FutureC23690) this.f15486.remove(interfaceC19106);
            if (futureC23690 == null) {
                futureC23690 = new FutureC23690();
                this.f15491 = FutureC23690.m52921(this.f15491, futureC23690);
            }
        }
        try {
            threadPoolExecutor.execute(new Runnable() { // from class: l.ۨܶ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC19106 interfaceC19107 = interfaceC19106;
                    FutureC23690 futureC23691 = futureC23690;
                    try {
                        interfaceC19107.mo11049();
                        futureC23691.m52935((Object) null);
                    } catch (Throwable th) {
                        futureC23691.m52937(th);
                    }
                }
            });
        } catch (RuntimeException e) {
            futureC23690.m52937((Throwable) e);
        }
        return futureC23690.m52949((InterfaceC25138) new C20664());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13585(C4256 c4256, Throwable th) {
        boolean z;
        synchronized (c4256) {
            if (c4256.f15489 && th != null) {
                Throwable th2 = c4256.f15490;
                if (th2 == null) {
                    c4256.f15490 = th;
                } else if (th2 != th) {
                    th2.addSuppressed(th);
                }
            }
            z = true;
            int i = c4256.f15488 - 1;
            c4256.f15488 = i;
            if (!c4256.f15489 || i != 0) {
                z = false;
            }
        }
        if (z) {
            c4256.m13587();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m13587() {
        Throwable th;
        synchronized (this) {
            th = this.f15490;
        }
        if (th == null) {
            this.f15492.m52935((Object) null);
        } else {
            this.f15492.m52937(th);
        }
    }
}
