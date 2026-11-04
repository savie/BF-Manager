package l;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3890 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f13257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f13258;

    public C3890(View view) {
        this.f13258 = new WeakReference(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f13257 = layoutParams != null ? layoutParams.width : -2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12527() {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.f13258.get();
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = this.f13257;
    }
}
