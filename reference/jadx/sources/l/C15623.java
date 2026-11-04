package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P7FQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15623 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37372(int i, String str) {
        C20099 c20099;
        if (i < 0) {
            m37374(str);
            return;
        }
        ArrayList arrayListM37371 = m37371();
        Iterator it = arrayListM37371.iterator();
        do {
            if (!it.hasNext()) {
                c20099 = null;
                break;
            }
            c20099 = (C20099) it.next();
        } while (!c20099.f64587.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c20099 != null) {
            c20099.f64588 = i;
            c20099.f64586 = jCurrentTimeMillis;
        } else {
            arrayListM37371.add(new C20099(str, i, jCurrentTimeMillis));
        }
        if (arrayListM37371.size() > 100) {
            Collections.sort(arrayListM37371, new C23083());
            while (arrayListM37371.size() > 100) {
                C2764.m9138(arrayListM37371, 1);
            }
        }
        m37373(arrayListM37371);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37370(String str) {
        ArrayList<C20099> arrayListM37371 = m37371();
        for (C20099 c20099 : arrayListM37371) {
            if (c20099.f64587.equals(str)) {
                if (c20099.f64588 < 0) {
                    return -1;
                }
                c20099.f64586 = System.currentTimeMillis();
                m37373(arrayListM37371);
                return c20099.f64588;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37374(String str) {
        ArrayList arrayListM37371 = m37371();
        for (int i = 0; i < arrayListM37371.size(); i++) {
            if (((C20099) arrayListM37371.get(i)).f64587.equals(str)) {
                arrayListM37371.remove(i);
                m37373(arrayListM37371);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37371() {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrMo7903 = ApplicationC17729.f58258.mo7903("vats", (byte[]) null);
            if (bArrMo7903 != null && bArrMo7903.length != 0) {
                C20348 c20348M46740 = C20348.m46740(bArrMo7903);
                c20348M46740.m46746(1699025494);
                int i = c20348M46740.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new C20099(c20348M46740.m46758(), c20348M46740.readInt(), c20348M46740.readLong()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37373(ArrayList arrayList) {
        C6178 c6178M34975 = C14483.m34975(1699025494);
        c6178M34975.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20099 c20099 = (C20099) it.next();
            c6178M34975.m17800(c20099.f64587);
            c6178M34975.writeInt(c20099.f64588);
            c6178M34975.m17803(c20099.f64586);
        }
        ApplicationC17729.f58258.edit().mo3488("vats", c6178M34975.m17799()).apply();
    }
}
