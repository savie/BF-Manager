package l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes.dex */
public final class C22906 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f74461 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0140.m1229("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f74462;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f74463;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f74464;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f74465;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74466;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22874 f74467;

    public C22906() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f74463 = new RunnableC6677(this);
        this.f74465 = new ArrayDeque();
        this.f74467 = new C22874(1);
        this.f74464 = 5;
        this.f74462 = timeUnit.toNanos(5L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0896 m50687(C16328 c16328, C15009 c15009, C8608 c8608) {
        for (C0896 c0896 : this.f74465) {
            if (c0896.m3583(c16328, c8608)) {
                c15009.m36000(c0896, true);
                return c0896;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Socket m50686(C16328 c16328, C15009 c15009) {
        for (C0896 c0896 : this.f74465) {
            if (c0896.m3583(c16328, null) && c0896.m3586() && c0896 != c15009.m36003()) {
                return c15009.m35996(c0896);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50689(C0896 c0896) {
        if (!this.f74466) {
            this.f74466 = true;
            f74461.execute(this.f74463);
        }
        this.f74465.add(c0896);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50688(C0896 c0896) {
        if (c0896.f3611 || this.f74464 == 0) {
            this.f74465.remove(c0896);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50685(long j) {
        synchronized (this) {
            C0896 c0896 = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C0896 c0897 : this.f74465) {
                if (m50684(c0897, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c0897.f3605;
                    if (j3 > j2) {
                        c0896 = c0897;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f74462;
            if (j2 < j4 && i <= this.f74464) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f74466 = false;
                return -1L;
            }
            this.f74465.remove(c0896);
            C0140.m1233(c0896.m3585());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m50684(C0896 c0896, long j) {
        ArrayList arrayList = c0896.f3610;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C18743.m43294().mo11391(((C22770) reference).f74145, "A connection to " + c0896.m3576().f29716.f52605 + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                c0896.f3611 = true;
                if (arrayList.isEmpty()) {
                    c0896.f3605 = j - this.f74462;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
