package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3202 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List f10441;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f10442;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Map f10443;

    static {
        m10542();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m10542() {
        int i;
        String string = ApplicationC17729.f58258.getString("ema", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashSet.add(jSONArray.getString(i2));
                }
                m10539(m10537(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        String string2 = C21576.f68931.getString("fms", null);
        if (string2 != null) {
            C21576.f68931.edit().remove("fms").apply();
            try {
                String[] strArrSplit = string2.split("\\|");
                if (strArrSplit.length % 2 != 0) {
                    throw new Exception();
                }
                C15399 c15399 = new C15399(15, 0);
                for (int i3 = 0; i3 < strArrSplit.length; i3 += 2) {
                    c15399.mo20978(Integer.parseInt(strArrSplit[i3]), Integer.parseInt(strArrSplit[i3 + 1]));
                }
                ArrayList<InterfaceC18078> arrayList = new ArrayList(c15399.mo20854());
                Collections.sort(arrayList, C2661.comparingInt(new C23340(0)));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z = false;
                boolean z2 = false;
                for (InterfaceC18078 interfaceC18078 : arrayList) {
                    if (!z2 && interfaceC18078.mo33339() >= 300 && interfaceC18078.mo33339() < 500) {
                        linkedHashSet2.add("divider:secondary");
                        z2 = true;
                    } else if (!z && interfaceC18078.mo33339() >= 500) {
                        linkedHashSet2.add("divider:hidden");
                        z = true;
                    }
                    switch (interfaceC18078.mo33340()) {
                        case 0:
                            i = 7;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 14;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 11;
                            break;
                        case 9:
                            i = 15;
                            break;
                        case 10:
                            i = 13;
                            break;
                        case 11:
                            i = 9;
                            break;
                        case 12:
                            i = 12;
                            break;
                        case 13:
                            i = 10;
                            break;
                        case 14:
                            i = 6;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    if (i != -1) {
                        linkedHashSet2.add(C15880.m37853(i));
                    }
                }
                m10539(m10537(linkedHashSet2));
                m10541();
                return;
            } catch (Exception unused2) {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C15880(7));
        arrayList2.add(new C15880(10));
        arrayList2.add(new C15880(1));
        arrayList2.add(new C15880(2));
        arrayList2.add(new C15880(3));
        arrayList2.add(new C15880(4));
        arrayList2.add(new C15880(5));
        arrayList2.add(new C15880(14));
        arrayList2.add(new C15880(8));
        arrayList2.add(new C15880(11));
        arrayList2.add(C15024.f49062);
        arrayList2.add(new C15880(12));
        arrayList2.add(new C15880(15));
        arrayList2.add(C21738.f69343);
        arrayList2.add(new C15880(13));
        arrayList2.add(new C15880(9));
        arrayList2.add(new C15880(6));
        m10539(arrayList2);
        m10541();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m10540() {
        return f10441;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m10543() {
        m10538();
        return f10441;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Map m10544() {
        m10538();
        return f10443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10538() {
        int iM52716 = C23522.m52716();
        if (iM52716 == f10442) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18300 c18300 : C23522.m52705()) {
            ArrayList arrayList = new ArrayList();
            c18300.m42655(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c18300.m42672() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC22484 abstractC22484 : f10441) {
            if (abstractC22484 instanceof C19500) {
                linkedHashSet.remove(abstractC22484.mo31674());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f10442 = iM52716;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f10441);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C19500((String) it2.next(), true));
        }
        m10539(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m10537(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C15880.m37854());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C18300 c18300 : C23522.m52705()) {
            ArrayList arrayList = new ArrayList();
            c18300.m42655(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c18300.m42672() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC22484> list = f10441;
        if (list != null) {
            for (AbstractC22484 abstractC22484 : list) {
                if (abstractC22484 instanceof C19500) {
                    map.put(abstractC22484.mo31674(), (C19500) abstractC22484);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM37852 = C15880.m37852(str);
                if (numM37852 != null) {
                    arrayList2.add(new C15880(numM37852.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C19500 c19500 = (C19500) map.get(str);
                if (c19500 == null) {
                    c19500 = new C19500(str, true);
                }
                arrayList2.add(c19500);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C21738.f69343);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C15024.f49062);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10539(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC22484 abstractC22484 = (AbstractC22484) it.next();
            if (abstractC22484 == C15024.f49062) {
                i = 300;
            } else {
                if (abstractC22484 == C21738.f69343) {
                    break;
                }
                map.put(abstractC22484.mo31674(), Integer.valueOf(i));
                i++;
            }
        }
        f10441 = C4681.unmodifiableList(arrayList);
        f10443 = C4681.unmodifiableMap(map);
        f10442 = C23522.m52716();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m10541() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f10441.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC22484) it.next()).mo31674());
        }
        ApplicationC17729.f58258.edit().putString("ema", jSONArray.toString()).apply();
    }
}
