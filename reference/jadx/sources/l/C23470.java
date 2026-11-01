package l;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.᩻ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAMT */
/* JADX INFO: loaded from: classes.dex */
public final class C23470 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m51714(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C13465.m32967(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
