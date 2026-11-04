package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9968 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25811(JSONObject jSONObject, String str) throws C10186 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301(strConcat, str, jSONValue, JSON.array(), JSON.object());
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25810(JSONObject jSONObject) throws C10186 {
        String strM25811 = m25811(jSONObject, "targetVersion");
        if (strM25811.length() == 16) {
            boolean z = true;
            for (int i = 0; i < strM25811.length(); i++) {
                char cCharAt = strM25811.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    z = false;
                }
            }
            if (z) {
                return strM25811;
            }
        }
        throw C10186.m26301("Copy an existing file's 16 lowercase hex targetVersion; empty and missing are invalid", "targetVersion", jSONObject.get("targetVersion"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m25813(String str, long j, long j2) {
        return C10186.m26302("FILE_SIZE_OUT_OF_RANGE", str, "warning", (JSONArray) null, JSON.object().add("limit", j).add("actual", j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m25808() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C10932.m27740("string", "Copy the existing file's current targetVersion. Empty and missing are invalid."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m25809(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path.")).add("size", C10932.m27740("integer", "Final raw file size in bytes.")).add("targetVersion", C10932.m27740("string", "Final whole-file version; copy unchanged for subsequent operations.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether the final bytes differ from the original file.")).add("warnings", C10932.m27742("Metadata or publication limitations; empty when none."));
        if (z) {
            jSONObjectAdd.add("encoding", C10932.m27740("string", "Actual unchanged encoding token including its physical BOM."));
        }
        String strM34865 = C14442.m34865("Result for ", str, ".");
        JSONObject jSONObjectM27731 = C10932.m27731(jSONObjectAdd, "Final file state.");
        JSONObject jSONObjectM16576 = C5596.m16576(str);
        JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "See the target read tool.")).add("targetVersion", C10932.m27740("string", "See the target read tool."));
        if (z) {
            jSONObjectAdd2.add("encoding", C10932.m27740("string", "See mt_file_read_text.")).add("startLine", C10932.m27740("integer", "See mt_file_read_text.")).add("startColumn", C10932.m27740("integer", "See mt_file_read_text.")).add("limit", C10932.m27740("integer", "See mt_file_read_text.")).add("maxChars", C10932.m27740("integer", "See mt_file_read_text."));
        } else {
            jSONObjectAdd2.add("byteOffset", C10932.m27740("integer", "See mt_file_read_bytes.")).add("maxBytes", C10932.m27740("integer", "See mt_file_read_bytes."));
        }
        return C10932.m27734(strM34865, jSONObjectM27731, jSONObjectM16576, C10932.m27737("Success provides an inspection near the affected file tail.", C10932.m27732(C10932.m27731(jSONObjectAdd2, "Arguments for the read tool."), z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m25812(C20717 c20717, String str, long j, long j2) {
        JSONObject jSONObjectObject = JSON.object();
        String str2 = c20717.f66393;
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, str2).add("size", c20717.f66391);
        String str3 = c20717.f66394;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("targetVersion", str3).add("changed", c20717.f66390).add("warnings", c20717.f66392);
        JSONObject jSONObjectAdd3 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("targetVersion", str3);
        boolean z = str != null;
        if (z) {
            jSONObjectAdd2.add("encoding", str);
            jSONObjectAdd3.add("encoding", str).add("startLine", j).add("startColumn", j2).add("limit", 500).add("maxChars", 49152);
        } else {
            jSONObjectAdd3.add("byteOffset", j2).add("maxBytes", 256);
        }
        return new C1238(C15300.m36728(jSONObjectAdd2, JSON.array().add(C2729.m9064(jSONObjectAdd3, z ? "mt_file_read_text" : "mt_file_read_bytes", "inspect", "Inspect the final file near the affected tail."))));
    }
}
