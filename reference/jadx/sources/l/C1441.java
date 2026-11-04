package l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.֨᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1441 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f5049;

    public C1441(Collator collator, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f5049 = arrayList;
        if (z) {
            arrayList.add(new C9643(collator, str, false));
            return;
        }
        Matcher matcher = C14118.f44642.matcher(str);
        int length = 0;
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group();
            if (!strGroup.isEmpty()) {
                length += strGroup.length();
                char cCharAt = strGroup.charAt(0);
                this.f5049.add(new C9643(collator, strGroup, '0' <= cCharAt && cCharAt <= '9'));
            }
        }
        C11972.m30026(length == str.length());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1441 c1441) {
        Iterator it = this.f5049.iterator();
        Iterator it2 = c1441.f5049.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((C9643) it.next()).compareTo((C9643) it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
