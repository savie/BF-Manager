package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes.dex */
public final class C23009 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f74671;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15549 f74672;

    public C23009(C15549 c15549) {
        this.f74672 = c15549;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51901(String str) {
        if (this.f74671 == null) {
            C8566 c8566 = (C8566) C15407.m36886().f23304.get(0);
            ArrayList arrayList = new ArrayList(c8566.m23011());
            this.f74671 = arrayList;
            Iterator it = c8566.m23007().iterator();
            while (it.hasNext()) {
                arrayList.add(((C2600) it.next()).f8356);
            }
            arrayList.trimToSize();
            Collections.sort(arrayList);
        }
        String lowerCase = str.toLowerCase();
        String[] strArrSplit = lowerCase.split(":", 2);
        C3681 c3681 = new C3681();
        C15549 c15549 = this.f74672;
        String lowerCase2 = c15549.f50580.m51604().toLowerCase();
        if (strArrSplit.length == 1) {
            int iIndexOf = lowerCase2.indexOf(lowerCase);
            if (iIndexOf != -1) {
                SpannableString spannableString = new SpannableString(lowerCase2.concat(":"));
                spannableString.setSpan(c15549.f50574, iIndexOf, lowerCase.length() + iIndexOf, 33);
                c3681.m11973(spannableString, 0);
            }
            int length = lowerCase2.length() + 1;
            for (String str2 : this.f74671) {
                int iIndexOf2 = str2.toLowerCase().indexOf(lowerCase);
                if (iIndexOf2 != -1) {
                    SpannableString spannableString2 = new SpannableString(C20196.m46451(lowerCase2, ":", str2));
                    int i = length + iIndexOf2;
                    spannableString2.setSpan(c15549.f50574, i, lowerCase.length() + i, 33);
                    c3681.m11973(spannableString2, iIndexOf2);
                }
            }
        } else if (lowerCase2.equals(strArrSplit[0])) {
            lowerCase = strArrSplit[1];
            int length2 = lowerCase2.length() + 1;
            for (String str3 : this.f74671) {
                int iIndexOf3 = str3.toLowerCase().indexOf(lowerCase);
                if (iIndexOf3 != -1) {
                    SpannableString spannableString3 = new SpannableString(C20196.m46451(lowerCase2, ":", str3));
                    spannableString3.setSpan(c15549.f50574, 0, lowerCase.length() + length2 + iIndexOf3, 33);
                    c3681.m11973(spannableString3, iIndexOf3);
                }
            }
        }
        c15549.f50579.clear();
        c3681.m11974(c15549.f50579);
        if (c15549.f50579.size() == 1 && ((SpannableString) c15549.f50579.get(0)).toString().equals(lowerCase)) {
            c15549.f50579.clear();
        }
    }
}
