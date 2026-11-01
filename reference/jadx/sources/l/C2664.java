package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2664 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile C2664 f10328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8201(C2664 c2664) {
        f10328 = c2664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2664 m8195() {
        C2664 c2664 = f10328;
        C13638.requireNonNull(c2664, "MCP host is not installed");
        return c2664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m8206(String str) {
        return C8416.m22053().m22055(str, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8194(C8902 c8902) {
        return C0735.m3193(JSON.object().add("workspaceId", c8902.f30544).add("editSessionId", c8902.f30545).add("locator", C17638.m41043(c8902.f30546, c8902.f30547)).add("deleted", true), JSON.array());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m8203() {
        return C12731.m31629(JSON.array(), "OUT_OF_MEMORY", "Not enough memory to complete this operation.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8200(String str, boolean z) {
        if (str != null) {
            try {
                String strM17479 = C6370.m17479(str, MotionUtils.EASING_TYPE_PATH);
                C20119.m45481().m37800().m9209(strM17479);
                if (C5553.m15313(strM17479, new String[0]).mo33975()) {
                    return C12731.m31623(JSON.array().add(C11320.m28376(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM17479).add("temporary", z), "mt_apk_workspace_open", "retry", "Recreate workspace from source APK")), "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
                }
            } catch (C12731 unused) {
            }
        }
        return C12731.m31629(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m8204(String str, String str2) {
        return m8196(C3184.m9603("workspaceId", str, "editSessionId", str2).add("view", "resource_table").add("prefix", "").add("limit", 200), "RESOURCE_NOT_FOUND", "Resource not found.", "mt_apk_list", "Verify resource table entries in workspace");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C12731 m8193(String str, String str2, String str3) {
        String strM41044 = C17638.m41044("axml", str3, (String) null, (String) null, (String) null, (String) null);
        return C12731.m31627("NOT_TEXT_ENTRY", "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator.", "fatal", JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", C17638.m41044("axml", str3, (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read this ZIP entry as decoded AXML")), JSON.object().add("suggestedLocator", strM41044));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m8202(String str, String str2, String str3) {
        return C12731.m31623(JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", C17638.m41044("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "retry", "Read this ZIP entry as hex bytes")), "NOT_TEXT_ENTRY", "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8197(String str, String str2) {
        return m8196(C3184.m9603("workspaceId", str, "editSessionId", str2).add("view", "dex_classes").add("prefix", "").add("limit", 200), "CLASS_NOT_FOUND", "Class not found", "mt_apk_list", "Verify dex classes in workspace");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m8205(String str, String str2, String str3) {
        return m8199("METHOD_NOT_FOUND", "Method not found", "Verify class outline for method signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8198(String str, String str2, String str3) {
        return m8199("FIELD_NOT_FOUND", "Field not found", "Verify class outline for field signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8199(String str, String str2, String str3, String str4, String str5, String str6) {
        return m8196(C3184.m9603("workspaceId", str4, "editSessionId", str5).add("locator", C17638.m41044("dex_class", (String) null, str6, (String) null, (String) null, (String) null)).add("limit", 200), str, str2, "mt_apk_dex_read_class_outline", str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8196(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C12731.m31623(JSON.array().add(C11320.m28376(jSONObject, str3, "verify_workspace", str4)), str, str2, "fatal");
    }
}
