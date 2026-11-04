package l;

import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14604 implements InputFilter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InputFilter f46007;

    static {
        InputFilter c14604;
        if (Build.VERSION.SDK_INT >= 27) {
            Locale locale = Locale.ENGLISH;
            c14604 = C24302.m54315();
        } else {
            c14604 = new C14604();
        }
        f46007 = c14604;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            if (Character.isLowerCase(charSequence.charAt(i5))) {
                if (charSequence instanceof Spanned) {
                    return new C4164((Spanned) charSequence, i, i2);
                }
                return charSequence.subSequence(i, i2).toString().toLowerCase();
            }
        }
        return charSequence;
    }
}
