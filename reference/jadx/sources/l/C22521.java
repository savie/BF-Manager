package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31WU */
/* JADX INFO: loaded from: classes.dex */
public final class C22521 implements Comparable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C18415 f72849 = C18415.m42925("[0-9]+");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f72850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f72851;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f72853;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22521 c22521 = (C22521) obj;
        int iCompareTo = this.f72853.compareTo(c22521.f72853);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f72852 - c22521.f72852;
        return i != 0 ? i : this.f72850.compareTo(c22521.f72850);
    }

    public C22521(String str) {
        this.f72851 = str;
        C4245 c4245Matcher = f72849.matcher((CharSequence) str);
        if (c4245Matcher.find() && c4245Matcher.end() - c4245Matcher.start() < 10) {
            this.f72853 = str.substring(0, c4245Matcher.start());
            this.f72852 = Integer.parseInt(c4245Matcher.group());
            this.f72850 = str.substring(c4245Matcher.end());
        } else {
            this.f72853 = str;
            this.f72852 = -1;
            this.f72850 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50746(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C22521((String) it.next()));
        }
        Collections.sort(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, ((C22521) arrayList2.get(i)).f72851);
        }
    }
}
