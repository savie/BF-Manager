package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۘܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C4293 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21447 f15566;

    public C4293(C21447 c21447) {
        this.f15566 = c21447;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C21447 c21447 = this.f15566;
        c21447.f68425 = C21447.m48791(x, y, c21447);
        c21447.f68404 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C21447 c21447 = this.f15566;
        if (!c21447.f68422 && !c21447.f68404) {
            c21447.f68404 = c21447.f68425 && Math.abs(motionEvent2.getY() - motionEvent.getY()) > Math.abs(motionEvent2.getX() - motionEvent.getX());
            if (!c21447.f68404) {
                C21447.m48775(c21447, motionEvent);
            }
        }
        return c21447.f68422;
    }
}
