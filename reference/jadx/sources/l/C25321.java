package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes.dex */
public final class C25321 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f81781;

    static {
        ArrayList arrayList = new ArrayList(5);
        f81781 = arrayList;
        arrayList.add(new C11894(".ass", "text/x-ssa"));
        arrayList.add(new C11894(".ssa", "text/x-ssa"));
        arrayList.add(new C11894(".srt", "application/x-subrip"));
        arrayList.add(new C11894(".vtt", "text/vtt"));
        arrayList.add(new C11894(".ttml", "application/ttml+xml"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m56595(InterfaceC2386 interfaceC2386, AbstractC7629 abstractC7629) {
        C11894 c11894M56598;
        boolean zEquals;
        String strM56597 = m56597(interfaceC2386.getName());
        final boolean zMo20839 = abstractC7629.mo20839();
        ArrayList<C2200> arrayList = new ArrayList();
        for (InterfaceC2386 interfaceC2387 : abstractC7629.mo20830(interfaceC2386.getParent(), true)) {
            if (interfaceC2387.mo8090() && !interfaceC2386.getPath().equals(interfaceC2387.getPath()) && (c11894M56598 = m56598(interfaceC2387.getName())) != null) {
                String strM56598 = m56597(interfaceC2387.getName());
                String strM29773 = c11894M56598.m29773();
                if (zMo20839) {
                    zEquals = strM56597.equalsIgnoreCase(strM56598);
                } else {
                    zEquals = strM56597.equals(strM56598);
                }
                arrayList.add(new C2200(interfaceC2387, strM29773, zEquals, c11894M56598.m29775()));
            }
        }
        C12884.sort(arrayList, new Comparator() { // from class: l.۫᩸֫
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C2200 c2200 = (C2200) obj;
                C2200 c2201 = (C2200) obj2;
                if (c2200.m7512() != c2201.m7512()) {
                    return c2200.m7512() ? -1 : 1;
                }
                int iCompare = Integer.compare(c2200.m7511(), c2201.m7511());
                if (iCompare != 0) {
                    return iCompare;
                }
                String name = c2200.m7510().getName();
                boolean z = zMo20839;
                if (z) {
                    name = name.toLowerCase(Locale.ROOT);
                }
                String name2 = c2201.m7510().getName();
                if (z) {
                    name2 = name2.toLowerCase(Locale.ROOT);
                }
                int iCompareTo = name.compareTo(name2);
                return iCompareTo != 0 ? iCompareTo : c2200.m7510().getPath().compareTo(c2201.m7510().getPath());
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C2200 c2200 : arrayList) {
            arrayList2.add(new C5929(c2200.m7510(), c2200.m7513()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5929 m56596(List list, InterfaceC2386 interfaceC2386, boolean z) {
        boolean zEquals;
        String strM56597 = m56597(interfaceC2386.getName());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5929 c5929 = (C5929) it.next();
            String strM56598 = m56597(c5929.m17243().getName());
            if (z) {
                zEquals = strM56597.equalsIgnoreCase(strM56598);
            } else {
                zEquals = strM56597.equals(strM56598);
            }
            if (zEquals) {
                return c5929;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m56597(String str) {
        String strM49832 = AbstractC22044.m49832(str);
        return strM49832.isEmpty() ? str : str.substring(0, str.length() - strM49832.length());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11894 m56598(String str) {
        String lowerCase = AbstractC22044.m49832(str).toLowerCase(Locale.ROOT);
        ArrayList arrayList = f81781;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11894 c11894 = (C11894) arrayList.get(i);
            if (c11894.m29774().equals(lowerCase)) {
                return C11894.m29772(c11894, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56594(String str) {
        C11894 c11894M56598 = m56598(str);
        if (c11894M56598 == null) {
            return null;
        }
        return c11894M56598.m29773();
    }
}
