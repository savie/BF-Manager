package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes4.dex */
public final class C21553 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f69991;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18731 f69992;

    public C21553(C18731 c18731) {
        this.f69992 = c18731;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48268(String str) {
        if (this.f69991 == null) {
            C2239 c2239 = (C2239) C13530.m33070().f17661.get(0);
            ArrayList arrayList = new ArrayList(c2239.m6880());
            this.f69991 = arrayList;
            Iterator it = c2239.m6876().iterator();
            while (it.hasNext()) {
                arrayList.add(((C11413) it.next()).f38431);
            }
            arrayList.trimToSize();
            Collections.sort(arrayList);
        }
        String lowerCase = str.toLowerCase();
        String[] strArrSplit = lowerCase.split(":", 2);
        C19576 c19576 = new C19576();
        C18731 c18731 = this.f69992;
        String lowerCase2 = c18731.f60760.m35682().toLowerCase();
        if (strArrSplit.length == 1) {
            int iIndexOf = lowerCase2.indexOf(lowerCase);
            if (iIndexOf != -1) {
                SpannableString spannableString = new SpannableString(lowerCase2.concat(":"));
                spannableString.setSpan(c18731.f60753, iIndexOf, lowerCase.length() + iIndexOf, 33);
                c19576.m44683(spannableString, 0);
            }
            int length = lowerCase2.length() + 1;
            for (String str2 : this.f69991) {
                int iIndexOf2 = str2.toLowerCase().indexOf(lowerCase);
                if (iIndexOf2 != -1) {
                    SpannableString spannableString2 = new SpannableString(C1679.m5594(lowerCase2, ":", str2));
                    int i = length + iIndexOf2;
                    spannableString2.setSpan(c18731.f60753, i, lowerCase.length() + i, 33);
                    c19576.m44683(spannableString2, iIndexOf2);
                }
            }
        } else if (lowerCase2.equals(strArrSplit[0])) {
            lowerCase = strArrSplit[1];
            int length2 = lowerCase2.length() + 1;
            for (String str3 : this.f69991) {
                int iIndexOf3 = str3.toLowerCase().indexOf(lowerCase);
                if (iIndexOf3 != -1) {
                    SpannableString spannableString3 = new SpannableString(C1679.m5594(lowerCase2, ":", str3));
                    spannableString3.setSpan(c18731.f60753, 0, lowerCase.length() + length2 + iIndexOf3, 33);
                    c19576.m44683(spannableString3, iIndexOf3);
                }
            }
        }
        c18731.f60761.clear();
        c19576.m44684(c18731.f60761);
        if (c18731.f60761.size() == 1 && ((SpannableString) c18731.f60761.get(0)).toString().equals(lowerCase)) {
            c18731.f60761.clear();
        }
    }
}
