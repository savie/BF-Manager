package l;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۖ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2766 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10586 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f10587 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8438(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8439(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        WeakHashMap weakHashMap = f10587;
        if (actionMasked == 0) {
            weakHashMap.put(view, new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            weakHashMap.remove(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8440(View view, C16195 c16195) {
        Point point = (Point) f10587.remove(view);
        int width = point != null ? point.x : view.getWidth() / 2;
        if (width < 0 || width > view.getWidth()) {
            width = view.getWidth() / 2;
        }
        c16195.m38294(width < view.getWidth() / 2 ? 3 : 5);
        c16195.m38297();
    }
}
