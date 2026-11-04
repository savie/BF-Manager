package l;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes.dex */
public final class C23744 implements InputFilter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22340 f76954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f76955;

    public C23744(TextView textView) {
        this.f76955 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f76955;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM7521 = C2203.m7520().m7521();
        if (iM7521 != 0) {
            if (iM7521 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2203.m7520().m7522(0, charSequence.length(), charSequence);
            }
            if (iM7521 != 3) {
                return charSequence;
            }
        }
        C2203 c2203M7520 = C2203.m7520();
        if (this.f76954 == null) {
            this.f76954 = new RunnableC16284(textView, this);
        }
        c2203M7520.m7525(this.f76954);
        return charSequence;
    }
}
