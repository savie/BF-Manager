package l;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܶᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC16284 extends AbstractC22340 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f52879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakReference f52880;

    @Override // l.AbstractC22340
    /* JADX INFO: renamed from: ᩷ */
    public final void mo26322() {
        Handler handler;
        TextView textView = (TextView) this.f52880.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f52880.get();
        InputFilter inputFilter = (InputFilter) this.f52879.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C2203 c2203M7520 = C2203.m7520();
                    if (text == null) {
                        length = 0;
                    } else {
                        c2203M7520.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM7522 = c2203M7520.m7522(0, length, text);
                    if (text == charSequenceM7522) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM7522);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM7522);
                    textView.setText(charSequenceM7522);
                    if (charSequenceM7522 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM7522;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public RunnableC16284(TextView textView, C23744 c23744) {
        this.f52880 = new WeakReference(textView);
        this.f52879 = new WeakReference(c23744);
    }
}
