package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6XE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13697 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f43445;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0580 f43446;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f43447;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Write File Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Create or fully replace one regular local file from raw hexadecimal bytes. Use targetVersion=\"missing\" only to create a missing file; otherwise copy the current targetVersion from mt_file_stat or mt_file_read_bytes. hex is case-insensitive, contains no separators, may be empty, and is limited to 1048576 raw bytes. Paths may be absolute or relative to the Home captured at call start. Inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_write_bytes";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33486(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m33487(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C13697(C0580 c0580) {
        this.f43446 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f43445 == null) {
            this.f43445 = C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C10932.m27740("string", "Use missing for creation, otherwise the current 16-digit lowercase hex version token.")), "string", "Zero through 1048576 raw bytes as even-length hexadecimal without separators.", "hex", "Arguments for mt_file_write_bytes.");
        }
        return this.f43445;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f43447 == null) {
            this.f43447 = C10932.m27734("Result for mt_file_write_bytes.", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute target path fixed for this call.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether target content changed.")).add("warnings", C22121.m50076("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C10932.m27740("string", "One warning message."))).add("size", C10932.m27740("integer", "Final raw byte size.")), "string", "Final whole-file version token of 16 lowercase hex digits.", "targetVersion", "Successful complete binary file write."), C5596.m16576("mt_file_write_bytes"), C10932.m27737("Success returns one read_bytes verification action.", C10932.m27732(C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path.")).add("targetVersion", C10932.m27740("string", "Whole-file targetVersion returned by this write.")).add("byteOffset", C10932.m27740("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect")));
        }
        return this.f43447;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_write_bytes", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C6986(), "Invalid file byte write argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM33486 = m33486(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM33487 = m33486(jSONObject, "targetVersion");
        String strM33488 = m33486(jSONObject, "hex");
        if (strM33488.length() > 2097152) {
            throw C10186.m26302("FILE_INVALID_HEX", "Hex input exceeds the 1048576-byte write limit.", "warning", (JSONArray) null, C22121.m50076("operation", "parse_hex", "backendReason", "hex_too_large").add("limit", 1048576).add("actual", (((long) strM33488.length()) + 1) / 2));
        }
        try {
            C20717 c20717M2662 = this.f43446.m2662(strM33486, strM33487, new C13688(C16973.m40024(strM33488)));
            String str = c20717M2662.f66394;
            String str2 = c20717M2662.f66393;
            return new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("changed", c20717M2662.f66390).add("warnings", new JSONArray(c20717M2662.f66392)).add("size", c20717M2662.f66391).add("targetVersion", str), JSON.array().add(C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str2, "targetVersion", str).add("byteOffset", 0L).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Read back the beginning of the written file using its new targetVersion."))));
        } catch (IllegalArgumentException e) {
            throw C10186.m26302("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C22121.m50076("operation", "parse_hex", "backendReason", "invalid_hex"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m33487(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), C22121.m50076(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "missing").add("hex", "00FF"));
    }
}
