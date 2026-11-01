package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩷᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21169 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10587 m47628(CharSequence charSequence) {
        C15070 c15070 = new C15070();
        int i = 0;
        while (true) {
            int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
            if (iIndexOf != -1) {
                c15070.add(iIndexOf);
                i = iIndexOf + 1;
            } else {
                c15070.add(charSequence.length());
                int[] iArrMo3181 = c15070.mo3181();
                charSequence.length();
                return new C7764(iArrMo3181);
            }
        }
    }
}
