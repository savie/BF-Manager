package l;

import android.text.method.MovementMethod;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۫ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnTouchListenerC12859 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f41169;

    public /* synthetic */ ViewOnTouchListenerC12859(KeyEvent.Callback callback, Object obj, int i) {
        this.f41167 = i;
        this.f41169 = callback;
        this.f41168 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f41167) {
            case 0:
                TextView textView = (TextView) this.f41169;
                MovementMethod movementMethod = (MovementMethod) this.f41168;
                if (motionEvent.getActionMasked() != 0 || textView.getMovementMethod() == movementMethod) {
                    return false;
                }
                textView.setMovementMethod(movementMethod);
                return false;
            default:
                ActivityC7135.m19571((ActivityC7135) this.f41169, (GestureDetector) this.f41168, motionEvent);
                return true;
        }
    }
}
