package l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.᩸᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23143 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52063(C5866 c5866) {
        c5866.m17087(-3.4028235E38f, Integer.MIN_VALUE);
        if (c5866.m17083() instanceof Spanned) {
            if (!(c5866.m17083() instanceof Spannable)) {
                c5866.m17079(SpannableString.valueOf(c5866.m17083()));
            }
            CharSequence charSequenceM17083 = c5866.m17083();
            charSequenceM17083.getClass();
            Spannable spannable = (Spannable) charSequenceM17083;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }
}
