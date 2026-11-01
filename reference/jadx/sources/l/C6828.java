package l;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۜܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6828 extends AbstractC22351 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f23005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8946 f23006;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f23007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Handler f23008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f23009;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f23010;

    public C6828(C1183 c1183) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f23007 = new HashMap(2);
        this.f23009 = c1183.f5260;
        this.f23010 = c1183.f5258;
        this.f23005 = c1183.f5256;
        this.f23006 = c1183.f5257;
        this.f23008 = handler;
    }

    @Override // l.AbstractC22351
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo18438(C5417 c5417) {
        HashMap map = this.f23007;
        if (((Future) map.get(c5417)) == null) {
            map.put(c5417, this.f23009.submit(new RunnableC4005(this, c5417)));
        }
    }

    @Override // l.AbstractC22351
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18437(C5417 c5417) {
        Future future = (Future) this.f23007.remove(c5417);
        if (future != null) {
            future.cancel(true);
        }
        this.f23008.removeCallbacksAndMessages(c5417);
    }
}
