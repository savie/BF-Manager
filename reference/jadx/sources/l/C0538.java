package l;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0538 implements InterfaceC4086 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4647 f2292;

    public C0538(C4647 c4647) {
        this.f2292 = c4647;
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2548(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C4647 c4647 = this.f2292;
        c4647.f16424.m26793(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1949 c1949 = null;
        if (actionMasked == 0) {
            c4647.f16425 = motionEvent.getPointerId(0);
            c4647.f16413 = motionEvent.getX();
            c4647.f16417 = motionEvent.getY();
            VelocityTracker velocityTracker = c4647.f16416;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c4647.f16416 = VelocityTracker.obtain();
            if (c4647.f16421 == null) {
                ArrayList arrayList = c4647.f16419;
                if (!arrayList.isEmpty()) {
                    View viewM12827 = c4647.m12827(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1949 c19410 = (C1949) arrayList.get(size);
                        if (c19410.f7349.itemView == viewM12827) {
                            c1949 = c19410;
                            break;
                        }
                    }
                }
                if (c1949 != null) {
                    AbstractC12554 abstractC12554 = c1949.f7349;
                    c4647.f16413 -= c1949.f7346;
                    c4647.f16417 -= c1949.f7347;
                    c4647.m12824(abstractC12554, true);
                    if (c4647.f16431.remove(abstractC12554.itemView)) {
                        c4647.f16422.mo28055(c4647.f16432, abstractC12554);
                    }
                    c4647.m12823(abstractC12554, c1949.f7340);
                    c4647.m12829(c4647.f16418, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c4647.f16425 = -1;
            c4647.m12823((AbstractC12554) null, 0);
        } else {
            int i = c4647.f16425;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c4647.m12821(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c4647.f16416;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c4647.f16421 != null;
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2546(MotionEvent motionEvent) {
        C4647 c4647 = this.f2292;
        Runnable runnable = c4647.f16420;
        c4647.f16424.m26793(motionEvent);
        VelocityTracker velocityTracker = c4647.f16416;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c4647.f16425 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c4647.f16425);
        if (iFindPointerIndex >= 0) {
            c4647.m12821(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC12554 abstractC12554 = c4647.f16421;
        if (abstractC12554 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c4647.m12829(c4647.f16418, iFindPointerIndex, motionEvent);
                    c4647.m12822(abstractC12554);
                    c4647.f16432.removeCallbacks(runnable);
                    ((RunnableC20295) runnable).run();
                    c4647.f16432.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c4647.f16425) {
                    c4647.f16425 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c4647.m12829(c4647.f16418, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c4647.f16416;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c4647.m12823((AbstractC12554) null, 0);
        c4647.f16425 = -1;
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2547(boolean z) {
        if (z) {
            this.f2292.m12823((AbstractC12554) null, 0);
        }
    }
}
