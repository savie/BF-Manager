package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C19331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f62446 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f62447;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44719(AbstractC7629 abstractC7629, List list, int i) {
        C11969 c11969 = C11969.f38536;
        if (abstractC7629 == c11969) {
            if (list.isEmpty() || i < 0 || i >= list.size()) {
                throw new IllegalArgumentException("Invalid music playlist");
            }
            if (abstractC7629 == c11969 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        if (((InterfaceC2386) it.next()).mo8093().m49833()) {
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                synchronized (f62446) {
                    m44715(i, 0, list);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44717(AbstractC7629 abstractC7629, int i) {
        if (abstractC7629 != C11969.f38536) {
            return;
        }
        synchronized (f62446) {
            if (ApplicationC17729.f58258.contains("mpl")) {
                ApplicationC17729.f58258.edit().mo3486(i, "mpi").remove("mpp").apply();
                f62447++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44718(AbstractC7629 abstractC7629, int i, int i2) {
        if (abstractC7629 != C11969.f38536) {
            return;
        }
        synchronized (f62446) {
            if (ApplicationC17729.f58258.contains("mpl") && ApplicationC17729.f58258.mo7902(21, "mpi") && ApplicationC17729.f58258.getInt("mpi", -1) == i) {
                InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
                if (i2 > 0) {
                    interfaceC18752Edit.mo3486(i2, "mpp");
                } else {
                    interfaceC18752Edit.remove("mpp");
                }
                interfaceC18752Edit.apply();
                f62447++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44716(AbstractC7629 abstractC7629) {
        if (abstractC7629 != C11969.f38536) {
            return;
        }
        synchronized (f62446) {
            if (ApplicationC17729.f58258.contains("mpp")) {
                ApplicationC17729.f58258.edit().remove("mpp").apply();
                f62447++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8144 m44714() {
        boolean zContains;
        byte[] bArrMo7903;
        int i;
        int i2;
        boolean z;
        long j;
        int i3;
        synchronized (f62446) {
            zContains = ApplicationC17729.f58258.contains("mpl");
            bArrMo7903 = ApplicationC17729.f58258.mo7902(25, "mpl") ? ApplicationC17729.f58258.mo7903("mpl", (byte[]) null) : null;
            i = ApplicationC17729.f58258.mo7902(21, "mpi") ? ApplicationC17729.f58258.getInt("mpi", -1) : -1;
            boolean zContains2 = ApplicationC17729.f58258.contains("mpp");
            boolean z2 = !zContains2 || ApplicationC17729.f58258.mo7902(21, "mpp");
            i2 = z2 ? ApplicationC17729.f58258.getInt("mpp", 0) : 0;
            z = zContains2 && (!z2 || i2 <= 0);
            if (i2 <= 0) {
                i2 = 0;
            }
            j = f62447;
        }
        if (bArrMo7903 == null || bArrMo7903.length == 0) {
            return new C8144(null, zContains, 0, j);
        }
        try {
            ArrayList arrayListM44713 = m44713(bArrMo7903);
            if (i < 0 || i >= arrayListM44713.size()) {
                throw new IllegalArgumentException("Invalid music playlist index");
            }
            ArrayList arrayList = new ArrayList(arrayListM44713.size());
            ArrayList arrayList2 = new ArrayList(arrayListM44713.size());
            boolean z3 = false;
            for (int i4 = 0; i4 < arrayListM44713.size(); i4++) {
                try {
                    AbstractC22044 abstractC22044M35193 = C14584.m35193((String) arrayListM44713.get(i4), new String[0]);
                    if (abstractC22044M35193.mo4304()) {
                        C6004 c6004 = new C6004(abstractC22044M35193);
                        if (c6004.mo8114().startsWith("audio/")) {
                            arrayList.add(c6004);
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
                return new C8144(null, true, 0, j);
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
            return new C8144(new C12184(C11969.f38536, arrayList, i5), arrayList.size() != arrayListM44713.size() || z, i3, j);
        } catch (RuntimeException unused2) {
            return new C8144(null, true, 0, j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44720(C8144 c8144) {
        synchronized (f62446) {
            if (f62447 != c8144.m22024()) {
                return false;
            }
            if (!c8144.m22025()) {
                return true;
            }
            C12184 c12184M22022 = c8144.m22022();
            if (c12184M22022 != null) {
                m44715(c12184M22022.m30458(), c8144.m22023(), c12184M22022.m30460());
            } else {
                ApplicationC17729.f58258.edit().remove("mpl").remove("mpi").remove("mpp").apply();
                f62447++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44713(byte[] bArr) {
        C20348 c20348M46740 = C20348.m46740(bArr);
        if (c20348M46740.readInt() != 1297107969) {
            throw new IllegalArgumentException("Unsupported music playlist format");
        }
        int i = c20348M46740.readInt();
        if (i <= 0 || i > c20348M46740.available()) {
            throw new IllegalArgumentException("Invalid music playlist size");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM46758 = c20348M46740.m46758();
            if (strM46758.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            arrayList.add(strM46758);
        }
        if (c20348M46740.available() == 0) {
            return arrayList;
        }
        throw new IllegalArgumentException("Trailing music playlist data");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44715(int i, int i2, List list) {
        ArrayList<String> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2386) it.next()).getPath());
        }
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Empty music playlist");
        }
        C6178 c6178M34975 = C14483.m34975(1297107969);
        c6178M34975.writeInt(arrayList.size());
        for (String str : arrayList) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Invalid music path");
            }
            c6178M34975.m17800(str);
        }
        InterfaceC18752 interfaceC18752Mo3486 = interfaceC18752Edit.mo3488("mpl", c6178M34975.m17799()).mo3486(i, "mpi");
        if (i2 > 0) {
            interfaceC18752Mo3486.mo3486(i2, "mpp");
        } else {
            interfaceC18752Mo3486.remove("mpp");
        }
        interfaceC18752Mo3486.apply();
        f62447++;
    }
}
