package l;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DO */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLongClickListenerC14898 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC14898 f48663;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC14898 f48664;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21612 f48666;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f48667;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f48668;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f48670;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f48671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48674;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final RunnableC24596 f48669 = new Runnable() { // from class: l.᩺᩹
        @Override // java.lang.Runnable
        public final void run() {
            this.f79685.m35850(false);
        }
    };

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC4458 f48673 = new Runnable() { // from class: l.ۘ᩹
        @Override // java.lang.Runnable
        public final void run() {
            this.f15955.m35849();
        }
    };

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48665 = true;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35847(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC14898 viewOnLongClickListenerC14898 = f48663;
        if (viewOnLongClickListenerC14898 != null && viewOnLongClickListenerC14898.f48671 == view) {
            m35848((ViewOnLongClickListenerC14898) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC14898 viewOnLongClickListenerC14899 = f48664;
            if (viewOnLongClickListenerC14899 != null && viewOnLongClickListenerC14899.f48671 == view) {
                viewOnLongClickListenerC14899.m35849();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC14898(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩺᩹] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۘ᩹] */
    public ViewOnLongClickListenerC14898(View view, CharSequence charSequence) {
        this.f48671 = view;
        this.f48667 = charSequence;
        this.f48670 = C5512.m16413(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f48674 = view.getWidth() / 2;
        this.f48672 = view.getHeight() / 2;
        m35850(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f48666 == null || !this.f48668) {
            View view2 = this.f48671;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f48665 = true;
                        m35849();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f48666 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.f48665) {
                        int iAbs = Math.abs(x - this.f48674);
                        int i = this.f48670;
                        if (iAbs > i || Math.abs(y - this.f48672) > i) {
                            this.f48674 = x;
                            this.f48672 = y;
                            this.f48665 = false;
                            m35848(this);
                        }
                    } else {
                        this.f48674 = x;
                        this.f48672 = y;
                        this.f48665 = false;
                        m35848(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m35849();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35850(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f48671;
        if (view.isAttachedToWindow()) {
            m35848((ViewOnLongClickListenerC14898) null);
            ViewOnLongClickListenerC14898 viewOnLongClickListenerC14898 = f48664;
            if (viewOnLongClickListenerC14898 != null) {
                viewOnLongClickListenerC14898.m35849();
            }
            f48664 = this;
            this.f48668 = z;
            C21612 c21612 = new C21612(view.getContext());
            this.f48666 = c21612;
            c21612.mo4706(this.f48671, this.f48674, this.f48672, this.f48668, this.f48667);
            view.addOnAttachStateChangeListener(this);
            if (this.f48668) {
                j2 = 2500;
            } else {
                int i = C22666.f73603;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = c.a;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC4458 runnableC4458 = this.f48673;
            view.removeCallbacks(runnableC4458);
            view.postDelayed(runnableC4458, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35849() {
        ViewOnLongClickListenerC14898 viewOnLongClickListenerC14898 = f48664;
        View view = this.f48671;
        if (viewOnLongClickListenerC14898 == this) {
            f48664 = null;
            C21612 c21612 = this.f48666;
            if (c21612 != null) {
                c21612.mo4704();
                this.f48666 = null;
                this.f48665 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f48663 == this) {
            m35848((ViewOnLongClickListenerC14898) null);
        }
        view.removeCallbacks(this.f48673);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35848(ViewOnLongClickListenerC14898 viewOnLongClickListenerC14898) {
        ViewOnLongClickListenerC14898 viewOnLongClickListenerC14899 = f48663;
        if (viewOnLongClickListenerC14899 != null) {
            viewOnLongClickListenerC14899.f48671.removeCallbacks(viewOnLongClickListenerC14899.f48669);
        }
        f48663 = viewOnLongClickListenerC14898;
        if (viewOnLongClickListenerC14898 != null) {
            viewOnLongClickListenerC14898.f48671.postDelayed(viewOnLongClickListenerC14898.f48669, ViewConfiguration.getLongPressTimeout());
        }
    }
}
