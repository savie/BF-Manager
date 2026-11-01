package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۤۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10058 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14997 f34368;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11092 f34369;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Handler f34370;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC8686 f34371;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34372;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Executor f34373;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f34374;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21346 f34375;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f34376;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f34377;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f34378;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f34379;

    /* JADX WARN: Multi-variable type inference failed */
    public C10058(InterfaceC2916 interfaceC2916) {
        C14997 c14997 = new C14997();
        Executor executorM32821 = C13312.m32821();
        C1254 c1254Mo8735 = interfaceC2916.mo8735();
        C13638.requireNonNull(c1254Mo8735);
        C21346 c21346 = new C21346(0, c1254Mo8735);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f34370 = handler;
        RunnableC8686 runnableC8686 = new RunnableC8686(1, this);
        this.f34371 = runnableC8686;
        this.f34378 = 600000L;
        this.f34379 = -1L;
        this.f34369 = (C11092) interfaceC2916;
        this.f34368 = c14997;
        this.f34373 = executorM32821;
        this.f34375 = c21346;
        handler.postDelayed(runnableC8686, 2000L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ۗ֫ۖ, l.ۧܺۖ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25468(final C10058 c10058) {
        if (c10058.f34376) {
            return;
        }
        c10058.f34368.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jM4523 = c10058.f34369.mo8735().m4523();
        if (jM4523 != c10058.f34379) {
            c10058.f34379 = jM4523;
            c10058.f34377 = jUptimeMillis;
        }
        if (!c10058.f34374 && jUptimeMillis - c10058.f34377 >= 10000 && jUptimeMillis >= c10058.f34372) {
            c10058.f34374 = true;
            try {
                FutureC12075.m30004(new C17818(c10058, jM4523), c10058.f34373).m30028((InterfaceC15954) new C3012()).m30016(new InterfaceC7486() { // from class: l.ᩴۙۚ
                    @Override // l.InterfaceC7486
                    /* JADX INFO: renamed from: ܰ */
                    public final void mo2142(Object obj, Throwable th) {
                        C10058 c10059 = this.f58986;
                        c10059.f34370.post(new RunnableC19230(c10059, th, (EnumC9578) obj, 0));
                    }
                });
                return;
            } catch (RuntimeException unused) {
                c10058.f34374 = false;
                c10058.f34372 = jUptimeMillis + 600000;
                if (c10058.f34376) {
                    return;
                }
            }
        } else if (c10058.f34376) {
            return;
        }
        c10058.f34370.postDelayed(c10058.f34371, 2000L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۗ֫ۖ, l.ۧܺۖ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m25466(final C10058 c10058, final long j) {
        if (c10058.f34376 || c10058.f34369.mo8735().m4523() != j) {
            return FutureC12075.m30001(EnumC9578.SKIPPED);
        }
        C21346 c21346 = c10058.f34375;
        return ((C1254) c21346.f69464).m4531(new BooleanSupplier() { // from class: l.۠ۙۚ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C10058.m25470(this.f26102, j);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۗ֫ۖ, l.ۧܺۖ] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25470(C10058 c10058, long j) {
        return c10058.f34376 || c10058.f34369.mo8735().m4523() != j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ۗ֫ۖ, l.ۧܺۖ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25467(EnumC9578 enumC9578, C10058 c10058, Throwable th) {
        c10058.f34374 = false;
        if (c10058.f34376) {
            return;
        }
        long j = 600000;
        if (th == null) {
            int i = C8647.f29823[enumC9578.ordinal()];
            if (i == 1) {
                c10058.f34378 = 600000L;
            } else if (i == 2) {
                long j2 = c10058.f34378;
                c10058.f34378 = Math.min(3600000L, 2 * j2);
                j = j2;
            } else if (i == 3) {
                j = 3600000;
            } else {
                if (i != 4) {
                    throw new IncompatibleClassChangeError();
                }
                j = 30000;
            }
        }
        c10058.f34368.getClass();
        c10058.f34372 = SystemClock.uptimeMillis() + j;
        if (enumC9578 == EnumC9578.COMPACTED) {
            C11092 c11092 = c10058.f34369;
            for (C12919 c12919 : (C12919[]) c11092.getSpans(0, c11092.length(), C12919.class)) {
                c12919.m32007(c10058.f34369);
            }
        }
        if (c10058.f34376) {
            return;
        }
        c10058.f34370.postDelayed(c10058.f34371, 2000L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f34376 = true;
        this.f34370.removeCallbacks(this.f34371);
    }
}
