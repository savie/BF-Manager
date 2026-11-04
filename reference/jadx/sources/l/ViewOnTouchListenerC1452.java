package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֨᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC1452 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f5078;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f5079;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f5080;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f5082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5228(View view) {
        ViewOnTouchListenerC1452 viewOnTouchListenerC1452 = new ViewOnTouchListenerC1452();
        viewOnTouchListenerC1452.f5081 = 0;
        viewOnTouchListenerC1452.f5080 = view;
        view.setOnTouchListener(viewOnTouchListenerC1452);
        viewOnTouchListenerC1452.f5083 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f5083;
        View view2 = this.f5080;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            view2.setPressed(true);
            this.f5079 = false;
            this.f5084 = false;
            this.f5082 = motionEvent.getX();
            this.f5078 = motionEvent.getY();
            final int i2 = this.f5081 + 1;
            this.f5081 = i2;
            view2.postDelayed(new Runnable() { // from class: l.۟᩷᩻
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnTouchListenerC1452.m5231(this.f26933, i2);
                }
            }, 150L);
            return true;
        }
        if (action == 1) {
            view2.setPressed(false);
            this.f5081++;
            if (!this.f5079 && !this.f5084) {
                view2.performClick();
            }
        } else if (action != 2) {
            if (action == 3) {
                view2.setPressed(false);
                this.f5081++;
                if (!this.f5079) {
                    view2.performClick();
                }
            }
        } else if (!this.f5079) {
            float f = i;
            if (Math.abs(motionEvent.getX() - this.f5082) >= f || Math.abs(motionEvent.getY() - this.f5078) >= f) {
                this.f5079 = true;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5231(final ViewOnTouchListenerC1452 viewOnTouchListenerC1452, final int i) {
        View view = viewOnTouchListenerC1452.f5080;
        if (i != viewOnTouchListenerC1452.f5081 || viewOnTouchListenerC1452.f5079) {
            return;
        }
        viewOnTouchListenerC1452.f5084 = true;
        view.performClick();
        view.postDelayed(new Runnable() { // from class: l.ᩳ᩷᩻
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC1452.m5229(this.f62526, i);
            }
        }, 350L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5229(ViewOnTouchListenerC1452 viewOnTouchListenerC1452, int i) {
        if (i != viewOnTouchListenerC1452.f5081 || viewOnTouchListenerC1452.f5079) {
            return;
        }
        viewOnTouchListenerC1452.f5080.performHapticFeedback(0);
        new RunnableC10400(viewOnTouchListenerC1452, i).run();
    }
}
