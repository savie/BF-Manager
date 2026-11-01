package l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۧܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11149 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f37808;

    public C11149(Collator collator, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f37808 = arrayList;
        if (z) {
            arrayList.add(new C23849(collator, str, false));
            return;
        }
        Matcher matcher = C3386.f12509.matcher(str);
        int length = 0;
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group();
            if (!strGroup.isEmpty()) {
                length += strGroup.length();
                char cCharAt = strGroup.charAt(0);
                this.f37808.add(new C23849(collator, strGroup, '0' <= cCharAt && cCharAt <= '9'));
            }
        }
        C6171.m17176(length == str.length());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C11149 c11149) {
        Iterator it = this.f37808.iterator();
        Iterator it2 = c11149.f37808.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((C23849) it.next()).compareTo((C23849) it2.next());
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
