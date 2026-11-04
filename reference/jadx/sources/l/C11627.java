package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۧ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes4.dex */
public final class C11627 extends AbstractC25054 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f36468;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f36468.run();
    }

    public C11627(Runnable runnable) {
        this.f36468 = runnable;
    }
}
