package l;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1K9 */
/* JADX INFO: loaded from: classes4.dex */
public class C12318 extends AbstractC13213 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f39587 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicInteger f39588 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AtomicInteger f39585 = new AtomicInteger();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f39586 = new ConcurrentLinkedQueue();

    public C12318() {
        new Thread(new RunnableC4021(3, this)).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30722(C12318 c12318) {
        while (!c12318.f39587) {
            SystemClock.sleep(100L);
            while (!c12318.f39586.isEmpty()) {
                Runnable runnable = (Runnable) c12318.f39586.poll();
                if (runnable != null) {
                    runnable.run();
                    c12318.f39585.incrementAndGet();
                }
            }
        }
        while (!c12318.f39586.isEmpty()) {
            Runnable runnable2 = (Runnable) c12318.f39586.poll();
            if (runnable2 != null) {
                runnable2.run();
                c12318.f39585.incrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30723(Runnable runnable) {
        this.f39588.incrementAndGet();
        this.f39586.add(runnable);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30724() {
        while (m30725()) {
            SystemClock.sleep(10L);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m30725() {
        if (this.f39587) {
            return false;
        }
        return (this.f39586.isEmpty() && this.f39588.get() == this.f39585.get()) ? false : true;
    }

    @Override // l.AbstractC13213
    /* JADX INFO: renamed from: ۤ */
    public final void mo6417() {
        this.f39587 = true;
    }
}
