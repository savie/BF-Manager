package l;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f67252;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC14330 f67253;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final WeakReference f67254;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f67255;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextWatcher f67256;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, l.ܰۘ֫] */
    public C21044(View view, final RunnableC8501 runnableC8501) {
        this.f67252 = false;
        WeakReference weakReference = new WeakReference(view);
        this.f67254 = weakReference;
        ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ܰۘ֫
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                runnableC8501.run();
            }
        };
        this.f67253 = r4;
        C24028 c24028 = new C24028(runnableC8501);
        this.f67256 = c24028;
        View view2 = (View) weakReference.get();
        if (view2 == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(r4);
            this.f67255 = viewTreeObserver;
        }
        if (view2 instanceof TextView) {
            ((TextView) view2).addTextChangedListener(c24028);
            this.f67252 = true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m48095() {
        return (View) this.f67254.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m48094() {
        return this.f67254.get() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48093() {
        View view = (View) this.f67254.get();
        ViewTreeObserver viewTreeObserver = this.f67255;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.f67255.removeOnGlobalLayoutListener(this.f67253);
        }
        if (this.f67252 && (view instanceof TextView)) {
            ((TextView) view).removeTextChangedListener(this.f67256);
        }
    }
}
