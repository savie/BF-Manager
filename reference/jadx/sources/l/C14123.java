package l;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: l.۬᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SIRR */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14123 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (((((long) spanned.length()) - ((long) (i4 - i3))) + ((long) i2)) - ((long) i) <= 50000) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}
