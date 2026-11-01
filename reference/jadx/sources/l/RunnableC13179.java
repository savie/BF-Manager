package l;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.۬ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13179 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC4005 f43875;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f43876;

    public RunnableC13179(RunnableC4005 runnableC4005, Drawable drawable) {
        this.f43875 = runnableC4005;
        this.f43876 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        RunnableC4005 runnableC4005 = this.f43875;
        HashMap map = runnableC4005.f14850.f23007;
        C5417 c5417 = runnableC4005.f14851;
        if (((Future) map.remove(c5417)) == null || (drawable = this.f43876) == null || c5417.getCallback() == null) {
            return;
        }
        c5417.m14993(drawable);
    }
}
