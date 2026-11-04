package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.֫ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1863 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f6266;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f6267;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f6268;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC9263 f6269;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Executor f6270;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C5068 f6271;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f6272;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Handler f6273;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22746 f6274;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10811 f6275;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f6276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f6277;

    /* JADX WARN: Multi-variable type inference failed */
    public C1863(InterfaceC19106 interfaceC19106) {
        C10811 c10811 = new C10811();
        Executor executorM44678 = C19304.m44678();
        C17505 c17505Mo11043 = interfaceC19106.mo11043();
        C17359.requireNonNull(c17505Mo11043);
        C22746 c22746 = new C22746(c17505Mo11043);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6273 = handler;
        RunnableC9263 runnableC9263 = new RunnableC9263(1, this);
        this.f6269 = runnableC9263;
        this.f6277 = 600000L;
        this.f6272 = -1L;
        this.f6271 = (C5068) interfaceC19106;
        this.f6275 = c10811;
        this.f6270 = executorM44678;
        this.f6274 = c22746;
        handler.postDelayed(runnableC9263, 2000L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ۙܿ᩸, l.ᩳ۬᩸] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6394(C1863 c1863) {
        if (c1863.f6266) {
            return;
        }
        c1863.f6275.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jM41105 = c1863.f6271.mo11043().m41105();
        if (jM41105 != c1863.f6272) {
            c1863.f6272 = jM41105;
            c1863.f6276 = jUptimeMillis;
        }
        if (!c1863.f6268 && jUptimeMillis - c1863.f6276 >= 10000 && jUptimeMillis >= c1863.f6267) {
            c1863.f6268 = true;
            try {
                FutureC23690.m52920(new C19762(c1863, jM41105), c1863.f6270).m52943((InterfaceC25138) new C4791(5)).m52931((InterfaceC2017) new C7256(2, c1863));
                return;
            } catch (RuntimeException unused) {
                c1863.f6268 = false;
                c1863.f6267 = jUptimeMillis + 600000;
                if (c1863.f6266) {
                    return;
                }
            }
        } else if (c1863.f6266) {
            return;
        }
        c1863.f6273.postDelayed(c1863.f6269, 2000L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۙܿ᩸, l.ᩳ۬᩸] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m6393(final C1863 c1863, final long j) {
        if (c1863.f6266 || c1863.f6271.mo11043().m41105() != j) {
            return FutureC23690.m52928(EnumC19743.SKIPPED);
        }
        C22746 c22746 = c1863.f6274;
        return c22746.f73815.m41088(new BooleanSupplier() { // from class: l.ܳۤᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C1863.m6397(this.f49972, j);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۙܿ᩸, l.ᩳ۬᩸] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6397(C1863 c1863, long j) {
        return c1863.f6266 || c1863.f6271.mo11043().m41105() != j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ۙܿ᩸, l.ᩳ۬᩸] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6395(EnumC19743 enumC19743, C1863 c1863, Throwable th) {
        c1863.f6268 = false;
        if (c1863.f6266) {
            return;
        }
        long j = 600000;
        if (th == null) {
            int i = C5592.f19412[enumC19743.ordinal()];
            if (i == 1) {
                c1863.f6277 = 600000L;
            } else if (i == 2) {
                long j2 = c1863.f6277;
                c1863.f6277 = Math.min(3600000L, 2 * j2);
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
        c1863.f6275.getClass();
        c1863.f6267 = SystemClock.uptimeMillis() + j;
        if (enumC19743 == EnumC19743.COMPACTED) {
            C5068 c5068 = c1863.f6271;
            for (C15751 c15751 : (C15751[]) c5068.getSpans(0, c5068.length(), C15751.class)) {
                c15751.m37671(c1863.f6271);
            }
        }
        if (c1863.f6266) {
            return;
        }
        c1863.f6273.postDelayed(c1863.f6269, 2000L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6266 = true;
        this.f6273.removeCallbacks(this.f6269);
    }
}
