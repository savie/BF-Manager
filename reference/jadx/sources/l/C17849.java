package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ܽ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17849 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f58541;

    public C17849(C12628 c12628) {
        this.f58541 = c12628;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C12628 c12628 = this.f58541;
        C5917 c5917 = c12628.f40509;
        C15282 c15282 = c12628.f40530;
        int iM36658 = c15282.m36658(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c12628.m31378(), false);
        boolean zM36683 = c15282.m36683();
        c12628.requestFocus();
        if (c15282.m36655() && !c15282.m36677() && !zM36683 && C12628.m31346(c12628)) {
            c12628.m31345();
            c12628.invalidate();
            return true;
        }
        if (zM36683) {
            C12628.m31344(c12628);
            c12628.m31345();
            c12628.invalidate();
            return false;
        }
        if (c15282.m36655()) {
            int iM36659 = c15282.m36659(((long) ((int) motionEvent.getY())) + c12628.m31378(), motionEvent.getX());
            if (iM36659 < 0) {
                return false;
            }
            c5917.m17193(iM36659, c15282.m36668());
            c12628.m31367(iM36659);
            c12628.m31345();
            c12628.invalidate();
            return false;
        }
        if (c5917.m17206()) {
            if (c15282.m36677() || iM36658 < c5917.m17202() || iM36658 > c5917.m17208()) {
                c5917.m17193(iM36658, c15282.m36668());
                c12628.m31367(iM36658);
                c12628.m31385();
            } else {
                C12628.m31344(c12628);
            }
        } else {
            if (c12628.m31371() || c5917.m17202() != iM36658 || c5917.m17220() != c15282.m36668()) {
                c5917.m17193(iM36658, c15282.m36668());
                c12628.m31367(iM36658);
            } else if (c15282.m36677()) {
                c12628.m31367(iM36658);
            } else {
                C12628.m31341(c12628, c12628.m31367(iM36658));
            }
            c12628.m31385();
        }
        c12628.m31345();
        c12628.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C12628 c12628 = this.f58541;
        C5917 c5917 = c12628.f40509;
        C15282 c15282 = c12628.f40530;
        int iM36658 = c15282.m36658(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c12628.m31378(), false);
        boolean zM36683 = c15282.m36683();
        c12628.requestFocus();
        if (c15282.m36655() && !c15282.m36677() && !zM36683 && C12628.m31346(c12628)) {
            c12628.m31345();
            c12628.invalidate();
            return true;
        }
        if (zM36683) {
            c12628.m31345();
            c12628.invalidate();
            C12628.m31344(c12628);
            return true;
        }
        if (c15282.m36655()) {
            iM36658 = c15282.m36659(((long) ((int) motionEvent.getY())) + c12628.m31378(), motionEvent.getX());
        }
        if (iM36658 < 0 || iM36658 >= c5917.m17218()) {
            return false;
        }
        if (!c5917.m17206() || c15282.m36677() || iM36658 < c5917.m17202() || iM36658 > c5917.m17208()) {
            c5917.m17216(iM36658, iM36658);
        }
        c12628.m31345();
        c12628.invalidate();
        C12628.m31341(c12628, c12628.m31367(iM36658));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (onDoubleTap(motionEvent)) {
            this.f58541.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C12628 c12628 = this.f58541;
        c12628.requestFocus();
        long jM31378 = c12628.m31378() + ((long) Math.round(f2));
        long jM36675 = c12628.f40530.m36675();
        if (jM31378 < 0) {
            jM31378 = 0;
        } else if (jM31378 > jM36675) {
            jM31378 = jM36675;
        }
        c12628.m31348();
        c12628.m31359(jM31378);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C12628 c12628 = this.f58541;
        c12628.f40531.m23017(c12628.m31378(), (int) (-f2), c12628.f40530.m36675(), c12628.f40527);
        c12628.m31348();
        c12628.invalidate();
        return true;
    }
}
