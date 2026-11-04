package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E177 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12919 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedList f41306 = new LinkedList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f41304 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f41308 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f41305 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f41309 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f41307 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f41303 = false;

    public C12919() {
    }

    public C12919(int i) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31997() {
        synchronized (this.f41307) {
            if (this.f41304.get()) {
                return;
            }
            this.f41308.set(true);
            this.f41304.set(true);
            this.f41309 = System.currentTimeMillis();
            this.f41305 = 0L;
            this.f41306.clear();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31996() {
        synchronized (this.f41307) {
            this.f41304.set(false);
            this.f41306.clear();
            this.f41305 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31995(long j) {
        if (j <= 0 || !this.f41304.get()) {
            return;
        }
        synchronized (this.f41307) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f41306.isEmpty()) {
                C15156 c15156 = (C15156) this.f41306.getLast();
                if (jCurrentTimeMillis - c15156.f49448 < 50) {
                    c15156.f49447 += j;
                    m31993(jCurrentTimeMillis);
                    return;
                }
            }
            this.f41306.addLast(new C15156(jCurrentTimeMillis, j));
            m31993(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m31994() {
        long jMin;
        if (!this.f41304.get()) {
            return 0L;
        }
        synchronized (this.f41307) {
            m31993(System.currentTimeMillis());
            jMin = this.f41305;
            if (this.f41303) {
                jMin += Math.min(jMin / 12, 5242880L);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31993(long j) {
        if (j - this.f41309 < 500) {
            return;
        }
        this.f41309 = j;
        LinkedList linkedList = this.f41306;
        if (linkedList.isEmpty()) {
            this.f41305 = 0L;
            return;
        }
        long j2 = j - 2000;
        while (!linkedList.isEmpty() && ((C15156) linkedList.getFirst()).f49448 < j2) {
            linkedList.removeFirst();
        }
        long j3 = ((C15156) linkedList.getFirst()).f49448;
        Iterator it = linkedList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C15156) it.next()).f49447;
        }
        long j5 = j - j3;
        AtomicBoolean atomicBoolean = this.f41308;
        if (atomicBoolean.get()) {
            if (j5 < 200) {
                this.f41305 = 0L;
                this.f41309 = j - 400;
                return;
            }
            atomicBoolean.set(false);
        }
        if (j5 == 0) {
            this.f41305 = 0L;
            return;
        }
        long j6 = (j4 * 1000) / j5;
        long j7 = this.f41305;
        if (j7 == 0 || j6 > j7) {
            this.f41305 = j6;
        } else {
            this.f41305 = Math.round((j7 * 0.19999999999999996d) + (j6 * 0.8d));
        }
        if (this.f41305 < 0) {
            this.f41305 = 0L;
        }
    }
}
