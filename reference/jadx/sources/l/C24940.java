package l;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36IP */
/* JADX INFO: loaded from: classes.dex */
public final class C24940 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55623(TextView textView, CharSequence charSequence, boolean z, Consumer consumer) {
        int iIndexOf;
        int iIndexOf2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        String string = charSequence.toString();
        int i = 0;
        while (i < string.length() && (iIndexOf = string.indexOf(123, i)) >= 0 && (iIndexOf2 = string.indexOf(q.h, iIndexOf)) >= 0) {
            int i2 = iIndexOf2 + 1;
            if (!z || iIndexOf <= 0 || string.charAt(iIndexOf - 1) == '\n') {
                String strSubstring = string.substring(iIndexOf, i2);
                spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i2, 33);
                spannableStringBuilder.setSpan(new C13005(strSubstring, consumer), iIndexOf, i2, 33);
            }
            i = i2;
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(new C5548());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Consumer m55622(C23255 c23255) {
        return new C11513(c23255);
    }
}
