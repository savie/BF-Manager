package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.json.JSONValue;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17CG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19518 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15399 f62971;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C17930 f62972;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f62973;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ArrayList f62974;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f62975;

    static {
        Object obj = new Object();
        f62975 = obj;
        ArrayList arrayList = new ArrayList();
        f62974 = arrayList;
        C15399 c15399 = new C15399();
        f62971 = c15399;
        f62972 = new C17930();
        f62973 = 1;
        synchronized (obj) {
            arrayList.clear();
            c15399.clear();
            f62973 = 1;
            String string = ApplicationC17729.f58258.getString("ndg_data", null);
            if (string != null && !string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f62973 = Math.max(1, jSONObject.getInt("nextId"));
                    JSONArray jSONArray = jSONObject.getJSONArray("groups");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        f62974.add(new C10567(jSONObject2.getInt("id"), jSONObject2.getString("name")));
                    }
                    if (jSONObject.contains("assignments")) {
                        for (JSONObject.Member member : jSONObject.getJSONObject("assignments")) {
                            f62971.mo20978(Integer.parseInt(member.getName()), member.getValue().asInt());
                        }
                    }
                } catch (JSONParseException | NumberFormatException unused) {
                    f62974.clear();
                    f62971.clear();
                    f62973 = 1;
                }
            }
        }
        m45055();
        C7606.m20789(new C7035());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45044(Main main, C18222 c18222) {
        f62972.m40350(main, c18222);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45054() {
        ArrayList arrayList;
        synchronized (f62975) {
            arrayList = new ArrayList(f62974);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m45063() {
        return f62974.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45048(C10017 c10017) {
        synchronized (f62975) {
            Iterator it = f62974.iterator();
            while (it.hasNext()) {
                c10017.accept((C10567) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45051(int i, String str) {
        synchronized (f62975) {
            for (C10567 c10567 : f62974) {
                if (c10567.f33580 != i && str.equals(c10567.f33581)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45045(String str) {
        synchronized (f62975) {
            int i = f62973;
            f62973 = i + 1;
            f62974.add(new C10567(i, str));
            m45057();
        }
        f62972.mo40348(Object.class);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m45061(int i, String str) {
        synchronized (f62975) {
            C10567 c10567M45059 = m45059(i);
            if (c10567M45059 == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            c10567M45059.f33581 = str;
            m45057();
        }
        f62972.mo40348(Object.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45040(final int i) {
        ArrayList arrayListM45056 = m45056();
        synchronized (f62975) {
            if (m45059(i) == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            C1170.removeIf(f62974, new Predicate() { // from class: l.۬ۡܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C10567) obj).f33580 == i;
                }
            });
            C1170.removeIf(f62971.mo20854(), new Predicate() { // from class: l.ۙۖܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC18078) obj).mo33339() == i;
                }
            });
        }
        m45047(arrayListM45056, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45046(ArrayList arrayList) {
        ArrayList arrayListM45056 = m45056();
        synchronized (f62975) {
            int size = arrayList.size();
            ArrayList<C10567> arrayList2 = f62974;
            if (size != arrayList2.size()) {
                throw new IllegalArgumentException("Unexpected group count " + arrayList.size());
            }
            HashMap map = new HashMap(arrayList2.size());
            for (C10567 c10567 : arrayList2) {
                map.put(Integer.valueOf(c10567.f33580), c10567);
            }
            ArrayList arrayList3 = new ArrayList(f62974.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num == null) {
                    throw new IllegalArgumentException("Group id can not be null");
                }
                C10567 c10568 = (C10567) map.remove(num);
                if (c10568 == null) {
                    throw new IllegalArgumentException("Unknown or duplicate group " + num);
                }
                arrayList3.add(c10568);
            }
            if (!map.isEmpty()) {
                throw new IllegalArgumentException("Missing group ids " + map.keySet());
            }
            ArrayList arrayList4 = f62974;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        m45047(arrayListM45056, true, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m45058() {
        ArrayList<AbstractC0148> arrayListM45056 = m45056();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f62975) {
            for (C10567 c10567 : f62974) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", c10567.f33581);
                jSONArray.add(jSONObject3);
            }
            for (AbstractC0148 abstractC0148 : arrayListM45056) {
                int iM45062 = m45062(abstractC0148.f1127);
                C10567 c10567M45059 = iM45062 == -1 ? null : m45059(iM45062);
                jSONObject2.put(String.valueOf(abstractC0148.f1127), c10567M45059 == null ? "" : c10567M45059.f33581);
            }
        }
        jSONObject.put("groups", jSONArray);
        jSONObject.put("assignments", jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45043(JSONObject jSONObject, boolean z) {
        JSONValue value;
        String strAsString;
        String strTrim;
        ArrayList arrayListM45056 = m45056();
        C21756 c21756 = new C21756();
        HashMap map = new HashMap();
        JSONArray jSONArray = jSONObject.getJSONArray("groups");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONValue jSONValue = jSONArray.get(i);
                String str = null;
                if (jSONValue != null) {
                    if (jSONValue.isObject()) {
                        JSONValue jSONValue2 = jSONValue.asObject().get("name");
                        if (jSONValue2 != null && jSONValue2.isString()) {
                            strAsString = jSONValue2.asString();
                            strTrim = strAsString.trim();
                            if (!strTrim.isEmpty()) {
                                str = strTrim;
                            }
                        }
                    } else if (jSONValue.isString()) {
                        strAsString = jSONValue.asString();
                        strTrim = strAsString.trim();
                        if (!strTrim.isEmpty()) {
                            str = strTrim;
                        }
                    }
                }
                if (str != null && !map.containsKey(str)) {
                    map.put(str, Boolean.TRUE);
                    c21756.f69394.add(str);
                }
            }
        }
        HashMap map2 = new HashMap(arrayListM45056.size());
        Iterator it = arrayListM45056.iterator();
        while (it.hasNext()) {
            map2.put(Integer.valueOf(((AbstractC0148) it.next()).f1127), Boolean.TRUE);
        }
        JSONObject<JSONObject.Member> jSONObject2 = jSONObject.getJSONObject("assignments");
        if (jSONObject2 != null) {
            for (JSONObject.Member member : jSONObject2) {
                try {
                    int i2 = Integer.parseInt(member.getName());
                    if (map2.containsKey(Integer.valueOf(i2)) && (value = member.getValue()) != null && value.isString()) {
                        String strTrim2 = value.asString().trim();
                        if (strTrim2.isEmpty() || map.containsKey(strTrim2)) {
                            c21756.f69393.put(Integer.valueOf(i2), strTrim2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        synchronized (f62975) {
            try {
                if (z) {
                    m45049(c21756);
                } else {
                    m45050(c21756, arrayListM45056);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m45047(arrayListM45056, true, true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m45053(int i) {
        int iM45062;
        synchronized (f62975) {
            iM45062 = m45062(i);
        }
        return iM45062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45041(int i, int i2, Integer num) {
        int iM45037;
        ArrayList arrayListM45056 = m45056();
        int iM45038 = m45037(arrayListM45056, i);
        if (iM45038 < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unknown config "));
        }
        synchronized (f62975) {
            iM45037 = -1;
            if (m45062(i) == i2) {
                if (num != null) {
                    iM45037 = m45037(arrayListM45056, num.intValue());
                }
                if (iM45037 < 0) {
                    iM45037 = iM45038;
                }
            } else {
                int iM45039 = m45038(arrayListM45056, iM45038, i2, num);
                C15399 c15399 = f62971;
                if (i2 == -1) {
                    c15399.remove(i);
                } else {
                    if (m45059(i2) == null) {
                        throw new IllegalArgumentException("Unknown group " + i2);
                    }
                    c15399.mo20978(i, i2);
                }
                m45057();
                iM45037 = iM45039;
            }
        }
        if (iM45038 != iM45037) {
            C7606.m20785(iM45038, iM45037);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45038(ArrayList arrayList, int i, int i2, Integer num) {
        int iM45037 = num == null ? -1 : m45037(arrayList, num.intValue());
        if (iM45037 < 0) {
            ArrayList arrayList2 = f62974;
            C15399 c15399 = new C15399(arrayList2.size() + 1, 0);
            c15399.m20979();
            c15399.mo20978(-1, 0);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = ((C10567) arrayList2.get(i3)).f33580;
                i3++;
                c15399.mo20978(i4, i3);
            }
            int i5 = c15399.get(i2);
            if (i5 < 0) {
                throw new IllegalArgumentException(C13645.m33382(i2, "Unknown group "));
            }
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                if (c15399.get(m45062(((AbstractC0148) arrayList.get(i6)).f1127)) > i5) {
                    iM45037 = i6;
                }
            }
            iM45037 = size2;
        }
        return i < iM45037 ? iM45037 - 1 : iM45037;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45056() {
        ArrayList arrayList;
        synchronized (C7606.class) {
            arrayList = new ArrayList(C7606.m20791());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m45055() {
        m45047(m45056(), false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45047(ArrayList arrayList, boolean z, boolean z2) {
        C22502 c22502M45060;
        synchronized (f62975) {
            c22502M45060 = m45060(arrayList);
            if (z || c22502M45060.f72802) {
                m45057();
            }
        }
        InterfaceC9018 interfaceC9018 = c22502M45060.f72803;
        if (interfaceC9018 != null) {
            C7606.m20788(interfaceC9018);
        }
        if (z2 || c22502M45060.f72802 || c22502M45060.f72803 != null) {
            f62972.mo40348(Object.class);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45037(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC0148) arrayList.get(i2)).f1127 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22502 m45060(ArrayList arrayList) {
        C14763 c14763;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(Integer.valueOf(((AbstractC0148) it.next()).f1127), Boolean.TRUE);
        }
        boolean zRemoveIf = C1170.removeIf(f62971.mo20854(), new C14243(1, map));
        ArrayList arrayList2 = f62974;
        if (arrayList2.isEmpty()) {
            c14763 = null;
        } else {
            C14763 c14764 = new C14763(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c14764.add(((AbstractC0148) it2.next()).f1127);
            }
            C15399 c15399 = new C15399(arrayList2.size() + 1, 0);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
            c15399.mo20978(-1, 0);
            arrayList3.add(new C14763());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = ((C10567) arrayList2.get(i)).f33580;
                i++;
                c15399.mo20978(i2, i);
                arrayList3.add(new C14763());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC0148 abstractC0148 = (AbstractC0148) it3.next();
                ((InterfaceC9018) arrayList3.get(c15399.get(m45062(abstractC0148.f1127)))).add(abstractC0148.f1127);
            }
            c14763 = new C14763(arrayList.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c14763.mo14693((InterfaceC9018) it4.next());
            }
            if (c14764.size() == c14763.size()) {
                int size2 = c14764.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (c14764.getInt(i3) == c14763.getInt(i3)) {
                    }
                }
                c14763 = null;
            }
        }
        return new C22502(zRemoveIf, c14763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m45052(HashMap map, InterfaceC18078 interfaceC18078) {
        if (map.containsKey(Integer.valueOf(interfaceC18078.mo33340()))) {
            return interfaceC18078.mo33339() != -1 && m45059(interfaceC18078.mo33339()) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m45062(int i) {
        int iM36868 = f62971.m36868(i, -1);
        if (iM36868 == -1 || m45059(iM36868) == null) {
            return -1;
        }
        return iM36868;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10567 m45059(int i) {
        for (C10567 c10567 : f62974) {
            if (c10567.f33580 == i) {
                return c10567;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45050(C21756 c21756, ArrayList arrayList) {
        ArrayList arrayList2 = f62974;
        arrayList2.clear();
        f62971.clear();
        f62973 = 1;
        for (String str : c21756.f69394) {
            int i = f62973;
            f62973 = i + 1;
            arrayList2.add(new C10567(i, str));
        }
        HashMap mapM45039 = m45039();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = ((AbstractC0148) it.next()).f1127;
            m45042(i2, (String) c21756.f69393.get(Integer.valueOf(i2)), mapM45039);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45049(C21756 c21756) {
        ArrayList<String> arrayList = c21756.f69394;
        ArrayList<C10567> arrayList2 = f62974;
        HashMap map = new HashMap(arrayList2.size());
        for (C10567 c10567 : arrayList2) {
            map.put(c10567.f33581, c10567);
        }
        ArrayList arrayList3 = new ArrayList(Math.max(arrayList2.size(), arrayList.size()));
        for (String str : arrayList) {
            C10567 c10568 = (C10567) map.remove(str);
            if (c10568 == null) {
                int i = f62973;
                f62973 = i + 1;
                c10568 = new C10567(i, str);
            }
            arrayList3.add(c10568);
        }
        for (C10567 c10569 : arrayList2) {
            if (map.containsKey(c10569.f33581)) {
                arrayList3.add(c10569);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        HashMap mapM45039 = m45039();
        for (Map.Entry entry : c21756.f69393.entrySet()) {
            m45042(((Integer) entry.getKey()).intValue(), (String) entry.getValue(), mapM45039);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m45039() {
        ArrayList<C10567> arrayList = f62974;
        HashMap map = new HashMap(arrayList.size());
        for (C10567 c10567 : arrayList) {
            map.put(c10567.f33581, Integer.valueOf(c10567.f33580));
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45042(int i, String str, HashMap map) {
        C15399 c15399 = f62971;
        if (str == null || str.isEmpty()) {
            c15399.remove(i);
            return;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            c15399.mo20978(i, num.intValue());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m45057() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextId", f62973);
        JSONArray jSONArray = new JSONArray();
        for (C10567 c10567 : f62974) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", c10567.f33580);
            jSONObject2.put("name", c10567.f33581);
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("groups", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        InterfaceC15224 it = f62971.mo20854().iterator();
        while (it.hasNext()) {
            InterfaceC18078 interfaceC18078 = (InterfaceC18078) it.next();
            jSONObject3.put(String.valueOf(interfaceC18078.mo33340()), interfaceC18078.mo33339());
        }
        jSONObject.put("assignments", jSONObject3);
        ApplicationC17729.f58258.edit().putString("ndg_data", jSONObject.toString()).apply();
    }
}
