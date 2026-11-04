package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1FH */
/* JADX INFO: loaded from: classes.dex */
public final class C22145 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern f71335 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f71336;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f71337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50103() {
        return this.f71336.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m50108(int i) {
        return ((Integer) this.f71337.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13983 m50107(int i) {
        return (C13983) this.f71336.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7272 m50104(int i) {
        return (C7272) this.f71336.get(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4991 m50106(int i) {
        return (C4991) this.f71336.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22145 m50102(CharSequence charSequence) throws C10254, IOException {
        C19205 c19205 = new C19205();
        c19205.m44493(new C10849(charSequence));
        C22145 c22145 = new C22145();
        c22145.f71336 = new ArrayList();
        c22145.f71337 = new ArrayList();
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        while (true) {
            int iM44501 = c19205.m44501();
            if (iM44501 == 1) {
                return c22145;
            }
            if (iM44501 == 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < c19205.m44490(); i++) {
                    String strM44491 = c19205.m44491(i);
                    String strM44507 = c19205.m44507(i);
                    String strM44503 = c19205.m44503(i);
                    if ("xmlns".equals(strM44507)) {
                        arrayList2.add(new C13983(c19205.m44500(i).m24888(), strM44491, strM44503));
                    } else {
                        arrayList.add(new C8763(c19205.m44496(i), strM44507, strM44491, strM44503, c19205.m44505(i).clone(), c19205.m44500(i).clone()));
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c22145.m50105(0, (C13983) it.next());
                }
                C7272 c7272 = new C7272(c19205.m44489(), c19205.m44498(), c19205.m44499(), arrayList);
                c22145.m50105(1, c7272);
                stack.push(c7272);
                stack2.push(arrayList2);
            } else if (iM44501 == 3) {
                c22145.m50105(2, stack.pop());
                Iterator it2 = C4583.m14376((ArrayList) stack2.pop()).iterator();
                while (it2.hasNext()) {
                    c22145.m50105(3, (C13983) it2.next());
                }
            } else if (iM44501 == 4) {
                String strM44508 = c19205.m44508();
                if (!f71335.matcher(strM44508).matches()) {
                    c22145.m50105(4, new C4991(strM44508, c19205.m44489()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50105(int i, Object obj) {
        this.f71337.add(Integer.valueOf(i));
        this.f71336.add(obj);
    }
}
