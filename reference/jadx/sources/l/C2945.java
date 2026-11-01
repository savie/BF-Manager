package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2945 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11050;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11050) {
            case 0:
                C15606 c15606 = (C15606) obj;
                C15606 c15607 = (C15606) obj2;
                int iCompare = Integer.compare(c15606.f50741, c15607.f50741);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Integer.compare(c15607.f50739, c15606.f50739);
                return iCompare2 != 0 ? iCompare2 : c15606.f50740.compareTo(c15607.f50740);
            case 1:
                C2065 c2065 = (C2065) obj;
                C2065 c2066 = (C2065) obj2;
                long j = c2065.f7659;
                long j2 = c2066.f7659;
                if (j - j2 == 0) {
                    return c2065.compareTo(c2066);
                }
                return j < j2 ? -1 : 1;
            default:
                SpannableString spannableString = (SpannableString) obj;
                SpannableString spannableString2 = (SpannableString) obj2;
                boolean z = TextUtils.indexOf(spannableString, "android:") == 1;
                if (z == (TextUtils.indexOf(spannableString2, "android:") == 1)) {
                    return spannableString.toString().compareTo(spannableString2.toString());
                }
                return z ? 1 : -1;
        }
    }
}
