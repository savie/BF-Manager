package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16090 extends TouchDelegate {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f52028;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f52029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Rect f52030;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f52031;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52032;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f52033;

    public C16090(View view, Rect rect, Rect rect2) {
        super(rect, view);
        this.f52028 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f52033 = new Rect();
        this.f52030 = new Rect();
        this.f52029 = new Rect();
        m38117(rect, rect2);
        this.f52031 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38117(Rect rect, Rect rect2) {
        this.f52033.set(rect);
        Rect rect3 = this.f52030;
        rect3.set(rect);
        int i = this.f52028;
        rect3.inset(-i, -i);
        this.f52029.set(rect2);
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
                z2 = this.f52032;
                if (z2 && !this.f52030.contains(x, y)) {
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                z2 = this.f52032;
                this.f52032 = false;
            }
            z3 = z2;
            z2 = z3;
            z = true;
        } else if (this.f52033.contains(x, y)) {
            this.f52032 = true;
            z2 = z3;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        Rect rect = this.f52029;
        View view = this.f52031;
        if (z && !rect.contains(x, y)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
