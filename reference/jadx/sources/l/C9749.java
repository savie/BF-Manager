package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9749 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25412(JSONObject jSONObject, InterfaceC18700 interfaceC18700, String str, String... strArr) throws C10186 {
        List listAsList = Arrays.asList(strArr);
        HashSet hashSet = new HashSet();
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2) || !hashSet.add(str2)) {
                throw interfaceC18700.mo3210(jSONObject.get(str2), str, str2);
            }
        }
        for (String str3 : strArr) {
            if (!hashSet.contains(str3)) {
                throw interfaceC18700.mo3210(null, C25272.m56409("Missing parameter: ", str3), str3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25411(JSONObject jSONObject, String str, String str2, C1020 c1020) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw c1020.mo3210(jSONValue, str2, str);
        }
        return jSONValue.asString();
    }
}
