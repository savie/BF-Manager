package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19962 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SpannableString spannableString = (SpannableString) obj;
        SpannableString spannableString2 = (SpannableString) obj2;
        boolean z = TextUtils.indexOf(spannableString, "android:") == 1;
        if (z == (TextUtils.indexOf(spannableString2, "android:") == 1)) {
            return spannableString.toString().compareTo(spannableString2.toString());
        }
        return z ? 1 : -1;
    }
}
