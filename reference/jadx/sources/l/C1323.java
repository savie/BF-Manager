package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.֨᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAH9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1323 implements InterfaceC19429 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4721(double d) {
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid number: " + d);
        }
        return C12123.m30163(Float.toString((float) d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4722(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m4723(String str) {
        return m4722(str).trim();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4720(C18073 c18073) {
        JSONArray jSONArrayArray = JSON.array();
        String str = c18073.f57796;
        if (str != null) {
            jSONArrayArray.add(C11320.m28376(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("temporary", true), "mt_apk_workspace_open", "inspect", "Open built APK as a temporary workspace for one-time inspection"));
        }
        return C0735.m3193(JSON.object().add("workspaceId", c18073.f57805).add("editSessionId", c18073.f57801).add("outputPath", c18073.f57799).add("apkFileName", c18073.f57802).add("size", c18073.f57804).add("signingPerformed", c18073.f57806).add("signSchemes", C10413.m26314(c18073.f57808)).add("signatureSummary", C10584.m26760(c18073.f57803, false)).add("changedDexEntries", C10413.m26314(c18073.f57795)).add("changedClassCount", c18073.f57800).add("deletedClassCount", c18073.f57807).add("addedZipEntries", C10413.m26314(c18073.f57797)).add("changedZipEntries", C10413.m26314(c18073.f57798)).add("deletedZipEntries", C10413.m26314(c18073.f57794)), jSONArrayArray);
    }
}
