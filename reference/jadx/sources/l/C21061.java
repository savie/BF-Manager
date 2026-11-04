package l;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21061 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f67302 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1229 f67303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC23690 f67304;

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34769() {
    }

    public C21061(FutureC23690 futureC23690, C1229 c1229) {
        this.f67304 = futureC23690;
        this.f67303 = c1229;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ */
    public final void mo34768() {
        C1229 c1229 = this.f67303;
        AtomicBoolean atomicBoolean = this.f67302;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Fragment state persistence must wait in the background");
        }
        try {
            this.f67304.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (atomicBoolean.compareAndSet(false, true)) {
                c1229.m4466(e);
            }
        } catch (CancellationException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if ((e instanceof CancellationException) && atomicBoolean.compareAndSet(false, true)) {
                c1229.m4466(e);
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
