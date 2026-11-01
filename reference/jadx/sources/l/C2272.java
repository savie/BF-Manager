package l;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۖۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2272 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextWatcher f8115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8116;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WeakReference f8117;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC11446 f8118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f8119;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, l.ۨۘۘ] */
    public C2272(View view, final RunnableC21384 runnableC21384) {
        this.f8116 = false;
        WeakReference weakReference = new WeakReference(view);
        this.f8117 = weakReference;
        ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ۨۘۘ
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                runnableC21384.run();
            }
        };
        this.f8118 = r4;
        C4389 c4389 = new C4389(runnableC21384);
        this.f8115 = c4389;
        View view2 = (View) weakReference.get();
        if (view2 == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(r4);
            this.f8119 = viewTreeObserver;
        }
        if (view2 instanceof TextView) {
            ((TextView) view2).addTextChangedListener(c4389);
            this.f8116 = true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m6971() {
        return (View) this.f8117.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6970() {
        return this.f8117.get() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6969() {
        View view = (View) this.f8117.get();
        ViewTreeObserver viewTreeObserver = this.f8119;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.f8119.removeOnGlobalLayoutListener(this.f8118);
        }
        if (this.f8116 && (view instanceof TextView)) {
            ((TextView) view).removeTextChangedListener(this.f8115);
        }
    }
}
