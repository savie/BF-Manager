package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5330 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List f18725;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f18726;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Map f18727;

    static {
        String string = ApplicationC17729.f58258.getString("tma", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    linkedHashSet.add(jSONArray.getString(i));
                }
                m15979(m15977(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12787(1));
        arrayList.add(new C12787(2));
        arrayList.add(new C12787(3));
        arrayList.add(new C12787(4));
        arrayList.add(new C12787(5));
        arrayList.add(new C12787(6));
        arrayList.add(new C12787(7));
        arrayList.add(new C12787(8));
        arrayList.add(new C12787(9));
        arrayList.add(new C12787(10));
        arrayList.add(new C12787(11));
        arrayList.add(new C12787(12));
        arrayList.add(new C12787(13));
        arrayList.add(new C12787(14));
        arrayList.add(C15024.f49062);
        arrayList.add(C21738.f69343);
        m15979(arrayList);
        m15981();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m15980() {
        return f18725;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m15982() {
        m15978();
        return f18725;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Map m15983() {
        m15978();
        return f18727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15978() {
        int iM52716 = C23522.m52716();
        if (iM52716 == f18726) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18300 c18300 : C23522.m52705()) {
            ArrayList arrayList = new ArrayList();
            c18300.m42664(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c18300.m42672() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC22484 abstractC22484 : f18725) {
            if (abstractC22484 instanceof C19500) {
                linkedHashSet.remove(abstractC22484.mo31674());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f18726 = iM52716;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f18725);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C19500((String) it2.next(), false));
        }
        m15979(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15977(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C12787.m31672());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C18300 c18300 : C23522.m52705()) {
            ArrayList arrayList = new ArrayList();
            c18300.m42664(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c18300.m42672() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC22484> list = f18725;
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
                Integer numM31671 = C12787.m31671(str);
                if (numM31671 != null) {
                    arrayList2.add(new C12787(numM31671.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C19500 c19500 = (C19500) map.get(str);
                if (c19500 == null) {
                    c19500 = new C19500(str, false);
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
    public static void m15979(ArrayList arrayList) {
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
        f18725 = C4681.unmodifiableList(arrayList);
        f18727 = C4681.unmodifiableMap(map);
        f18726 = C23522.m52716();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m15981() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f18725.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC22484) it.next()).mo31674());
        }
        ApplicationC17729.f58258.edit().putString("tma", jSONArray.toString()).apply();
    }
}
