package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23884 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52646(JSONObject jSONObject, String str) throws C12731 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626(strConcat, str, jSONValue, JSON.array(), JSON.object());
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52645(JSONObject jSONObject) throws C12731 {
        String strM52646 = m52646(jSONObject, "targetVersion");
        if (strM52646.length() == 16) {
            boolean z = true;
            for (int i = 0; i < strM52646.length(); i++) {
                char cCharAt = strM52646.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    z = false;
                }
            }
            if (z) {
                return strM52646;
            }
        }
        throw C12731.m31626("Copy an existing file's 16 lowercase hex targetVersion; empty and missing are invalid", "targetVersion", jSONObject.get("targetVersion"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m52647(String str, long j, long j2) {
        return C12731.m31627("FILE_SIZE_OUT_OF_RANGE", str, "warning", (JSONArray) null, JSON.object().add("limit", j).add("actual", j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m52643() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C4969.m13786("string", "Copy the existing file's current targetVersion. Empty and missing are invalid."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m52644(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path.")).add("size", C4969.m13786("integer", "Final raw file size in bytes.")).add("targetVersion", C4969.m13786("string", "Final whole-file version; copy unchanged for subsequent operations.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether the final bytes differ from the original file.")).add("warnings", C4969.m13788("Metadata or publication limitations; empty when none."));
        if (z) {
            jSONObjectAdd.add("encoding", C4969.m13786("string", "Actual unchanged encoding token including its physical BOM."));
        }
        String strM38890 = C16523.m38890("Result for ", str, ".");
        JSONObject jSONObjectM13777 = C4969.m13777(jSONObjectAdd, "Final file state.");
        JSONObject jSONObjectM30172 = C12123.m30172(str);
        JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "See the target read tool.")).add("targetVersion", C4969.m13786("string", "See the target read tool."));
        if (z) {
            jSONObjectAdd2.add("encoding", C4969.m13786("string", "See mt_file_read_text.")).add("startLine", C4969.m13786("integer", "See mt_file_read_text.")).add("startColumn", C4969.m13786("integer", "See mt_file_read_text.")).add("limit", C4969.m13786("integer", "See mt_file_read_text.")).add("maxChars", C4969.m13786("integer", "See mt_file_read_text."));
        } else {
            jSONObjectAdd2.add("byteOffset", C4969.m13786("integer", "See mt_file_read_bytes.")).add("maxBytes", C4969.m13786("integer", "See mt_file_read_bytes."));
        }
        return C4969.m13780(strM38890, jSONObjectM13777, jSONObjectM30172, C4969.m13783("Success provides an inspection near the affected file tail.", C4969.m13778(C4969.m13777(jSONObjectAdd2, "Arguments for the read tool."), z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17669 m52648(C7740 c7740, String str, long j, long j2) {
        JSONObject jSONObjectObject = JSON.object();
        String str2 = c7740.f25579;
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, str2).add("size", c7740.f25578);
        String str3 = c7740.f25575;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("targetVersion", str3).add("changed", c7740.f25576).add("warnings", c7740.f25577);
        JSONObject jSONObjectAdd3 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("targetVersion", str3);
        boolean z = str != null;
        if (z) {
            jSONObjectAdd2.add("encoding", str);
            jSONObjectAdd3.add("encoding", str).add("startLine", j).add("startColumn", j2).add("limit", 500).add("maxChars", 49152);
        } else {
            jSONObjectAdd3.add("byteOffset", j2).add("maxBytes", 256);
        }
        return new C17669(C0735.m3193(jSONObjectAdd2, JSON.array().add(C11320.m28376(jSONObjectAdd3, z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect", "Inspect the final file near the affected tail."))));
    }
}
