package l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ܽ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17220 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f56114 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11999 f56115;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C17220(C11999 c11999) {
        this.f56115 = c11999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40440() {
        this.f56114 = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM30175;
        AbstractC11800 childViewHolder;
        C11999 c11999 = this.f56115;
        AbstractC16474 abstractC16474 = c11999.f38680;
        if (!this.f56114 || (viewM30175 = c11999.m30175(motionEvent)) == null || (childViewHolder = c11999.f38692.getChildViewHolder(viewM30175)) == null) {
            return;
        }
        if ((AbstractC16474.m39082(abstractC16474.mo9678(childViewHolder), c11999.f38692.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c11999.f38694;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c11999.f38672 = x;
                c11999.f38681 = y;
                c11999.f38683 = 0.0f;
                c11999.f38685 = 0.0f;
                if (abstractC16474.mo17826()) {
                    c11999.m30171(childViewHolder, 2);
                }
            }
        }
    }
}
