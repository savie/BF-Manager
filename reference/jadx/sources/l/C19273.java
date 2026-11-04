package l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ᩳᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19273 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f62319 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C19822.m45599("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f62320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f62321;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17354 f62322;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f62323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f62324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f62325;

    public C19273() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f62320 = new RunnableC8086(this);
        this.f62321 = new ArrayDeque();
        this.f62322 = new C17354(1);
        this.f62323 = 5;
        this.f62325 = timeUnit.toNanos(5L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14600 m44617(C13306 c13306, C19076 c19076, C7208 c7208) {
        for (C14600 c14600 : this.f62321) {
            if (c14600.m35244(c13306, c7208)) {
                c19076.m44180(c14600, true);
                return c14600;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Socket m44616(C13306 c13306, C19076 c19076) {
        for (C14600 c14600 : this.f62321) {
            if (c14600.m35244(c13306, null) && c14600.m35247() && c14600 != c19076.m44182()) {
                return c19076.m44176(c14600);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44619(C14600 c14600) {
        if (!this.f62324) {
            this.f62324 = true;
            f62319.execute(this.f62320);
        }
        this.f62321.add(c14600);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44618(C14600 c14600) {
        if (c14600.f45989 || this.f62323 == 0) {
            this.f62321.remove(c14600);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m44615(long j) {
        synchronized (this) {
            C14600 c14600 = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C14600 c14601 : this.f62321) {
                if (m44614(c14601, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c14601.f45992;
                    if (j3 > j2) {
                        c14600 = c14601;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f62325;
            if (j2 < j4 && i <= this.f62323) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f62324 = false;
                return -1L;
            }
            this.f62321.remove(c14600);
            C19822.m45603(c14600.m35248());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m44614(C14600 c14600, long j) {
        ArrayList arrayList = c14600.f45990;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C9052.m24178().mo24181(((C7889) reference).f26234, "A connection to " + c14600.m35250().f23785.f42479 + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                c14600.f45989 = true;
                if (arrayList.isEmpty()) {
                    c14600.f45992 = j - this.f62325;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
