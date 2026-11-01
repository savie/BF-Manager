package l;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12255 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f41002 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0652 f41003;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC12075 f41004;

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo30475() {
    }

    public C12255(FutureC12075 futureC12075, C0652 c0652) {
        this.f41004 = futureC12075;
        this.f41003 = c0652;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30474() {
        C0652 c0652 = this.f41003;
        AtomicBoolean atomicBoolean = this.f41002;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Fragment state persistence must wait in the background");
        }
        try {
            this.f41004.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (atomicBoolean.compareAndSet(false, true)) {
                c0652.m2969((Throwable) e);
            }
        } catch (CancellationException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if ((e instanceof CancellationException) && atomicBoolean.compareAndSet(false, true)) {
                c0652.m2969(e);
            }
        } catch (ExecutionException e3) {
            e = e3;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof CancellationException) {
            }
        }
    }
}
