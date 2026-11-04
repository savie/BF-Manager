package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6BV */
/* JADX INFO: loaded from: classes.dex */
public final class C24601 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4463 f79694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6701 f79695;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f79696;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f79697;

    public C24601(C4463 c4463, C6701 c6701, boolean z) {
        this.f79694 = c4463;
        this.f79695 = c6701;
        this.f79696 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54925(C24601 c24601) throws Throwable {
        boolean z;
        long jNanoTime;
        boolean z2 = false;
        C21990 c21990M27505 = null;
        try {
            synchronized (c24601.f79694.f15972) {
                z = false;
                while (true) {
                    try {
                        C4463.m14159(c24601.f79694);
                        if (c24601.f79694.f15970 == c24601) {
                            break;
                        }
                        if (c21990M27505 == null) {
                            C4463 c4463 = c24601.f79694;
                            if (c4463.f15970 == null) {
                                Object first = c4463.f15973.getFirst();
                                C6701 c6701 = c24601.f79695;
                                if (first == c6701) {
                                    boolean z3 = true;
                                    for (C24601 c24602 : c6701.f22293) {
                                        if (c24602 == c24601) {
                                            z3 = false;
                                        } else {
                                            boolean z4 = c24601.f79696;
                                            if ((z4 || !c24602.f79696) && (!z3 || c24602.f79696 != z4)) {
                                            }
                                        }
                                    }
                                }
                                c21990M27505 = C10801.m27505();
                                break;
                            }
                            if (c4463.f15970 != c24601) {
                                c21990M27505 = C10801.m27505();
                                break;
                            }
                        }
                        if (c24601.f79694.f15970 == null) {
                            long j = ((C6701) c24601.f79694.f15973.getFirst()).f22292;
                            ((C10792) c24601.f79694.f15971).getClass();
                            jNanoTime = j - System.nanoTime();
                        } else {
                            jNanoTime = 0;
                        }
                        if (jNanoTime > 0) {
                            try {
                                c24601.f79694.f15972.wait(TimeUnit.NANOSECONDS.toMillis(jNanoTime) + 1);
                            } catch (InterruptedException unused) {
                                z = true;
                            }
                        } else {
                            c24601.f79694.f15972.wait();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z;
                            if (c21990M27505 != null) {
                                c21990M27505.close();
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
            }
            if (c21990M27505 != null) {
                c21990M27505.close();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f79694.f15972) {
            if (this.f79697) {
                return;
            }
            this.f79697 = true;
            this.f79695.f22293.remove(this);
            if (this.f79695.f22293.isEmpty()) {
                this.f79694.f15973.remove(this.f79695);
            }
            if (this.f79694.f15970 == this) {
                this.f79694.f15970 = null;
            }
            this.f79694.f15972.notifyAll();
        }
    }
}
