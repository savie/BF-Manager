package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6XE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3421 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f12621;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17617 f12622;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f12623;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_write_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Create or fully replace one regular local file from raw hexadecimal bytes. Use targetVersion=\"missing\" only to create a missing file; otherwise copy the current targetVersion from mt_file_stat or mt_file_read_bytes. hex is case-insensitive, contains no separators, may be empty, and is limited to 1048576 raw bytes. Paths may be absolute or relative to the Home captured at call start. Inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Write File Bytes";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10134(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m10135(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C3421(C17617 c17617) {
        this.f12622 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f12621 == null) {
            this.f12621 = C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C4969.m13786("string", "Use missing for creation, otherwise the current 16-digit lowercase hex version token.")), "string", "Zero through 1048576 raw bytes as even-length hexadecimal without separators.", "hex", "Arguments for mt_file_write_bytes.");
        }
        return this.f12621;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f12623 == null) {
            this.f12623 = C4969.m13780("Result for mt_file_write_bytes.", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute target path fixed for this call.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether target content changed.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C4969.m13786("string", "One warning message."))).add("size", C4969.m13786("integer", "Final raw byte size.")), "string", "Final whole-file version token of 16 lowercase hex digits.", "targetVersion", "Successful complete binary file write."), C12123.m30172("mt_file_write_bytes"), C4969.m13783("Success returns one read_bytes verification action.", C4969.m13778(C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path.")).add("targetVersion", C4969.m13786("string", "Whole-file targetVersion returned by this write.")).add("byteOffset", C4969.m13786("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect")));
        }
        return this.f12623;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_write_bytes", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C9773(), "Invalid file byte write argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM10134 = m10134(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM10135 = m10134(jSONObject, "targetVersion");
        String strM10136 = m10134(jSONObject, "hex");
        if (strM10136.length() > 2097152) {
            throw C12731.m31627("FILE_INVALID_HEX", "Hex input exceeds the 1048576-byte write limit.", "warning", (JSONArray) null, C3184.m9603("operation", "parse_hex", "backendReason", "hex_too_large").add("limit", 1048576).add("actual", (((long) strM10136.length()) + 1) / 2));
        }
        try {
            C7740 c7740M40988 = this.f12622.m40988(strM10134, strM10135, new C12388(3, C9754.m24741(strM10136)));
            String str = c7740M40988.f25575;
            String str2 = c7740M40988.f25579;
            return new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("changed", c7740M40988.f25576).add("warnings", new JSONArray(c7740M40988.f25577)).add("size", c7740M40988.f25578).add("targetVersion", str), JSON.array().add(C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str2, "targetVersion", str).add("byteOffset", 0L).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Read back the beginning of the written file using its new targetVersion."))));
        } catch (IllegalArgumentException e) {
            throw C12731.m31627("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C3184.m9603("operation", "parse_hex", "backendReason", "invalid_hex"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m10135(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), C3184.m9603(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "missing").add("hex", "00FF"));
    }
}
