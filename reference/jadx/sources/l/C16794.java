package l;

import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16794 implements InputFilter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final InputFilter f53781;

    static {
        InputFilter c16794;
        if (Build.VERSION.SDK_INT >= 27) {
            Locale locale = Locale.ENGLISH;
            c16794 = C20322.m45862();
        } else {
            c16794 = new C16794();
        }
        f53781 = c16794;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            if (Character.isLowerCase(charSequence.charAt(i5))) {
                if (charSequence instanceof Spanned) {
                    return new C0565((Spanned) charSequence, i, i2);
                }
                return charSequence.subSequence(i, i2).toString().toLowerCase();
            }
        }
        return charSequence;
    }
}
