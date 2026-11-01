package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܽ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E177 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16842 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedList f53896 = new LinkedList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f53894 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f53895 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f53890 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f53891 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f53893 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53892 = false;

    public C16842() {
    }

    public C16842(int i) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39499() {
        synchronized (this.f53893) {
            if (this.f53894.get()) {
                return;
            }
            this.f53895.set(true);
            this.f53894.set(true);
            this.f53891 = System.currentTimeMillis();
            this.f53890 = 0L;
            this.f53896.clear();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39498() {
        synchronized (this.f53893) {
            this.f53894.set(false);
            this.f53896.clear();
            this.f53890 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39497(long j) {
        if (j <= 0 || !this.f53894.get()) {
            return;
        }
        synchronized (this.f53893) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f53896.isEmpty()) {
                C0613 c0613 = (C0613) this.f53896.getLast();
                if (jCurrentTimeMillis - c0613.f2665 < 50) {
                    c0613.f2664 += j;
                    m39495(jCurrentTimeMillis);
                    return;
                }
            }
            this.f53896.addLast(new C0613(jCurrentTimeMillis, j));
            m39495(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m39496() {
        long jMin;
        if (!this.f53894.get()) {
            return 0L;
        }
        synchronized (this.f53893) {
            m39495(System.currentTimeMillis());
            jMin = this.f53890;
            if (this.f53892) {
                jMin += Math.min(jMin / 12, 5242880L);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39495(long j) {
        if (j - this.f53891 < 500) {
            return;
        }
        this.f53891 = j;
        LinkedList linkedList = this.f53896;
        if (linkedList.isEmpty()) {
            this.f53890 = 0L;
            return;
        }
        long j2 = j - 2000;
        while (!linkedList.isEmpty() && ((C0613) linkedList.getFirst()).f2665 < j2) {
            linkedList.removeFirst();
        }
        long j3 = ((C0613) linkedList.getFirst()).f2665;
        Iterator it = linkedList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C0613) it.next()).f2664;
        }
        long j5 = j - j3;
        AtomicBoolean atomicBoolean = this.f53895;
        if (atomicBoolean.get()) {
            if (j5 < 200) {
                this.f53890 = 0L;
                this.f53891 = j - 400;
                return;
            }
            atomicBoolean.set(false);
        }
        if (j5 == 0) {
            this.f53890 = 0L;
            return;
        }
        long j6 = (j4 * 1000) / j5;
        long j7 = this.f53890;
        if (j7 == 0 || j6 > j7) {
            this.f53890 = j6;
        } else {
            this.f53890 = Math.round((j7 * 0.19999999999999996d) + (j6 * 0.8d));
        }
        if (this.f53890 < 0) {
            this.f53890 = 0L;
        }
    }
}
