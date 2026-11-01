package l;

import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5500 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15197(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4794.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        for (Object obj : spans) {
            ((C4794) obj).m13317((InterfaceC3238) null);
        }
    }
}
