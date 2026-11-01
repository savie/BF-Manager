package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8226 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map f28627 = C0561.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m21539(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C18809.m43382(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C19515 c19515 = (C19515) f28627.get(velocityTracker);
        if (c19515 != null) {
            return c19515.m44575(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21540(VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C19515 c19515 = (C19515) f28627.get(velocityTracker);
        if (c19515 != null) {
            c19515.m44576();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21541(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = f28627;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new C19515());
            }
            ((C19515) map.get(velocityTracker)).m44577(motionEvent);
        }
    }
}
