package l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B916 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13929 implements MovementMethod {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MovementMethod f44162;

    public C13929(MovementMethod movementMethod) {
        this.f44162 = movementMethod;
    }

    @Override // android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        this.f44162.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f44162.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f44162.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.f44162.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.f44162.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f44162.onTrackballEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C16102 c16102;
        Layout layoutM38262;
        if (this.f44162.onTouchEvent(textView, spannable, motionEvent)) {
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
            C16102[] c16102Arr = (C16102[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C16102.class);
            if (c16102Arr.length != 0 && (layoutM38262 = (c16102 = c16102Arr[0]).m38262(scrollX)) != null) {
                int offsetForHorizontal2 = layoutM38262.getOffsetForHorizontal(layoutM38262.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % c16102.m38259());
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layoutM38262.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
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
        return this.f44162.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return this.f44162.canSelectArbitrarily();
    }
}
