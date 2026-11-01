package l;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.᩷ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21030 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68488 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f68489;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Throwable f68492;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68495;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f68487 = new HashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f68486 = new ReferenceQueue();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f68493 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f68490 = new FutureC12075();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f68491 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f68494 = FutureC12075.m30001(null);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C7625 m47408() {
        if (this.f68495) {
            return null;
        }
        this.f68489++;
        return new C7625(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21030 m47403(InterfaceC3800 interfaceC3800) {
        C21030 c21030;
        InterfaceC3800 interfaceC3800Normalize = interfaceC3800.toAbsolutePath().normalize();
        synchronized (f68487) {
            while (true) {
                C10448 c10448 = (C10448) f68486.poll();
                if (c10448 == null) {
                    break;
                }
                C9735.remove(f68487, c10448.f35673, c10448);
            }
            HashMap map = f68487;
            C10448 c10449 = (C10448) map.get(interfaceC3800Normalize);
            c21030 = c10449 == null ? null : (C21030) c10449.get();
            if (c21030 == null) {
                c21030 = new C21030();
                if (C5212.exists(interfaceC3800Normalize, EnumC22146.NOFOLLOW_LINKS)) {
                    c21030.m47406();
                }
                map.put(interfaceC3800Normalize, new C10448(interfaceC3800Normalize, c21030));
            }
        }
        return c21030;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m47406() {
        boolean z;
        FutureC12075 futureC12075;
        synchronized (this) {
            z = true;
            this.f68495 = true;
            if (this.f68489 != 0) {
                z = false;
            }
        }
        if (z) {
            m47402();
        }
        synchronized (this) {
            futureC12075 = this.f68494;
        }
        return this.f68490.m30028((InterfaceC15954) new C0392(futureC12075)).m30032((InterfaceC15954) new C19620());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m47407(final InterfaceC2916 interfaceC2916, ThreadPoolExecutor threadPoolExecutor) {
        final FutureC12075 futureC12075;
        synchronized (this) {
            futureC12075 = (FutureC12075) this.f68491.remove(interfaceC2916);
            if (futureC12075 == null) {
                futureC12075 = new FutureC12075();
                this.f68494 = FutureC12075.m30006(this.f68494, futureC12075);
            }
        }
        try {
            threadPoolExecutor.execute(new Runnable() { // from class: l.ۡᩳۖ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2916 interfaceC2917 = interfaceC2916;
                    FutureC12075 futureC12076 = futureC12075;
                    try {
                        interfaceC2917.mo8734();
                        futureC12076.m30019((Object) null);
                    } catch (Throwable th) {
                        futureC12076.m30021(th);
                    }
                }
            });
        } catch (RuntimeException e) {
            futureC12075.m30021((Throwable) e);
        }
        return futureC12075.m30032((InterfaceC15954) new C19620());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47404(C21030 c21030, Throwable th) {
        boolean z;
        synchronized (c21030) {
            if (c21030.f68495 && th != null) {
                Throwable th2 = c21030.f68492;
                if (th2 == null) {
                    c21030.f68492 = th;
                } else if (th2 != th) {
                    th2.addSuppressed(th);
                }
            }
            z = true;
            int i = c21030.f68489 - 1;
            c21030.f68489 = i;
            if (!c21030.f68495 || i != 0) {
                z = false;
            }
        }
        if (z) {
            c21030.m47402();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m47402() {
        Throwable th;
        synchronized (this) {
            th = this.f68492;
        }
        if (th == null) {
            this.f68490.m30019((Object) null);
        } else {
            this.f68490.m30021(th);
        }
    }
}
