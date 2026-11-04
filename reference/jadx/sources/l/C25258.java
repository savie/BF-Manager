package l;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8HR */
/* JADX INFO: loaded from: classes.dex */
public final class C25258 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f81583;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f81584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String f81585;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f81586;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f81587;

    static {
        String str = C7116.f23455;
        f81587 = Integer.toString(0, 36);
        f81583 = Integer.toString(1, 36);
        f81586 = Integer.toString(2, 36);
        f81585 = Integer.toString(3, 36);
        f81584 = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m56395(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C16306 c16306 : (C16306[]) spanned.getSpans(0, spanned.length(), C16306.class)) {
            arrayList.add(m56394(spanned, c16306, 1, c16306.m38673()));
        }
        for (C23766 c23766 : (C23766[]) spanned.getSpans(0, spanned.length(), C23766.class)) {
            arrayList.add(m56394(spanned, c23766, 2, c23766.m53048()));
        }
        for (C17052 c17052 : (C17052[]) spanned.getSpans(0, spanned.length(), C17052.class)) {
            arrayList.add(m56394(spanned, c17052, 3, null));
        }
        for (C3628 c3628 : (C3628[]) spanned.getSpans(0, spanned.length(), C3628.class)) {
            arrayList.add(m56394(spanned, c3628, 4, c3628.m11780()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56396(Bundle bundle, SpannableString spannableString) {
        int i = bundle.getInt(f81587);
        int i2 = bundle.getInt(f81583);
        int i3 = bundle.getInt(f81586);
        int i4 = bundle.getInt(f81585, -1);
        Bundle bundle2 = bundle.getBundle(f81584);
        if (i4 == 1) {
            bundle2.getClass();
            spannableString.setSpan(C16306.m38672(bundle2), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            bundle2.getClass();
            spannableString.setSpan(C23766.m53047(bundle2), i, i2, i3);
        } else if (i4 == 3) {
            spannableString.setSpan(new C17052(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            bundle2.getClass();
            spannableString.setSpan(C3628.m11779(bundle2), i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m56394(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f81587, spanned.getSpanStart(obj));
        bundle2.putInt(f81583, spanned.getSpanEnd(obj));
        bundle2.putInt(f81586, spanned.getSpanFlags(obj));
        bundle2.putInt(f81585, i);
        if (bundle != null) {
            bundle2.putBundle(f81584, bundle);
        }
        return bundle2;
    }
}
