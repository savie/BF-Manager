package l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.ܿ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17604 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m40924(String str) {
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 10132) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                }
                int i2 = i + 1;
                spannableStringBuilder.replace(i, i2, (CharSequence) "￼");
                spannableStringBuilder.setSpan(new C12666(), i, i2, 33);
            }
        }
        return spannableStringBuilder == null ? str : spannableStringBuilder;
    }
}
