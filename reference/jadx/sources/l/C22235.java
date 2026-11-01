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

/* JADX INFO: renamed from: l.᩹ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6X3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22235 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f72695;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f72696;

    public C22235(List list, boolean z) {
        C9422.m24179(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f72696 = C0561.unmodifiableList(arrayList);
        this.f72695 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22235 m49362(String str) {
        EnumC13197 enumC13197;
        if (str == null) {
            Object[] objArr = {new C9422("/", EnumC13197.DIRECTORY, EnumC23533.DENY, true)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C13638.requireNonNull(obj);
            arrayList.add(obj);
            return new C22235(C0561.unmodifiableList(arrayList), false);
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(str).asObject();
            m49363(jSONObjectAsObject, "version", "rules");
            if (!"2".equals(jSONObjectAsObject.get("version").toString())) {
                throw new IllegalArgumentException("Unsupported file access policy version");
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it = jSONObjectAsObject.get("rules").asArray().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it.next()).asObject();
                m49363(jSONObjectAsObject2, MotionUtils.EASING_TYPE_PATH, "targetType", am.Q);
                String strM17479 = C6370.m17479(jSONObjectAsObject2.get(MotionUtils.EASING_TYPE_PATH).asString(), MotionUtils.EASING_TYPE_PATH);
                if (!hashSet.add(strM17479)) {
                    throw new IllegalArgumentException("Duplicate file access rule path");
                }
                String strAsString = jSONObjectAsObject2.get("targetType").asString();
                int iHashCode = strAsString.hashCode();
                if (iHashCode != -962584979) {
                    if (iHashCode != 3143036 || !strAsString.equals("file")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC13197 = EnumC13197.FILE;
                    arrayList2.add(new C9422(strM17479, enumC13197, m49365(jSONObjectAsObject2.get(am.Q).asString()), false));
                } else {
                    if (!strAsString.equals("directory")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC13197 = EnumC13197.DIRECTORY;
                    arrayList2.add(new C9422(strM17479, enumC13197, m49365(jSONObjectAsObject2.get(am.Q).asString()), false));
                }
            }
            return new C22235(arrayList2, false);
        } catch (RuntimeException | C12731 unused) {
            Object[] objArr2 = {new C9422("/", EnumC13197.DIRECTORY, EnumC23533.DENY, true)};
            ArrayList arrayList3 = new ArrayList(1);
            Object obj2 = objArr2[0];
            C13638.requireNonNull(obj2);
            arrayList3.add(obj2);
            return new C22235(C0561.unmodifiableList(arrayList3), true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49366() {
        JSONArray jSONArrayArray = JSON.array();
        for (C9422 c9422 : this.f72696) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c9422.f31925).add("targetType", c9422.f31923.m32668()).add(am.Q, c9422.f31924.m51849()));
        }
        return JSON.object().add("version", 2).add("rules", jSONArrayArray).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3070 m49367(String str, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C9422 c9422 : this.f72696) {
            arrayList2.add(new C9422(c9422.f31925, c9422.f31923, c9422.f31924, c9422.m24180() || !m49364(c9422.f31925, str, arrayList)));
        }
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return new C3070(str, "acl-v2-".concat(C22253.m49424(C22253.m49421().digest(JSON.object().add("home", str).add("config", m49366()).add("managed", jSONArrayArray).toString().getBytes(StandardCharsets.UTF_8)))), arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49364(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C6370.m17477(str, (String) it.next())) {
                return true;
            }
        }
        return !C6370.m17476(str) && C6370.m17477(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49363(JSONObject jSONObject, String... strArr) {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C13638.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C0561.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid file access policy fields");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC23533 m49365(String str) {
        str.getClass();
        switch (str) {
            case "read_only":
                return EnumC23533.READ_ONLY;
            case "read_write":
                return EnumC23533.READ_WRITE;
            case "deny":
                return EnumC23533.DENY;
            default:
                throw new IllegalArgumentException("Invalid file access level");
        }
    }
}
