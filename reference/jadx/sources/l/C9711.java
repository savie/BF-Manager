package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P7FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9711 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24668(int i, String str) {
        C1948 c1948;
        if (i < 0) {
            m24670(str);
            return;
        }
        ArrayList arrayListM24667 = m24667();
        Iterator it = arrayListM24667.iterator();
        do {
            if (!it.hasNext()) {
                c1948 = null;
                break;
            }
            c1948 = (C1948) it.next();
        } while (!c1948.f7335.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1948 != null) {
            c1948.f7336 = i;
            c1948.f7334 = jCurrentTimeMillis;
        } else {
            arrayListM24667.add(new C1948(str, i, jCurrentTimeMillis));
        }
        if (arrayListM24667.size() > 100) {
            Collections.sort(arrayListM24667, new C14650());
            while (arrayListM24667.size() > 100) {
                C19028.m43762(arrayListM24667, 1);
            }
        }
        m24669(arrayListM24667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24666(String str) {
        ArrayList<C1948> arrayListM24667 = m24667();
        for (C1948 c1948 : arrayListM24667) {
            if (c1948.f7335.equals(str)) {
                if (c1948.f7336 < 0) {
                    return -1;
                }
                c1948.f7334 = System.currentTimeMillis();
                m24669(arrayListM24667);
                return c1948.f7336;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m24670(String str) {
        ArrayList arrayListM24667 = m24667();
        for (int i = 0; i < arrayListM24667.size(); i++) {
            if (((C1948) arrayListM24667.get(i)).f7335.equals(str)) {
                arrayListM24667.remove(i);
                m24669(arrayListM24667);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m24667() {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrMo16347 = ApplicationC0716.f2992.mo16347("vats", (byte[]) null);
            if (bArrMo16347 != null && bArrMo16347.length != 0) {
                C17367 c17367M40441 = C17367.m40441(bArrMo16347);
                c17367M40441.m40447(1699025494);
                int i = c17367M40441.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(new C1948(c17367M40441.m40458(), c17367M40441.readInt(), c17367M40441.readLong()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24669(ArrayList arrayList) {
        C11018 c11018M43576 = C18917.m43576(1699025494);
        c11018M43576.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1948 c1948 = (C1948) it.next();
            c11018M43576.m27786(c1948.f7335);
            c11018M43576.writeInt(c1948.f7336);
            c11018M43576.m27791(c1948.f7334);
        }
        ApplicationC0716.f2992.edit().mo4067("vats", c11018M43576.m27798()).apply();
    }
}
