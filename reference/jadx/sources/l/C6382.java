package l;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۛ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1K9 */
/* JADX INFO: loaded from: classes3.dex */
public class C6382 extends AbstractC8956 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f21691 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f21692 = new AtomicInteger();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f21693 = new AtomicInteger();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f21690 = new ConcurrentLinkedQueue();

    public C6382() {
        new Thread(new RunnableC19814(4, this)).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17518(C6382 c6382) {
        while (!c6382.f21691) {
            SystemClock.sleep(100L);
            while (!c6382.f21690.isEmpty()) {
                Runnable runnable = (Runnable) c6382.f21690.poll();
                if (runnable != null) {
                    runnable.run();
                    c6382.f21693.incrementAndGet();
                }
            }
        }
        while (!c6382.f21690.isEmpty()) {
            Runnable runnable2 = (Runnable) c6382.f21690.poll();
            if (runnable2 != null) {
                runnable2.run();
                c6382.f21693.incrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17520(Runnable runnable) {
        this.f21692.incrementAndGet();
        this.f21690.add(runnable);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m17521() {
        while (m17519()) {
            SystemClock.sleep(10L);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m17519() {
        if (this.f21691) {
            return false;
        }
        return (this.f21690.isEmpty() && this.f21692.get() == this.f21693.get()) ? false : true;
    }

    @Override // l.AbstractC8956
    /* JADX INFO: renamed from: ۨ */
    public final void mo17355() {
        this.f21691 = true;
    }
}
