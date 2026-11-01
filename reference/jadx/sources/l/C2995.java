package l;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۗۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public class C2995 extends C17381 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11244 = 0;

    /* JADX INFO: renamed from: ᩷᩶֫, reason: not valid java name and contains not printable characters */
    private static final short[] f11245;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11246;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static native void m8961();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m8960(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C2995) {
                ((C2995) parent).f11246 = true;
                return;
            }
        }
    }

    static {
        ApplicationC6132.m17119(51);
        f11245 = new short[]{9201, -2583, -2586, -2580, -2566, -2585, -2591, -2580, -2650, -2581, -2585, -2586, -2564, -2579, -2586, -2564, -2650, -2568, -2587, -2650, -2600, -2583, -2581, -2589, -2583, -2577, -2579, -2623, -2586, -2578, -2585, -2644, -2631, -2583, -2586, -2580, -2566, -2585, -2591, -2580, -2650, -2581, -2585, -2586, -2564, -2579, -2586, -2564, -2650, -2568, -2587, -2650, -2600, -2583, -2581, -2589, -2583, -2577, -2579, -2623, -2586, -2578, -2585, -2613, -2598, -2611, -2615, -2596, -2617, -2598, -2565, -2600, -2583, -2581, -2589, -2583, -2577, -2579, -2623, -2586, -2578, -2585, -2613, -2583, -2581, -2592, -2579, -2587, -2613, -2566, -2579, -2583, -2564, -2585, -2566, -2565, -2565, -2600, -2583, -2591, -2566, -2579, -2580, -2613, -2566, -2579, -2583, -2564, -2585, -2566, -2565, -2581, -2588, -2579, -2583, -2566, -2582, -2591, -2586, -2650, -2587, -2564, -2650, -2568, -2588, -2563, -2565};
        C4716.f16636.execute(new RunnableC1584());
        new Matrix();
    }

    public C2995(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2995(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        if (j == 160) {
            return false;
        }
        return super.postDelayed(runnable, j);
    }

    @Override // l.C17381, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                mode2 = 1073741824;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, mode2);
        }
        super.onMeasure(i, i2);
    }

    @Override // l.C17381, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11246) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f11246 = false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // l.C17381, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11246) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f11246 = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
