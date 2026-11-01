package l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۡ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8738 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22677(C20369 c20369) {
        c20369.m46010(-3.4028235E38f, Integer.MIN_VALUE);
        if (c20369.m46003() instanceof Spanned) {
            if (!(c20369.m46003() instanceof Spannable)) {
                c20369.m46002(SpannableString.valueOf(c20369.m46003()));
            }
            CharSequence charSequenceM46003 = c20369.m46003();
            charSequenceM46003.getClass();
            Spannable spannable = (Spannable) charSequenceM46003;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }
}
