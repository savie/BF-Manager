package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ܰۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: TIXB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14286 extends FrameLayout {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10139 f45113;

    public C14286(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C14286(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34694(C10139 c10139) {
        this.f45113 = c10139;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10139 c10139 = this.f45113;
        boolean z = c10139 != null && c10139.m26203();
        C10139 c101310 = this.f45113;
        if (c101310 == null || !c101310.m26202(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }
}
