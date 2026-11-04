package l;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12745 implements InterfaceC18931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11999 f40807;

    public C12745(C11999 c11999) {
        this.f40807 = c11999;
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9319(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C11999 c11999 = this.f40807;
        c11999.f38676.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C23188 c23188 = null;
        if (actionMasked == 0) {
            c11999.f38694 = motionEvent.getPointerId(0);
            c11999.f38672 = motionEvent.getX();
            c11999.f38681 = motionEvent.getY();
            VelocityTracker velocityTracker = c11999.f38679;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c11999.f38679 = VelocityTracker.obtain();
            if (c11999.f38677 == null) {
                ArrayList arrayList = c11999.f38673;
                if (!arrayList.isEmpty()) {
                    View viewM30175 = c11999.m30175(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C23188 c23189 = (C23188) arrayList.get(size);
                        if (c23189.f75150.itemView == viewM30175) {
                            c23188 = c23189;
                            break;
                        }
                    }
                }
                if (c23188 != null) {
                    AbstractC11800 abstractC11800 = c23188.f75150;
                    c11999.f38672 -= c23188.f75145;
                    c11999.f38681 -= c23188.f75146;
                    c11999.m30172(abstractC11800, true);
                    if (c11999.f38696.remove(abstractC11800.itemView)) {
                        c11999.f38680.mo25773(c11999.f38692, abstractC11800);
                    }
                    c11999.m30171(abstractC11800, c23188.f75139);
                    c11999.m30177(c11999.f38697, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c11999.f38694 = -1;
            c11999.m30171((AbstractC11800) null, 0);
        } else {
            int i = c11999.f38694;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c11999.m30169(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c11999.f38679;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c11999.f38677 != null;
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ۙ */
    public final void mo9314(MotionEvent motionEvent) {
        C11999 c11999 = this.f40807;
        Runnable runnable = c11999.f38682;
        c11999.f38676.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c11999.f38679;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c11999.f38694 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c11999.f38694);
        if (iFindPointerIndex >= 0) {
            c11999.m30169(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC11800 abstractC11800 = c11999.f38677;
        if (abstractC11800 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c11999.m30177(c11999.f38697, iFindPointerIndex, motionEvent);
                    c11999.m30170(abstractC11800);
                    c11999.f38692.removeCallbacks(runnable);
                    ((RunnableC14982) runnable).run();
                    c11999.f38692.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c11999.f38694) {
                    c11999.f38694 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c11999.m30177(c11999.f38697, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c11999.f38679;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c11999.m30171((AbstractC11800) null, 0);
        c11999.f38694 = -1;
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ۙ */
    public final void mo9315(boolean z) {
        if (z) {
            this.f40807.m30171((AbstractC11800) null, 0);
        }
    }
}
