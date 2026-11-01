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

/* JADX INFO: renamed from: l.ۙܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 17CG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4757 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f16754;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10672 f16755;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f16756;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9186 f16757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f16758;

    static {
        Object obj = new Object();
        f16754 = obj;
        ArrayList arrayList = new ArrayList();
        f16758 = arrayList;
        C10672 c10672 = new C10672();
        f16755 = c10672;
        f16757 = new C9186();
        f16756 = 1;
        synchronized (obj) {
            arrayList.clear();
            c10672.clear();
            f16756 = 1;
            String string = ApplicationC0716.f2992.getString("ndg_data", null);
            if (string != null && !string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f16756 = Math.max(1, jSONObject.getInt("nextId"));
                    JSONArray jSONArray = jSONObject.getJSONArray("groups");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        f16758.add(new C9843(jSONObject2.getInt("id"), jSONObject2.getString("name")));
                    }
                    if (jSONObject.contains("assignments")) {
                        for (JSONObject.Member member : jSONObject.getJSONObject("assignments")) {
                            f16755.mo26878(Integer.parseInt(member.getName()), member.getValue().asInt());
                        }
                    }
                } catch (JSONParseException | NumberFormatException unused) {
                    f16758.clear();
                    f16755.clear();
                    f16756 = 1;
                }
            }
        }
        m13186();
        C5717.m15764(new C11254());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13196(Main main, C7726 c7726) {
        f16757.m44959(main, c7726);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13207() {
        ArrayList arrayList;
        synchronized (f16754) {
            arrayList = new ArrayList(f16758);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m13188() {
        return f16758.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13200(C0669 c0669) {
        synchronized (f16754) {
            Iterator it = f16758.iterator();
            while (it.hasNext()) {
                c0669.accept((C9843) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13203(int i, String str) {
        synchronized (f16754) {
            for (C9843 c9843 : f16758) {
                if (c9843.f33625 != i && str.equals(c9843.f33626)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13197(String str) {
        synchronized (f16754) {
            int i = f16756;
            f16756 = i + 1;
            f16758.add(new C9843(i, str));
            m13205();
        }
        f16757.mo23641(Object.class);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13211(int i, String str) {
        synchronized (f16754) {
            C9843 c9843M13210 = m13210(i);
            if (c9843M13210 == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            c9843M13210.f33626 = str;
            m13205();
        }
        f16757.mo23641(Object.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13192(final int i) {
        ArrayList arrayListM13212 = m13212();
        synchronized (f16754) {
            if (m13210(i) == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            C9030.removeIf(f16758, new Predicate() { // from class: l.᩻᩷᩹
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C9843) obj).f33625 == i;
                }
            });
            C9030.removeIf(f16755.mo26882(), new Predicate() { // from class: l.ܳ᩷᩹
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC21254) obj).mo45096() == i;
                }
            });
        }
        m13199(arrayListM13212, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13198(ArrayList arrayList) {
        ArrayList arrayListM13212 = m13212();
        synchronized (f16754) {
            int size = arrayList.size();
            ArrayList<C9843> arrayList2 = f16758;
            if (size != arrayList2.size()) {
                throw new IllegalArgumentException("Unexpected group count " + arrayList.size());
            }
            HashMap map = new HashMap(arrayList2.size());
            for (C9843 c9843 : arrayList2) {
                map.put(Integer.valueOf(c9843.f33625), c9843);
            }
            ArrayList arrayList3 = new ArrayList(f16758.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num == null) {
                    throw new IllegalArgumentException("Group id can not be null");
                }
                C9843 c9844 = (C9843) map.remove(num);
                if (c9844 == null) {
                    throw new IllegalArgumentException("Unknown or duplicate group " + num);
                }
                arrayList3.add(c9844);
            }
            if (!map.isEmpty()) {
                throw new IllegalArgumentException("Missing group ids " + map.keySet());
            }
            ArrayList arrayList4 = f16758;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        m13199(arrayListM13212, true, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13208() {
        ArrayList<AbstractC12068> arrayListM13212 = m13212();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f16754) {
            for (C9843 c9843 : f16758) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", c9843.f33626);
                jSONArray.add(jSONObject3);
            }
            for (AbstractC12068 abstractC12068 : arrayListM13212) {
                int iM13187 = m13187(abstractC12068.f40385);
                C9843 c9843M13210 = iM13187 == -1 ? null : m13210(iM13187);
                jSONObject2.put(String.valueOf(abstractC12068.f40385), c9843M13210 == null ? "" : c9843M13210.f33626);
            }
        }
        jSONObject.put("groups", jSONArray);
        jSONObject.put("assignments", jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13195(JSONObject jSONObject, boolean z) {
        JSONValue value;
        String strAsString;
        String strTrim;
        ArrayList arrayListM13212 = m13212();
        C2080 c2080 = new C2080();
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
                    c2080.f7685.add(str);
                }
            }
        }
        HashMap map2 = new HashMap(arrayListM13212.size());
        Iterator it = arrayListM13212.iterator();
        while (it.hasNext()) {
            map2.put(Integer.valueOf(((AbstractC12068) it.next()).f40385), Boolean.TRUE);
        }
        JSONObject<JSONObject.Member> jSONObject2 = jSONObject.getJSONObject("assignments");
        if (jSONObject2 != null) {
            for (JSONObject.Member member : jSONObject2) {
                try {
                    int i2 = Integer.parseInt(member.getName());
                    if (map2.containsKey(Integer.valueOf(i2)) && (value = member.getValue()) != null && value.isString()) {
                        String strTrim2 = value.asString().trim();
                        if (strTrim2.isEmpty() || map.containsKey(strTrim2)) {
                            c2080.f7684.put(Integer.valueOf(i2), strTrim2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        synchronized (f16754) {
            try {
                if (z) {
                    m13201(c2080);
                } else {
                    m13202(c2080, arrayListM13212);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m13199(arrayListM13212, true, true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m13206(int i) {
        int iM13187;
        synchronized (f16754) {
            iM13187 = m13187(i);
        }
        return iM13187;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13193(int i, int i2, Integer num) {
        int iM13189;
        ArrayList arrayListM13212 = m13212();
        int iM131810 = m13189(arrayListM13212, i);
        if (iM131810 < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unknown config "));
        }
        synchronized (f16754) {
            iM13189 = -1;
            if (m13187(i) == i2) {
                if (num != null) {
                    iM13189 = m13189(arrayListM13212, num.intValue());
                }
                if (iM13189 < 0) {
                    iM13189 = iM131810;
                }
            } else {
                int iM13190 = m13190(arrayListM13212, iM131810, i2, num);
                C10672 c10672 = f16755;
                if (i2 == -1) {
                    c10672.remove(i);
                } else {
                    if (m13210(i2) == null) {
                        throw new IllegalArgumentException("Unknown group " + i2);
                    }
                    c10672.mo26878(i, i2);
                }
                m13205();
                iM13189 = iM13190;
            }
        }
        if (iM131810 != iM13189) {
            C5717.m15762(iM131810, iM13189);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13190(ArrayList arrayList, int i, int i2, Integer num) {
        int iM13189 = num == null ? -1 : m13189(arrayList, num.intValue());
        if (iM13189 < 0) {
            ArrayList arrayList2 = f16758;
            C10672 c10672 = new C10672(arrayList2.size() + 1, 0);
            c10672.m42951();
            c10672.mo26878(-1, 0);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = ((C9843) arrayList2.get(i3)).f33625;
                i3++;
                c10672.mo26878(i4, i3);
            }
            int i5 = c10672.get(i2);
            if (i5 < 0) {
                throw new IllegalArgumentException(C8479.m22141(i2, "Unknown group "));
            }
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                if (c10672.get(m13187(((AbstractC12068) arrayList.get(i6)).f40385)) > i5) {
                    iM13189 = i6;
                }
            }
            iM13189 = size2;
        }
        return i < iM13189 ? iM13189 - 1 : iM13189;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static ArrayList m13212() {
        ArrayList arrayList;
        synchronized (C5717.class) {
            arrayList = new ArrayList(C5717.m15769());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m13186() {
        m13199(m13212(), false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13199(ArrayList arrayList, boolean z, boolean z2) {
        C3491 c3491M13209;
        synchronized (f16754) {
            c3491M13209 = m13209(arrayList);
            if (z || c3491M13209.f12799) {
                m13205();
            }
        }
        InterfaceC10609 interfaceC10609 = c3491M13209.f12800;
        if (interfaceC10609 != null) {
            C5717.m15765(interfaceC10609);
        }
        if (z2 || c3491M13209.f12799 || c3491M13209.f12800 != null) {
            f16757.mo23641(Object.class);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13189(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC12068) arrayList.get(i2)).f40385 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3491 m13209(ArrayList arrayList) {
        C15070 c15070;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(Integer.valueOf(((AbstractC12068) it.next()).f40385), Boolean.TRUE);
        }
        boolean zRemoveIf = C9030.removeIf(f16755.mo26882(), new C9204(1, map));
        ArrayList arrayList2 = f16758;
        if (arrayList2.isEmpty()) {
            c15070 = null;
        } else {
            C15070 c15071 = new C15070(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c15071.add(((AbstractC12068) it2.next()).f40385);
            }
            C10672 c10672 = new C10672(arrayList2.size() + 1, 0);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
            c10672.mo26878(-1, 0);
            arrayList3.add(new C15070());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = ((C9843) arrayList2.get(i)).f33625;
                i++;
                c10672.mo26878(i2, i);
                arrayList3.add(new C15070());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC12068 abstractC12068 = (AbstractC12068) it3.next();
                ((InterfaceC10609) arrayList3.get(c10672.get(m13187(abstractC12068.f40385)))).add(abstractC12068.f40385);
            }
            c15070 = new C15070(arrayList.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c15070.mo3173((InterfaceC10609) it4.next());
            }
            if (c15071.size() == c15070.size()) {
                int size2 = c15071.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (c15071.getInt(i3) == c15070.getInt(i3)) {
                    }
                }
                c15070 = null;
            }
        }
        return new C3491(zRemoveIf, c15070);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m13204(HashMap map, InterfaceC21254 interfaceC21254) {
        if (map.containsKey(Integer.valueOf(interfaceC21254.mo45097()))) {
            return interfaceC21254.mo45096() != -1 && m13210(interfaceC21254.mo45096()) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m13187(int i) {
        int iM26883 = f16755.m26883(i);
        if (iM26883 == -1 || m13210(iM26883) == null) {
            return -1;
        }
        return iM26883;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9843 m13210(int i) {
        for (C9843 c9843 : f16758) {
            if (c9843.f33625 == i) {
                return c9843;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13202(C2080 c2080, ArrayList arrayList) {
        ArrayList arrayList2 = f16758;
        arrayList2.clear();
        f16755.clear();
        f16756 = 1;
        for (String str : c2080.f7685) {
            int i = f16756;
            f16756 = i + 1;
            arrayList2.add(new C9843(i, str));
        }
        HashMap mapM13191 = m13191();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = ((AbstractC12068) it.next()).f40385;
            m13194(i2, (String) c2080.f7684.get(Integer.valueOf(i2)), mapM13191);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13201(C2080 c2080) {
        ArrayList<String> arrayList = c2080.f7685;
        ArrayList<C9843> arrayList2 = f16758;
        HashMap map = new HashMap(arrayList2.size());
        for (C9843 c9843 : arrayList2) {
            map.put(c9843.f33626, c9843);
        }
        ArrayList arrayList3 = new ArrayList(Math.max(arrayList2.size(), arrayList.size()));
        for (String str : arrayList) {
            C9843 c9844 = (C9843) map.remove(str);
            if (c9844 == null) {
                int i = f16756;
                f16756 = i + 1;
                c9844 = new C9843(i, str);
            }
            arrayList3.add(c9844);
        }
        for (C9843 c9845 : arrayList2) {
            if (map.containsKey(c9845.f33626)) {
                arrayList3.add(c9845);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        HashMap mapM13191 = m13191();
        for (Map.Entry entry : c2080.f7684.entrySet()) {
            m13194(((Integer) entry.getKey()).intValue(), (String) entry.getValue(), mapM13191);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m13191() {
        ArrayList<C9843> arrayList = f16758;
        HashMap map = new HashMap(arrayList.size());
        for (C9843 c9843 : arrayList) {
            map.put(c9843.f33626, Integer.valueOf(c9843.f33625));
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13194(int i, String str, HashMap map) {
        C10672 c10672 = f16755;
        if (str == null || str.isEmpty()) {
            c10672.remove(i);
            return;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            c10672.mo26878(i, num.intValue());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m13205() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextId", f16756);
        JSONArray jSONArray = new JSONArray();
        for (C9843 c9843 : f16758) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", c9843.f33625);
            jSONObject2.put("name", c9843.f33626);
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("groups", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        InterfaceC6269 it = f16755.mo26882().iterator();
        while (it.hasNext()) {
            InterfaceC21254 interfaceC21254 = (InterfaceC21254) it.next();
            jSONObject3.put(String.valueOf(interfaceC21254.mo45097()), interfaceC21254.mo45096());
        }
        jSONObject.put("assignments", jSONObject3);
        ApplicationC0716.f2992.edit().putString("ndg_data", jSONObject.toString()).apply();
    }
}
