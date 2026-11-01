package l;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩵ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19250 extends AbstractC11406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f62188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f62189;

    public C19250(TextView textView, C8667 c8667) {
        this.f62189 = new WeakReference(textView);
        this.f62188 = new WeakReference(c8667);
    }

    @Override // l.AbstractC11406
    /* JADX INFO: renamed from: ܰ */
    public final void mo28510() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f62189.get();
        InputFilter inputFilter = (InputFilter) this.f62188.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C12817 c12817M31807 = C12817.m31807();
                    if (text == null) {
                        length = 0;
                    } else {
                        c12817M31807.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM31815 = c12817M31807.m31815(0, length, text);
                    if (text == charSequenceM31815) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM31815);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM31815);
                    textView.setText(charSequenceM31815);
                    if (charSequenceM31815 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM31815;
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
}
