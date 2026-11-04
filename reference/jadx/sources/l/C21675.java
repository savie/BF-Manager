package l;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.᩶᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes.dex */
public final class C21675 extends AbstractC6759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3029 f69193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Handler f69194;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f69195;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f69196;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExecutorService f69197;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f69198;

    public C21675(C24659 c24659) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f69196 = new HashMap(2);
        this.f69197 = c24659.f79822;
        this.f69195 = c24659.f79821;
        this.f69198 = c24659.f79823;
        this.f69193 = c24659.f79819;
        this.f69194 = handler;
    }

    @Override // l.AbstractC6759
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18885(C12724 c12724) {
        HashMap map = this.f69196;
        if (((Future) map.get(c12724)) == null) {
            map.put(c12724, this.f69197.submit(new RunnableC14961(this, c12724)));
        }
    }

    @Override // l.AbstractC6759
    /* JADX INFO: renamed from: ۙ */
    public final void mo18884(C12724 c12724) {
        Future future = (Future) this.f69196.remove(c12724);
        if (future != null) {
            future.cancel(true);
        }
        this.f69194.removeCallbacksAndMessages(c12724);
    }
}
