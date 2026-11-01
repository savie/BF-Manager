package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18794 implements Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C14690 f60922 = C14690.m35219("[0-9]+");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60923;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f60924;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f60925;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f60926;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18794 c18794 = (C18794) obj;
        int iCompareTo = this.f60926.compareTo(c18794.f60926);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f60923 - c18794.f60923;
        return i != 0 ? i : this.f60925.compareTo(c18794.f60925);
    }

    public C18794(String str) {
        this.f60924 = str;
        C6222 c6222Matcher = f60922.matcher((CharSequence) str);
        if (c6222Matcher.find() && c6222Matcher.end() - c6222Matcher.start() < 10) {
            this.f60926 = str.substring(0, c6222Matcher.start());
            this.f60923 = Integer.parseInt(c6222Matcher.group());
            this.f60925 = str.substring(c6222Matcher.end());
        } else {
            this.f60926 = str;
            this.f60923 = -1;
            this.f60925 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43355(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C18794((String) it.next()));
        }
        Collections.sort(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, ((C18794) arrayList2.get(i)).f60924);
        }
    }
}
