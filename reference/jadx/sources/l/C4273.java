package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4273 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12078(String str, C22619 c22619) {
        C1451 c1451;
        C22619 c22619M12080 = m12080(c22619);
        if (str.isEmpty() || c22619M12080 == null) {
            m12081(str);
            return;
        }
        ArrayList arrayListM12075 = m12075();
        Iterator it = arrayListM12075.iterator();
        do {
            if (!it.hasNext()) {
                c1451 = null;
                break;
            }
            c1451 = (C1451) it.next();
        } while (!c1451.f5926.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1451 != null) {
            c1451.f5925 = c22619M12080;
            c1451.f5924 = jCurrentTimeMillis;
        } else {
            arrayListM12075.add(new C1451(str, c22619M12080, jCurrentTimeMillis));
        }
        if (arrayListM12075.size() > 100) {
            Collections.sort(arrayListM12075, new C2862());
            while (arrayListM12075.size() > 100) {
                C19028.m43762(arrayListM12075, 1);
            }
        }
        m12079(arrayListM12075);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22619 m12076(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList<C1451> arrayListM12075 = m12075();
        for (C1451 c1451 : arrayListM12075) {
            if (c1451.f5926.equals(str)) {
                C22619 c22619M12080 = m12080(c1451.f5925);
                if (c22619M12080 == null) {
                    return null;
                }
                c1451.f5924 = System.currentTimeMillis();
                m12079(arrayListM12075);
                return c22619M12080;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12081(String str) {
        if (str.isEmpty()) {
            return;
        }
        ArrayList arrayListM12075 = m12075();
        for (int i = 0; i < arrayListM12075.size(); i++) {
            if (((C1451) arrayListM12075.get(i)).f5926.equals(str)) {
                arrayListM12075.remove(i);
                m12079(arrayListM12075);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C22619 m12080(C22619 c22619) {
        int i = C5685.f19402[c22619.m50141().ordinal()];
        if (i == 1) {
            return new C22619(EnumC13447.OFF, -1, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IncompatibleClassChangeError();
            }
            if (c22619.m50143() != null && !c22619.m50143().isEmpty()) {
                return new C22619(EnumC13447.FILE, -1, c22619.m50143());
            }
        } else if (c22619.m50142() >= 0) {
            return new C22619(EnumC13447.TRACK, c22619.m50142(), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m12075() {
        byte[] bArrMo16347;
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
            if (interfaceC6025 != null && (bArrMo16347 = interfaceC6025.mo16347("vsts", (byte[]) null)) != null && bArrMo16347.length != 0) {
                C17367 c17367M40441 = C17367.m40441(bArrMo16347);
                c17367M40441.m40447(1699025495);
                int i = c17367M40441.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(C1451.m5041(c17367M40441));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12079(ArrayList arrayList) {
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        if (interfaceC6025 == null) {
            return;
        }
        C11018 c11018M43576 = C18917.m43576(1699025495);
        c11018M43576.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1451 c1451 = (C1451) it.next();
            c11018M43576.m27786(c1451.f5926);
            int i = C5685.f19402[c1451.f5925.m50141().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    continue;
                }
            }
            c11018M43576.writeByte(i2);
            c11018M43576.writeInt(c1451.f5925.m50142());
            c11018M43576.m27783(c1451.f5925.m50143());
            c11018M43576.m27791(c1451.f5924);
        }
        interfaceC6025.edit().mo4067("vsts", c11018M43576.m27798()).apply();
    }
}
