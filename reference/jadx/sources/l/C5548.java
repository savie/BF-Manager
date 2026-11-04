package l;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36IP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5548 extends LinkMovementMethod {
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        try {
            boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
            if (motionEvent.getActionMasked() == 0 && Selection.getSelectionStart(spannable) >= 0 && Selection.getSelectionEnd(spannable) > Selection.getSelectionStart(spannable)) {
                textView.setPressed(true);
            }
        } finally {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                Selection.removeSelection(spannable);
                textView.setPressed(false);
            }
        }
    }
}
