package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19127 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List f61795;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f61796;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Map f61797;

    static {
        String string = ApplicationC0716.f2992.getString("tma", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    linkedHashSet.add(jSONArray.getString(i));
                }
                m43948(m43946(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7838(1));
        arrayList.add(new C7838(2));
        arrayList.add(new C7838(3));
        arrayList.add(new C7838(4));
        arrayList.add(new C7838(5));
        arrayList.add(new C7838(6));
        arrayList.add(new C7838(7));
        arrayList.add(new C7838(8));
        arrayList.add(new C7838(9));
        arrayList.add(new C7838(10));
        arrayList.add(new C7838(11));
        arrayList.add(new C7838(12));
        arrayList.add(new C7838(13));
        arrayList.add(new C7838(14));
        arrayList.add(C18421.f58739);
        arrayList.add(C22655.f73802);
        m43948(arrayList);
        m43949();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m43950() {
        return f61795;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m43951() {
        m43947();
        return f61795;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Map m43945() {
        m43947();
        return f61797;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43947() {
        int iM40032 = C17132.m40032();
        if (iM40032 == f61796) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11986 c11986 : C17132.m40019()) {
            ArrayList arrayList = new ArrayList();
            c11986.m29828(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c11986.m29843() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC21243 abstractC21243 : f61795) {
            if (abstractC21243 instanceof C17715) {
                linkedHashSet.remove(abstractC21243.mo20676());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f61796 = iM40032;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f61795);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C17715((String) it2.next(), false));
        }
        m43948(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m43946(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C7838.m20674());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C11986 c11986 : C17132.m40019()) {
            ArrayList arrayList = new ArrayList();
            c11986.m29828(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c11986.m29843() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC21243> list = f61795;
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
                Integer numM20673 = C7838.m20673(str);
                if (numM20673 != null) {
                    arrayList2.add(new C7838(numM20673.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C17715 c17715 = (C17715) map.get(str);
                if (c17715 == null) {
                    c17715 = new C17715(str, false);
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
    public static void m43948(ArrayList arrayList) {
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
        f61795 = C0561.unmodifiableList(arrayList);
        f61797 = C0561.unmodifiableMap(map);
        f61796 = C17132.m40032();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m43949() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f61795.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC21243) it.next()).mo20676());
        }
        ApplicationC0716.f2992.edit().putString("tma", jSONArray.toString()).apply();
    }
}
