package l;

import bin.mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23863 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52589(JSONObject jSONObject, InterfaceC11163 interfaceC11163, String str, String... strArr) throws C12731 {
        List listAsList = Arrays.asList(strArr);
        HashSet hashSet = new HashSet();
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2) || !hashSet.add(str2)) {
                throw interfaceC11163.mo2806(jSONObject.get(str2), str, str2);
            }
        }
        for (String str3 : strArr) {
            if (!hashSet.contains(str3)) {
                throw interfaceC11163.mo2806(null, C0252.m1693("Missing parameter: ", str3), str3);
            }
        }
    }
}
