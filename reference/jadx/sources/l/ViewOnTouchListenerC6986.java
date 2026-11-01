package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۜ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC6986 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f23499;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f23500;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23501;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23502;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f23503;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f23505;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18766(View view) {
        ViewOnTouchListenerC6986 viewOnTouchListenerC6986 = new ViewOnTouchListenerC6986();
        viewOnTouchListenerC6986.f23502 = 0;
        viewOnTouchListenerC6986.f23500 = view;
        view.setOnTouchListener(viewOnTouchListenerC6986);
        viewOnTouchListenerC6986.f23504 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f23504;
        View view2 = this.f23500;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            view2.setPressed(true);
            this.f23501 = false;
            this.f23505 = false;
            this.f23499 = motionEvent.getX();
            this.f23503 = motionEvent.getY();
            final int i2 = this.f23502 + 1;
            this.f23502 = i2;
            view2.postDelayed(new Runnable() { // from class: l.֨᩶ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnTouchListenerC6986.m18769(this.f5667, i2);
                }
            }, 150L);
            return true;
        }
        if (action == 1) {
            view2.setPressed(false);
            this.f23502++;
            if (!this.f23501 && !this.f23505) {
                view2.performClick();
            }
        } else if (action != 2) {
            if (action == 3) {
                view2.setPressed(false);
                this.f23502++;
                if (!this.f23501) {
                    view2.performClick();
                }
            }
        } else if (!this.f23501) {
            float f = i;
            if (Math.abs(motionEvent.getX() - this.f23499) >= f || Math.abs(motionEvent.getY() - this.f23503) >= f) {
                this.f23501 = true;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18769(final ViewOnTouchListenerC6986 viewOnTouchListenerC6986, final int i) {
        View view = viewOnTouchListenerC6986.f23500;
        if (i != viewOnTouchListenerC6986.f23502 || viewOnTouchListenerC6986.f23501) {
            return;
        }
        viewOnTouchListenerC6986.f23505 = true;
        view.performClick();
        view.postDelayed(new Runnable() { // from class: l.۬᩶ۜ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC6986.m18767(this.f44249, i);
            }
        }, 350L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18767(ViewOnTouchListenerC6986 viewOnTouchListenerC6986, int i) {
        if (i != viewOnTouchListenerC6986.f23502 || viewOnTouchListenerC6986.f23501) {
            return;
        }
        viewOnTouchListenerC6986.f23500.performHapticFeedback(0);
        new RunnableC4163(viewOnTouchListenerC6986, i).run();
    }
}
