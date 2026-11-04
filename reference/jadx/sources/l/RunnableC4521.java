package l;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۘ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4521 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14961 f16106;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f16107;

    public RunnableC4521(RunnableC14961 runnableC14961, Drawable drawable) {
        this.f16106 = runnableC14961;
        this.f16107 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        RunnableC14961 runnableC14961 = this.f16106;
        HashMap map = runnableC14961.f48872.f69196;
        C12724 c12724 = runnableC14961.f48873;
        if (((Future) map.remove(c12724)) == null || (drawable = this.f16107) == null || c12724.getCallback() == null) {
            return;
        }
        c12724.m31537(drawable);
    }
}
