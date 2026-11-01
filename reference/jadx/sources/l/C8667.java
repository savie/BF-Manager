package l;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8667 implements InputFilter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC11406 f29860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f29861;

    public C8667(TextView textView) {
        this.f29861 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f29861;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM31814 = C12817.m31807().m31814();
        if (iM31814 != 0) {
            if (iM31814 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C12817.m31807().m31815(0, charSequence.length(), charSequence);
            }
            if (iM31814 != 3) {
                return charSequence;
            }
        }
        C12817 c12817M31807 = C12817.m31807();
        if (this.f29860 == null) {
            this.f29860 = new C19250(textView, this);
        }
        c12817M31807.m31818(this.f29860);
        return charSequence;
    }
}
