package l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B916 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20878 implements MovementMethod {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MovementMethod f67815;

    public C20878(MovementMethod movementMethod) {
        this.f67815 = movementMethod;
    }

    @Override // android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        this.f67815.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f67815.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f67815.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.f67815.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.f67815.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f67815.onTrackballEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C4794 c4794;
        Layout layoutM13318;
        if (this.f67815.onTouchEvent(textView, spannable, motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            C4794[] c4794Arr = (C4794[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C4794.class);
            if (c4794Arr.length != 0 && (layoutM13318 = (c4794 = c4794Arr[0]).m13318(scrollX)) != null) {
                int offsetForHorizontal2 = layoutM13318.getOffsetForHorizontal(layoutM13318.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % c4794.m13315());
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layoutM13318.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(textView);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f67815.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return this.f67815.canSelectArbitrarily();
    }
}
