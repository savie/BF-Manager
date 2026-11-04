package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC11739 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f37964;

    public ViewOnTouchListenerC11739(C16960 c16960) {
        this.f37964 = c16960;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C16960 c16960 = this.f37964;
        if (action == 0 && (popupWindow = c16960.f55402) != null && popupWindow.isShowing() && x >= 0 && x < c16960.f55402.getWidth() && y >= 0 && y < c16960.f55402.getHeight()) {
            c16960.f55414.postDelayed(c16960.f55426, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c16960.f55414.removeCallbacks(c16960.f55426);
        return false;
    }
}
