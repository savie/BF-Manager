package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩷ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes.dex */
public final class C21801 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14186 m49449(CharSequence charSequence) {
        C14763 c14763 = new C14763();
        int i = 0;
        while (true) {
            int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
            if (iIndexOf != -1) {
                c14763.add(iIndexOf);
                i = iIndexOf + 1;
            } else {
                c14763.add(charSequence.length());
                int[] iArrMo2687 = c14763.mo2687();
                charSequence.length();
                return new C4647(iArrMo2687);
            }
        }
    }
}
