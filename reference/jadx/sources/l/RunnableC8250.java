package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۟᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8250 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19437 f27133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f27134;

    public RunnableC8250(C19437 c19437, Drawable drawable) {
        this.f27133 = c19437;
        this.f27134 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27133.invalidateDrawable(this.f27134);
    }
}
