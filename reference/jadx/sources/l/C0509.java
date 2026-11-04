package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0509 extends TouchDelegate {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f2188;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f2189;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Rect f2190;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f2191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2193;

    public C0509(View view, Rect rect, Rect rect2) {
        super(rect, view);
        this.f2193 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2190 = new Rect();
        this.f2191 = new Rect();
        this.f2188 = new Rect();
        m2476(rect, rect2);
        this.f2189 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2476(Rect rect, Rect rect2) {
        this.f2190.set(rect);
        Rect rect3 = this.f2191;
        rect3.set(rect);
        int i = this.f2193;
        rect3.inset(-i, -i);
        this.f2188.set(rect2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f2192;
                if (z2 && !this.f2191.contains(x, y)) {
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                z2 = this.f2192;
                this.f2192 = false;
            }
            z3 = z2;
            z2 = z3;
            z = true;
        } else if (this.f2190.contains(x, y)) {
            this.f2192 = true;
            z2 = z3;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        Rect rect = this.f2188;
        View view = this.f2189;
        if (z && !rect.contains(x, y)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
