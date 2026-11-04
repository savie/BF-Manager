package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12127 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30299(C22941 c22941) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c22941.m51742().iterator();
        while (it.hasNext()) {
            String name = ((C8002) it.next()).getName();
            if (m30297(name)) {
                arrayList.add(name);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (String str : arrayList2) {
            String strM28558 = C11293.m28558(str);
            String strM28559 = C11293.m28558(strM28558);
            boolean z = true;
            boolean z2 = !strM28559.startsWith("base-master") || "base-master.apk".equals(strM28559);
            if (!"base.apk".equals(strM28558) && !"base-master.apk".equals(strM28558)) {
                z = false;
            }
            arrayList3.add(new C20332(str, z2, z));
        }
        C12884.sort(arrayList3, new C3178());
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30294(ArrayList arrayList, boolean[] zArr) {
        ArrayList arrayList2 = new ArrayList();
        int iMin = Math.min(arrayList.size(), zArr.length);
        for (int i = 0; i < iMin; i++) {
            if (zArr[i]) {
                arrayList2.add(((C20332) arrayList.get(i)).m46711());
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30296(C22941 c22941, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        ArrayList arrayListM30295 = m30295(c22941);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        String strM30293 = m30293(arrayListM30295);
        if (strM30293 != null) {
            linkedHashSet2.add(strM30293);
        }
        ArrayList arrayList = new ArrayList(linkedHashSet2);
        if (arrayList.size() > linkedHashSet.size()) {
            return arrayList;
        }
        String strM30294 = m30293(m30295(c22941));
        if (strM30294 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C8002 c8002 : c22941.m51742()) {
                if (m30297(c8002.getName())) {
                    arrayList2.add(c8002);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM30294 = null;
                    break;
                }
                C8002 c8003 = (C8002) it.next();
                try {
                    if (m30298(c8003, c22941)) {
                        strM30294 = c8003.getName();
                        break;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        }
        if (strM30294 != null) {
            linkedHashSet.add(strM30294);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30300(C22941 c22941) {
        boolean z;
        C8002 entry = c22941.getEntry("AndroidManifest.xml");
        if (entry == null) {
            return false;
        }
        XmlResourceParserC9734 xmlResourceParserC9734M35991 = C14955.m35982(c22941.m51731(entry, (C3374) null)).m35991();
        while (true) {
            try {
                int next = xmlResourceParserC9734M35991.next();
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
                    xmlResourceParserC9734M35991.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (z && "manifest".equals(xmlResourceParserC9734M35991.getName())) {
            int attributeCount = xmlResourceParserC9734M35991.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                if ("split".equals(xmlResourceParserC9734M35991.getAttributeName(i))) {
                    xmlResourceParserC9734M35991.close();
                    return false;
                }
            }
            xmlResourceParserC9734M35991.close();
            return true;
        }
        xmlResourceParserC9734M35991.close();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30297(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30295(C22941 c22941) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c22941.m51742().iterator();
        while (it.hasNext()) {
            String name = ((C8002) it.next()).getName();
            if (m30297(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30298(C8002 c8002, C22941 c22941) {
        C22941 c22942;
        AbstractC22044 abstractC22044M49857 = null;
        try {
            if (c8002.m21826() == 0) {
                c22942 = c22941.m51743(c8002);
            } else {
                abstractC22044M49857 = C6382.f21563.m49857(".apk");
                abstractC22044M49857.m49840(c22941.m51727(c8002));
                c22942 = new C22941(abstractC22044M49857);
            }
            try {
                boolean zM30300 = m30300(c22942);
                c22942.close();
                if (abstractC22044M49857 != null) {
                    abstractC22044M49857.mo4296();
                }
                return zM30300;
            } catch (Throwable th) {
                try {
                    c22942.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC22044M49857 != null) {
                abstractC22044M49857.mo4296();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30293(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("base.apk".equals(C11293.m28558(str))) {
                return str;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if ("base-master.apk".equals(C11293.m28558(str2))) {
                return str2;
            }
        }
        return null;
    }
}
