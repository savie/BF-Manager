package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20253 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map f65038 = C4681.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m46525(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C3099.m10083(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C12048 c12048 = (C12048) f65038.get(velocityTracker);
        if (c12048 != null) {
            return c12048.m30225(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46526(VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C12048 c12048 = (C12048) f65038.get(velocityTracker);
        if (c12048 != null) {
            c12048.m30226();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46527(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = f65038;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new C12048());
            }
            ((C12048) map.get(velocityTracker)).m30227(motionEvent);
        }
    }
}
