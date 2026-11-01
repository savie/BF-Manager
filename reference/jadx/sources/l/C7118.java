package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C7118 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f23816 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long f23817;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19008(AbstractC9677 abstractC9677, List list, int i) {
        C21611 c21611 = C21611.f70098;
        if (abstractC9677 == c21611) {
            if (list.isEmpty() || i < 0 || i >= list.size()) {
                throw new IllegalArgumentException("Invalid music playlist");
            }
            if (abstractC9677 == c21611 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC2557) it.next()).mo7989().m46725()) {
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                synchronized (f23816) {
                    m19004(i, 0, list);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19006(AbstractC9677 abstractC9677, int i) {
        if (abstractC9677 != C21611.f70098) {
            return;
        }
        synchronized (f23816) {
            if (ApplicationC0716.f2992.contains("mpl")) {
                ApplicationC0716.f2992.edit().mo4065(i, "mpi").remove("mpp").apply();
                f23817++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19007(AbstractC9677 abstractC9677, int i, int i2) {
        if (abstractC9677 != C21611.f70098) {
            return;
        }
        synchronized (f23816) {
            if (ApplicationC0716.f2992.contains("mpl") && ApplicationC0716.f2992.mo16346(21, "mpi") && ApplicationC0716.f2992.getInt("mpi", -1) == i) {
                InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
                if (i2 > 0) {
                    interfaceC17314Edit.mo4065(i2, "mpp");
                } else {
                    interfaceC17314Edit.remove("mpp");
                }
                interfaceC17314Edit.apply();
                f23817++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19005(AbstractC9677 abstractC9677) {
        if (abstractC9677 != C21611.f70098) {
            return;
        }
        synchronized (f23816) {
            if (ApplicationC0716.f2992.contains("mpp")) {
                ApplicationC0716.f2992.edit().remove("mpp").apply();
                f23817++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9941 m19003() {
        boolean zContains;
        byte[] bArrMo16347;
        int i;
        int i2;
        boolean z;
        long j;
        int i3;
        synchronized (f23816) {
            zContains = ApplicationC0716.f2992.contains("mpl");
            bArrMo16347 = ApplicationC0716.f2992.mo16346(25, "mpl") ? ApplicationC0716.f2992.mo16347("mpl", (byte[]) null) : null;
            i = ApplicationC0716.f2992.mo16346(21, "mpi") ? ApplicationC0716.f2992.getInt("mpi", -1) : -1;
            boolean zContains2 = ApplicationC0716.f2992.contains("mpp");
            boolean z2 = !zContains2 || ApplicationC0716.f2992.mo16346(21, "mpp");
            i2 = z2 ? ApplicationC0716.f2992.getInt("mpp", 0) : 0;
            z = zContains2 && (!z2 || i2 <= 0);
            if (i2 <= 0) {
                i2 = 0;
            }
            j = f23817;
        }
        if (bArrMo16347 == null || bArrMo16347.length == 0) {
            return new C9941(null, zContains, 0, j);
        }
        try {
            ArrayList arrayListM19002 = m19002(bArrMo16347);
            if (i < 0 || i >= arrayListM19002.size()) {
                throw new IllegalArgumentException("Invalid music playlist index");
            }
            ArrayList arrayList = new ArrayList(arrayListM19002.size());
            ArrayList arrayList2 = new ArrayList(arrayListM19002.size());
            boolean z3 = false;
            for (int i4 = 0; i4 < arrayListM19002.size(); i4++) {
                try {
                    AbstractC20745 abstractC20745M15313 = C5553.m15313((String) arrayListM19002.get(i4), new String[0]);
                    if (abstractC20745M15313.mo33971()) {
                        C6794 c6794 = new C6794(abstractC20745M15313);
                        if (c6794.mo7967().startsWith("audio/")) {
                            arrayList.add(c6794);
                            arrayList2.add(Integer.valueOf(i4));
                            if (i4 == i) {
                                z3 = true;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return new C9941(null, true, 0, j);
            }
            int iIntValue = ((Integer) arrayList2.get(0)).intValue();
            int iAbs = Math.abs(iIntValue - i);
            int i5 = 0;
            for (int i6 = 1; i6 < arrayList2.size(); i6++) {
                int iIntValue2 = ((Integer) arrayList2.get(i6)).intValue();
                int iAbs2 = Math.abs(iIntValue2 - i);
                if (iAbs2 < iAbs || (iAbs2 == iAbs && iIntValue2 > iIntValue)) {
                    i5 = i6;
                    iIntValue = iIntValue2;
                    iAbs = iAbs2;
                }
            }
            if (z3 || i2 <= 0) {
                i3 = i2;
            } else {
                z = true;
                i3 = 0;
            }
            return new C9941(new C21830(C21611.f70098, arrayList, i5), arrayList.size() != arrayListM19002.size() || z, i3, j);
        } catch (RuntimeException unused2) {
            return new C9941(null, true, 0, j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19009(C9941 c9941) {
        synchronized (f23816) {
            if (f23817 != c9941.m25151()) {
                return false;
            }
            if (!c9941.m25150()) {
                return true;
            }
            C21830 c21830M25149 = c9941.m25149();
            if (c21830M25149 != null) {
                m19004(c21830M25149.m48601(), c9941.m25148(), c21830M25149.m48602());
            } else {
                ApplicationC0716.f2992.edit().remove("mpl").remove("mpi").remove("mpp").apply();
                f23817++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m19002(byte[] bArr) {
        C17367 c17367M40441 = C17367.m40441(bArr);
        if (c17367M40441.readInt() != 1297107969) {
            throw new IllegalArgumentException("Unsupported music playlist format");
        }
        int i = c17367M40441.readInt();
        if (i <= 0 || i > c17367M40441.available()) {
            throw new IllegalArgumentException("Invalid music playlist size");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM40458 = c17367M40441.m40458();
            if (strM40458.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            arrayList.add(strM40458);
        }
        if (c17367M40441.available() == 0) {
            return arrayList;
        }
        throw new IllegalArgumentException("Trailing music playlist data");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19004(int i, int i2, List list) {
        ArrayList<String> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2557) it.next()).getPath());
        }
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty music playlist");
        }
        C11018 c11018M43576 = C18917.m43576(1297107969);
        c11018M43576.writeInt(arrayList.size());
        for (String str : arrayList) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            c11018M43576.m27786(str);
        }
        InterfaceC17314 interfaceC17314Mo4065 = interfaceC17314Edit.mo4067("mpl", c11018M43576.m27798()).mo4065(i, "mpi");
        if (i2 > 0) {
            interfaceC17314Mo4065.mo4065(i2, "mpp");
        } else {
            interfaceC17314Mo4065.remove("mpp");
        }
        interfaceC17314Mo4065.apply();
        f23817++;
    }
}
