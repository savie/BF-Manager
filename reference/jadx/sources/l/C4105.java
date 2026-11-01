package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1FH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4105 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Pattern f15042 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f15043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f15044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11652() {
        return this.f15043.size();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11651(int i) {
        return ((Integer) this.f15044.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1283 m11656(int i) {
        return (C1283) this.f15043.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22451 m11653(int i) {
        return (C22451) this.f15043.get(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13279 m11655(int i) {
        return (C13279) this.f15043.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4105 m11650(CharSequence charSequence) throws IOException, C4811 {
        C3504 c3504 = new C3504();
        c3504.m10317(new C17664(charSequence));
        C4105 c4105 = new C4105();
        c4105.f15043 = new ArrayList();
        c4105.f15044 = new ArrayList();
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        while (true) {
            int iM10327 = c3504.m10327();
            if (iM10327 == 1) {
                return c4105;
            }
            if (iM10327 == 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < c3504.m10314(); i++) {
                    String strM10315 = c3504.m10315(i);
                    String strM10312 = c3504.m10312(i);
                    String strM10319 = c3504.m10319(i);
                    if ("xmlns".equals(strM10312)) {
                        arrayList2.add(new C1283(c3504.m10329(i).m29578(), strM10315, strM10319));
                    } else {
                        arrayList.add(new C5517(c3504.m10322(i), strM10312, strM10315, strM10319, c3504.m10325(i).clone(), c3504.m10329(i).clone()));
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c4105.m11654(0, (C1283) it.next());
                }
                C22451 c22451 = new C22451(c3504.m10313(), c3504.m10310(), c3504.m10328(), arrayList);
                c4105.m11654(1, c22451);
                stack.push(c22451);
                stack2.push(arrayList2);
            } else if (iM10327 == 3) {
                c4105.m11654(2, stack.pop());
                Iterator it2 = C3051.m9147((ArrayList) stack2.pop()).iterator();
                while (it2.hasNext()) {
                    c4105.m11654(3, (C1283) it2.next());
                }
            } else if (iM10327 == 4) {
                String strM10326 = c3504.m10326();
                if (!f15042.matcher(strM10326).matches()) {
                    c4105.m11654(4, new C13279(strM10326, c3504.m10313()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11654(int i, Object obj) {
        this.f15044.add(Integer.valueOf(i));
        this.f15043.add(obj);
    }
}
