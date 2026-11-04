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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۘ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15766 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String f15778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f15781;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final String[] f15774 = {"workspaceId", "editSessionId", "target", "query", "queryType", "caseSensitive", "matchMode", "prefix", "includeMatchOffsets", "limit", "snippetMaxChars"};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f15765 = {"overview", "files", "resource_table_names", "resource_table_values", "resource_table_file_paths", "dex_names", "dex_strings", "dex_string_members", "smali", "native_symbols", "native_strings"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String[] f15775 = {"workspaceId", "editSessionId", "reads", "maxValueChars", "maxValueXmlChars", "maxItemsPerValue", "resolveDepth"};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f15776 = {"locator", "variant"};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f15771 = {"workspaceId", "editSessionId", "locator", "methodResolution", "limit"};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f15768 = {"exact", "slot", "dispatch", "not_applicable"};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f15772 = {"workspaceId", "editSessionId", "locator", "targetVersion", "edits"};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f15769 = {"workspaceId", "editSessionId", "locator"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f15770 = {"workspaceId", "editSessionId", "locator", "patches"};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f15782 = {"byteOffset", "expectedHex", "replacementHex"};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f15777 = {"workspaceId", "editSessionId", "edits"};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f15780 = {"workspaceId", "editSessionId", "runBuildChecks"};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f15767 = {"mode", "matchText", "writeText"};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f15773 = {"locator", "variant", "targetVersion", "valueXml"};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f15779 = {"workspaceId", "editSessionId", "outputPath", "overwrite", "sign"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f15764 = {"workspaceId", "editSessionId", "outputPath", "overwrite"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13890(char c) {
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
    public static String m13900(int i) {
        return C14442.m34864(i, "edits[", "]");
    }

    static {
        String[] strArr = {"zip_entries", "axml", "resource_table_id", "resource_table_name", "resource_table_value", "resource_table_file_path", "dex_class", "dex_field", "dex_method", "dex_string", "smali", "native_symbol", "native_string"};
        f15781 = strArr;
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
        f15778 = sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13896(String str, int i, String str2, String str3) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("nextCursor", str3).add("limit", i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONValue m13930(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(m13906(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C10099 m13982(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "open", MotionUtils.EASING_TYPE_PATH, "temporary");
        String strM13942 = m13942(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("temporary");
        if (jSONValue != null && jSONValue.isNull()) {
            throw C10186.m26301("Invalid temporary", "temporary", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        boolean zM13924 = m13924(jSONObject, "temporary");
        if ("mt://current-apk".equals(strM13942)) {
            return new C10099(null, null, !zM13924, zM13924);
        }
        if (strM13942.startsWith("mt://installed-app/")) {
            C1919 c1919M29183 = C11613.m29183(strM13942);
            return new C10099(c1919M29183.f6454, zM13924, c1919M29183);
        }
        if (strM13942.startsWith("mt://workspace/")) {
            String strSubstring = strM13942.substring(15);
            if (strSubstring.isEmpty()) {
                throw C10186.m26301("Invalid path", MotionUtils.EASING_TYPE_PATH, JSON.value(strM13942), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            if (zM13924) {
                throw C10186.m26301("temporary is invalid when reopening a workspace", "temporary", JSON.value(true), JSON.array(false), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            return new C10099(null, strSubstring, true, false);
        }
        C9113 c9113M51885 = C20015.m46048().m51885();
        String strM2299 = C0470.m2299(c9113M51885, strM13942, MotionUtils.EASING_TYPE_PATH, false);
        c9113M51885.m24268(strM2299);
        return new C10099(strM2299, null, !zM13924, zM13924);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String m13983(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "read_signature", "workspaceId");
        m13920(jSONObject, "workspaceId");
        return m13942(jSONObject, "workspaceId");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C20542 m13977(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "close", "workspaceId");
        m13920(jSONObject, "workspaceId");
        return new C20542(m13942(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19050 m13955(JSONObject jSONObject) {
        return m13973(jSONObject, "mt_apk_list_entries", "zip_entries");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C19050 m13953(JSONObject jSONObject) {
        return m13973(jSONObject, "mt_apk_dex_list_classes", "dex_classes");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C19050 m13973(JSONObject jSONObject, String str, String str2) throws C10186 {
        String[] strArr = {"workspaceId", "editSessionId", "prefix", "limit"};
        m13919(jSONObject, str, strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        String strM13927 = m13926(jSONObject, "prefix");
        int iM13946 = m13946(jSONObject, "limit");
        m13917(iM13946, 1, 1000, "limit");
        return new C19050(iM13946, 0, strM13942, strM13926, str2, strM13927, 200, null);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C19050 m13951(JSONObject jSONObject) throws C10186 {
        String[] strArr = {"workspaceId", "editSessionId", "view", "typeName", "variant", "limit"};
        m13919(jSONObject, "mt_apk_resource_list", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        int iM13946 = m13946(jSONObject, "limit");
        m13917(iM13946, 1, 1000, "limit");
        String strM13943 = m13942(jSONObject, "view");
        if (!"resource_table".equals(strM13943) && !"resource_table_variants".equals(strM13943)) {
            throw C10186.m26301("Unsupported resource list view", "view", JSON.value(strM13943), JSON.array("resource_table", "resource_table_variants"), JSON.object().add("view", "resource_table"));
        }
        String strM13944 = m13942(jSONObject, "typeName");
        String strM13945 = m13942(jSONObject, "variant");
        if (!"*".equals(strM13945) && !"default".equals(strM13945) && !strM13945.startsWith("-")) {
            throw C10186.m26301("Invalid variant. Use default for a configuration with no qualifiers, or exact qualifiers with a leading hyphen, such as -zh-rCN. Copy a variant returned by resource_table_variants when unsure. Use * only to list all configurations.", "variant", JSON.value(strM13945), JSON.array(), JSON.object().add("variant", "-zh-rCN"));
        }
        return new C19050(strM13942, strM13926, strM13943, "", null, iM13946, 0, 0, 200, strM13944, strM13945);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C19050 m13888(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "mt_apk_dex_read_class_outline", "workspaceId", "editSessionId", "locator", "limit");
        m13920(jSONObject, "workspaceId", "editSessionId", "locator", "limit");
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        String strM13952 = m13952(m13932(jSONObject));
        int iM13946 = m13946(jSONObject, "limit");
        m13917(iM13946, 1, 1000, "limit");
        return new C19050(iM13946, 0, strM13942, strM13926, "dex_class_outline", "", iM13946, strM13952);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C2642 m13889(JSONObject jSONObject) {
        m13919(jSONObject, "read_text", "workspaceId", "editSessionId", "locator", "limit", "maxChars", "startLine", "startColumn");
        m13920(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        C13828 c13828M13887 = m13887(m13932(jSONObject));
        String str = c13828M13887.f43896;
        if (!"entry_text".equals(str) && !"axml".equals(str) && !"dex_class_smali".equals(str) && !"dex_method_smali".equals(str) && !"dex_field_smali".equals(str)) {
            throw C10186.m26301("mt_apk_read_text accepts only text locators", "locator", JSON.value(m13947(m13907(c13828M13887))), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field"), JSON.object().add("locator", m13906("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM13963 = m13963(49152, jSONObject, "maxChars");
        m13917(iM13963, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM13964 = m13963(500, jSONObject, "limit");
        m13917(iM13964, 1, 2000, "limit");
        int iM13965 = m13963(0, jSONObject, "startLine");
        m13917(iM13965, 0, Integer.MAX_VALUE, "startLine");
        int iM13966 = m13963(0, jSONObject, "startColumn");
        m13917(iM13966, 0, Integer.MAX_VALUE, "startColumn");
        return new C2642(strM13942, strM13926, c13828M13887, TextBundle.TEXT_ENTRY, iM13965, iM13966, iM13964, iM13963, 0, 256, "startColumn", JSON.value(iM13966));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C2642 m13941(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "read_bytes", "workspaceId", "editSessionId", "locator", "byteOffset", "maxBytes");
        m13920(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        C13828 c13828M13887 = m13887(m13932(jSONObject));
        if (!"entry_text".equals(c13828M13887.f43896)) {
            throw C10186.m26301("mt_apk_read_bytes accepts only zip_entry locators", "locator", JSON.value(m13947(m13907(c13828M13887))), JSON.array("zip_entry"), JSON.object().add("locator", m13906("zip_entry", "classes.dex", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM13963 = m13963(0, jSONObject, "byteOffset");
        m13917(iM13963, 0, Integer.MAX_VALUE, "byteOffset");
        int iM13964 = m13963(256, jSONObject, "maxBytes");
        m13917(iM13964, 1, 65536, "maxBytes");
        return new C2642(strM13942, strM13926, c13828M13887, "hex", 0, 0, 500, 49152, iM13963, iM13964, null, null);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C7117 m13929(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15775;
        m13919(jSONObject, "resource_read", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        String str = "locator";
        JSONObject jSONObjectAdd = C22121.m50076("workspaceId", strM13942, "editSessionId", strM13926).add("reads", JSON.array().add(JSON.object().add("locator", m13906("resource", (String) null, (String) null, (String) null, (String) null, "0x7F010000")).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
        JSONArray jSONArrayM13893 = m13893(jSONObject, jSONObjectAdd, "reads");
        if (jSONArrayM13893.size() == 0 || jSONArrayM13893.size() > 200) {
            throw C10186.m26301("Invalid reads", "reads", JSON.value(jSONArrayM13893.size()), JSON.array(1, 200), jSONObjectAdd);
        }
        ArrayList arrayList = new ArrayList(jSONArrayM13893.size());
        int i = 0;
        while (i < jSONArrayM13893.size()) {
            JSONValue jSONValue = jSONArrayM13893.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C10186.m26301("Invalid reads item", C14442.m34864(i, "reads[", "]"), jSONValue, JSON.array(), jSONObjectAdd);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f15776);
            for (String str2 : jSONObjectAsObject.names()) {
                JSONArray jSONArray = jSONArrayM13893;
                if (!listAsList.contains(str2)) {
                    throw C10186.m26301("Invalid resource_read item argument", m13931(i, str2), jSONObjectAsObject.get(str2), C12556.m31235(listAsList), jSONObjectAdd);
                }
                jSONArrayM13893 = jSONArray;
            }
            JSONArray jSONArray2 = jSONArrayM13893;
            String strM13931 = m13931(i, str);
            JSONValue jSONValue2 = jSONObjectAsObject.get(str);
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m13885(jSONObjectAdd, strM13931);
            }
            C20783 c20783M13916 = m13916(jSONObjectAdd, jSONValue2, strM13931);
            String str3 = str;
            String str4 = c20783M13916.f66584;
            String str5 = strM13926;
            if (!"resource".equals(str4)) {
                throw C10186.m26301("mt_apk_resource_read accepts only resource locators", strM13931, JSON.value(str4), JSON.array("resource"), jSONObjectAdd);
            }
            String strM21735 = C7972.m21735(c20783M13916.f66585, strM13931);
            String strM13932 = m13931(i, "variant");
            JSONValue jSONValue3 = jSONObjectAsObject.get("variant");
            if (jSONValue3 == null || jSONValue3.isNull()) {
                throw m13885(jSONObjectAdd, strM13932);
            }
            if (!jSONValue3.isString()) {
                throw C10186.m26301(C25272.m56409("Invalid ", strM13932), strM13932, jSONValue3, (JSONArray) null, jSONObjectAdd);
            }
            String strAsString = jSONValue3.asString();
            if (strAsString.isEmpty()) {
                throw C10186.m26301(C25272.m56409("Invalid ", strM13932), strM13932, JSON.value(strAsString), (JSONArray) null, jSONObjectAdd);
            }
            if ("*".equals(strAsString)) {
                throw C10186.m26301("Invalid reads item variant", m13931(i, "variant"), JSON.value(strAsString), JSON.array("default"), jSONObjectAdd);
            }
            arrayList.add(new C8608(strM21735, strAsString));
            i++;
            str = str3;
            strM13926 = str5;
            jSONArrayM13893 = jSONArray2;
        }
        int iM13946 = m13946(jSONObject, "maxValueChars");
        m13917(iM13946, 1, 32768, "maxValueChars");
        int iM13947 = m13946(jSONObject, "maxValueXmlChars");
        m13917(iM13947, 1, 1048576, "maxValueXmlChars");
        int iM13948 = m13946(jSONObject, "maxItemsPerValue");
        m13917(iM13948, 0, 2000, "maxItemsPerValue");
        int iM13949 = m13946(jSONObject, "resolveDepth");
        m13917(iM13949, 0, 1, "resolveDepth");
        return new C7117(strM13942, strM13926, arrayList, iM13946, iM13947, iM13948, iM13949);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m13931(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("reads[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10671 m13914(C12578 c12578, C11196 c11196) throws C10186 {
        String str;
        ArrayList arrayListM13909;
        String str2 = c12578.f40379;
        String str3 = c11196.f35331;
        String str4 = c12578.f40374;
        String str5 = c12578.f40380;
        String str6 = c12578.f40376;
        if (!str3.equals(str4)) {
            throw C10186.m26301("Invalid workspaceId", "workspaceId", JSON.value(str4), (JSONArray) null, (JSONObject) null);
        }
        if ("overview".equals(str6)) {
            str = str4;
            arrayListM13909 = m13908((JSONArray) null, c11196.f35328, c11196.f35330, c11196.f35329);
        } else {
            str = str4;
            if ("files".equals(str6)) {
                arrayListM13909 = m13909("zip_entries", "axml");
            } else if ("resource_table_names".equals(str6)) {
                arrayListM13909 = m13909("resource_table_id", "resource_table_name");
            } else if ("resource_table_values".equals(str6)) {
                arrayListM13909 = m13909("resource_table_value");
            } else if ("resource_table_file_paths".equals(str6)) {
                arrayListM13909 = m13909("resource_table_file_path");
            } else if ("dex_names".equals(str6)) {
                arrayListM13909 = m13909("dex_class", "dex_field", "dex_method");
            } else if ("dex_strings".equals(str6) || "dex_string_members".equals(str6)) {
                arrayListM13909 = m13909("dex_string");
            } else if ("smali".equals(str6)) {
                arrayListM13909 = m13909("smali");
            } else if ("native_symbols".equals(str6)) {
                arrayListM13909 = m13909("native_symbol");
            } else if ("native_strings".equals(str6)) {
                arrayListM13909 = m13909("native_string");
            } else {
                throw C10186.m26301("Invalid target", "target", JSON.value(str6), C12556.m31235(Arrays.asList(f15765)), m13957("overview", "AndroidManifest"));
            }
        }
        ArrayList arrayList = arrayListM13909;
        String str7 = c12578.f40375;
        String str8 = c12578.f40376;
        int i = c12578.f40377;
        int i2 = c12578.f40378;
        return new C10671(str, str7, str8, str2, arrayList, i, i2 > 0, i2, !"overview".equals(str8), c12578.f40381, (("files".equals(str6) || "native_symbols".equals(str6) || "native_strings".equals(str6)) && !str5.isEmpty()) ? str5 : null, ("resource_table_names".equals(str6) || "resource_table_values".equals(str6) || "resource_table_file_paths".equals(str6)) ? m13984(str5) : null, (!m13974(str6) || str5.isEmpty()) ? C21860.f69689 : m13939(m13957(str6, str2).put("prefix", "com.example."), str5), "dex_string_members".equals(str6) ? "member" : Name.LABEL, c12578.f40382, new C14903(0, 0, 0, -1, 0));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static C15146 m13962(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15771;
        m13919(jSONObject, "dex_xref", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        C24513 c24513M13978 = m13978(m13932(jSONObject), jSONObject.get("locator"));
        String strM13943 = m13942(jSONObject, "methodResolution");
        m13935(strM13943, jSONObject.get("methodResolution"));
        m13923(c24513M13978, strM13943, jSONObject.get("methodResolution"));
        int iM13946 = m13946(jSONObject, "limit");
        m13917(iM13946, 1, 200, "limit");
        return new C15146(strM13942, strM13926, c24513M13978.f79497, c24513M13978.f79495, c24513M13978.f79496, strM13943, iM13946, new C8959(0, 0, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14574 m13886(JSONObject jSONObject) throws C10186 {
        m13919(jSONObject, "mt_apk_session_create", "workspaceId");
        m13920(jSONObject, "workspaceId");
        return new C14574(m13942(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C12337 m13949(JSONObject jSONObject) throws C10186 {
        C3629 c3629;
        String[] strArr = f15769;
        m13919(jSONObject, "mt_apk_delete_target", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13943 = m13942(jSONObject, "editSessionId");
        if (strM13943.isEmpty()) {
            throw C10186.m26301("mt_apk_delete_target requires a non-empty editSessionId", "editSessionId", JSON.value(strM13943), JSON.array("edit session id returned by mt_apk_session_create"), m13897(strM13942, "edit1234", "dex_class"));
        }
        C20783 c20783M13916 = m13916(m13897("<workspaceId>", "<editSessionId>", "smali_class"), JSON.value(m13932(jSONObject)), "locator");
        String str = c20783M13916.f66585;
        String str2 = c20783M13916.f66584;
        if ("dex_class".equals(str2)) {
            c3629 = new C3629("smali_class", m13884(str));
        } else if ("dex_method".equals(str2)) {
            C6613 c6613M13971 = m13971(str, e.s, true);
            c3629 = new C3629("smali_method", m13948(c6613M13971.f22101, c6613M13971.f22102));
        } else {
            if (!"axml".equals(str2) && !"zip_entry".equals(str2)) {
                throw C10186.m26301("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), m13897("<workspaceId>", "<editSessionId>", "smali_class"));
            }
            if (str == null || !str.endsWith("/")) {
                m13940(str);
            } else {
                m13940(C1402.m5124(1, 0, str));
            }
            c3629 = new C3629(str2, str);
        }
        return new C12337(strM13942, strM13943, c3629.f12441, c3629.f12440);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C24272 m13944(JSONObject jSONObject) throws C10186 {
        String[] strArr;
        String strM21735;
        int i;
        int iM13975;
        String strM13942;
        m13919(jSONObject, "mt_apk_resource_delete", "workspaceId", "editSessionId", "deletes");
        m13920(jSONObject, "workspaceId", "editSessionId", "deletes");
        String strM13943 = m13942(jSONObject, "workspaceId");
        String strM13944 = m13942(jSONObject, "editSessionId");
        JSONArray jSONArrayM13964 = m13964(jSONObject, "deletes");
        if (jSONArrayM13964.isEmpty() || jSONArrayM13964.size() > 200) {
            throw C10186.m26301("deletes must contain 1..200 targets", "deletes", JSON.value(jSONArrayM13964.size()), (JSONArray) null, (JSONObject) null);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArrayM13964.size()) {
            try {
                JSONValue jSONValue = jSONArrayM13964.get(i2);
                if (!jSONValue.isObject()) {
                    throw C10186.m26301("Expected a deletion target object", "", jSONValue, (JSONArray) null, (JSONObject) null);
                }
                JSONObject jSONObjectAsObject = jSONValue.asObject();
                String strM13945 = m13942(jSONObjectAsObject, "kind");
                if ("resource".equals(strM13945)) {
                    strArr = new String[]{"kind", "locator"};
                } else if ("variant".equals(strM13945)) {
                    strArr = new String[]{"kind", "locator", "variant"};
                } else {
                    if (!"type_variant".equals(strM13945)) {
                        throw C10186.m26301("Unsupported resource deletion kind", "kind", JSON.value(strM13945), JSON.array("resource", "variant", "type_variant"), JSON.object());
                    }
                    strArr = new String[]{"kind", "packageId", "typeId", "variant"};
                }
                JSONArray jSONArray = jSONArrayM13964;
                m13919(jSONObjectAsObject, "resource deletion", strArr);
                m13920(jSONObjectAsObject, strArr);
                if ("type_variant".equals(strM13945)) {
                    int iM13976 = m13975(m13942(jSONObjectAsObject, "packageId"), "packageId");
                    iM13975 = m13975(m13942(jSONObjectAsObject, "typeId"), "typeId");
                    strM21735 = null;
                    i = iM13976;
                } else {
                    String strM13946 = m13942(jSONObjectAsObject, "locator");
                    if (!strM13946.startsWith("resource:")) {
                        throw C10186.m26301("Expected a resource locator", "locator", JSON.value(strM13946), (JSONArray) null, (JSONObject) null);
                    }
                    strM21735 = C7972.m21735(strM13946.substring(9), "locator");
                    i = 0;
                    iM13975 = 0;
                }
                if ("resource".equals(strM13945)) {
                    strM13942 = null;
                } else {
                    strM13942 = m13942(jSONObjectAsObject, "variant");
                    if (strM13942.indexOf(42) >= 0 || (!"default".equals(strM13942) && (!strM13942.startsWith("-") || strM13942.length() == 1))) {
                        throw C10186.m26301("Use default or an exact returned variant with a leading hyphen; wildcards are not accepted", "variant", JSON.value(strM13942), (JSONArray) null, (JSONObject) null);
                    }
                }
                arrayList.add(new C6372(strM13945, i, strM21735, strM13942, iM13975));
                i2++;
                jSONArrayM13964 = jSONArray;
            } catch (C10186 e) {
                String strM34864 = C14442.m34864(i2, "deletes[", "]");
                JSONObject jSONObject2 = e.f32602;
                String string = jSONObject2.getString("argument", "");
                if (!string.isEmpty()) {
                    strM34864 = C20196.m46451(strM34864, ".", string);
                }
                jSONObject2.put("argument", strM34864).put("failedDeleteIndex", i2).put("deleteTarget", JSON.NULL);
                throw e;
            }
        }
        return new C24272(strM13943, strM13944, arrayList);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m13975(String str, String str2) throws C10186 {
        if (str.length() == 4 && str.startsWith("0x")) {
            int iM13890 = m13890(str.charAt(2));
            int iM13891 = m13890(str.charAt(3));
            if (iM13890 >= 0 && iM13891 >= 0 && iM13890 + iM13891 > 0) {
                return (iM13890 * 16) + iM13891;
            }
        }
        throw C10186.m26301(str2.concat(" must be 0x followed by two hex digits in 0x01..0xff"), str2, JSON.value(str), (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C9353 m13961(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15770;
        m13919(jSONObject, "patch_bytes", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13943 = m13942(jSONObject, "editSessionId");
        if (strM13943.isEmpty()) {
            throw C10186.m26301("mt_apk_patch_bytes requires a non-empty editSessionId", "editSessionId", JSON.value(strM13943), JSON.array("edit session id returned by mt_apk_session_create"), m13965(strM13942, "edit1234", "assets/data.bin"));
        }
        C20783 c20783M13916 = m13916(m13965(strM13942, strM13943, "assets/data.bin"), JSON.value(m13932(jSONObject)), "locator");
        String str = c20783M13916.f66584;
        if (!"zip_entry".equals(str)) {
            throw C10186.m26301("mt_apk_patch_bytes accepts only zip_entry locators", "locator", JSON.value(str), JSON.array("zip_entry"), m13965(strM13942, strM13943, "assets/data.bin"));
        }
        String str2 = c20783M13916.f66585;
        m13940(str2);
        JSONArray jSONArrayM13893 = m13893(jSONObject, m13965(strM13942, strM13943, str2), "patches");
        JSONObject jSONObjectM13965 = m13965(strM13942, strM13943, str2);
        if (jSONArrayM13893.size() == 0) {
            throw C10186.m26301("patches must contain at least one item", "patches", jSONArrayM13893, JSON.array("1..200"), jSONObjectM13965);
        }
        if (jSONArrayM13893.size() > 200) {
            throw C10186.m26301("patches must contain at most 200 items", "patches", JSON.value(jSONArrayM13893.size()), JSON.array("1..200"), jSONObjectM13965);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = 0;
        while (i < jSONArrayM13893.size()) {
            JSONValue jSONValue = jSONArrayM13893.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C10186.m26301("Invalid patches item", C14442.m34864(i, "patches[", "]"), jSONValue, JSON.array(), jSONObjectM13965);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f15782);
            for (String str3 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str3)) {
                    throw C10186.m26301("Invalid patch item argument", m13968(i, str3), jSONObjectAsObject.get(str3), C12556.m31235(listAsList), jSONObjectM13965);
                }
            }
            String strM13968 = m13968(i, "byteOffset");
            JSONValue jSONValue2 = jSONObjectAsObject.get("byteOffset");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m13885(jSONObjectM13965, strM13968);
            }
            if (!jSONValue2.isNumber()) {
                throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, jSONValue2, (JSONArray) null, jSONObjectM13965);
            }
            try {
                int iM31240 = C12556.m31240(jSONValue2);
                if (iM31240 < 0) {
                    throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, jSONValue2, JSON.array(0, Integer.MAX_VALUE), jSONObjectM13965);
                }
                byte[] bArrM13925 = m13925(jSONObjectAsObject, i, "expectedHex", jSONObjectM13965);
                byte[] bArrM13926 = m13925(jSONObjectAsObject, i, "replacementHex", jSONObjectM13965);
                JSONArray jSONArray = jSONArrayM13893;
                if (bArrM13925.length != bArrM13926.length) {
                    throw C10186.m26301("expectedHex and replacementHex must contain the same byte count", m13968(i, "replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array("same byte count as expectedHex"), jSONObjectM13965);
                }
                if (bArrM13925.length > 4096) {
                    throw C10186.m26301("Patch item is too large", m13968(i, "replacementHex"), JSON.value(bArrM13925.length), JSON.array("1..4096"), jSONObjectM13965);
                }
                length += bArrM13925.length;
                if (length > 65536) {
                    throw C10186.m26301("Patch byte budget exceeded", "patches", JSON.value(length), JSON.array("1..65536"), jSONObjectM13965);
                }
                arrayList.add(new C1151(iM31240, bArrM13925, bArrM13926));
                i++;
                jSONArrayM13893 = jSONArray;
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, jSONValue2, (JSONArray) null, jSONObjectM13965);
            }
        }
        return new C9353(strM13942, strM13943, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18304 m13938(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15777;
        m13919(jSONObject, "mt_apk_resource_edit", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13943 = m13942(jSONObject, "editSessionId");
        String str = "default";
        JSONArray jSONArrayM13893 = m13893(jSONObject, m13898(strM13942, strM13943, "0x7f010000", "default"), "edits");
        JSONObject jSONObjectM13898 = m13898(strM13942, strM13943, "0x7f010000", "default");
        if (jSONArrayM13893.size() == 0) {
            C10186 c10186M26301 = C10186.m26301("edits must contain at least one item", "edits", jSONArrayM13893, JSON.array("1..200"), jSONObjectM13898);
            m13921(c10186M26301, strM13942, strM13943);
            throw c10186M26301;
        }
        if (jSONArrayM13893.size() > 200) {
            C10186 c10186M26302 = C10186.m26301("edits must contain at most 200 items", "edits", JSON.value(jSONArrayM13893.size()), JSON.array("1..200"), jSONObjectM13898);
            m13921(c10186M26302, strM13942, strM13943);
            throw c10186M26302;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < jSONArrayM13893.size()) {
            JSONValue jSONValue = jSONArrayM13893.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                C10186 c10186M26303 = C10186.m26301("Invalid edits item", m13900(i), jSONValue, JSON.array(), jSONObjectM13898);
                m13922(c10186M26303, strM13942, strM13943, i, (String) null, (String) null);
                throw c10186M26303;
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f15773);
            for (String str2 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str2)) {
                    C10186 c10186M26304 = C10186.m26301("Invalid edit resource item argument", m13901(i, str2), jSONObjectAsObject.get(str2), C12556.m31235(listAsList), jSONObjectM13898);
                    m13922(c10186M26304, strM13942, strM13943, i, (String) null, (String) null);
                    throw c10186M26304;
                }
            }
            JSONValue jSONValue2 = jSONObjectAsObject.get("locator");
            String strM13901 = m13901(i, "locator");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                C10186 c10186M13885 = m13885(jSONObjectM13898, strM13901);
                m13922(c10186M13885, strM13942, strM13943, i, (String) null, (String) null);
                throw c10186M13885;
            }
            try {
                C20783 c20783M13916 = m13916(jSONObjectM13898, jSONValue2, strM13901);
                String str3 = c20783M13916.f66584;
                if (!"resource".equals(str3)) {
                    C10186 c10186M26305 = C10186.m26301("mt_apk_resource_edit accepts only resource locators", strM13901, JSON.value(str3), JSON.array("resource"), jSONObjectM13898);
                    m13922(c10186M26305, strM13942, strM13943, i, (String) null, (String) null);
                    throw c10186M26305;
                }
                try {
                    String strM21735 = C7972.m21735(c20783M13916.f66585, strM13901);
                    JSONObject jSONObjectM13899 = m13898(strM13942, strM13943, strM21735, str);
                    JSONArray jSONArray = jSONArrayM13893;
                    String strM13904 = m13904(jSONObjectAsObject, strM13942, strM13943, i, strM21735, null, "variant", jSONObjectM13899);
                    if ("*".equals(strM13904)) {
                        C10186 c10186M26306 = C10186.m26301("Invalid variant", m13901(i, "variant"), JSON.value(strM13904), JSON.array(str), jSONObjectM13899);
                        m13922(c10186M26306, strM13942, strM13943, i, strM21735, strM13904);
                        throw c10186M26306;
                    }
                    int i2 = i;
                    JSONObject jSONObject2 = jSONObjectM13898;
                    String strM13905 = m13904(jSONObjectAsObject, strM13942, strM13943, i2, strM21735, strM13904, "targetVersion", m13898(strM13942, strM13943, strM21735, strM13904));
                    String str4 = str;
                    String strM13906 = m13904(jSONObjectAsObject, strM13942, strM13943, i2, strM21735, strM13904, "valueXml", m13898(strM13942, strM13943, strM21735, strM13904));
                    if (strM13906.trim().isEmpty()) {
                        C10186 c10186M26307 = C10186.m26301("valueXml is required", m13901(i, "valueXml"), JSON.value(strM13906), JSON.array(), m13898(strM13942, strM13943, strM21735, strM13904));
                        m13922(c10186M26307, strM13942, strM13943, i, strM21735, strM13904);
                        throw c10186M26307;
                    }
                    if (!linkedHashSet.add(strM21735 + '\n' + strM13904)) {
                        C10186 c10186M26308 = C10186.m26301("Duplicate resource edit target", m13901(i, "locator"), JSON.value(m13906("resource", (String) null, (String) null, (String) null, (String) null, strM21735)), JSON.array(), m13898(strM13942, strM13943, strM21735, strM13904));
                        m13922(c10186M26308, strM13942, strM13943, i, strM21735, strM13904);
                        throw c10186M26308;
                    }
                    arrayList.add(new C21288(strM21735, strM13904, strM13905, strM13906));
                    i++;
                    str = str4;
                    jSONArrayM13893 = jSONArray;
                    jSONObjectM13898 = jSONObject2;
                } catch (C10186 e) {
                    m13922(e, strM13942, strM13943, i, (String) null, (String) null);
                    throw e;
                }
            } catch (C10186 e2) {
                m13922(e2, strM13942, strM13943, i, (String) null, (String) null);
                throw e2;
            }
        }
        return new C18304(strM13942, strM13943, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13904(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str5);
        String strM13901 = m13901(i, str5);
        if (jSONValue == null || jSONValue.isNull()) {
            C10186 c10186M13885 = m13885(jSONObject2, strM13901);
            m13922(c10186M13885, str, str2, i, str3, str4);
            throw c10186M13885;
        }
        if (!jSONValue.isString()) {
            C10186 c10186M26301 = C10186.m26301(C25272.m56409("Invalid ", strM13901), strM13901, jSONValue, (JSONArray) null, jSONObject2);
            m13922(c10186M26301, str, str2, i, str3, str4);
            throw c10186M26301;
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.isEmpty()) {
            return strAsString;
        }
        C10186 c10186M26302 = C10186.m26301(C25272.m56409("Invalid ", strM13901), strM13901, JSON.value(strAsString), (JSONArray) null, jSONObject2);
        m13922(c10186M26302, str, str2, i, str3, str4);
        throw c10186M26302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13922(C10186 c10186, String str, String str2, int i, String str3, String str4) {
        JSONValue jSONValueValue;
        JSONObject jSONObjectPut = c10186.f32602.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i);
        if (str3 == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(m13906("resource", (String) null, (String) null, (String) null, (String) null, str3));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("locator", jSONValueValue).put("variant", str4 == null ? JSON.NULL : JSON.value(str4));
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut2.put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13921(C10186 c10186, String str, String str2) {
        JSONObject jSONObjectPut = c10186.f32602.put("workspaceId", str).put("editSessionId", str2);
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut.put("failedEditIndex", jSONValue).put("locator", jSONValue).put("variant", jSONValue).put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13902(JSONObject jSONObject, int i, String str, boolean z, JSONObject jSONObject2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM13901 = m13901(i, str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13885(jSONObject2, strM13901);
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301(C25272.m56409("Invalid ", strM13901), strM13901, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (z || !strAsString.isEmpty()) {
            return strAsString;
        }
        throw C10186.m26301(C25272.m56409("Invalid ", strM13901), strM13901, JSON.value(strAsString), (JSONArray) null, jSONObject2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13937(String str) {
        return "write_target".equals(str) || "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13901(int i, String str) {
        return C12669.m31438(new StringBuilder(), m13900(i), ".", str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C7863 m13985(JSONObject jSONObject) throws C10186 {
        C3629 c3629;
        String[] strArr = f15772;
        List listAsList = Arrays.asList(strArr);
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str)) {
                throw C10186.m26301("Invalid edit_text argument", str, jSONObject.get(str), C12556.m31235(listAsList), m13895(jSONObject));
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
            JSONObject jSONObjectM13895 = m13895(jSONObject);
            if (arrayList.size() == 1) {
                throw m13885(jSONObjectM13895, (String) arrayList.get(0));
            }
            StringBuilder sb = new StringBuilder("Missing parameters: ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) arrayList.get(i2));
            }
            throw C10186.m26301(sb.toString(), "parameters", (JSONValue) null, C12556.m31235(arrayList), jSONObjectM13895);
        }
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13943 = m13942(jSONObject, "editSessionId");
        C20783 c20783M13916 = m13916(JSON.object().add("locator", m13906("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)), JSON.value(m13932(jSONObject)), "locator");
        String str3 = c20783M13916.f66584;
        String str4 = c20783M13916.f66585;
        if ("dex_class".equals(str3)) {
            c3629 = new C3629("smali_class", m13884(str4));
        } else if ("dex_method".equals(str3)) {
            C6613 c6613M13971 = m13971(str4, e.s, true);
            c3629 = new C3629("smali_method", m13948(c6613M13971.f22101, c6613M13971.f22102));
        } else {
            if (!"axml".equals(str3) && !"zip_entry".equals(str3)) {
                throw C10186.m26301("Unsupported locator", "locator", JSON.value(str3), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), JSON.object().add("locator", m13906("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
            }
            m13940(str4);
            c3629 = new C3629(str3, str4);
        }
        String strM13926 = m13926(jSONObject, "targetVersion");
        boolean zIsEmpty = strM13926.isEmpty();
        String str5 = c3629.f12441;
        String str6 = c3629.f12440;
        if (zIsEmpty) {
            throw C10186.m26301("targetVersion is required", "targetVersion", JSON.value(strM13926), JSON.array(), m13899(strM13942, strM13943, str5, m13969(jSONObject), str6));
        }
        JSONArray jSONArrayM13893 = m13893(jSONObject, m13899(strM13942, strM13943, str5, "replace_match", str6), "edits");
        if (jSONArrayM13893.size() == 0) {
            throw C10186.m26301("edits must contain at least one item", "edits", jSONArrayM13893, JSON.array(), m13899(strM13942, strM13943, str5, "replace_match", str6));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        while (i4 < jSONArrayM13893.size()) {
            JSONObject jSONObjectM13899 = m13899(strM13942, strM13943, str5, "replace_match", str6);
            JSONValue jSONValue = jSONArrayM13893.get(i4);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C10186.m26301("Invalid edits item", m13900(i4), jSONValue, JSON.array(), jSONObjectM13899);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            JSONArray jSONArray = jSONArrayM13893;
            List listAsList2 = Arrays.asList(f15767);
            for (String str7 : jSONObjectAsObject.names()) {
                String str8 = strM13926;
                if (!listAsList2.contains(str7)) {
                    throw C10186.m26301("Invalid edit item argument", m13901(i4, str7), jSONObjectAsObject.get(str7), C12556.m31235(listAsList2), jSONObjectM13899);
                }
                strM13926 = str8;
            }
            String str9 = strM13926;
            String strM13902 = m13902(jSONObjectAsObject, i4, "mode", false, jSONObjectM13899);
            if (m13937(strM13902)) {
                jSONObjectM13899 = m13899(strM13942, strM13943, str5, strM13902, str6);
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            String strM13903 = m13902(jSONObjectAsObject, i4, "matchText", true, jSONObjectM13899);
            String strM13904 = m13902(jSONObjectAsObject, i4, "writeText", true, jSONObjectM13899);
            if ("write_target".equals(strM13902)) {
                if (!strM13903.isEmpty()) {
                    throw C10186.m26301("write_target requires empty matchText", m13901(i4, "matchText"), JSON.value(strM13903), JSON.array(""), m13899(strM13942, strM13943, str5, strM13902, str6));
                }
                if (strM13904.isEmpty() && !"zip_entry".equals(str5)) {
                    throw C10186.m26301("write_target requires non-empty writeText", m13901(i4, "writeText"), JSON.value(strM13904), JSON.array(), m13899(strM13942, strM13943, str5, strM13902, str6));
                }
            } else if (!"replace_match".equals(strM13902)) {
                if (!"insert_before_match".equals(strM13902) && !"insert_after_match".equals(strM13902)) {
                    throw C10186.m26301("Invalid mode", m13901(i4, "mode"), JSON.value(strM13902), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), m13899(strM13942, strM13943, str5, "replace_match", str6));
                }
                if (strM13903.isEmpty()) {
                    throw C10186.m26301(C14483.m34972(strM13902, " requires non-empty matchText"), m13901(i4, "matchText"), JSON.value(strM13903), JSON.array(), m13899(strM13942, strM13943, str5, strM13902, str6));
                }
                if (strM13904.isEmpty()) {
                    throw C10186.m26301(C14483.m34972(strM13902, " requires non-empty writeText"), m13901(i4, "writeText"), JSON.value(strM13904), JSON.array(), m13899(strM13942, strM13943, str5, strM13902, str6));
                }
            } else if (strM13903.isEmpty()) {
                throw C10186.m26301("replace_match requires non-empty matchText", m13901(i4, "matchText"), JSON.value(strM13903), JSON.array(), m13899(strM13942, strM13943, str5, strM13902, str6));
            }
            if ("write_target".equals(strM13902)) {
                i5 = i4;
            }
            C0405 c0405 = new C0405(strM13902, strM13903, strM13904);
            arrayList2 = arrayList3;
            arrayList2.add(c0405);
            i4++;
            jSONArrayM13893 = jSONArray;
            i3 = i5;
            strM13926 = str9;
        }
        int i6 = i3;
        String str10 = strM13926;
        if (arrayList2.size() <= 1 || i6 < 0) {
            return new C7863(strM13942, strM13943, str5, str6, str10, arrayList2);
        }
        throw C10186.m26301("write_target must be the only edit", m13901(i6, "mode"), JSON.value(((C0405) arrayList2.get(i6)).f1950), JSON.array("replace_match", "insert_before_match", "insert_after_match"), m13899(strM13942, strM13943, str5, "replace_match", str6));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m13925(JSONObject jSONObject, int i, String str, JSONObject jSONObject2) throws C10186 {
        String strM13968 = m13968(i, str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13885(jSONObject2, strM13968);
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty() || (strAsString.length() & 1) != 0) {
            throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, JSON.value(strAsString), JSON.array("non-empty even-length hex"), jSONObject2);
        }
        int length = strAsString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iM13890 = m13890(strAsString.charAt(i3));
            int iM13891 = m13890(strAsString.charAt(i3 + 1));
            if (iM13890 < 0 || iM13891 < 0) {
                throw C10186.m26301(C25272.m56409("Invalid ", strM13968), strM13968, JSON.value(strAsString), JSON.array("hex characters 0-9, a-f, A-F"), jSONObject2);
            }
            bArr[i2] = (byte) (iM13891 | (iM13890 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m13968(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("patches[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13895(JSONObject jSONObject) {
        C3629 c3629;
        C3629 c36210;
        JSONValue jSONValue = jSONObject.get("workspaceId");
        String strAsString = (jSONValue == null || !jSONValue.isString() || jSONValue.asString().isEmpty()) ? "<workspaceId>" : jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("editSessionId");
        String strAsString2 = (jSONValue2 == null || !jSONValue2.isString() || jSONValue2.asString().isEmpty()) ? "<editSessionId>" : jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("locator");
        String strM42520 = "Lcom/example/EditTarget;";
        if (jSONValue3 == null || !jSONValue3.isString()) {
            c3629 = new C3629("smali_class", "Lcom/example/EditTarget;");
        } else {
            String strAsString3 = jSONValue3.asString();
            String strM13947 = m13947(strAsString3);
            String strM13943 = m13943(strAsString3);
            if (strM13947 == null || strM13943 == null) {
                c3629 = new C3629("smali_class", "Lcom/example/EditTarget;");
            } else if ("dex_method".equals(strM13947)) {
                if (strM13943.isEmpty()) {
                    strM13943 = "Lcom/example/EditTarget;->target()V";
                }
                c36210 = new C3629("smali_method", strM13943);
            } else if ("axml".equals(strM13947)) {
                if (strM13943.isEmpty()) {
                    strM13943 = "AndroidManifest.xml";
                }
                c36210 = new C3629("axml", strM13943);
            } else if ("zip_entry".equals(strM13947)) {
                if (strM13943.isEmpty()) {
                    strM13943 = "assets/example.txt";
                }
                c36210 = new C3629("zip_entry", strM13943);
            } else {
                if (!strM13943.isEmpty()) {
                    try {
                        strM42520 = C18282.m42520(strM13943);
                    } catch (RuntimeException | C10186 unused) {
                    }
                }
                c36210 = new C3629("smali_class", strM42520);
            }
            return m13899(strAsString, strAsString2, c36210.f12441, m13969(jSONObject), c36210.f12440);
        }
        c36210 = c3629;
        return m13899(strAsString, strAsString2, c36210.f12441, m13969(jSONObject), c36210.f12440);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m13969(JSONObject jSONObject) {
        JSONValue jSONValue;
        JSONValue jSONValue2 = jSONObject.get("mode");
        if (jSONValue2 != null && jSONValue2.isString() && m13937(jSONValue2.asString())) {
            return jSONValue2.asString();
        }
        JSONValue jSONValue3 = jSONObject.get("edits");
        return (jSONValue3 != null && jSONValue3.isArray() && jSONValue3.asArray().size() > 0 && jSONValue3.asArray().get(0).isObject() && (jSONValue = jSONValue3.asArray().get(0).asObject().get("mode")) != null && jSONValue.isString() && m13937(jSONValue.asString())) ? jSONValue.asString() : "replace_match";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13899(String str, String str2, String str3, String str4, String str5) {
        String strM34865;
        String str6;
        String str7;
        String str8 = ".class public ";
        String strM34866 = "";
        if ("write_target".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n.super Ljava/lang/Object;\n";
                strM34865 = C14442.m34865(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                StringBuilder sb = new StringBuilder(".method public ");
                int iIndexOf = str5.indexOf("->");
                strM34865 = C8947.m23910(sb, iIndexOf < 0 ? "method()V" : str5.substring(iIndexOf + 2), "\n    .registers 1\n    return-void\n.end method");
            } else {
                strM34865 = "axml".equals(str3) ? "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" />\n" : "text\n";
            }
        } else if ("replace_match".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n";
                strM34866 = C14442.m34865(".class public ", str5, "\n");
                str8 = ".class public final ";
                strM34865 = C14442.m34865(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                str6 = "    # inserted marker\n    return-void\n";
                strM34865 = str6;
                strM34866 = "    return-void\n";
            } else {
                strM34866 = "old";
                strM34865 = "new";
            }
        } else if (!"insert_before_match".equals(str4) && !"insert_after_match".equals(str4)) {
            strM34865 = "";
        } else if ("smali_class".equals(str3)) {
            strM34866 = ".super Ljava/lang/Object;\n";
            strM34865 = "# inserted comment\n";
        } else if ("smali_method".equals(str3)) {
            str6 = "    # inserted marker\n";
            strM34865 = str6;
            strM34866 = "    return-void\n";
        } else {
            strM34866 = "</";
            strM34865 = "inserted";
        }
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", m13905(str3, str5)).add("targetVersion", "<copy data.targetVersion from mt_apk_read_text>").add("edits", JSON.array().add(C22121.m50076("mode", str4, "matchText", strM34866).add("writeText", strM34865)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13897(String str, String str2, String str3) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", m13905(str3, "Lcom/example/EditTarget;"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m13965(String str, String str2, String str3) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", m13906("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "01")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13898(String str, String str2, String str3, String str4) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("edits", JSON.array().add(JSON.object().add("locator", m13906("resource", (String) null, (String) null, (String) null, (String) null, str3)).add("variant", str4).add("targetVersion", "<copy results[0].targetVersion from mt_apk_resource_read>").add("valueXml", "<string name=\"example\">text</string>")));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C4134 m13927(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15780;
        m13919(jSONObject, "mt_apk_session_check", strArr);
        m13920(jSONObject, strArr);
        return new C4134(m13942(jSONObject, "workspaceId"), m13942(jSONObject, "editSessionId"), m13979(jSONObject, "runBuildChecks"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3388 m13910(JSONObject jSONObject, C9113 c9113) throws C10186 {
        m13919(jSONObject, "build", f15779);
        m13920(jSONObject, f15764);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13943 = m13942(jSONObject, "editSessionId");
        String strM13926 = m13926(jSONObject, "outputPath");
        return new C3388(strM13942, strM13943, !strM13926.isEmpty() ? C0470.m2299(c9113, strM13926, "outputPath", false) : strM13926, m13979(jSONObject, "overwrite"), jSONObject.contains("sign") ? m13979(jSONObject, "sign") : true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13940(String str) throws C10186 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0 || str.endsWith("/")) {
            throw C10186.m26301("Invalid locator", "locator", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("locator", m13906("zip_entry", "res/layout/activity_main.xml", (String) null, (String) null, (String) null, (String) null)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13907(C13828 c13828) {
        String str = c13828.f43896;
        String str2 = c13828.f43896;
        if ("entry_text".equals(str)) {
            return m13906("zip_entry", c13828.f43895, (String) null, (String) null, (String) null, (String) null);
        }
        if ("axml".equals(str2)) {
            return m13906("axml", c13828.f43895, (String) null, (String) null, (String) null, (String) null);
        }
        if ("dex_class_smali".equals(str2)) {
            return m13906("dex_class", (String) null, c13828.f43891, (String) null, (String) null, (String) null);
        }
        if ("dex_method_smali".equals(str2)) {
            return m13906("dex_method", (String) null, c13828.f43891, c13828.f43894, (String) null, (String) null);
        }
        if ("dex_field_smali".equals(str2)) {
            return m13906("dex_field", (String) null, c13828.f43891, (String) null, c13828.f43892, (String) null);
        }
        return m13906("resource", (String) null, (String) null, (String) null, (String) null, c13828.f43893);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13906(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!"zip_entry".equals(str) && !"axml".equals(str)) {
            if ("dex_class".equals(str)) {
                str2 = C15870.m37840(str3);
            } else if ("dex_method".equals(str)) {
                str2 = m13948(str3, str4);
            } else if ("dex_field".equals(str)) {
                str2 = m13948(str3, str5);
            } else {
                if (!"resource".equals(str)) {
                    throw new IllegalArgumentException(C25272.m56409("Unsupported target kind: ", str));
                }
                str2 = str6 == null ? null : str6.toLowerCase(Locale.ROOT);
            }
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException(C25272.m56409("Empty target for locator kind: ", str));
        }
        return C8008.m21875(':', str, str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m13954(String str) throws C10186 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m13906("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null));
        C20783 c20783M13916 = m13916(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c20783M13916.f66584;
        if (!"zip_entry".equals(str2)) {
            throw C10186.m26301("Only zip_entry locators are accepted", "locator", JSON.value(str2), JSON.array("zip_entry"), jSONObjectAdd);
        }
        String str3 = c20783M13916.f66585;
        if (str3 == null || !str3.endsWith("/")) {
            m13940(str3);
        } else {
            m13940(C1402.m5124(1, 0, str3));
        }
        return str3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m13947(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m13943(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONValue m13967(String str, String str2) {
        if (str == null || str2 == null) {
            return JSON.NULL;
        }
        if ("axml".equals(str) || "zip_entry".equals(str) || "smali_method".equals(str) || "smali_class".equals(str)) {
            return JSON.value(m13905(str, str2));
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13905(String str, String str2) {
        if ("axml".equals(str)) {
            return m13906("axml", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("zip_entry".equals(str)) {
            return m13906("zip_entry", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("smali_method".equals(str)) {
            return C25272.m56409("dex_method:", str2);
        }
        if ("smali_class".equals(str)) {
            return m13906("dex_class", (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C25272.m56409("Unsupported edit target type: ", str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m13933(String str, String str2, String str3) {
        if ("dex_method".equals(str)) {
            return m13906(str, (String) null, str2, str3, (String) null, (String) null);
        }
        if ("dex_field".equals(str)) {
            return m13906(str, (String) null, str2, (String) null, str3, (String) null);
        }
        if ("dex_class".equals(str)) {
            return m13906(str, (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C25272.m56409("Unsupported xref target kind: ", str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m13966(C14596 c14596, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(c14596.f45982);
        jSONObject2.remove("recommendedLimit");
        jSONObject2.remove("limitMax");
        return jSONObject2.put("workspaceId", m13942(jSONObject, "workspaceId")).put("editSessionId", m13926(jSONObject, "editSessionId")).put("limit", m13892(c14596, jSONObject));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19050 m13915(String str, String str2, C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        JSONObject jSONObject3 = c14596.f45980;
        String strM13952 = m13952(m13942(jSONObject2, "locator"));
        int iM13892 = m13892(c14596, jSONObject);
        int iM13956 = m13956(jSONObject3, "memberOffset");
        m13917(iM13956, 0, Integer.MAX_VALUE, "memberOffset");
        return new C19050(iM13892, iM13956, str, str2, "dex_class_outline", "", iM13892, strM13952);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2642 m13970(String str, String str2, C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        JSONObject jSONObject3 = c14596.f45980;
        C13828 c13828M13887 = m13887(m13942(jSONObject2, "target"));
        String str3 = c13828M13887.f43896;
        String strM13903 = m13903(jSONObject2, "format", TextBundle.TEXT_ENTRY);
        if ("hex".equals(strM13903)) {
            if (!"entry_text".equals(str3)) {
                throw C10186.m26301("Byte read cursor is valid only for zip_entry locators", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            int iM13892 = m13892(c14596, jSONObject);
            int iM13956 = m13956(jSONObject3, "hexOffset");
            m13917(iM13956, 0, Integer.MAX_VALUE, "hexOffset");
            return new C2642(str, str2, c13828M13887, strM13903, 0, 0, 500, 49152, iM13956, iM13892, null, null);
        }
        if (!TextBundle.TEXT_ENTRY.equals(strM13903)) {
            throw C10186.m26301("Invalid read cursor format", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        if ("resource_item".equals(str3)) {
            throw C10186.m26301("Resource read cursors are no longer supported", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        int iM13893 = m13892(c14596, jSONObject);
        int iM13957 = m13956(jSONObject2, "maxChars");
        m13917(iM13957, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM13958 = m13956(jSONObject3, "lineOffset");
        m13917(iM13958, 0, Integer.MAX_VALUE, "lineOffset");
        int iM13959 = m13956(jSONObject3, "lineCharOffset");
        m13917(iM13959, 0, Integer.MAX_VALUE, "lineCharOffset");
        return new C2642(str, str2, c13828M13887, strM13903, iM13958, iM13959, iM13893, iM13957, 0, 256, "nextCursor", jSONObject.get("nextCursor"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10671 m13934(String str, String str2, C14596 c14596, JSONObject jSONObject) throws C10186 {
        String str3;
        C21860 c21860;
        JSONObject jSONObject2 = c14596.f45982;
        String strM13942 = m13942(jSONObject2, "query");
        String strM13943 = m13942(jSONObject2, "queryType");
        boolean zM13936 = m13936(jSONObject2, "caseSensitive");
        String strM13944 = m13942(jSONObject2, "matchMode");
        C12666 c12666M31432 = C12666.m31432(strM13942, strM13943, strM13944, zM13936);
        int i = 0;
        ArrayList arrayListM13908 = m13908(m13964(jSONObject2, "scopes"), false, false, false);
        if ("exact".equals(strM13944)) {
            Iterator it = arrayListM13908.iterator();
            while (it.hasNext()) {
                if ("smali".equals((String) it.next())) {
                    throw C10186.m26301("matchMode=exact is invalid for smali scope", "matchMode", JSON.value(strM13944), JSON.array("contains"), JSON.object().add("scopes", JSON.array("smali")).add("matchMode", "contains"));
                }
            }
        }
        int iM13892 = m13892(c14596, jSONObject);
        boolean zM13937 = m13936(jSONObject2, "includeSnippet");
        int iM13956 = m13956(jSONObject2, "snippetMaxChars");
        m13917(iM13956, 0, 1000, "snippetMaxChars");
        boolean zM13938 = m13936(jSONObject2, "explicitScopes");
        JSONValue jSONValue = jSONObject.get("nextCursor");
        String strM13903 = m13903(jSONObject2, "target", (String) null);
        if (strM13903 == null) {
            str3 = zM13938 ? "" : "overview";
        } else {
            while (true) {
                if (i >= 11) {
                    throw C10186.m26301("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                if (f15765[i].equals(strM13903)) {
                    str3 = strM13903;
                    break;
                }
                i++;
            }
        }
        boolean zM13939 = m13936(jSONObject2, "includeMatchOffsets");
        String strM13904 = m13903(jSONObject2, "zipEntryPrefix", (String) null);
        String strM13905 = m13903(jSONObject2, "resourcePrefix", (String) null);
        String strM13984 = strM13905 == null ? null : m13984(strM13905);
        String strM13945 = m13942(jSONObject2, "classPrefixMode");
        String strM13906 = m13903(jSONObject2, "classPrefix", (String) null);
        if ("none".equals(strM13945)) {
            if (strM13906 != null) {
                throw C10186.m26301("Invalid prefix", "prefix", JSON.value(strM13906), (JSONArray) null, (JSONObject) null);
            }
            c21860 = C21860.f69689;
        } else {
            if (strM13906 == null || strM13906.isEmpty()) {
                throw C10186.m26301("Invalid prefix", "prefix", strM13906 == null ? null : JSON.value(strM13906), (JSONArray) null, (JSONObject) null);
            }
            if (!"prefix".equals(strM13945) && !"descriptorExact".equals(strM13945)) {
                throw C10186.m26301("Invalid prefix", "prefix", JSON.value(strM13906), (JSONArray) null, (JSONObject) null);
            }
            c21860 = new C21860(strM13945, strM13906);
        }
        String strM13946 = m13942(jSONObject2, "dexStringResultMode");
        if (Name.LABEL.equals(strM13946) || "member".equals(strM13946)) {
            return new C10671(str, str2, str3, strM13942, arrayListM13908, iM13892, zM13937, iM13956, zM13938, zM13939, strM13904, strM13984, c21860, strM13946, c12666M31432, C14903.m35854(c14596.f45980, jSONObject.get("nextCursor")));
        }
        throw C10186.m26301("Invalid cursor", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C15146 m13976(String str, String str2, C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        int iM13892 = m13892(c14596, jSONObject);
        try {
            C24513 c24513M13978 = m13978(m13942(jSONObject2, "targetLocator"), jSONObject.get("nextCursor"));
            String strM13942 = m13942(jSONObject2, "methodResolution");
            m13935(strM13942, jSONObject.get("nextCursor"));
            m13923(c24513M13978, strM13942, jSONObject.get("nextCursor"));
            return new C15146(str, str2, c24513M13978.f79497, c24513M13978.f79495, c24513M13978.f79496, strM13942, iM13892, C8959.m23946(c14596.f45980, jSONObject.get("nextCursor")));
        } catch (C10186 unused) {
            throw C10186.m26301("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C24513 m13978(String str, JSONValue jSONValue) throws C10186 {
        C20783 c20783M13916 = m13916(m13960("dex_method"), JSON.value(str), "locator");
        String str2 = c20783M13916.f66584;
        try {
            String str3 = c20783M13916.f66585;
            if (!"dex_method".equals(str2)) {
                if (!"dex_field".equals(str2)) {
                    if ("dex_class".equals(str2)) {
                        return new C24513(str2, m13884(str3), null);
                    }
                    throw C10186.m26301("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_method", "dex_field", "dex_class"), m13960("dex_method"));
                }
                C6613 c6613M13971 = m13971(str3, "field", true);
                return new C24513(str2, c6613M13971.f22101, c6613M13971.f22102);
            }
            C6613 c6613M13972 = m13971(str3, e.s, true);
            return new C24513(str2, c6613M13972.f22101, c6613M13972.f22102);
        } catch (C10186 unused) {
            throw C10186.m26301("Invalid locator", "locator", jSONValue, JSON.array(), m13960(str2));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13935(String str, JSONValue jSONValue) throws C10186 {
        int i = 0;
        while (true) {
            String[] strArr = f15768;
            if (i < 4) {
                if (strArr[i].equals(str)) {
                    return;
                } else {
                    i++;
                }
            } else {
                throw C10186.m26301("Invalid methodResolution", "methodResolution", jSONValue, C12556.m31235(Arrays.asList(strArr)), JSON.object().add("methodResolution", "dispatch"));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13923(C24513 c24513, String str, JSONValue jSONValue) throws C10186 {
        if ("dex_method".equals(c24513.f79497)) {
            if ("not_applicable".equals(str)) {
                throw C10186.m26301("Invalid methodResolution for dex_method", "methodResolution", jSONValue, C12556.m31235(Arrays.asList("exact", "slot", "dispatch")), JSON.object().add("methodResolution", "dispatch"));
            }
        } else if (!"not_applicable".equals(str)) {
            throw C10186.m26301("Invalid methodResolution for xref target", "methodResolution", jSONValue, JSON.array("not_applicable"), JSON.object().add("methodResolution", "not_applicable"));
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C13828 m13887(String str) throws C10186 {
        C20783 c20783M13916 = m13916(JSON.object().add("locator", m13906("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)), JSON.value(str), "locator");
        String str2 = c20783M13916.f66584;
        String str3 = c20783M13916.f66585;
        if ("zip_entry".equals(str2)) {
            return C13828.m33744(str3);
        }
        if ("axml".equals(str2)) {
            return C13828.m33742(str3);
        }
        if ("dex_class".equals(str2)) {
            return C13828.m33745(m13884(str3));
        }
        if (!"dex_method".equals(str2)) {
            if (!"dex_field".equals(str2)) {
                if ("resource".equals(str2)) {
                    return C13828.m33747(C7972.m21735(str3, "locator"));
                }
                throw C10186.m26301("Unsupported locator", "locator", JSON.value(str2), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field", "resource"), JSON.object().add("locator", m13906("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
            }
            C6613 c6613M13971 = m13971(str3, "field", true);
            return C13828.m33743(c6613M13971.f22101, c6613M13971.f22102);
        }
        C6613 c6613M13972 = m13971(str3, e.s, true);
        return C13828.m33746(c6613M13972.f22101, c6613M13972.f22102);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m13952(String str) throws C10186 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m13906("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        C20783 c20783M13916 = m13916(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c20783M13916.f66584;
        if (!"dex_class".equals(str2)) {
            throw C10186.m26301("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class"), jSONObjectAdd);
        }
        return m13884(c20783M13916.f66585);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m13932(JSONObject jSONObject) throws C10186 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13972("locator", jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C10186.m26301("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return strAsString;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20783 m13916(JSONObject jSONObject, JSONValue jSONValue, String str) throws C10186 {
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301(C25272.m56409("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        String strAsString = jSONValue.asString();
        int iIndexOf = strAsString.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == strAsString.length() - 1) {
            throw C10186.m26301(C25272.m56409("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        return new C20783(strAsString.substring(0, iIndexOf), strAsString.substring(iIndexOf + 1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m13963(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) ? i : m13891(i, jSONObject, str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static String m13950(String str) {
        return m13971(str, e.s, false).f22101;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m13981(String str) {
        return m13971(str, e.s, false).f22102;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m13948(String str, String str2) {
        return C15870.m37840(str) + "->" + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C6613 m13971(java.lang.String r7, java.lang.String r8, boolean r9) throws l.C10186 {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4375.m13971(java.lang.String, java.lang.String, boolean):l.ۛ᩵ۚ");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m13959(String str) {
        if (str.length() == 1) {
            return "ZBCSIJFD".indexOf(str.charAt(0)) >= 0;
        }
        return str.startsWith("L") && str.endsWith(l.b) && str.length() > 2 && str.indexOf(91) < 0 && str.indexOf(58) < 0 && str.indexOf(40) < 0 && str.indexOf(41) < 0 && str.indexOf(59) == str.length() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13884(String str) throws C10186 {
        if (!m13959(str) || str.indexOf(46) >= 0 || str.indexOf(59) != str.length() - 1) {
            throw C10186.m26301("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", m13906("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
        }
        return C15870.m37840(str);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static JSONObject m13960(String str) {
        if ("dex_field".equals(str)) {
            return JSON.object().add("locator", m13906("dex_field", (String) null, "Lcom/example/Foo;", (String) null, "fieldFlag:Z", (String) null));
        }
        if ("dex_class".equals(str)) {
            return JSON.object().add("locator", m13906("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        }
        return JSON.object().add("locator", m13906("dex_method", (String) null, "Lcom/example/Foo;", "onCreate(Landroid/os/Bundle;)V", (String) null, (String) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m13913(String str, String str2, boolean z) {
        String str3 = e.s.equals(str2) ? "Lcom/example/Foo;->onCreate(Landroid/os/Bundle;)V" : "Lcom/example/Foo;->fieldFlag:Z";
        if (z) {
            return C10186.m26301("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", "dex_" + str2 + ':' + str3));
        }
        return C10186.m26301("Invalid target", "target", JSON.value(str), JSON.array(), JSON.object().add("target", "Lcom/example/Foo;->bar()V"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12578 m13945(JSONObject jSONObject) throws C10186 {
        String[] strArr = f15774;
        m13919(jSONObject, "search", strArr);
        m13920(jSONObject, strArr);
        String strM13942 = m13942(jSONObject, "workspaceId");
        String strM13926 = m13926(jSONObject, "editSessionId");
        String strM13927 = m13926(jSONObject, "target");
        int i = 0;
        while (true) {
            String[] strArr2 = f15765;
            if (i >= 11) {
                throw C10186.m26301("Invalid target", "target", JSON.value(strM13927), C12556.m31235(Arrays.asList(strArr2)), m13957("overview", "AndroidManifest"));
            }
            if (strArr2[i].equals(strM13927)) {
                String strM13928 = m13926(jSONObject, "query");
                if (strM13928.isEmpty()) {
                    throw C10186.m26301("Invalid query", "query", JSON.value(strM13928), (JSONArray) null, m13957(strM13927, "AndroidManifest"));
                }
                String strM13929 = m13926(jSONObject, "queryType");
                boolean zM13979 = m13979(jSONObject, "caseSensitive");
                String strM139210 = m13926(jSONObject, "matchMode");
                String strM139211 = m13926(jSONObject, "prefix");
                boolean zM139710 = m13979(jSONObject, "includeMatchOffsets");
                int iM13946 = m13946(jSONObject, "limit");
                m13918(iM13946, 1, 200, "limit", m13957(strM13927, strM13928));
                int iM13947 = m13946(jSONObject, "snippetMaxChars");
                m13918(iM13947, 0, 1000, "snippetMaxChars", m13957(strM13927, strM13928));
                if ("overview".equals(strM13927) && !strM139211.isEmpty()) {
                    throw C10186.m26301("prefix must be empty for target=overview", "prefix", JSON.value(strM139211), JSON.array(""), m13957("overview", "AndroidManifest"));
                }
                if ("smali".equals(strM13927) && "exact".equals(strM139210)) {
                    throw C10186.m26301("matchMode=exact is invalid for target=smali", "matchMode", JSON.value(strM139210), JSON.array("contains"), m13957("smali", "onCreate"));
                }
                if ("resource_table_names".equals(strM13927) || "resource_table_values".equals(strM13927) || "resource_table_file_paths".equals(strM13927)) {
                    m13984(strM139211);
                } else if (m13974(strM13927) && !strM139211.isEmpty()) {
                    m13939(m13957(strM13927, "Outer").put("prefix", "com.example."), strM139211);
                }
                try {
                    return new C12578(strM13942, strM13926, strM13927, strM13928, strM139211, zM139710, iM13946, iM13947, C12666.m31432(strM13928, strM13929, strM139210, zM13979));
                } catch (C10186 e) {
                    if (!e.f32597) {
                        throw e;
                    }
                    JSONObject jSONObject2 = e.f32602;
                    String string = jSONObject2.getString("argument", null);
                    if (!"query".equals(string) && !"queryType".equals(string) && !"matchMode".equals(string)) {
                        throw e;
                    }
                    throw C10186.m26301(e.getMessage(), string, e.f32603, jSONObject2.getJSONArray("allowedValues"), m13957(strM13927, "query".equals(string) ? "AndroidManifest" : strM13928));
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m13974(String str) {
        return "dex_names".equals(str) || "dex_strings".equals(str) || "dex_string_members".equals(str) || "smali".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13909(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return m13908(jSONArrayArray, false, false, false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m13984(String str) throws C10186 {
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("/") || str.contains("//")) {
            throw m13911(str);
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0 || iIndexOf != str.lastIndexOf(47)) {
                throw m13911(str);
            }
            if (str.substring(0, iIndexOf).isEmpty()) {
                throw m13911(str);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m13911(String str) {
        return C10186.m26301("Invalid prefix", "prefix", JSON.value(str), JSON.array("", "0x7f", "string", "string/app_", "app_"), m13957("resource_table_names", "app_name").put("prefix", "string/"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21860 m13939(JSONObject jSONObject, String str) throws C10186 {
        if (str == null) {
            return C21860.f69689;
        }
        if (!str.contains(l.b)) {
            String strReplace = (str.startsWith("L") ? str.substring(1) : str).replace('.', '/');
            if (strReplace.isEmpty()) {
                throw C10186.m26301("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
            }
            return new C21860("prefix", strReplace);
        }
        if (str.startsWith("L") && str.endsWith(l.b) && str.indexOf(59) == str.length() - 1 && str.length() > 3 && C22313.m50373(2, str) != '/') {
            return new C21860("descriptorExact", str);
        }
        throw C10186.m26301("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13908(JSONArray jSONArray, boolean z, boolean z2, boolean z3) throws C10186 {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = f15781;
        String str2 = "resource_table_value";
        String str3 = f15778;
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
                throw C10186.m26301(C25272.m56409("Invalid scopes. ", str3), "scopes", jSONArray, C12556.m31235(Arrays.asList(strArr)), m13894());
            }
            Iterator it = jSONArray.asArray().iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                JSONValue jSONValue = (JSONValue) it.next();
                if (!jSONValue.isString()) {
                    throw C10186.m26301(C25272.m56409("Invalid scopes. ", str3), "scopes", jSONValue, C12556.m31235(Arrays.asList(strArr)), m13894());
                }
                String strAsString = jSONValue.asString();
                if ("zip_entries".equals(strAsString) || "axml".equals(strAsString) || "resource_table_id".equals(strAsString) || "resource_table_name".equals(strAsString) || str2.equals(strAsString)) {
                    str = str2;
                } else {
                    str = str2;
                    if (!"resource_table_file_path".equals(strAsString) && !"dex_class".equals(strAsString) && !"dex_field".equals(strAsString) && !"dex_method".equals(strAsString) && !"dex_string".equals(strAsString) && !"smali".equals(strAsString) && !"native_symbol".equals(strAsString) && !"native_string".equals(strAsString)) {
                        throw C10186.m26301(ExternalValue$$ExternalSyntheticOutline0.m("Invalid scope: ", strAsString, ". ", str3), "scopes", JSON.value(strAsString), C12556.m31235(Arrays.asList(strArr)), m13894());
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
            throw C10186.m26301(C25272.m56409("Invalid scopes. ", str3), "scopes", jSONArray, C12556.m31235(Arrays.asList(strArr)), m13894());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m13980(String str) {
        return "resource_table_id".equals(str) || "resource_table_name".equals(str) || "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13919(JSONObject jSONObject, String str, String... strArr) throws C10186 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw C10186.m26301(C14442.m34865("Invalid ", str, " argument"), str2, jSONObject.get(str2), C12556.m31235(listAsList), JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13920(JSONObject jSONObject, String... strArr) throws C10186 {
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
            throw m13928((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("Missing parameters: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i));
        }
        throw C10186.m26301(sb.toString(), "parameters", (JSONValue) null, C12556.m31235(arrayList), JSON.object());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C23767 m13958(JSONObject jSONObject) throws C10186 {
        for (String str : jSONObject.names()) {
            if (!"workspaceId".equals(str) && !"editSessionId".equals(str) && !"nextCursor".equals(str) && !"limit".equals(str)) {
                throw C10186.m26301("Invalid continue continuation argument", str, jSONObject.get(str), JSON.array("workspaceId", "editSessionId", "nextCursor", "limit"), JSON.object().add("nextCursor", "<cursor>"));
            }
        }
        m13920(jSONObject, "workspaceId", "editSessionId", "nextCursor", "limit");
        return new C23767(m13942(jSONObject, "workspaceId"), m13926(jSONObject, "editSessionId"), m13942(jSONObject, "nextCursor"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13892(C14596 c14596, JSONObject jSONObject) throws C10186 {
        int iM13946 = m13946(jSONObject, "limit");
        m13917(iM13946, 1, c14596.f45979, "limit");
        return iM13946;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13957(String str, String str2) {
        return C22121.m50076("workspaceId", "ab12cd34", "editSessionId", "").add("target", str).add("query", str2).add("queryType", "literal").add("caseSensitive", false).add("matchMode", "contains").add("prefix", "").add("includeMatchOffsets", false).add("limit", 50).add("snippetMaxChars", 240);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m13942(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13972(str, jSONValue);
        }
        String strM13903 = m13903(jSONObject, str, (String) null);
        if (strM13903.isEmpty()) {
            throw C10186.m26301("Invalid ".concat(str), str, JSON.value(strM13903), (JSONArray) null, (JSONObject) null);
        }
        return strM13903;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m13926(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13972(str, jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONArray m13964(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13972(str, jSONValue);
        }
        if (!jSONValue.isArray()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m13893(JSONObject jSONObject, JSONObject jSONObject2, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw C10186.m26301("Missing ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        if (!jSONValue.isArray()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13903(JSONObject jSONObject, String str, String str2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return str2;
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13891(int i, JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return i;
        }
        if (!jSONValue.isNumber()) {
            throw m13912(str, jSONValue);
        }
        try {
            return C12556.m31240(jSONValue);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m13912(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m13956(JSONObject jSONObject, String str) throws C10186 {
        if (!jSONObject.contains(str)) {
            throw m13928(str);
        }
        return m13891(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m13946(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m13928(str);
        }
        if (jSONValue.isNull()) {
            throw m13912(str, jSONValue);
        }
        return m13891(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13924(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return false;
        }
        if (!jSONValue.isBoolean()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m13936(JSONObject jSONObject, String str) throws C10186 {
        if (!jSONObject.contains(str)) {
            throw m13928(str);
        }
        return m13924(jSONObject, str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m13979(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m13928(str);
        }
        if (jSONValue.isNull()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return m13924(jSONObject, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13917(int i, int i2, int i3, String str) throws C10186 {
        if (i < i2 || i > i3) {
            throw C10186.m26301("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13918(int i, int i2, int i3, String str, JSONObject jSONObject) throws C10186 {
        if (i < i2 || i > i3) {
            throw C10186.m26301("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), jSONObject);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m13912(String str, JSONValue jSONValue) {
        return C10186.m26301(C14442.m34865("Invalid ", str, ": expected a 32-bit integer JSON number"), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10186 m13928(String str) {
        return C10186.m26301(C25272.m56409("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m13972(String str, JSONValue jSONValue) {
        return C10186.m26301("Missing ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10186 m13885(JSONObject jSONObject, String str) {
        return C10186.m26301(C25272.m56409("Missing ", str), str, (JSONValue) null, (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m13894() {
        return JSON.object().add("scopes", JSON.array("dex_string", "smali"));
    }
}
