package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC13373 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f44304;

    public ViewOnTouchListenerC13373(C7022 c7022) {
        this.f44304 = c7022;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C7022 c7022 = this.f44304;
        if (action == 0 && (popupWindow = c7022.f23602) != null && popupWindow.isShowing() && x >= 0 && x < c7022.f23602.getWidth() && y >= 0 && y < c7022.f23602.getHeight()) {
            c7022.f23601.postDelayed(c7022.f23606, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c7022.f23601.removeCallbacks(c7022.f23606);
        return false;
    }
}
