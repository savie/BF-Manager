package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܳ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes4.dex */
public final class C14529 extends AbstractC1827 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f47591;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f47591.run();
    }

    public C14529(Runnable runnable) {
        this.f47591 = runnable;
    }
}
