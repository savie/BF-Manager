package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2529 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f10033;

    static {
        ArrayList arrayList = new ArrayList(5);
        f10033 = arrayList;
        arrayList.add(new C11703(".ass", "text/x-ssa"));
        arrayList.add(new C11703(".ssa", "text/x-ssa"));
        arrayList.add(new C11703(".srt", "application/x-subrip"));
        arrayList.add(new C11703(".vtt", "text/vtt"));
        arrayList.add(new C11703(".ttml", "application/ttml+xml"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7903(InterfaceC2557 interfaceC2557, AbstractC9677 abstractC9677) {
        C11703 c11703M7906;
        boolean zEquals;
        String strM7905 = m7905(interfaceC2557.getName());
        final boolean zMo24615 = abstractC9677.mo24615();
        ArrayList<C13820> arrayList = new ArrayList();
        for (InterfaceC2557 interfaceC2558 : abstractC9677.mo10263(interfaceC2557.getParent(), true)) {
            if (interfaceC2558.mo7985() && !interfaceC2557.getPath().equals(interfaceC2558.getPath()) && (c11703M7906 = m7906(interfaceC2558.getName())) != null) {
                String strM7906 = m7905(interfaceC2558.getName());
                String strM29214 = c11703M7906.m29214();
                if (zMo24615) {
                    zEquals = strM7905.equalsIgnoreCase(strM7906);
                } else {
                    zEquals = strM7905.equals(strM7906);
                }
                arrayList.add(new C13820(interfaceC2558, strM29214, zEquals, c11703M7906.m29215()));
            }
        }
        C23846.sort(arrayList, new Comparator() { // from class: l.ۗܽ۬
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C13820 c13820 = (C13820) obj;
                C13820 c13821 = (C13820) obj2;
                if (c13820.m33636() != c13821.m33636()) {
                    return c13820.m33636() ? -1 : 1;
                }
                int iCompare = Integer.compare(c13820.m33633(), c13821.m33633());
                if (iCompare != 0) {
                    return iCompare;
                }
                String name = c13820.m33634().getName();
                boolean z = zMo24615;
                if (z) {
                    name = name.toLowerCase(Locale.ROOT);
                }
                String name2 = c13821.m33634().getName();
                if (z) {
                    name2 = name2.toLowerCase(Locale.ROOT);
                }
                int iCompareTo = name.compareTo(name2);
                return iCompareTo != 0 ? iCompareTo : c13820.m33634().getPath().compareTo(c13821.m33634().getPath());
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C13820 c13820 : arrayList) {
            arrayList2.add(new C4646(c13820.m33634(), c13820.m33635()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4646 m7904(List list, InterfaceC2557 interfaceC2557, boolean z) {
        boolean zEquals;
        String strM7905 = m7905(interfaceC2557.getName());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4646 c4646 = (C4646) it.next();
            String strM7906 = m7905(c4646.m12815().getName());
            if (z) {
                zEquals = strM7905.equalsIgnoreCase(strM7906);
            } else {
                zEquals = strM7905.equals(strM7906);
            }
            if (zEquals) {
                return c4646;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m7905(String str) {
        String strM46686 = AbstractC20745.m46686(str);
        return strM46686.isEmpty() ? str : str.substring(0, str.length() - strM46686.length());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11703 m7906(String str) {
        String lowerCase = AbstractC20745.m46686(str).toLowerCase(Locale.ROOT);
        ArrayList arrayList = f10033;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11703 c11703 = (C11703) arrayList.get(i);
            if (c11703.m29213().equals(lowerCase)) {
                return C11703.m29212(c11703, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7902(String str) {
        C11703 c11703M7906 = m7906(str);
        if (c11703M7906 == null) {
            return null;
        }
        return c11703M7906.m29214();
    }
}
