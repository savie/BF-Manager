package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩷᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21132 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47558(C2455 c2455) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c2455.m7466().iterator();
        while (it.hasNext()) {
            String name = ((C12107) it.next()).getName();
            if (m47556(name)) {
                arrayList.add(name);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (String str : arrayList2) {
            String strM18175 = C6730.m18175(str);
            String strM18176 = C6730.m18175(strM18175);
            boolean z = true;
            boolean z2 = !strM18176.startsWith("base-master") || "base-master.apk".equals(strM18176);
            if (!"base.apk".equals(strM18175) && !"base-master.apk".equals(strM18175)) {
                z = false;
            }
            arrayList3.add(new C7727(str, z2, z));
        }
        C23846.sort(arrayList3, new C10550());
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47553(ArrayList arrayList, boolean[] zArr) {
        ArrayList arrayList2 = new ArrayList();
        int iMin = Math.min(arrayList.size(), zArr.length);
        for (int i = 0; i < iMin; i++) {
            if (zArr[i]) {
                arrayList2.add(((C7727) arrayList.get(i)).m20373());
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47555(C2455 c2455, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        ArrayList arrayListM47554 = m47554(c2455);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        String strM47552 = m47552(arrayListM47554);
        if (strM47552 != null) {
            linkedHashSet2.add(strM47552);
        }
        ArrayList arrayList = new ArrayList(linkedHashSet2);
        if (arrayList.size() > linkedHashSet.size()) {
            return arrayList;
        }
        String strM47553 = m47552(m47554(c2455));
        if (strM47553 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C12107 c12107 : c2455.m7466()) {
                if (m47556(c12107.getName())) {
                    arrayList2.add(c12107);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM47553 = null;
                    break;
                }
                C12107 c12108 = (C12107) it.next();
                try {
                    if (m47557(c12108, c2455)) {
                        strM47553 = c12108.getName();
                        break;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        }
        if (strM47553 != null) {
            linkedHashSet.add(strM47553);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m47559(C2455 c2455) {
        boolean z;
        C12107 entry = c2455.getEntry("AndroidManifest.xml");
        if (entry == null) {
            return false;
        }
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = C20945.m47103(c2455.m7475(entry, (C8516) null)).m47106();
        while (true) {
            try {
                int next = xmlResourceParserC11068M47106.next();
                if (next != 1) {
                    if (next == 2) {
                        z = true;
                        break;
                    }
                    if (next == 3) {
                    }
                }
                z = false;
                break;
            } catch (Throwable th) {
                try {
                    xmlResourceParserC11068M47106.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (z && "manifest".equals(xmlResourceParserC11068M47106.getName())) {
            int attributeCount = xmlResourceParserC11068M47106.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                if ("split".equals(xmlResourceParserC11068M47106.getAttributeName(i))) {
                    xmlResourceParserC11068M47106.close();
                    return false;
                }
            }
            xmlResourceParserC11068M47106.close();
            return true;
        }
        xmlResourceParserC11068M47106.close();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47556(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47554(C2455 c2455) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c2455.m7466().iterator();
        while (it.hasNext()) {
            String name = ((C12107) it.next()).getName();
            if (m47556(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47557(C12107 c12107, C2455 c2455) {
        C2455 c2456;
        AbstractC20745 abstractC20745M46688 = null;
        try {
            if (c12107.m30119() == 0) {
                c2456 = c2455.m7476(c12107);
            } else {
                abstractC20745M46688 = C11904.f39941.m46688(".apk");
                abstractC20745M46688.m46694(c2455.m7471(c12107));
                c2456 = new C2455(abstractC20745M46688);
            }
            try {
                boolean zM47559 = m47559(c2456);
                c2456.close();
                if (abstractC20745M46688 != null) {
                    abstractC20745M46688.mo24647();
                }
                return zM47559;
            } catch (Throwable th) {
                try {
                    c2456.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC20745M46688 != null) {
                abstractC20745M46688.mo24647();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47552(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("base.apk".equals(C6730.m18175(str))) {
                return str;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if ("base-master.apk".equals(C6730.m18175(str2))) {
                return str2;
            }
        }
        return null;
    }
}
