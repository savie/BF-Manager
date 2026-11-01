package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16926 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List f54117;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f54118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Map f54119;

    static {
        m39619();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m39619() {
        int i;
        String string = ApplicationC0716.f2992.getString("ema", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashSet.add(jSONArray.getString(i2));
                }
                m39618(m39616(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        String string2 = C16737.f53607.getString("fms", null);
        if (string2 != null) {
            C16737.f53607.edit().remove("fms").apply();
            try {
                String[] strArrSplit = string2.split("\\|");
                if (strArrSplit.length % 2 != 0) {
                    throw new Exception();
                }
                C10672 c10672 = new C10672(15, 0);
                for (int i3 = 0; i3 < strArrSplit.length; i3 += 2) {
                    c10672.mo26878(Integer.parseInt(strArrSplit[i3]), Integer.parseInt(strArrSplit[i3 + 1]));
                }
                ArrayList<InterfaceC21254> arrayList = new ArrayList(c10672.mo26882());
                Collections.sort(arrayList, C7618.comparingInt(new C0697()));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z = false;
                boolean z2 = false;
                for (InterfaceC21254 interfaceC21254 : arrayList) {
                    if (!z2 && interfaceC21254.mo45096() >= 300 && interfaceC21254.mo45096() < 500) {
                        linkedHashSet2.add("divider:secondary");
                        z2 = true;
                    } else if (!z && interfaceC21254.mo45096() >= 500) {
                        linkedHashSet2.add("divider:hidden");
                        z = true;
                    }
                    switch (interfaceC21254.mo45097()) {
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
                        linkedHashSet2.add(C20454.m46258(i));
                    }
                }
                m39618(m39616(linkedHashSet2));
                m39622();
                return;
            } catch (Exception unused2) {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C20454(7));
        arrayList2.add(new C20454(10));
        arrayList2.add(new C20454(1));
        arrayList2.add(new C20454(2));
        arrayList2.add(new C20454(3));
        arrayList2.add(new C20454(4));
        arrayList2.add(new C20454(5));
        arrayList2.add(new C20454(14));
        arrayList2.add(new C20454(8));
        arrayList2.add(new C20454(11));
        arrayList2.add(C18421.f58739);
        arrayList2.add(new C20454(12));
        arrayList2.add(new C20454(15));
        arrayList2.add(C22655.f73802);
        arrayList2.add(new C20454(13));
        arrayList2.add(new C20454(9));
        arrayList2.add(new C20454(6));
        m39618(arrayList2);
        m39622();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m39620() {
        return f54117;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m39621() {
        m39617();
        return f54117;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Map m39615() {
        m39617();
        return f54119;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39617() {
        int iM40032 = C17132.m40032();
        if (iM40032 == f54118) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11986 c11986 : C17132.m40019()) {
            ArrayList arrayList = new ArrayList();
            c11986.m29815(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c11986.m29843() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC21243 abstractC21243 : f54117) {
            if (abstractC21243 instanceof C17715) {
                linkedHashSet.remove(abstractC21243.mo20676());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f54118 = iM40032;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f54117);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C17715((String) it2.next(), true));
        }
        m39618(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m39616(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C20454.m46256());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C11986 c11986 : C17132.m40019()) {
            ArrayList arrayList = new ArrayList();
            c11986.m29815(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c11986.m29843() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC21243> list = f54117;
        if (list != null) {
            for (AbstractC21243 abstractC21243 : list) {
                if (abstractC21243 instanceof C17715) {
                    map.put(abstractC21243.mo20676(), (C17715) abstractC21243);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM46257 = C20454.m46257(str);
                if (numM46257 != null) {
                    arrayList2.add(new C20454(numM46257.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C17715 c17715 = (C17715) map.get(str);
                if (c17715 == null) {
                    c17715 = new C17715(str, true);
                }
                arrayList2.add(c17715);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C22655.f73802);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C18421.f58739);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39618(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC21243 abstractC21243 = (AbstractC21243) it.next();
            if (abstractC21243 == C18421.f58739) {
                i = 300;
            } else {
                if (abstractC21243 == C22655.f73802) {
                    break;
                }
                map.put(abstractC21243.mo20676(), Integer.valueOf(i));
                i++;
            }
        }
        f54117 = C0561.unmodifiableList(arrayList);
        f54119 = C0561.unmodifiableMap(map);
        f54118 = C17132.m40032();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m39622() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f54117.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC21243) it.next()).mo20676());
        }
        ApplicationC0716.f2992.edit().putString("ema", jSONArray.toString()).apply();
    }
}
