package l;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13563 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44740;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f44741;

    public C13563(View view) {
        this.f44741 = new WeakReference(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f44740 = layoutParams != null ? layoutParams.width : -2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33157() {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.f44741.get();
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = this.f44740;
    }
}
