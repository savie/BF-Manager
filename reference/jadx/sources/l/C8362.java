package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N6Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8362 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f28997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2800 f28998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f28999;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_read_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read one raw byte page from a regular local file. First call: targetVersion=\"\", byteOffset=0, maxBytes=256; maximum 65536 bytes per page. Returns uppercase hex and a whole-file targetVersion. Copy that version unchanged into later pages to avoid combining different file versions. Paths may be absolute or relative to Home. Large files are supported.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read File Bytes";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21888(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid string argument", str, jSONValue, JSON.array().add("string"), JSON.object().add(str, "targetVersion".equals(str) ? "" : "file.bin"));
        }
        return jSONValue.asString();
    }

    public C8362(C2800 c2800) {
        this.f28998 = c2800;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f28997 == null) {
            this.f28997 = m21886();
        }
        return this.f28997;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f28999 == null) {
            this.f28999 = C4969.m13780("Result for mt_file_read_bytes.", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path fixed for this call.")).add("hex", C4969.m13786("string", "Returned raw bytes as uppercase hexadecimal without separators.")).add("byteOffset", C4969.m13786("integer", "Zero-based byte offset of the first returned byte.")).add("nextByteOffset", C4969.m13786("integer", "Byte offset immediately after this page.")).add("totalBytes", C4969.m13786("integer", "Total file size observed by the complete streaming scan.")).add("hasMore", C4969.m13786(ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.")), "string", "Whole-file content version as 16 lowercase hex digits.", "targetVersion", "One raw byte page bound to a whole-file version."), C12123.m30172("mt_file_read_bytes"), C4969.m13783("Contains one directly executable continuation when hasMore=true; a version mismatch error contains one restart action.", C4969.m13778(m21886(), "mt_file_read_bytes", "continue"), C4969.m13778(m21886(), "mt_file_read_bytes", "retry")));
        }
        return this.f28999;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_read_bytes", c12731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21891(C5928 c5928, String str) throws C12731 {
        int i = C18945.f61345[c5928.m16196().ordinal()];
        C2800 c2800 = this.f28998;
        if (i == 2) {
            c2800.getClass();
            throw C2800.m8501(str);
        }
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "Directories cannot be read as raw file bytes.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic byte tool.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as file bytes.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m21889(int i, String str, String str2, String str3, String str4) {
        return C12731.m31627("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m21887("retry", "Discard earlier pages and restart at byteOffset 0 using the current file version.", str, str3, 0L, i)), C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str4).add("operation", "read").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m21890(long j, long j2, String str, String str2) {
        return C12731.m31627("FILE_OFFSET_OUT_OF_RANGE", "Byte offset is beyond the end of the file.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read").add("backendReason", "offset_after_end").add("byteOffset", j).add("totalBytes", j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21887(String str, String str2, String str3, String str4, long j, int i) {
        return C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m21886() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C4969.m13786("string", "Pass \"\" (empty string) on the first read; later pass the previous result unchanged.")).add("byteOffset", C4969.m13786("integer", "Zero-based byte offset in 0..9007199254740991; pass 0 by default.")), "integer", "Page size from 1 through 65536; pass 256 by default.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C18239(), "Invalid file byte read argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "byteOffset", "maxBytes");
        String strM21888 = m21888(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM21889 = m21888(jSONObject, "targetVersion");
        long jM38376 = C16249.m38376(jSONObject, "byteOffset", 0L, 9007199254740991L);
        int iM38376 = (int) C16249.m38376(jSONObject, "maxBytes", 1L, 65536L);
        C2800 c2800 = this.f28998;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(strM21888, c3070M8504, MotionUtils.EASING_TYPE_PATH);
        String str = c3070M8504.f11560;
        C11268 c11268M8505 = c2800.m8505(strM8495);
        try {
            C5928 c5928M8503 = c2800.m8503(strM8495);
            m21891(c5928M8503, strM8495);
            try {
                C12016 c12016M8600 = C2842.m8600(c5928M8503.m16195(), jM38376, iM38376);
                long j = c12016M8600.f40255;
                long j2 = c12016M8600.f40254;
                String str2 = c12016M8600.f40252;
                C5928 c5928M8504 = c2800.m8503(strM8495);
                if (c5928M8504.m16196() != EnumC12279.REGULAR || ((c5928M8503.m16197() >= 0 && c5928M8503.m16197() != j2) || (c5928M8504.m16197() >= 0 && c5928M8504.m16197() != j2))) {
                    throw C12731.m31627("FILE_CHANGED_DURING_READ", "The file changed while its bytes were being read.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str).add("operation", "read").add("backendReason", "metadata_changed"));
                }
                if (!strM21889.isEmpty() && !strM21889.equals(str2)) {
                    throw m21889(iM38376, strM8495, strM21889, str2, str);
                }
                long j3 = c12016M8600.f40254;
                if (jM38376 > j3) {
                    throw m21890(jM38376, j3, strM8495, c3070M8504.f11560);
                }
                JSONArray jSONArrayArray = JSON.array();
                long j4 = c12016M8600.f40255;
                if (j4 < j2) {
                    jSONArrayArray.add(m21887("continue", "Continue reading the next byte page from the same file version.", strM8495, c12016M8600.f40252, j4, iM38376));
                }
                C17669 c17669 = new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495).add("hex", C9754.m24738(c12016M8600.f40256)).add("byteOffset", c12016M8600.f40253).add("nextByteOffset", j).add("totalBytes", j2).add("hasMore", j < j2).add("targetVersion", str2), jSONArrayArray));
                c11268M8505.close();
                return c17669;
            } catch (IOException e) {
                throw C2800.m8497(strM8495, e);
            }
        } catch (Throwable th) {
            try {
                c11268M8505.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
