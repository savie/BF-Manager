package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J79S */
/* JADX INFO: loaded from: classes4.dex */
public final class C17638 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56057 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f56068;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String f56069;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f56067 = {"workspaceId", "editSessionId", "target", "query", "queryType", "caseSensitive", "matchMode", "prefix", "includeMatchOffsets", "limit", "snippetMaxChars"};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f56060 = {"overview", "files", "resource_table_names", "resource_table_values", "resource_table_file_paths", "dex_names", "dex_strings", "dex_string_members", "smali", "native_symbols", "native_strings"};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final String[] f56066 = {"workspaceId", "editSessionId", "reads", "maxValueChars", "maxValueXmlChars", "maxItemsPerValue", "resolveDepth"};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f56070 = {"locator", "variant"};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f56061 = {"workspaceId", "editSessionId", "locator", "methodResolution", "limit"};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f56062 = {"exact", "slot", "dispatch", "not_applicable"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f56054 = {"workspaceId", "editSessionId", "locator", "targetVersion", "edits"};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f56063 = {"workspaceId", "editSessionId", "locator"};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f56059 = {"workspaceId", "editSessionId", "locator", "patches"};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String[] f56072 = {"byteOffset", "expectedHex", "replacementHex"};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f56058 = {"workspaceId", "editSessionId", "edits"};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f56055 = {"workspaceId", "editSessionId", "runBuildChecks"};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f56064 = {"mode", "matchText", "writeText"};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f56071 = {"locator", "variant", "targetVersion", "valueXml"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f56065 = {"workspaceId", "editSessionId", "outputName", "overwrite", "sign"};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String[] f56056 = {"workspaceId", "editSessionId", "outputName", "overwrite"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41028(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41038(int i) {
        return C2271.m6966(i, "edits[", "]");
    }

    static {
        String[] strArr = {"zip_entries", "axml", "resource_table_id", "resource_table_name", "resource_table_value", "resource_table_file_path", "dex_class", "dex_field", "dex_method", "dex_string", "smali", "native_symbol", "native_string"};
        f56068 = strArr;
        StringBuilder sb = new StringBuilder("Valid scopes are: ");
        StringBuilder sb2 = new StringBuilder();
        if (strArr.length > 0) {
            sb2.append((CharSequence) strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb2.append((CharSequence) ", ");
                sb2.append((CharSequence) strArr[i]);
            }
        }
        sb.append(sb2.toString());
        sb.append(". Pass scopes as a JSON array even for one scope, for example [\"dex_class\"] or [\"dex_string\", \"smali\", \"resource_table_value\", \"axml\"]. Single strings and comma-separated strings such as \"dex_string,smali\" are invalid.");
        f56069 = sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41034(String str, int i, String str2, String str3) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("nextCursor", str3).add("limit", i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONValue m41075(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(m41044(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C1494 m41106(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "open", MotionUtils.EASING_TYPE_PATH, "temporary");
        String strM41107 = m41107(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("temporary");
        if (jSONValue != null && jSONValue.isNull()) {
            throw C12731.m31626("Invalid temporary", "temporary", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        boolean zM41061 = m41061(jSONObject, "temporary");
        if ("mt://current-apk".equals(strM41107)) {
            return new C1494(null, null, !zM41061, zM41061);
        }
        if (strM41107.startsWith("mt://workspace/")) {
            String strSubstring = strM41107.substring(15);
            if (strSubstring.isEmpty()) {
                throw C12731.m31626("Invalid path", MotionUtils.EASING_TYPE_PATH, JSON.value(strM41107), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            if (zM41061) {
                throw C12731.m31626("temporary is invalid when reopening a workspace", "temporary", JSON.value(true), JSON.array(false), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            return new C1494(null, strSubstring, true, false);
        }
        C3070 c3070M37800 = C20119.m45481().m37800();
        String strM17474 = C6370.m17474(c3070M37800, strM41107, MotionUtils.EASING_TYPE_PATH, false);
        c3070M37800.m9209(strM17474);
        return new C1494(strM17474, null, !zM41061, zM41061);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m41073(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "read_signature", "workspaceId");
        m41057(jSONObject, "workspaceId");
        return m41107(jSONObject, "workspaceId");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C19840 m41066(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "close", "workspaceId");
        m41057(jSONObject, "workspaceId");
        return new C19840(m41107(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C14196 m41097(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "list", "workspaceId", "editSessionId", "view", "prefix", "limit");
        m41057(jSONObject, "workspaceId", "editSessionId", "view");
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        String strM41108 = m41107(jSONObject, "view");
        if ("zip_entries".equals(strM41108) || "dex_classes".equals(strM41108) || "resource_table".equals(strM41108)) {
            String strM41041 = m41041(jSONObject, "prefix", "");
            int iM41029 = m41029(200, jSONObject, "limit");
            m41054(iM41029, 1, 1000, "limit");
            return new C14196(strM41107, strM41016, strM41108, strM41041, null, iM41029, 0, 0, 200);
        }
        throw C12731.m31626("Unsupported view", "view", JSON.value(strM41108), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C14196 m41099(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "mt_apk_dex_read_class_outline", "workspaceId", "editSessionId", "locator", "limit");
        m41057(jSONObject, "workspaceId", "editSessionId", "locator", "limit");
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        String strM41096 = m41096(m41077(jSONObject));
        int iM41063 = m41063(jSONObject, "limit");
        m41054(iM41063, 1, 1000, "limit");
        return new C14196(strM41107, strM41016, "dex_class_outline", "", strM41096, iM41063, 0, 0, iM41063);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C4667 m41074(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "read_text", "workspaceId", "editSessionId", "locator", "limit", "maxChars", "startLine", "startColumn");
        m41057(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        C2550 c2550M41071 = m41071(m41077(jSONObject));
        String str = c2550M41071.f10096;
        if (!"entry_text".equals(str) && !"axml".equals(str) && !"dex_class_smali".equals(str) && !"dex_method_smali".equals(str) && !"dex_field_smali".equals(str)) {
            throw C12731.m31626("mt_apk_read_text accepts only text locators", "locator", JSON.value(m41108(m41045(c2550M41071))), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field"), JSON.object().add("locator", m41044("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM41086 = m41086(49152, jSONObject, "maxChars");
        m41054(iM41086, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM41087 = m41086(500, jSONObject, "limit");
        m41054(iM41087, 1, 2000, "limit");
        int iM41088 = m41086(0, jSONObject, "startLine");
        m41054(iM41088, 0, Integer.MAX_VALUE, "startLine");
        int iM41089 = m41086(0, jSONObject, "startColumn");
        m41054(iM41089, 0, Integer.MAX_VALUE, "startColumn");
        return new C4667(strM41107, strM41016, c2550M41071, TextBundle.TEXT_ENTRY, iM41088, iM41089, iM41087, iM41086, 0, 256, "startColumn", JSON.value(iM41089));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C4667 m41072(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "read_bytes", "workspaceId", "editSessionId", "locator", "byteOffset", "maxBytes");
        m41057(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        C2550 c2550M41071 = m41071(m41077(jSONObject));
        if (!"entry_text".equals(c2550M41071.f10096)) {
            throw C12731.m31626("mt_apk_read_bytes accepts only zip_entry locators", "locator", JSON.value(m41108(m41045(c2550M41071))), JSON.array("zip_entry"), JSON.object().add("locator", m41044("zip_entry", "classes.dex", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM41086 = m41086(0, jSONObject, "byteOffset");
        m41054(iM41086, 0, Integer.MAX_VALUE, "byteOffset");
        int iM41087 = m41086(256, jSONObject, "maxBytes");
        m41054(iM41087, 1, 65536, "maxBytes");
        return new C4667(strM41107, strM41016, c2550M41071, "hex", 0, 0, 500, 49152, iM41086, iM41087, null, null);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C11724 m41103(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56066;
        m41056(jSONObject, "resource_read", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        String str = "locator";
        JSONObject jSONObjectAdd = C3184.m9603("workspaceId", strM41107, "editSessionId", strM41016).add("reads", JSON.array().add(JSON.object().add("locator", m41044("resource", (String) null, (String) null, (String) null, (String) null, "0x7F010000")).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
        JSONArray jSONArrayM41031 = m41031(jSONObject, "reads", jSONObjectAdd);
        if (jSONArrayM41031.size() == 0 || jSONArrayM41031.size() > 200) {
            throw C12731.m31626("Invalid reads", "reads", JSON.value(jSONArrayM41031.size()), JSON.array(1, 200), jSONObjectAdd);
        }
        ArrayList arrayList = new ArrayList(jSONArrayM41031.size());
        int i = 0;
        while (i < jSONArrayM41031.size()) {
            JSONValue jSONValue = jSONArrayM41031.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C12731.m31626("Invalid reads item", C2271.m6966(i, "reads[", "]"), jSONValue, JSON.array(), jSONObjectAdd);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f56070);
            for (String str2 : jSONObjectAsObject.names()) {
                JSONArray jSONArray = jSONArrayM41031;
                if (!listAsList.contains(str2)) {
                    throw C12731.m31626("Invalid resource_read item argument", m41076(i, str2), jSONObjectAsObject.get(str2), C10413.m26314(listAsList), jSONObjectAdd);
                }
                jSONArrayM41031 = jSONArray;
            }
            JSONArray jSONArray2 = jSONArrayM41031;
            String strM41076 = m41076(i, str);
            JSONValue jSONValue2 = jSONObjectAsObject.get(str);
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m41083(jSONObjectAdd, strM41076);
            }
            C20461 c20461M41053 = m41053(jSONObjectAdd, jSONValue2, strM41076);
            String str3 = str;
            String str4 = c20461M41053.f66396;
            String str5 = strM41016;
            if (!"resource".equals(str4)) {
                throw C12731.m31626("mt_apk_resource_read accepts only resource locators", strM41076, JSON.value(str4), JSON.array("resource"), jSONObjectAdd);
            }
            String strM50304 = C22703.m50304(c20461M41053.f66397, strM41076);
            String strM41077 = m41076(i, "variant");
            JSONValue jSONValue3 = jSONObjectAsObject.get("variant");
            if (jSONValue3 == null || jSONValue3.isNull()) {
                throw m41083(jSONObjectAdd, strM41077);
            }
            if (!jSONValue3.isString()) {
                throw C12731.m31626(C0252.m1693("Invalid ", strM41077), strM41077, jSONValue3, (JSONArray) null, jSONObjectAdd);
            }
            String strAsString = jSONValue3.asString();
            if (strAsString.isEmpty()) {
                throw C12731.m31626(C0252.m1693("Invalid ", strM41077), strM41077, JSON.value(strAsString), (JSONArray) null, jSONObjectAdd);
            }
            if ("*".equals(strAsString)) {
                throw C12731.m31626("Invalid reads item variant", m41076(i, "variant"), JSON.value(strAsString), JSON.array("default"), jSONObjectAdd);
            }
            arrayList.add(new C13841(strM50304, strAsString));
            i++;
            str = str3;
            strM41016 = str5;
            jSONArrayM41031 = jSONArray2;
        }
        int iM41063 = m41063(jSONObject, "maxValueChars");
        m41054(iM41063, 1, 32768, "maxValueChars");
        int iM41064 = m41063(jSONObject, "maxValueXmlChars");
        m41054(iM41064, 1, 1048576, "maxValueXmlChars");
        int iM41065 = m41063(jSONObject, "maxItemsPerValue");
        m41054(iM41065, 0, 2000, "maxItemsPerValue");
        int iM41066 = m41063(jSONObject, "resolveDepth");
        m41054(iM41066, 0, 1, "resolveDepth");
        return new C11724(strM41107, strM41016, arrayList, iM41063, iM41064, iM41065, iM41066);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m41076(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("reads[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1139 m41048(C0704 c0704, C22038 c22038) throws C12731 {
        String str;
        ArrayList arrayListM41047;
        String str2 = c0704.f2976;
        String str3 = c22038.f71435;
        String str4 = c0704.f2970;
        String str5 = c0704.f2972;
        String str6 = c0704.f2974;
        if (!str3.equals(str4)) {
            throw C12731.m31626("Invalid workspaceId", "workspaceId", JSON.value(str4), (JSONArray) null, (JSONObject) null);
        }
        if ("overview".equals(str6)) {
            str = str4;
            arrayListM41047 = m41046((JSONArray) null, c22038.f71436, c22038.f71438, c22038.f71437);
        } else {
            str = str4;
            if ("files".equals(str6)) {
                arrayListM41047 = m41047("zip_entries", "axml");
            } else if ("resource_table_names".equals(str6)) {
                arrayListM41047 = m41047("resource_table_id", "resource_table_name");
            } else if ("resource_table_values".equals(str6)) {
                arrayListM41047 = m41047("resource_table_value");
            } else if ("resource_table_file_paths".equals(str6)) {
                arrayListM41047 = m41047("resource_table_file_path");
            } else if ("dex_names".equals(str6)) {
                arrayListM41047 = m41047("dex_class", "dex_field", "dex_method");
            } else if ("dex_strings".equals(str6) || "dex_string_members".equals(str6)) {
                arrayListM41047 = m41047("dex_string");
            } else if ("smali".equals(str6)) {
                arrayListM41047 = m41047("smali");
            } else if ("native_symbols".equals(str6)) {
                arrayListM41047 = m41047("native_symbol");
            } else if ("native_strings".equals(str6)) {
                arrayListM41047 = m41047("native_string");
            } else {
                throw C12731.m31626("Invalid target", "target", JSON.value(str6), C10413.m26314(Arrays.asList(f56060)), m41020("overview", "AndroidManifest"));
            }
        }
        ArrayList arrayList = arrayListM41047;
        String str7 = c0704.f2971;
        String str8 = c0704.f2974;
        int i = c0704.f2973;
        int i2 = c0704.f2968;
        return new C1139(str, str7, str8, str2, arrayList, i, i2 > 0, i2, !"overview".equals(str8), c0704.f2975, (("files".equals(str6) || "native_symbols".equals(str6) || "native_strings".equals(str6)) && !str5.isEmpty()) ? str5 : null, ("resource_table_names".equals(str6) || "resource_table_values".equals(str6) || "resource_table_file_paths".equals(str6)) ? m41110(str5) : null, (!m41095(str6) || str5.isEmpty()) ? C22307.f72847 : m41027(m41020(str6, str2).put("prefix", "com.example."), str5), "dex_string_members".equals(str6) ? "member" : Name.LABEL, c0704.f2969, new C2323(0, 0, 0, -1, 0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6784 m41104(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56061;
        m41056(jSONObject, "dex_xref", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        C12700 c12700M41022 = m41022(m41077(jSONObject), jSONObject.get("locator"));
        String strM41108 = m41107(jSONObject, "methodResolution");
        m41080(strM41108, jSONObject.get("methodResolution"));
        m41058(c12700M41022, strM41108, jSONObject.get("methodResolution"));
        int iM41063 = m41063(jSONObject, "limit");
        m41054(iM41063, 1, 200, "limit");
        return new C6784(strM41107, strM41016, c12700M41022.f42376, c12700M41022.f42374, c12700M41022.f42375, strM41108, iM41063, new C4481(0, 0, 0));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C12079 m41026(JSONObject jSONObject) throws C12731 {
        m41056(jSONObject, "mt_apk_session_create", "workspaceId");
        m41057(jSONObject, "workspaceId");
        return new C12079(m41107(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C0083 m41018(JSONObject jSONObject) throws C12731 {
        C16228 c16228;
        String[] strArr = f56063;
        m41056(jSONObject, "mt_apk_delete_target", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41108 = m41107(jSONObject, "editSessionId");
        if (strM41108.isEmpty()) {
            throw C12731.m31626("mt_apk_delete_target requires a non-empty editSessionId", "editSessionId", JSON.value(strM41108), JSON.array("edit session id returned by mt_apk_session_create"), m41035(strM41107, "edit1234", "dex_class"));
        }
        C20461 c20461M41053 = m41053(m41035("<workspaceId>", "<editSessionId>", "smali_class"), JSON.value(m41077(jSONObject)), "locator");
        String str = c20461M41053.f66397;
        String str2 = c20461M41053.f66396;
        if ("dex_class".equals(str2)) {
            c16228 = new C16228("smali_class", m41025(str));
        } else if ("dex_method".equals(str2)) {
            C16933 c16933M41093 = m41093(str, e.s, true);
            c16228 = new C16228("smali_method", m41064(c16933M41093.f54131, c16933M41093.f54132));
        } else {
            if (!"axml".equals(str2) && !"zip_entry".equals(str2)) {
                throw C12731.m31626("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), m41035("<workspaceId>", "<editSessionId>", "smali_class"));
            }
            if (str == null || !str.endsWith("/")) {
                m41069(str);
            } else {
                m41069(C20630.m46498(1, 0, str));
            }
            c16228 = new C16228(str2, str);
        }
        return new C0083(strM41107, strM41108, c16228.f52357, c16228.f52356);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C2905 m41101(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56059;
        m41056(jSONObject, "patch_bytes", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41108 = m41107(jSONObject, "editSessionId");
        if (strM41108.isEmpty()) {
            throw C12731.m31626("mt_apk_patch_bytes requires a non-empty editSessionId", "editSessionId", JSON.value(strM41108), JSON.array("edit session id returned by mt_apk_session_create"), m41087(strM41107, "edit1234", "assets/data.bin"));
        }
        C20461 c20461M41053 = m41053(m41087(strM41107, strM41108, "assets/data.bin"), JSON.value(m41077(jSONObject)), "locator");
        String str = c20461M41053.f66396;
        if (!"zip_entry".equals(str)) {
            throw C12731.m31626("mt_apk_patch_bytes accepts only zip_entry locators", "locator", JSON.value(str), JSON.array("zip_entry"), m41087(strM41107, strM41108, "assets/data.bin"));
        }
        String str2 = c20461M41053.f66397;
        m41069(str2);
        JSONArray jSONArrayM41031 = m41031(jSONObject, "patches", m41087(strM41107, strM41108, str2));
        JSONObject jSONObjectM41087 = m41087(strM41107, strM41108, str2);
        if (jSONArrayM41031.size() == 0) {
            throw C12731.m31626("patches must contain at least one item", "patches", jSONArrayM41031, JSON.array("1..200"), jSONObjectM41087);
        }
        if (jSONArrayM41031.size() > 200) {
            throw C12731.m31626("patches must contain at most 200 items", "patches", JSON.value(jSONArrayM41031.size()), JSON.array("1..200"), jSONObjectM41087);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = 0;
        while (i < jSONArrayM41031.size()) {
            JSONValue jSONValue = jSONArrayM41031.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C12731.m31626("Invalid patches item", C2271.m6966(i, "patches[", "]"), jSONValue, JSON.array(), jSONObjectM41087);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f56072);
            for (String str3 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str3)) {
                    throw C12731.m31626("Invalid patch item argument", m41089(i, str3), jSONObjectAsObject.get(str3), C10413.m26314(listAsList), jSONObjectM41087);
                }
            }
            String strM41089 = m41089(i, "byteOffset");
            JSONValue jSONValue2 = jSONObjectAsObject.get("byteOffset");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m41083(jSONObjectM41087, strM41089);
            }
            if (!jSONValue2.isNumber()) {
                throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, jSONValue2, (JSONArray) null, jSONObjectM41087);
            }
            try {
                int iM26321 = C10413.m26321(jSONValue2);
                if (iM26321 < 0) {
                    throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, jSONValue2, JSON.array(0, Integer.MAX_VALUE), jSONObjectM41087);
                }
                byte[] bArrM41062 = m41062(jSONObjectAsObject, i, "expectedHex", jSONObjectM41087);
                byte[] bArrM41063 = m41062(jSONObjectAsObject, i, "replacementHex", jSONObjectM41087);
                JSONArray jSONArray = jSONArrayM41031;
                if (bArrM41062.length != bArrM41063.length) {
                    throw C12731.m31626("expectedHex and replacementHex must contain the same byte count", m41089(i, "replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array("same byte count as expectedHex"), jSONObjectM41087);
                }
                if (bArrM41062.length > 4096) {
                    throw C12731.m31626("Patch item is too large", m41089(i, "replacementHex"), JSON.value(bArrM41062.length), JSON.array("1..4096"), jSONObjectM41087);
                }
                length += bArrM41062.length;
                if (length > 65536) {
                    throw C12731.m31626("Patch byte budget exceeded", "patches", JSON.value(length), JSON.array("1..65536"), jSONObjectM41087);
                }
                arrayList.add(new C9257(iM26321, bArrM41062, bArrM41063));
                i++;
                jSONArrayM41031 = jSONArray;
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, jSONValue2, (JSONArray) null, jSONObjectM41087);
            }
        }
        return new C2905(strM41107, strM41108, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C5728 m41068(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56058;
        m41056(jSONObject, "mt_apk_resource_edit", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41108 = m41107(jSONObject, "editSessionId");
        String str = "default";
        JSONArray jSONArrayM41031 = m41031(jSONObject, "edits", m41036(strM41107, strM41108, "0x7f010000", "default"));
        JSONObject jSONObjectM41036 = m41036(strM41107, strM41108, "0x7f010000", "default");
        if (jSONArrayM41031.size() == 0) {
            C12731 c12731M31626 = C12731.m31626("edits must contain at least one item", "edits", jSONArrayM41031, JSON.array("1..200"), jSONObjectM41036);
            m41059(c12731M31626, strM41107, strM41108);
            throw c12731M31626;
        }
        if (jSONArrayM41031.size() > 200) {
            C12731 c12731M31627 = C12731.m31626("edits must contain at most 200 items", "edits", JSON.value(jSONArrayM41031.size()), JSON.array("1..200"), jSONObjectM41036);
            m41059(c12731M31627, strM41107, strM41108);
            throw c12731M31627;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < jSONArrayM41031.size()) {
            JSONValue jSONValue = jSONArrayM41031.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                C12731 c12731M31628 = C12731.m31626("Invalid edits item", m41038(i), jSONValue, JSON.array(), jSONObjectM41036);
                m41060(c12731M31628, strM41107, strM41108, i, (String) null, (String) null);
                throw c12731M31628;
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f56071);
            for (String str2 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str2)) {
                    C12731 c12731M31629 = C12731.m31626("Invalid edit resource item argument", m41039(i, str2), jSONObjectAsObject.get(str2), C10413.m26314(listAsList), jSONObjectM41036);
                    m41060(c12731M31629, strM41107, strM41108, i, (String) null, (String) null);
                    throw c12731M31629;
                }
            }
            JSONValue jSONValue2 = jSONObjectAsObject.get("locator");
            String strM41039 = m41039(i, "locator");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                C12731 c12731M41083 = m41083(jSONObjectM41036, strM41039);
                m41060(c12731M41083, strM41107, strM41108, i, (String) null, (String) null);
                throw c12731M41083;
            }
            try {
                C20461 c20461M41053 = m41053(jSONObjectM41036, jSONValue2, strM41039);
                String str3 = c20461M41053.f66396;
                if (!"resource".equals(str3)) {
                    C12731 c12731M316210 = C12731.m31626("mt_apk_resource_edit accepts only resource locators", strM41039, JSON.value(str3), JSON.array("resource"), jSONObjectM41036);
                    m41060(c12731M316210, strM41107, strM41108, i, (String) null, (String) null);
                    throw c12731M316210;
                }
                try {
                    String strM50304 = C22703.m50304(c20461M41053.f66397, strM41039);
                    JSONObject jSONObjectM41037 = m41036(strM41107, strM41108, strM50304, str);
                    JSONArray jSONArray = jSONArrayM41031;
                    String strM41042 = m41042(jSONObjectAsObject, strM41107, strM41108, i, strM50304, null, "variant", jSONObjectM41037);
                    if ("*".equals(strM41042)) {
                        C12731 c12731M316211 = C12731.m31626("Invalid variant", m41039(i, "variant"), JSON.value(strM41042), JSON.array(str), jSONObjectM41037);
                        m41060(c12731M316211, strM41107, strM41108, i, strM50304, strM41042);
                        throw c12731M316211;
                    }
                    int i2 = i;
                    JSONObject jSONObject2 = jSONObjectM41036;
                    String strM41043 = m41042(jSONObjectAsObject, strM41107, strM41108, i2, strM50304, strM41042, "targetVersion", m41036(strM41107, strM41108, strM50304, strM41042));
                    String str4 = str;
                    String strM41044 = m41042(jSONObjectAsObject, strM41107, strM41108, i2, strM50304, strM41042, "valueXml", m41036(strM41107, strM41108, strM50304, strM41042));
                    if (strM41044.trim().isEmpty()) {
                        C12731 c12731M316212 = C12731.m31626("valueXml is required", m41039(i, "valueXml"), JSON.value(strM41044), JSON.array(), m41036(strM41107, strM41108, strM50304, strM41042));
                        m41060(c12731M316212, strM41107, strM41108, i, strM50304, strM41042);
                        throw c12731M316212;
                    }
                    if (!linkedHashSet.add(strM50304 + '\n' + strM41042)) {
                        C12731 c12731M316213 = C12731.m31626("Duplicate resource edit target", m41039(i, "locator"), JSON.value(m41044("resource", (String) null, (String) null, (String) null, (String) null, strM50304)), JSON.array(), m41036(strM41107, strM41108, strM50304, strM41042));
                        m41060(c12731M316213, strM41107, strM41108, i, strM50304, strM41042);
                        throw c12731M316213;
                    }
                    arrayList.add(new C17017(strM50304, strM41042, strM41043, strM41044));
                    i++;
                    str = str4;
                    jSONArrayM41031 = jSONArray;
                    jSONObjectM41036 = jSONObject2;
                } catch (C12731 e) {
                    m41060(e, strM41107, strM41108, i, (String) null, (String) null);
                    throw e;
                }
            } catch (C12731 e2) {
                m41060(e2, strM41107, strM41108, i, (String) null, (String) null);
                throw e2;
            }
        }
        return new C5728(strM41107, strM41108, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41042(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str5);
        String strM41039 = m41039(i, str5);
        if (jSONValue == null || jSONValue.isNull()) {
            C12731 c12731M41083 = m41083(jSONObject2, strM41039);
            m41060(c12731M41083, str, str2, i, str3, str4);
            throw c12731M41083;
        }
        if (!jSONValue.isString()) {
            C12731 c12731M31626 = C12731.m31626(C0252.m1693("Invalid ", strM41039), strM41039, jSONValue, (JSONArray) null, jSONObject2);
            m41060(c12731M31626, str, str2, i, str3, str4);
            throw c12731M31626;
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.isEmpty()) {
            return strAsString;
        }
        C12731 c12731M31627 = C12731.m31626(C0252.m1693("Invalid ", strM41039), strM41039, JSON.value(strAsString), (JSONArray) null, jSONObject2);
        m41060(c12731M31627, str, str2, i, str3, str4);
        throw c12731M31627;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41060(C12731 c12731, String str, String str2, int i, String str3, String str4) {
        JSONValue jSONValueValue;
        JSONObject jSONObjectPut = c12731.f42468.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i);
        if (str3 == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(m41044("resource", (String) null, (String) null, (String) null, (String) null, str3));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("locator", jSONValueValue).put("variant", str4 == null ? JSON.NULL : JSON.value(str4));
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut2.put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41059(C12731 c12731, String str, String str2) {
        JSONObject jSONObjectPut = c12731.f42468.put("workspaceId", str).put("editSessionId", str2);
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut.put("failedEditIndex", jSONValue).put("locator", jSONValue).put("variant", jSONValue).put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41040(JSONObject jSONObject, int i, String str, boolean z, JSONObject jSONObject2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM41039 = m41039(i, str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41083(jSONObject2, strM41039);
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626(C0252.m1693("Invalid ", strM41039), strM41039, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (z || !strAsString.isEmpty()) {
            return strAsString;
        }
        throw C12731.m31626(C0252.m1693("Invalid ", strM41039), strM41039, JSON.value(strAsString), (JSONArray) null, jSONObject2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m41082(String str) {
        return "write_target".equals(str) || "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41039(int i, String str) {
        return C1694.m5622(new StringBuilder(), m41038(i), ".", str);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C23368 m41111(JSONObject jSONObject) throws C12731 {
        C16228 c16228;
        String[] strArr = f56054;
        List listAsList = Arrays.asList(strArr);
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str)) {
                throw C12731.m31626("Invalid edit_text argument", str, jSONObject.get(str), C10413.m26314(listAsList), m41033(jSONObject));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (!jSONObject.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObjectM41033 = m41033(jSONObject);
            if (arrayList.size() == 1) {
                throw m41083(jSONObjectM41033, (String) arrayList.get(0));
            }
            StringBuilder sb = new StringBuilder("Missing parameters: ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) arrayList.get(i2));
            }
            throw C12731.m31626(sb.toString(), "parameters", (JSONValue) null, C10413.m26314(arrayList), jSONObjectM41033);
        }
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41108 = m41107(jSONObject, "editSessionId");
        C20461 c20461M41053 = m41053(JSON.object().add("locator", m41044("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)), JSON.value(m41077(jSONObject)), "locator");
        String str3 = c20461M41053.f66396;
        String str4 = c20461M41053.f66397;
        if ("dex_class".equals(str3)) {
            c16228 = new C16228("smali_class", m41025(str4));
        } else if ("dex_method".equals(str3)) {
            C16933 c16933M41093 = m41093(str4, e.s, true);
            c16228 = new C16228("smali_method", m41064(c16933M41093.f54131, c16933M41093.f54132));
        } else {
            if (!"axml".equals(str3) && !"zip_entry".equals(str3)) {
                throw C12731.m31626("Unsupported locator", "locator", JSON.value(str3), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), JSON.object().add("locator", m41044("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
            }
            m41069(str4);
            c16228 = new C16228(str3, str4);
        }
        String strM41016 = m41016(jSONObject, "targetVersion");
        boolean zIsEmpty = strM41016.isEmpty();
        String str5 = c16228.f52357;
        String str6 = c16228.f52356;
        if (zIsEmpty) {
            throw C12731.m31626("targetVersion is required", "targetVersion", JSON.value(strM41016), JSON.array(), m41037(strM41107, strM41108, str5, m41090(jSONObject), str6));
        }
        JSONArray jSONArrayM41031 = m41031(jSONObject, "edits", m41037(strM41107, strM41108, str5, "replace_match", str6));
        if (jSONArrayM41031.size() == 0) {
            throw C12731.m31626("edits must contain at least one item", "edits", jSONArrayM41031, JSON.array(), m41037(strM41107, strM41108, str5, "replace_match", str6));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        while (i4 < jSONArrayM41031.size()) {
            JSONObject jSONObjectM41037 = m41037(strM41107, strM41108, str5, "replace_match", str6);
            JSONValue jSONValue = jSONArrayM41031.get(i4);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C12731.m31626("Invalid edits item", m41038(i4), jSONValue, JSON.array(), jSONObjectM41037);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            JSONArray jSONArray = jSONArrayM41031;
            List listAsList2 = Arrays.asList(f56064);
            for (String str7 : jSONObjectAsObject.names()) {
                String str8 = strM41016;
                if (!listAsList2.contains(str7)) {
                    throw C12731.m31626("Invalid edit item argument", m41039(i4, str7), jSONObjectAsObject.get(str7), C10413.m26314(listAsList2), jSONObjectM41037);
                }
                strM41016 = str8;
            }
            String str9 = strM41016;
            String strM41040 = m41040(jSONObjectAsObject, i4, "mode", false, jSONObjectM41037);
            if (m41082(strM41040)) {
                jSONObjectM41037 = m41037(strM41107, strM41108, str5, strM41040, str6);
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            String strM41041 = m41040(jSONObjectAsObject, i4, "matchText", true, jSONObjectM41037);
            String strM41042 = m41040(jSONObjectAsObject, i4, "writeText", true, jSONObjectM41037);
            if ("write_target".equals(strM41040)) {
                if (!strM41041.isEmpty()) {
                    throw C12731.m31626("write_target requires empty matchText", m41039(i4, "matchText"), JSON.value(strM41041), JSON.array(""), m41037(strM41107, strM41108, str5, strM41040, str6));
                }
                if (strM41042.isEmpty() && !"zip_entry".equals(str5)) {
                    throw C12731.m31626("write_target requires non-empty writeText", m41039(i4, "writeText"), JSON.value(strM41042), JSON.array(), m41037(strM41107, strM41108, str5, strM41040, str6));
                }
            } else if (!"replace_match".equals(strM41040)) {
                if (!"insert_before_match".equals(strM41040) && !"insert_after_match".equals(strM41040)) {
                    throw C12731.m31626("Invalid mode", m41039(i4, "mode"), JSON.value(strM41040), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), m41037(strM41107, strM41108, str5, "replace_match", str6));
                }
                if (strM41041.isEmpty()) {
                    throw C12731.m31626(C15489.m37076(strM41040, " requires non-empty matchText"), m41039(i4, "matchText"), JSON.value(strM41041), JSON.array(), m41037(strM41107, strM41108, str5, strM41040, str6));
                }
                if (strM41042.isEmpty()) {
                    throw C12731.m31626(C15489.m37076(strM41040, " requires non-empty writeText"), m41039(i4, "writeText"), JSON.value(strM41042), JSON.array(), m41037(strM41107, strM41108, str5, strM41040, str6));
                }
            } else if (strM41041.isEmpty()) {
                throw C12731.m31626("replace_match requires non-empty matchText", m41039(i4, "matchText"), JSON.value(strM41041), JSON.array(), m41037(strM41107, strM41108, str5, strM41040, str6));
            }
            if ("write_target".equals(strM41040)) {
                i5 = i4;
            }
            C10668 c10668 = new C10668(strM41040, strM41041, strM41042);
            arrayList2 = arrayList3;
            arrayList2.add(c10668);
            i4++;
            jSONArrayM41031 = jSONArray;
            i3 = i5;
            strM41016 = str9;
        }
        int i6 = i3;
        String str10 = strM41016;
        if (arrayList2.size() <= 1 || i6 < 0) {
            return new C23368(strM41107, strM41108, str5, str6, str10, arrayList2);
        }
        throw C12731.m31626("write_target must be the only edit", m41039(i6, "mode"), JSON.value(((C10668) arrayList2.get(i6)).f36388), JSON.array("replace_match", "insert_before_match", "insert_after_match"), m41037(strM41107, strM41108, str5, "replace_match", str6));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41062(JSONObject jSONObject, int i, String str, JSONObject jSONObject2) throws C12731 {
        String strM41089 = m41089(i, str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41083(jSONObject2, strM41089);
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty() || (strAsString.length() & 1) != 0) {
            throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, JSON.value(strAsString), JSON.array("non-empty even-length hex"), jSONObject2);
        }
        int length = strAsString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iM41028 = m41028(strAsString.charAt(i3));
            int iM41029 = m41028(strAsString.charAt(i3 + 1));
            if (iM41028 < 0 || iM41029 < 0) {
                throw C12731.m31626(C0252.m1693("Invalid ", strM41089), strM41089, JSON.value(strAsString), JSON.array("hex characters 0-9, a-f, A-F"), jSONObject2);
            }
            bArr[i2] = (byte) (iM41029 | (iM41028 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m41089(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("patches[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41033(JSONObject jSONObject) {
        C16228 c16228;
        C16228 c16229;
        JSONValue jSONValue = jSONObject.get("workspaceId");
        String strAsString = (jSONValue == null || !jSONValue.isString() || jSONValue.asString().isEmpty()) ? "<workspaceId>" : jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("editSessionId");
        String strAsString2 = (jSONValue2 == null || !jSONValue2.isString() || jSONValue2.asString().isEmpty()) ? "<editSessionId>" : jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("locator");
        String strM35827 = "Lcom/example/EditTarget;";
        if (jSONValue3 == null || !jSONValue3.isString()) {
            c16228 = new C16228("smali_class", "Lcom/example/EditTarget;");
        } else {
            String strAsString3 = jSONValue3.asString();
            String strM41108 = m41108(strAsString3);
            String strM41017 = m41017(strAsString3);
            if (strM41108 == null || strM41017 == null) {
                c16228 = new C16228("smali_class", "Lcom/example/EditTarget;");
            } else if ("dex_method".equals(strM41108)) {
                if (strM41017.isEmpty()) {
                    strM41017 = "Lcom/example/EditTarget;->target()V";
                }
                c16229 = new C16228("smali_method", strM41017);
            } else if ("axml".equals(strM41108)) {
                if (strM41017.isEmpty()) {
                    strM41017 = "AndroidManifest.xml";
                }
                c16229 = new C16228("axml", strM41017);
            } else if ("zip_entry".equals(strM41108)) {
                if (strM41017.isEmpty()) {
                    strM41017 = "assets/example.txt";
                }
                c16229 = new C16228("zip_entry", strM41017);
            } else {
                if (!strM41017.isEmpty()) {
                    try {
                        strM35827 = C14952.m35827(strM41017);
                    } catch (RuntimeException | C12731 unused) {
                    }
                }
                c16229 = new C16228("smali_class", strM35827);
            }
            return m41037(strAsString, strAsString2, c16229.f52357, m41090(jSONObject), c16229.f52356);
        }
        c16229 = c16228;
        return m41037(strAsString, strAsString2, c16229.f52357, m41090(jSONObject), c16229.f52356);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m41090(JSONObject jSONObject) {
        JSONValue jSONValue;
        JSONValue jSONValue2 = jSONObject.get("mode");
        if (jSONValue2 != null && jSONValue2.isString() && m41082(jSONValue2.asString())) {
            return jSONValue2.asString();
        }
        JSONValue jSONValue3 = jSONObject.get("edits");
        return (jSONValue3 != null && jSONValue3.isArray() && jSONValue3.asArray().size() > 0 && jSONValue3.asArray().get(0).isObject() && (jSONValue = jSONValue3.asArray().get(0).asObject().get("mode")) != null && jSONValue.isString() && m41082(jSONValue.asString())) ? jSONValue.asString() : "replace_match";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41037(String str, String str2, String str3, String str4, String str5) {
        String strM38890;
        String str6;
        String str7;
        String str8 = ".class public ";
        String strM38891 = "";
        if ("write_target".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n.super Ljava/lang/Object;\n";
                strM38890 = C16523.m38890(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                StringBuilder sb = new StringBuilder(".method public ");
                int iIndexOf = str5.indexOf("->");
                strM38890 = C22697.m50267(sb, iIndexOf < 0 ? "method()V" : str5.substring(iIndexOf + 2), "\n    .registers 1\n    return-void\n.end method");
            } else {
                strM38890 = "axml".equals(str3) ? "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" />\n" : "text\n";
            }
        } else if ("replace_match".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n";
                strM38891 = C16523.m38890(".class public ", str5, "\n");
                str8 = ".class public final ";
                strM38890 = C16523.m38890(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                str6 = "    # inserted marker\n    return-void\n";
                strM38890 = str6;
                strM38891 = "    return-void\n";
            } else {
                strM38891 = "old";
                strM38890 = "new";
            }
        } else if (!"insert_before_match".equals(str4) && !"insert_after_match".equals(str4)) {
            strM38890 = "";
        } else if ("smali_class".equals(str3)) {
            strM38891 = ".super Ljava/lang/Object;\n";
            strM38890 = "# inserted comment\n";
        } else if ("smali_method".equals(str3)) {
            str6 = "    # inserted marker\n";
            strM38890 = str6;
            strM38891 = "    return-void\n";
        } else {
            strM38891 = "</";
            strM38890 = "inserted";
        }
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", m41043(str3, str5)).add("targetVersion", "<copy data.targetVersion from mt_apk_read_text>").add("edits", JSON.array().add(C3184.m9603("mode", str4, "matchText", strM38891).add("writeText", strM38890)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41035(String str, String str2, String str3) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", m41043(str3, "Lcom/example/EditTarget;"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41087(String str, String str2, String str3) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", m41044("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "01")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41036(String str, String str2, String str3, String str4) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("edits", JSON.array().add(JSON.object().add("locator", m41044("resource", (String) null, (String) null, (String) null, (String) null, str3)).add("variant", str4).add("targetVersion", "<copy results[0].targetVersion from mt_apk_resource_read>").add("valueXml", "<string name=\"example\">text</string>")));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C16312 m41085(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56055;
        m41056(jSONObject, "mt_apk_session_check", strArr);
        m41057(jSONObject, strArr);
        return new C16312(m41107(jSONObject, "workspaceId"), m41107(jSONObject, "editSessionId"), m41081(jSONObject, "runBuildChecks"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C15607 m41023(JSONObject jSONObject) throws C12731 {
        String strM17479;
        m41056(jSONObject, "build", f56065);
        m41057(jSONObject, f56056);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41108 = m41107(jSONObject, "editSessionId");
        String strM41016 = m41016(jSONObject, "outputName");
        if (strM41016.isEmpty()) {
            strM17479 = strM41016;
        } else if (strM41016.startsWith("/")) {
            strM17479 = C6370.m17479(strM41016, "outputName");
        } else {
            if (!".".equals(strM41016) && !"..".equals(strM41016) && strM41016.indexOf(47) < 0 && strM41016.indexOf(92) < 0) {
                int i = 0;
                if (strM41016.indexOf(0) < 0) {
                    int iIndexOf = strM41016.indexOf(58);
                    if (iIndexOf > 0) {
                        while (true) {
                            if (i < iIndexOf) {
                                char cCharAt = strM41016.charAt(i);
                                if (i == 0) {
                                    if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '-' || cCharAt == '.'))) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    strM17479 = strM41016;
                }
            }
            throw C12731.m31626("Invalid outputName", "outputName", JSON.value(strM41016), JSON.array(), JSON.object().add("outputName", "built.apk"));
        }
        return new C15607(strM41107, strM41108, strM17479, m41081(jSONObject, "overwrite"), jSONObject.contains("sign") ? m41081(jSONObject, "sign") : true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m41069(String str) throws C12731 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0 || str.endsWith("/")) {
            throw C12731.m31626("Invalid locator", "locator", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("locator", m41044("zip_entry", "res/layout/activity_main.xml", (String) null, (String) null, (String) null, (String) null)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41045(C2550 c2550) {
        String str = c2550.f10096;
        String str2 = c2550.f10096;
        if ("entry_text".equals(str)) {
            return m41044("zip_entry", c2550.f10100, (String) null, (String) null, (String) null, (String) null);
        }
        if ("axml".equals(str2)) {
            return m41044("axml", c2550.f10100, (String) null, (String) null, (String) null, (String) null);
        }
        if ("dex_class_smali".equals(str2)) {
            return m41044("dex_class", (String) null, c2550.f10097, (String) null, (String) null, (String) null);
        }
        if ("dex_method_smali".equals(str2)) {
            return m41044("dex_method", (String) null, c2550.f10097, c2550.f10098, (String) null, (String) null);
        }
        if ("dex_field_smali".equals(str2)) {
            return m41044("dex_field", (String) null, c2550.f10097, (String) null, c2550.f10099, (String) null);
        }
        return m41044("resource", (String) null, (String) null, (String) null, (String) null, c2550.f10101);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41044(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!"zip_entry".equals(str) && !"axml".equals(str)) {
            if ("dex_class".equals(str)) {
                str2 = C2209.m6824(str3);
            } else if ("dex_method".equals(str)) {
                str2 = m41064(str3, str4);
            } else if ("dex_field".equals(str)) {
                str2 = m41064(str3, str5);
            } else {
                if (!"resource".equals(str)) {
                    throw new IllegalArgumentException(C0252.m1693("Unsupported target kind: ", str));
                }
                str2 = str6 == null ? null : str6.toLowerCase(Locale.ROOT);
            }
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException(C0252.m1693("Empty target for locator kind: ", str));
        }
        return str + ':' + str2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m41105(String str) throws C12731 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m41044("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null));
        C20461 c20461M41053 = m41053(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c20461M41053.f66396;
        if (!"zip_entry".equals(str2)) {
            throw C12731.m31626("Only zip_entry locators are accepted", "locator", JSON.value(str2), JSON.array("zip_entry"), jSONObjectAdd);
        }
        String str3 = c20461M41053.f66397;
        if (str3 == null || !str3.endsWith("/")) {
            m41069(str3);
        } else {
            m41069(C20630.m46498(1, 0, str3));
        }
        return str3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m41108(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m41017(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONValue m41088(String str, String str2) {
        if (str == null || str2 == null) {
            return JSON.NULL;
        }
        if ("axml".equals(str) || "zip_entry".equals(str) || "smali_method".equals(str) || "smali_class".equals(str)) {
            return JSON.value(m41043(str, str2));
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41043(String str, String str2) {
        if ("axml".equals(str)) {
            return m41044("axml", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("zip_entry".equals(str)) {
            return m41044("zip_entry", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("smali_method".equals(str)) {
            return C0252.m1693("dex_method:", str2);
        }
        if ("smali_class".equals(str)) {
            return m41044("dex_class", (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C0252.m1693("Unsupported edit target type: ", str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m41078(String str, String str2, String str3) {
        if ("dex_method".equals(str)) {
            return m41044(str, (String) null, str2, str3, (String) null, (String) null);
        }
        if ("dex_field".equals(str)) {
            return m41044(str, (String) null, str2, (String) null, str3, (String) null);
        }
        if ("dex_class".equals(str)) {
            return m41044(str, (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C0252.m1693("Unsupported xref target kind: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14196 m41052(String str, String str2, C21632 c21632, JSONObject jSONObject) throws C12731 {
        JSONObject jSONObject2 = c21632.f70156;
        JSONObject jSONObject3 = c21632.f70155;
        String strM41107 = m41107(jSONObject2, "view");
        if ("zip_entries".equals(strM41107) || "dex_classes".equals(strM41107) || "resource_table".equals(strM41107)) {
            if (!jSONObject2.contains("prefix")) {
                throw m41084("prefix");
            }
            String strM41041 = m41041(jSONObject2, "prefix", "");
            int iM41030 = m41030(c21632, jSONObject);
            int iM41019 = m41019(jSONObject3, "offset");
            m41054(iM41019, 0, Integer.MAX_VALUE, "offset");
            return new C14196(str, str2, strM41107, strM41041, null, iM41030, iM41019, 0, 200);
        }
        throw C12731.m31626("Unsupported view", "view", JSON.value(strM41107), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14196 m41092(String str, String str2, C21632 c21632, JSONObject jSONObject) throws C12731 {
        JSONObject jSONObject2 = c21632.f70156;
        JSONObject jSONObject3 = c21632.f70155;
        String strM41096 = m41096(m41107(jSONObject2, "locator"));
        int iM41030 = m41030(c21632, jSONObject);
        int iM41019 = m41019(jSONObject3, "memberOffset");
        m41054(iM41019, 0, Integer.MAX_VALUE, "memberOffset");
        return new C14196(str, str2, "dex_class_outline", "", strM41096, iM41030, 0, iM41019, iM41030);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C4667 m41079(String str, String str2, C21632 c21632, JSONObject jSONObject) throws C12731 {
        JSONObject jSONObject2 = c21632.f70156;
        JSONObject jSONObject3 = c21632.f70155;
        C2550 c2550M41071 = m41071(m41107(jSONObject2, "target"));
        String str3 = c2550M41071.f10096;
        String strM41041 = m41041(jSONObject2, "format", TextBundle.TEXT_ENTRY);
        if ("hex".equals(strM41041)) {
            if (!"entry_text".equals(str3)) {
                throw C12731.m31626("Byte read cursor is valid only for zip_entry locators", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            int iM41030 = m41030(c21632, jSONObject);
            int iM41019 = m41019(jSONObject3, "hexOffset");
            m41054(iM41019, 0, Integer.MAX_VALUE, "hexOffset");
            return new C4667(str, str2, c2550M41071, strM41041, 0, 0, 500, 49152, iM41019, iM41030, null, null);
        }
        if (!TextBundle.TEXT_ENTRY.equals(strM41041)) {
            throw C12731.m31626("Invalid read cursor format", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        if ("resource_item".equals(str3)) {
            throw C12731.m31626("Resource read cursors are no longer supported", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        int iM41031 = m41030(c21632, jSONObject);
        int iM410110 = m41019(jSONObject2, "maxChars");
        m41054(iM410110, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM410111 = m41019(jSONObject3, "lineOffset");
        m41054(iM410111, 0, Integer.MAX_VALUE, "lineOffset");
        int iM410112 = m41019(jSONObject3, "lineCharOffset");
        m41054(iM410112, 0, Integer.MAX_VALUE, "lineCharOffset");
        return new C4667(str, str2, c2550M41071, strM41041, iM410111, iM410112, iM41031, iM410110, 0, 256, "nextCursor", jSONObject.get("nextCursor"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C1139 m41021(String str, String str2, C21632 c21632, JSONObject jSONObject) throws C12731 {
        String str3;
        C22307 c22307;
        JSONObject jSONObject2 = c21632.f70156;
        String strM41107 = m41107(jSONObject2, "query");
        String strM41108 = m41107(jSONObject2, "queryType");
        boolean zM41094 = m41094(jSONObject2, "caseSensitive");
        String strM41109 = m41107(jSONObject2, "matchMode");
        C11497 c11497M28685 = C11497.m28685(strM41107, strM41108, strM41109, zM41094);
        JSONValue jSONValue = jSONObject2.get("scopes");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41091("scopes", jSONValue);
        }
        String str4 = null;
        if (!jSONValue.isArray()) {
            throw C12731.m31626("Invalid scopes", "scopes", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        int i = 0;
        ArrayList arrayListM41046 = m41046(jSONValue.asArray(), false, false, false);
        if ("exact".equals(strM41109)) {
            Iterator it = arrayListM41046.iterator();
            while (it.hasNext()) {
                if ("smali".equals((String) it.next())) {
                    throw C12731.m31626("matchMode=exact is invalid for smali scope", "matchMode", JSON.value(strM41109), JSON.array("contains"), JSON.object().add("scopes", JSON.array("smali")).add("matchMode", "contains"));
                }
            }
        }
        int iM41030 = m41030(c21632, jSONObject);
        boolean zM41095 = m41094(jSONObject2, "includeSnippet");
        int iM41019 = m41019(jSONObject2, "snippetMaxChars");
        m41054(iM41019, 0, 1000, "snippetMaxChars");
        boolean zM41096 = m41094(jSONObject2, "explicitScopes");
        JSONValue jSONValue2 = jSONObject.get("nextCursor");
        String strM41041 = m41041(jSONObject2, "target", (String) null);
        if (strM41041 == null) {
            str3 = zM41096 ? "" : "overview";
        } else {
            while (true) {
                if (i >= 11) {
                    throw C12731.m31626("Invalid cursor", "nextCursor", jSONValue2, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                if (f56060[i].equals(strM41041)) {
                    str3 = strM41041;
                    break;
                }
                i++;
                str4 = null;
            }
        }
        boolean zM41097 = m41094(jSONObject2, "includeMatchOffsets");
        String strM41042 = m41041(jSONObject2, "zipEntryPrefix", str4);
        String strM41043 = m41041(jSONObject2, "resourcePrefix", str4);
        String strM41110 = strM41043 == null ? str4 : m41110(strM41043);
        String strM411010 = m41107(jSONObject2, "classPrefixMode");
        String strM41044 = m41041(jSONObject2, "classPrefix", str4);
        if ("none".equals(strM411010)) {
            if (strM41044 != null) {
                throw C12731.m31626("Invalid prefix", "prefix", JSON.value(strM41044), (JSONArray) null, (JSONObject) null);
            }
            c22307 = C22307.f72847;
        } else {
            if (strM41044 == null || strM41044.isEmpty()) {
                throw C12731.m31626("Invalid prefix", "prefix", strM41044 == null ? null : JSON.value(strM41044), (JSONArray) null, (JSONObject) null);
            }
            if (!"prefix".equals(strM411010) && !"descriptorExact".equals(strM411010)) {
                throw C12731.m31626("Invalid prefix", "prefix", JSON.value(strM41044), (JSONArray) null, (JSONObject) null);
            }
            c22307 = new C22307(strM411010, strM41044);
        }
        String strM411011 = m41107(jSONObject2, "dexStringResultMode");
        if (Name.LABEL.equals(strM411011) || "member".equals(strM411011)) {
            return new C1139(str, str2, str3, strM41107, arrayListM41046, iM41030, zM41095, iM41019, zM41096, zM41097, strM41042, strM41110, c22307, strM411011, c11497M28685, C2323.m7060(c21632.f70155, jSONObject.get("nextCursor")));
        }
        throw C12731.m31626("Invalid cursor", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C6784 m41065(String str, String str2, C21632 c21632, JSONObject jSONObject) throws C12731 {
        JSONObject jSONObject2 = c21632.f70156;
        int iM41030 = m41030(c21632, jSONObject);
        try {
            C12700 c12700M41022 = m41022(m41107(jSONObject2, "targetLocator"), jSONObject.get("nextCursor"));
            String strM41107 = m41107(jSONObject2, "methodResolution");
            m41080(strM41107, jSONObject.get("nextCursor"));
            m41058(c12700M41022, strM41107, jSONObject.get("nextCursor"));
            return new C6784(str, str2, c12700M41022.f42376, c12700M41022.f42374, c12700M41022.f42375, strM41107, iM41030, C4481.m12509(c21632.f70155, jSONObject.get("nextCursor")));
        } catch (C12731 unused) {
            throw C12731.m31626("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C12700 m41022(String str, JSONValue jSONValue) throws C12731 {
        C20461 c20461M41053 = m41053(m41102("dex_method"), JSON.value(str), "locator");
        String str2 = c20461M41053.f66396;
        try {
            String str3 = c20461M41053.f66397;
            if (!"dex_method".equals(str2)) {
                if (!"dex_field".equals(str2)) {
                    if ("dex_class".equals(str2)) {
                        return new C12700(str2, m41025(str3), null);
                    }
                    throw C12731.m31626("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_method", "dex_field", "dex_class"), m41102("dex_method"));
                }
                C16933 c16933M41093 = m41093(str3, "field", true);
                return new C12700(str2, c16933M41093.f54131, c16933M41093.f54132);
            }
            C16933 c16933M41094 = m41093(str3, e.s, true);
            return new C12700(str2, c16933M41094.f54131, c16933M41094.f54132);
        } catch (C12731 unused) {
            throw C12731.m31626("Invalid locator", "locator", jSONValue, JSON.array(), m41102(str2));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m41080(String str, JSONValue jSONValue) throws C12731 {
        int i = 0;
        while (true) {
            String[] strArr = f56062;
            if (i < 4) {
                if (strArr[i].equals(str)) {
                    return;
                } else {
                    i++;
                }
            } else {
                throw C12731.m31626("Invalid methodResolution", "methodResolution", jSONValue, C10413.m26314(Arrays.asList(strArr)), JSON.object().add("methodResolution", "dispatch"));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41058(C12700 c12700, String str, JSONValue jSONValue) throws C12731 {
        if ("dex_method".equals(c12700.f42376)) {
            if ("not_applicable".equals(str)) {
                throw C12731.m31626("Invalid methodResolution for dex_method", "methodResolution", jSONValue, C10413.m26314(Arrays.asList("exact", "slot", "dispatch")), JSON.object().add("methodResolution", "dispatch"));
            }
        } else if (!"not_applicable".equals(str)) {
            throw C12731.m31626("Invalid methodResolution for xref target", "methodResolution", jSONValue, JSON.array("not_applicable"), JSON.object().add("methodResolution", "not_applicable"));
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C2550 m41071(String str) throws C12731 {
        C20461 c20461M41053 = m41053(JSON.object().add("locator", m41044("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)), JSON.value(str), "locator");
        String str2 = c20461M41053.f66396;
        String str3 = c20461M41053.f66397;
        if ("zip_entry".equals(str2)) {
            return C2550.m7951(str3);
        }
        if ("axml".equals(str2)) {
            return C2550.m7949(str3);
        }
        if ("dex_class".equals(str2)) {
            return C2550.m7952(m41025(str3));
        }
        if (!"dex_method".equals(str2)) {
            if (!"dex_field".equals(str2)) {
                if ("resource".equals(str2)) {
                    return C2550.m7948(C22703.m50304(str3, "locator"));
                }
                throw C12731.m31626("Unsupported locator", "locator", JSON.value(str2), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field", "resource"), JSON.object().add("locator", m41044("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
            }
            C16933 c16933M41093 = m41093(str3, "field", true);
            return C2550.m7950(c16933M41093.f54131, c16933M41093.f54132);
        }
        C16933 c16933M41094 = m41093(str3, e.s, true);
        return C2550.m7953(c16933M41094.f54131, c16933M41094.f54132);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String m41096(String str) throws C12731 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m41044("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        C20461 c20461M41053 = m41053(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c20461M41053.f66396;
        if (!"dex_class".equals(str2)) {
            throw C12731.m31626("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class"), jSONObjectAdd);
        }
        return m41025(c20461M41053.f66397);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m41077(JSONObject jSONObject) throws C12731 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41091("locator", jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C12731.m31626("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return strAsString;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20461 m41053(JSONObject jSONObject, JSONValue jSONValue, String str) throws C12731 {
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626(C0252.m1693("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        String strAsString = jSONValue.asString();
        int iIndexOf = strAsString.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == strAsString.length() - 1) {
            throw C12731.m31626(C0252.m1693("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        return new C20461(strAsString.substring(0, iIndexOf), strAsString.substring(iIndexOf + 1));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m41086(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) ? i : m41029(i, jSONObject, str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m41098(String str) {
        return m41093(str, e.s, false).f54131;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m41100(String str) {
        return m41093(str, e.s, false).f54132;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m41064(String str, String str2) {
        return C2209.m6824(str) + "->" + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16933 m41093(java.lang.String r7, java.lang.String r8, boolean r9) throws l.C12731 {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17638.m41093(java.lang.String, java.lang.String, boolean):l.ܽ᩹۬");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m41067(String str) {
        if (str.length() == 1) {
            return "ZBCSIJFD".indexOf(str.charAt(0)) >= 0;
        }
        return str.startsWith("L") && str.endsWith(l.b) && str.length() > 2 && str.indexOf(91) < 0 && str.indexOf(58) < 0 && str.indexOf(40) < 0 && str.indexOf(41) < 0 && str.indexOf(59) == str.length() - 1;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String m41025(String str) throws C12731 {
        if (!m41067(str) || str.indexOf(46) >= 0 || str.indexOf(59) != str.length() - 1) {
            throw C12731.m31626("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", m41044("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
        }
        return C2209.m6824(str);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static JSONObject m41102(String str) {
        if ("dex_field".equals(str)) {
            return JSON.object().add("locator", m41044("dex_field", (String) null, "Lcom/example/Foo;", (String) null, "fieldFlag:Z", (String) null));
        }
        if ("dex_class".equals(str)) {
            return JSON.object().add("locator", m41044("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        }
        return JSON.object().add("locator", m41044("dex_method", (String) null, "Lcom/example/Foo;", "onCreate(Landroid/os/Bundle;)V", (String) null, (String) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m41051(String str, String str2, boolean z) {
        String str3 = e.s.equals(str2) ? "Lcom/example/Foo;->onCreate(Landroid/os/Bundle;)V" : "Lcom/example/Foo;->fieldFlag:Z";
        if (z) {
            return C12731.m31626("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", "dex_" + str2 + ':' + str3));
        }
        return C12731.m31626("Invalid target", "target", JSON.value(str), JSON.array(), JSON.object().add("target", "Lcom/example/Foo;->bar()V"));
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C0704 m41070(JSONObject jSONObject) throws C12731 {
        String[] strArr = f56067;
        m41056(jSONObject, "search", strArr);
        m41057(jSONObject, strArr);
        String strM41107 = m41107(jSONObject, "workspaceId");
        String strM41016 = m41016(jSONObject, "editSessionId");
        String strM41017 = m41016(jSONObject, "target");
        int i = 0;
        while (true) {
            String[] strArr2 = f56060;
            if (i >= 11) {
                throw C12731.m31626("Invalid target", "target", JSON.value(strM41017), C10413.m26314(Arrays.asList(strArr2)), m41020("overview", "AndroidManifest"));
            }
            if (strArr2[i].equals(strM41017)) {
                String strM41018 = m41016(jSONObject, "query");
                if (strM41018.isEmpty()) {
                    throw C12731.m31626("Invalid query", "query", JSON.value(strM41018), (JSONArray) null, m41020(strM41017, "AndroidManifest"));
                }
                String strM41019 = m41016(jSONObject, "queryType");
                boolean zM41081 = m41081(jSONObject, "caseSensitive");
                String strM410110 = m41016(jSONObject, "matchMode");
                String strM410111 = m41016(jSONObject, "prefix");
                boolean zM41082 = m41081(jSONObject, "includeMatchOffsets");
                int iM41063 = m41063(jSONObject, "limit");
                m41055(iM41063, 1, 200, "limit", m41020(strM41017, strM41018));
                int iM41064 = m41063(jSONObject, "snippetMaxChars");
                m41055(iM41064, 0, 1000, "snippetMaxChars", m41020(strM41017, strM41018));
                if ("overview".equals(strM41017) && !strM410111.isEmpty()) {
                    throw C12731.m31626("prefix must be empty for target=overview", "prefix", JSON.value(strM410111), JSON.array(""), m41020("overview", "AndroidManifest"));
                }
                if ("smali".equals(strM41017) && "exact".equals(strM410110)) {
                    throw C12731.m31626("matchMode=exact is invalid for target=smali", "matchMode", JSON.value(strM410110), JSON.array("contains"), m41020("smali", "onCreate"));
                }
                if ("resource_table_names".equals(strM41017) || "resource_table_values".equals(strM41017) || "resource_table_file_paths".equals(strM41017)) {
                    m41110(strM410111);
                } else if (m41095(strM41017) && !strM410111.isEmpty()) {
                    m41027(m41020(strM41017, "Outer").put("prefix", "com.example."), strM410111);
                }
                try {
                    return new C0704(strM41107, strM41016, strM41017, strM41018, strM410111, zM41082, iM41063, iM41064, C11497.m28685(strM41018, strM41019, strM410110, zM41081));
                } catch (C12731 e) {
                    if (!e.f42473) {
                        throw e;
                    }
                    JSONObject jSONObject2 = e.f42468;
                    String string = jSONObject2.getString("argument", null);
                    if (!"query".equals(string) && !"queryType".equals(string) && !"matchMode".equals(string)) {
                        throw e;
                    }
                    throw C12731.m31626(e.getMessage(), string, e.f42474, jSONObject2.getJSONArray("allowedValues"), m41020(strM41017, "query".equals(string) ? "AndroidManifest" : strM41018));
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m41095(String str) {
        return "dex_names".equals(str) || "dex_strings".equals(str) || "dex_string_members".equals(str) || "smali".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41047(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return m41046(jSONArrayArray, false, false, false);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String m41110(String str) throws C12731 {
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("/") || str.contains("//")) {
            throw m41049(str);
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0 || iIndexOf != str.lastIndexOf(47)) {
                throw m41049(str);
            }
            if (str.substring(0, iIndexOf).isEmpty()) {
                throw m41049(str);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m41049(String str) {
        return C12731.m31626("Invalid prefix", "prefix", JSON.value(str), JSON.array("", "0x7f", "string", "string/app_", "app_"), m41020("resource_table_names", "app_name").put("prefix", "string/"));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C22307 m41027(JSONObject jSONObject, String str) throws C12731 {
        if (str == null) {
            return C22307.f72847;
        }
        if (!str.contains(l.b)) {
            String strReplace = (str.startsWith("L") ? str.substring(1) : str).replace('.', '/');
            if (strReplace.isEmpty()) {
                throw C12731.m31626("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
            }
            return new C22307("prefix", strReplace);
        }
        if (str.startsWith("L") && str.endsWith(l.b) && str.indexOf(59) == str.length() - 1 && str.length() > 3 && C3184.m9601(2, str) != '/') {
            return new C22307("descriptorExact", str);
        }
        throw C12731.m31626("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41046(JSONArray jSONArray, boolean z, boolean z2, boolean z3) throws C12731 {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = f56068;
        String str2 = "resource_table_value";
        String str3 = f56069;
        if (jSONArray == null || jSONArray.isNull()) {
            linkedHashSet.add("zip_entries");
            linkedHashSet.add("axml");
            if (z3) {
                linkedHashSet.add("resource_table_id");
                linkedHashSet.add("resource_table_name");
                linkedHashSet.add("resource_table_value");
            }
            if (z) {
                linkedHashSet.add("dex_class");
                linkedHashSet.add("dex_field");
                linkedHashSet.add("dex_method");
            }
            if (z2) {
                linkedHashSet.add("dex_string");
            }
        } else {
            if (!jSONArray.isArray()) {
                throw C12731.m31626(C0252.m1693("Invalid scopes. ", str3), "scopes", jSONArray, C10413.m26314(Arrays.asList(strArr)), m41032());
            }
            Iterator it = jSONArray.asArray().iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                JSONValue jSONValue = (JSONValue) it.next();
                if (!jSONValue.isString()) {
                    throw C12731.m31626(C0252.m1693("Invalid scopes. ", str3), "scopes", jSONValue, C10413.m26314(Arrays.asList(strArr)), m41032());
                }
                String strAsString = jSONValue.asString();
                if ("zip_entries".equals(strAsString) || "axml".equals(strAsString) || "resource_table_id".equals(strAsString) || "resource_table_name".equals(strAsString) || str2.equals(strAsString)) {
                    str = str2;
                } else {
                    str = str2;
                    if (!"resource_table_file_path".equals(strAsString) && !"dex_class".equals(strAsString) && !"dex_field".equals(strAsString) && !"dex_method".equals(strAsString) && !"dex_string".equals(strAsString) && !"smali".equals(strAsString) && !"native_symbol".equals(strAsString) && !"native_string".equals(strAsString)) {
                        throw C12731.m31626(C7997.m21055("Invalid scope: ", strAsString, ". ", str3), "scopes", JSON.value(strAsString), C10413.m26314(Arrays.asList(strArr)), m41032());
                    }
                }
                linkedHashSet.add(strAsString);
                it = it2;
                str2 = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 13; i++) {
            String str4 = strArr[i];
            if (linkedHashSet.contains(str4)) {
                arrayList.add(str4);
            }
        }
        if (arrayList.isEmpty()) {
            throw C12731.m31626(C0252.m1693("Invalid scopes. ", str3), "scopes", jSONArray, C10413.m26314(Arrays.asList(strArr)), m41032());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m41024(String str) {
        return "resource_table_id".equals(str) || "resource_table_name".equals(str) || "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41056(JSONObject jSONObject, String str, String... strArr) throws C12731 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw C12731.m31626(C16523.m38890("Invalid ", str, " argument"), str2, jSONObject.get(str2), C10413.m26314(listAsList), JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41057(JSONObject jSONObject, String... strArr) throws C12731 {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!jSONObject.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            throw m41084((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("Missing parameters: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i));
        }
        throw C12731.m31626(sb.toString(), "parameters", (JSONValue) null, C10413.m26314(arrayList), JSON.object());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C21166 m41109(JSONObject jSONObject) throws C12731 {
        for (String str : jSONObject.names()) {
            if (!"workspaceId".equals(str) && !"editSessionId".equals(str) && !"nextCursor".equals(str) && !"limit".equals(str)) {
                throw C12731.m31626("Invalid continue continuation argument", str, jSONObject.get(str), JSON.array("workspaceId", "editSessionId", "nextCursor", "limit"), JSON.object().add("nextCursor", "<cursor>"));
            }
        }
        m41057(jSONObject, "workspaceId", "editSessionId", "nextCursor", "limit");
        return new C21166(m41107(jSONObject, "workspaceId"), m41016(jSONObject, "editSessionId"), m41107(jSONObject, "nextCursor"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41030(C21632 c21632, JSONObject jSONObject) throws C12731 {
        int iM41063 = m41063(jSONObject, "limit");
        m41054(iM41063, 1, c21632.f70153, "limit");
        return iM41063;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41020(String str, String str2) {
        return C3184.m9603("workspaceId", "ab12cd34", "editSessionId", "").add("target", str).add("query", str2).add("queryType", "literal").add("caseSensitive", false).add("matchMode", "contains").add("prefix", "").add("includeMatchOffsets", false).add("limit", 50).add("snippetMaxChars", 240);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m41107(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41091(str, jSONValue);
        }
        String strM41041 = m41041(jSONObject, str, (String) null);
        if (strM41041.isEmpty()) {
            throw C12731.m31626("Invalid ".concat(str), str, JSON.value(strM41041), (JSONArray) null, (JSONObject) null);
        }
        return strM41041;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m41016(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m41091(str, jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m41031(JSONObject jSONObject, String str, JSONObject jSONObject2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw C12731.m31626("Missing ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        if (!jSONValue.isArray()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41041(JSONObject jSONObject, String str, String str2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return str2;
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41029(int i, JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return i;
        }
        if (!jSONValue.isNumber()) {
            throw m41050(str, jSONValue);
        }
        try {
            return C10413.m26321(jSONValue);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m41050(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m41019(JSONObject jSONObject, String str) throws C12731 {
        if (!jSONObject.contains(str)) {
            throw m41084(str);
        }
        return m41029(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m41063(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m41084(str);
        }
        if (jSONValue.isNull()) {
            throw m41050(str, jSONValue);
        }
        return m41029(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41061(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return false;
        }
        if (!jSONValue.isBoolean()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m41094(JSONObject jSONObject, String str) throws C12731 {
        if (!jSONObject.contains(str)) {
            throw m41084(str);
        }
        return m41061(jSONObject, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m41081(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m41084(str);
        }
        if (jSONValue.isNull()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return m41061(jSONObject, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41054(int i, int i2, int i3, String str) throws C12731 {
        if (i < i2 || i > i3) {
            throw C12731.m31626("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41055(int i, int i2, int i3, String str, JSONObject jSONObject) throws C12731 {
        if (i < i2 || i > i3) {
            throw C12731.m31626("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), jSONObject);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m41050(String str, JSONValue jSONValue) {
        return C12731.m31626(C16523.m38890("Invalid ", str, ": expected a 32-bit integer JSON number"), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C12731 m41084(String str) {
        return C12731.m31626(C0252.m1693("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m41091(String str, JSONValue jSONValue) {
        return C12731.m31626("Missing ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C12731 m41083(JSONObject jSONObject, String str) {
        return C12731.m31626(C0252.m1693("Missing ", str), str, (JSONValue) null, (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41032() {
        return JSON.object().add("scopes", JSON.array("dex_string", "smali"));
    }
}
