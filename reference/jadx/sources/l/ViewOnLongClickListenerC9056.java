package l;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLongClickListenerC9056 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC9056 f30894;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC9056 f30895;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f30896;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f30897;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10467 f30898;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f30899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f30900;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f30901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30904;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final RunnableC8350 f30905 = new Runnable() { // from class: l.۠ᩴ
        @Override // java.lang.Runnable
        public final void run() {
            this.f28932.m23389(false);
        }
    };

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RunnableC19639 f30903 = new Runnable() { // from class: l.᩵ᩴ
        @Override // java.lang.Runnable
        public final void run() {
            this.f63061.m23388();
        }
    };

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30902 = true;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23386(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC9056 viewOnLongClickListenerC9056 = f30895;
        if (viewOnLongClickListenerC9056 != null && viewOnLongClickListenerC9056.f30901 == view) {
            m23387((ViewOnLongClickListenerC9056) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC9056 viewOnLongClickListenerC9057 = f30894;
            if (viewOnLongClickListenerC9057 != null && viewOnLongClickListenerC9057.f30901 == view) {
                viewOnLongClickListenerC9057.m23388();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC9056(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۠ᩴ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.᩵ᩴ] */
    public ViewOnLongClickListenerC9056(View view, CharSequence charSequence) {
        this.f30901 = view;
        this.f30900 = charSequence;
        this.f30897 = C3619.m10722(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f30904 = view.getWidth() / 2;
        this.f30896 = view.getHeight() / 2;
        m23389(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f30898 == null || !this.f30899) {
            View view2 = this.f30901;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f30902 = true;
                        m23388();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f30898 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.f30902) {
                        int iAbs = Math.abs(x - this.f30904);
                        int i = this.f30897;
                        if (iAbs > i || Math.abs(y - this.f30896) > i) {
                            this.f30904 = x;
                            this.f30896 = y;
                            this.f30902 = false;
                            m23387(this);
                        }
                    } else {
                        this.f30904 = x;
                        this.f30896 = y;
                        this.f30902 = false;
                        m23387(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m23388();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23389(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f30901;
        if (view.isAttachedToWindow()) {
            m23387((ViewOnLongClickListenerC9056) null);
            ViewOnLongClickListenerC9056 viewOnLongClickListenerC9056 = f30894;
            if (viewOnLongClickListenerC9056 != null) {
                viewOnLongClickListenerC9056.m23388();
            }
            f30894 = this;
            this.f30899 = z;
            C10467 c10467 = new C10467(view.getContext());
            this.f30898 = c10467;
            c10467.mo26444(this.f30901, this.f30904, this.f30896, this.f30899, this.f30900);
            view.addOnAttachStateChangeListener(this);
            if (this.f30899) {
                j2 = 2500;
            } else {
                int i = C5031.f17539;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = c.a;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC19639 runnableC19639 = this.f30903;
            view.removeCallbacks(runnableC19639);
            view.postDelayed(runnableC19639, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23388() {
        ViewOnLongClickListenerC9056 viewOnLongClickListenerC9056 = f30894;
        View view = this.f30901;
        if (viewOnLongClickListenerC9056 == this) {
            f30894 = null;
            C10467 c10467 = this.f30898;
            if (c10467 != null) {
                c10467.mo26443();
                this.f30898 = null;
                this.f30902 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f30895 == this) {
            m23387((ViewOnLongClickListenerC9056) null);
        }
        view.removeCallbacks(this.f30903);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23387(ViewOnLongClickListenerC9056 viewOnLongClickListenerC9056) {
        ViewOnLongClickListenerC9056 viewOnLongClickListenerC9057 = f30895;
        if (viewOnLongClickListenerC9057 != null) {
            viewOnLongClickListenerC9057.f30901.removeCallbacks(viewOnLongClickListenerC9057.f30905);
        }
        f30895 = viewOnLongClickListenerC9056;
        if (viewOnLongClickListenerC9056 != null) {
            viewOnLongClickListenerC9056.f30901.postDelayed(viewOnLongClickListenerC9056.f30905, ViewConfiguration.getLongPressTimeout());
        }
    }
}
