package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4441 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f15906;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f15907;

    public C4441(List list, boolean z) {
        C0911.m3681(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f15907 = C4681.unmodifiableList(arrayList);
        this.f15906 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4441 m14132(String str) {
        EnumC20059 enumC20059;
        if (str == null) {
            Object[] objArr = {new C0911("/", EnumC20059.DIRECTORY, EnumC7623.DENY, true)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            return new C4441(C24579.m54899(obj, arrayList, obj, arrayList), false);
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(str).asObject();
            m14133(jSONObjectAsObject, "version", "rules");
            if (!"2".equals(jSONObjectAsObject.get("version").toString())) {
                throw new IllegalArgumentException("Unsupported file access policy version");
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it = jSONObjectAsObject.get("rules").asArray().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it.next()).asObject();
                m14133(jSONObjectAsObject2, MotionUtils.EASING_TYPE_PATH, "targetType", am.Q);
                String strM2304 = C0470.m2304(jSONObjectAsObject2.get(MotionUtils.EASING_TYPE_PATH).asString(), MotionUtils.EASING_TYPE_PATH);
                if (!hashSet.add(strM2304)) {
                    throw new IllegalArgumentException("Duplicate file access rule path");
                }
                String strAsString = jSONObjectAsObject2.get("targetType").asString();
                int iHashCode = strAsString.hashCode();
                if (iHashCode != -962584979) {
                    if (iHashCode != 3143036 || !strAsString.equals("file")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC20059 = EnumC20059.FILE;
                    arrayList2.add(new C0911(strM2304, enumC20059, m14135(jSONObjectAsObject2.get(am.Q).asString()), false));
                } else {
                    if (!strAsString.equals("directory")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC20059 = EnumC20059.DIRECTORY;
                    arrayList2.add(new C0911(strM2304, enumC20059, m14135(jSONObjectAsObject2.get(am.Q).asString()), false));
                }
            }
            return new C4441(arrayList2, false);
        } catch (RuntimeException | C10186 unused) {
            Object[] objArr2 = {new C0911("/", EnumC20059.DIRECTORY, EnumC7623.DENY, true)};
            ArrayList arrayList3 = new ArrayList(1);
            Object obj2 = objArr2[0];
            return new C4441(C24579.m54899(obj2, arrayList3, obj2, arrayList3), true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m14136() {
        JSONArray jSONArrayArray = JSON.array();
        for (C0911 c0911 : this.f15907) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c0911.f3413).add("targetType", c0911.f3415.m46113()).add(am.Q, c0911.f3412.m20827()));
        }
        return JSON.object().add("version", 2).add("rules", jSONArrayArray).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9113 m14137(String str, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C0911 c0911 : this.f15907) {
            arrayList2.add(new C0911(c0911.f3413, c0911.f3415, c0911.f3412, c0911.m3682() || !m14134(c0911.f3413, str, arrayList)));
        }
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return new C9113(str, "acl-v2-".concat(C15022.m36182(C15022.m36179().digest(JSON.object().add("home", str).add("config", m14136()).add("managed", jSONArrayArray).toString().getBytes(StandardCharsets.UTF_8)))), arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14134(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C0470.m2302(str, (String) it.next())) {
                return true;
            }
        }
        return !C0470.m2301(str) && C0470.m2302(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14133(JSONObject jSONObject, String... strArr) {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C17359.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C4681.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid file access policy fields");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC7623 m14135(String str) {
        str.getClass();
        switch (str) {
            case "read_only":
                return EnumC7623.READ_ONLY;
            case "read_write":
                return EnumC7623.READ_WRITE;
            case "deny":
                return EnumC7623.DENY;
            default:
                throw new IllegalArgumentException("Invalid file access level");
        }
    }
}
