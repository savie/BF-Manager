package l;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8HR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12608 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f42122;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f42123;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f42124;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f42125;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f42126;

    static {
        String str = C17983.f57504;
        f42122 = Integer.toString(0, 36);
        f42123 = Integer.toString(1, 36);
        f42126 = Integer.toString(2, 36);
        f42124 = Integer.toString(3, 36);
        f42125 = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31381(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C11197 c11197 : (C11197[]) spanned.getSpans(0, spanned.length(), C11197.class)) {
            arrayList.add(m31380(spanned, c11197, 1, c11197.m28134()));
        }
        for (C23897 c23897 : (C23897[]) spanned.getSpans(0, spanned.length(), C23897.class)) {
            arrayList.add(m31380(spanned, c23897, 2, c23897.m52692()));
        }
        for (C17546 c17546 : (C17546[]) spanned.getSpans(0, spanned.length(), C17546.class)) {
            arrayList.add(m31380(spanned, c17546, 3, null));
        }
        for (C14725 c14725 : (C14725[]) spanned.getSpans(0, spanned.length(), C14725.class)) {
            arrayList.add(m31380(spanned, c14725, 4, c14725.m35254()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31382(Bundle bundle, SpannableString spannableString) {
        int i = bundle.getInt(f42122);
        int i2 = bundle.getInt(f42123);
        int i3 = bundle.getInt(f42126);
        int i4 = bundle.getInt(f42124, -1);
        Bundle bundle2 = bundle.getBundle(f42125);
        if (i4 == 1) {
            bundle2.getClass();
            spannableString.setSpan(C11197.m28133(bundle2), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            bundle2.getClass();
            spannableString.setSpan(C23897.m52691(bundle2), i, i2, i3);
        } else if (i4 == 3) {
            spannableString.setSpan(new C17546(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            bundle2.getClass();
            spannableString.setSpan(C14725.m35253(bundle2), i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m31380(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f42122, spanned.getSpanStart(obj));
        bundle2.putInt(f42123, spanned.getSpanEnd(obj));
        bundle2.putInt(f42126, spanned.getSpanFlags(obj));
        bundle2.putInt(f42124, i);
        if (bundle != null) {
            bundle2.putBundle(f42125, bundle);
        }
        return bundle2;
    }
}
