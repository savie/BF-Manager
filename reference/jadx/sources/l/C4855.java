package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4855 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17096;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17096) {
            case 0:
                return Long.compare(((C12287) obj).f41093, ((C12287) obj2).f41093);
            default:
                SpannableString spannableString = (SpannableString) obj;
                SpannableString spannableString2 = (SpannableString) obj2;
                boolean z = TextUtils.indexOf((CharSequence) spannableString, ':') != -1;
                if (z == (TextUtils.indexOf((CharSequence) spannableString2, ':') != -1)) {
                    return spannableString.toString().compareTo(spannableString2.toString());
                }
                return z ? 1 : -1;
        }
    }
}
