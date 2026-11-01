package l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩻ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public final class C23823 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f77020 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4647 f77021;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C23823(C4647 c4647) {
        this.f77021 = c4647;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52501() {
        this.f77020 = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM12827;
        AbstractC12554 childViewHolder;
        C4647 c4647 = this.f77021;
        AbstractC11123 abstractC11123 = c4647.f16422;
        if (!this.f77020 || (viewM12827 = c4647.m12827(motionEvent)) == null || (childViewHolder = c4647.f16432.getChildViewHolder(viewM12827)) == null) {
            return;
        }
        C17492 c17492 = c4647.f16432;
        int iMo8538 = abstractC11123.mo8538(childViewHolder);
        int i = C5031.f17539;
        if ((AbstractC11123.m28049(iMo8538, c17492.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i2 = c4647.f16425;
            if (pointerId == i2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c4647.f16413 = x;
                c4647.f16417 = y;
                c4647.f16411 = 0.0f;
                c4647.f16436 = 0.0f;
                if (abstractC11123.mo8537()) {
                    c4647.m12823(childViewHolder, 2);
                }
            }
        }
    }
}
