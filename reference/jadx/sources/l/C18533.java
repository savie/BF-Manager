package l;

import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܿᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18533 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43111(TextWatcher textWatcher, CharSequence charSequence, int i, int i2, int i3) {
        int length = (charSequence.length() - i3) + i2;
        int length2 = charSequence.length();
        int iMin = Math.min(length, 100000);
        int iMin2 = Math.min(length2, 100000);
        if (i >= 100000) {
            return;
        }
        int iMin3 = Math.min(i2, iMin - i);
        int iMin4 = Math.min(i3, 100000 - i);
        int i4 = (iMin - iMin3) + iMin4;
        C3617 c3617 = (C3617) textWatcher;
        c3617.onTextChanged(new C21517(i4, charSequence), i, iMin3, iMin4);
        if (iMin2 == i4) {
            return;
        }
        if (iMin2 > i4) {
            c3617.onTextChanged(new C21517(iMin2, charSequence), i4, 0, iMin2 - i4);
        } else {
            c3617.onTextChanged(new C21517(iMin2, charSequence), iMin2, i4 - iMin2, 0);
        }
    }
}
