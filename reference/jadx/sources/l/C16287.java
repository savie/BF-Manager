package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܶᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84S9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16287 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52889;

    public /* synthetic */ C16287(int i) {
        this.f52889 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f52889) {
            case 0:
                return ((C20017) obj).mo9073().m47020(((C20017) obj2).mo9073());
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
