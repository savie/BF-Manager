package l;

import android.text.InputFilter;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SIRR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4846 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14885(C23255 c23255) {
        InputFilter[] filters = c23255.m54021().getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = new C14123();
        c23255.m52304(inputFilterArr);
        if (c23255.m54099() > 50000) {
            c23255.mo52335("");
        }
    }
}
