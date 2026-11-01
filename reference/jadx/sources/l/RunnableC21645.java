package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩸ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21645 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18117 f70178;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f70179;

    public RunnableC21645(C18117 c18117, Drawable drawable) {
        this.f70178 = c18117;
        this.f70179 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70178.invalidateDrawable(this.f70179);
    }
}
