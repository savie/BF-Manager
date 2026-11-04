package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ܿۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18276 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1123 f59624;

    public C18276(C1123 c1123) {
        this.f59624 = c1123;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        C8580 c8580 = this.f59624.f4184;
        if (c8580.f28042.isFinished()) {
            return false;
        }
        c8580.f28042.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C8580 c8580 = this.f59624.f4184;
        c8580.f28044 = 0.0f;
        if (c8580.f28020 == null) {
            return true;
        }
        if (c8580.f28025) {
            int i = ((int) (c8580.f28033.y / c8580.f28035.f61624)) + c8580.f28024;
            if (c8580.f28050 - 1 <= i && i <= c8580.f28036 + 1) {
                c8580.f28027.mo23818(c8580.f28020.m43255(c8580.f28055, c8580.f28050, c8580.f28023, c8580.f28036).trim());
            }
            c8580.m23060((MotionEvent) null);
            return true;
        }
        c8580.requestFocus();
        c8580.f28018.mo33707();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8580 c8580 = this.f59624.f4184;
        if (c8580.f28020 == null) {
            return true;
        }
        float f3 = f2 + c8580.f28044;
        int i = (int) (f3 / c8580.f28035.f61624);
        c8580.f28044 = f3 - (c8580.f28035.f61624 * i);
        c8580.m23035(i);
        if (i < 0) {
            if (motionEvent2 == null || c8580.f28024 > (-c8580.f28020.m43268().m54888())) {
                return true;
            }
            C19577.m45178(c8580.f28056, (-f3) / c8580.getHeight(), motionEvent2.getX() / c8580.getWidth());
            c8580.postInvalidateOnAnimation();
            if (c8580.f28045.isFinished()) {
                return true;
            }
            c8580.f28045.onRelease();
            return true;
        }
        if (i <= 0 || motionEvent2 == null || c8580.f28024 < 0) {
            return true;
        }
        C19577.m45178(c8580.f28045, f3 / c8580.getHeight(), 1.0f - (motionEvent2.getX() / c8580.getWidth()));
        c8580.postInvalidateOnAnimation();
        if (c8580.f28056.isFinished()) {
            return true;
        }
        c8580.f28056.onRelease();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C8580 c8580 = this.f59624.f4184;
        c8580.performHapticFeedback(0);
        c8580.f28025 = false;
        c8580.m23060(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1123 c1123 = this.f59624;
        C8580 c8580 = c1123.f4184;
        if (c8580.f28020 == null) {
            return true;
        }
        float f3 = 1.0f / c8580.f28035.f61624;
        c8580.f28042.fling(0, (int) Math.ceil(c8580.f28024 / f3), 0, (int) ((-f2) * 1.2f), 0, 0, (int) (-Math.ceil(c8580.f28020.m43268().m54888() / f3)), 0);
        c8580.post(new RunnableC10071(c1123, f3));
        return true;
    }
}
