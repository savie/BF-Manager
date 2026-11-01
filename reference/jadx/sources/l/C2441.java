package l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۖۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2441 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f9754;

    public C2441(C13026 c13026, Context context) {
        this.f9754 = c13026;
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C13026 c13026 = this.f9754;
        if (c13026.isFocused()) {
            return false;
        }
        c13026.requestFocus();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C13026 c13026 = this.f9754;
        C16554 c16554 = c13026.f43455;
        int iM38959 = c16554.m38959(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c13026.m32235(), false);
        C13732 c13732 = c13026.f43452;
        if (c13732.m33475()) {
            if (c16554.m38970() || iM38959 < c13732.m33443() || iM38959 > c13732.m33465()) {
                c13732.m33449(iM38959, c16554.m38972());
                c13026.m32232(iM38959);
                c13026.m32240();
            } else {
                C13026.m32217(c13026);
            }
        } else {
            if (c13732.m33443() != iM38959 || c13732.m33469() != c16554.m38972()) {
                c13732.m33449(iM38959, c16554.m38972());
                c13026.m32232(iM38959);
            } else if (c16554.m38970()) {
                c13026.m32232(iM38959);
            } else {
                C13026.m32210(c13026, c13026.m32232(iM38959));
            }
            c13026.m32240();
        }
        c13026.m32216();
        c13026.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C13026 c13026 = this.f9754;
        C16554 c16554 = c13026.f43455;
        int iM38959 = c16554.m38959(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c13026.m32235(), false);
        C13732 c13732 = c13026.f43452;
        if (iM38959 >= c13732.m33442()) {
            return false;
        }
        if (!c13732.m33475() || c16554.m38970() || iM38959 < c13732.m33443() || iM38959 > c13732.m33465()) {
            c13732.m33467(iM38959, iM38959);
        }
        c13026.m32216();
        c13026.invalidate();
        C13026.m32210(c13026, c13026.m32232(iM38959));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (onDoubleTap(motionEvent)) {
            this.f9754.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C13026 c13026 = this.f9754;
        long jM32235 = c13026.m32235() + ((long) Math.round(f2));
        long jM38966 = c13026.f43455.m38966();
        if (jM32235 < 0) {
            jM32235 = 0;
        } else if (jM32235 > jM38966) {
            jM32235 = jM38966;
        }
        c13026.m32215();
        c13026.m32227(jM32235);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C13026 c13026 = this.f9754;
        c13026.f43449.m42854(c13026.m32235(), (int) (-f2), c13026.f43455.m38966(), c13026.f43453);
        c13026.m32215();
        c13026.invalidate();
        return true;
    }
}
