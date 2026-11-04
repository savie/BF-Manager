package l;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩸ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EO */
/* JADX INFO: loaded from: classes.dex */
public final class C22744 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73805 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f73806 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51280(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51281(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        WeakHashMap weakHashMap = f73806;
        if (actionMasked == 0) {
            weakHashMap.put(view, new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            weakHashMap.remove(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51282(View view, C18452 c18452) {
        Point point = (Point) f73806.remove(view);
        int width = point != null ? point.x : view.getWidth() / 2;
        if (width < 0 || width > view.getWidth()) {
            width = view.getWidth() / 2;
        }
        c18452.m42992(width < view.getWidth() / 2 ? 3 : 5);
        c18452.mo21878();
    }
}
