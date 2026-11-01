package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۘ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3583 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17695 f13177;

    public C3583(C17695 c17695) {
        this.f13177 = c17695;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        C19107 c19107 = this.f13177.f56191;
        if (c19107.f61728.isFinished()) {
            return false;
        }
        c19107.f61728.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C19107 c19107 = this.f13177.f56191;
        c19107.f61734 = 0.0f;
        if (c19107.f61714 == null) {
            return true;
        }
        if (c19107.f61705) {
            int i = ((int) (c19107.f61707.y / c19107.f61708.f48625)) + c19107.f61733;
            if (c19107.f61730 - 1 <= i && i <= c19107.f61711 + 1) {
                c19107.f61713.mo13841(c19107.f61714.m15426(c19107.f61729, c19107.f61730, c19107.f61710, c19107.f61711).trim());
            }
            c19107.m43902((MotionEvent) null);
            return true;
        }
        c19107.requestFocus();
        c19107.f61724.mo2926();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C19107 c19107 = this.f13177.f56191;
        if (c19107.f61714 == null) {
            return true;
        }
        float f3 = f2 + c19107.f61734;
        int i = (int) (f3 / c19107.f61708.f48625);
        c19107.f61734 = f3 - (c19107.f61708.f48625 * i);
        c19107.m43877(i);
        if (i < 0) {
            if (motionEvent2 == null || c19107.f61733 > (-c19107.f61714.m15433().m13572())) {
                return true;
            }
            C0883.m3557(c19107.f61709, (-f3) / c19107.getHeight(), motionEvent2.getX() / c19107.getWidth());
            c19107.postInvalidateOnAnimation();
            if (c19107.f61698.isFinished()) {
                return true;
            }
            c19107.f61698.onRelease();
            return true;
        }
        if (i <= 0 || motionEvent2 == null || c19107.f61733 < 0) {
            return true;
        }
        C0883.m3557(c19107.f61698, f3 / c19107.getHeight(), 1.0f - (motionEvent2.getX() / c19107.getWidth()));
        c19107.postInvalidateOnAnimation();
        if (c19107.f61709.isFinished()) {
            return true;
        }
        c19107.f61709.onRelease();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C19107 c19107 = this.f13177.f56191;
        c19107.performHapticFeedback(0);
        c19107.f61705 = false;
        c19107.m43902(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C17695 c17695 = this.f13177;
        C19107 c19107 = c17695.f56191;
        if (c19107.f61714 == null) {
            return true;
        }
        float f3 = 1.0f / c19107.f61708.f48625;
        c19107.f61728.fling(0, (int) Math.ceil(c19107.f61733 / f3), 0, (int) ((-f2) * 1.2f), 0, 0, (int) (-Math.ceil(c19107.f61714.m15433().m13572() / f3)), 0);
        c19107.post(new RunnableC21223(c17695, f3));
        return true;
    }
}
