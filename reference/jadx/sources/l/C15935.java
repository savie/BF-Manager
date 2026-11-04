package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܶ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6Y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15935 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f51751;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22209 f51752;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f51753;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read File Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Read one raw byte page from a regular local file. First call: targetVersion=\"\", byteOffset=0, maxBytes=256; maximum 65536 bytes per page. Returns uppercase hex and a whole-file targetVersion. Copy that version unchanged into later pages to avoid combining different file versions. Paths may be absolute or relative to Home. Large files are supported.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_read_bytes";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37960(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid string argument", str, jSONValue, JSON.array().add("string"), JSON.object().add(str, "targetVersion".equals(str) ? "" : "file.bin"));
        }
        return jSONValue.asString();
    }

    public C15935(C22209 c22209) {
        this.f51752 = c22209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f51751 == null) {
            this.f51751 = m37964();
        }
        return this.f51751;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f51753 == null) {
            this.f51753 = C10932.m27734("Result for mt_file_read_bytes.", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path fixed for this call.")).add("hex", C10932.m27740("string", "Returned raw bytes as uppercase hexadecimal without separators.")).add("byteOffset", C10932.m27740("integer", "Zero-based byte offset of the first returned byte.")).add("nextByteOffset", C10932.m27740("integer", "Byte offset immediately after this page.")).add("totalBytes", C10932.m27740("integer", "Total file size observed by the complete streaming scan.")).add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.")), "string", "Whole-file content version as 16 lowercase hex digits.", "targetVersion", "One raw byte page bound to a whole-file version."), C5596.m16576("mt_file_read_bytes"), C10932.m27737("Contains one directly executable continuation when hasMore=true; a version mismatch error contains one restart action.", C10932.m27732(m37964(), "mt_file_read_bytes", "continue"), C10932.m27732(m37964(), "mt_file_read_bytes", "retry")));
        }
        return this.f51753;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_read_bytes", c10186);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37963(C1907 c1907, String str) throws C10186 {
        int i = C17427.f56682[c1907.m6567().ordinal()];
        C22209 c22209 = this.f51752;
        if (i == 2) {
            c22209.getClass();
            throw C22209.m50225(str);
        }
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "Directories cannot be read as raw file bytes.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic byte tool.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as file bytes.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m37962(String str, int i, String str2, String str3, String str4) {
        return C10186.m26302("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m37959("retry", "Discard earlier pages and restart at byteOffset 0 using the current file version.", str, str3, 0L, i)), C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str4).add("operation", "read").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m37961(long j, long j2, String str, String str2) {
        return C10186.m26302("FILE_OFFSET_OUT_OF_RANGE", "Byte offset is beyond the end of the file.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read").add("backendReason", "offset_after_end").add("byteOffset", j).add("totalBytes", j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m37959(String str, String str2, String str3, String str4, long j, int i) {
        return C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m37964() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C10932.m27740("string", "Pass \"\" (empty string) on the first read; later pass the previous result unchanged.")).add("byteOffset", C10932.m27740("integer", "Zero-based byte offset in 0..9007199254740991; pass 0 by default.")), "integer", "Page size from 1 through 65536; pass 256 by default.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C16681(), "Invalid file byte read argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "byteOffset", "maxBytes");
        String strM37960 = m37960(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM37961 = m37960(jSONObject, "targetVersion");
        long jM18216 = C6437.m18216(jSONObject, "byteOffset", 0L, 9007199254740991L);
        int iM18216 = (int) C6437.m18216(jSONObject, "maxBytes", 1L, 65536L);
        C22209 c22209 = this.f51752;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(strM37960, c9113M50227, MotionUtils.EASING_TYPE_PATH);
        String str = c9113M50227.f29602;
        C19225 c19225M50228 = c22209.m50228(strM50219);
        try {
            c22209.m50230(c22209.m50232(strM50219));
            C1907 c1907M50234 = c22209.m50234(strM50219);
            m37963(c1907M50234, strM50219);
            try {
                C13588 c13588M15150 = C4945.m15150(c1907M50234.m6565(), jM18216, iM18216);
                long j = c13588M15150.f43159;
                long j2 = c13588M15150.f43160;
                String str2 = c13588M15150.f43162;
                C1907 c1907M50235 = c22209.m50234(strM50219);
                if (c1907M50235.m6567() != EnumC13093.REGULAR || ((c1907M50234.m6566() >= 0 && c1907M50234.m6566() != j2) || (c1907M50235.m6566() >= 0 && c1907M50235.m6566() != j2))) {
                    throw C10186.m26302("FILE_CHANGED_DURING_READ", "The file changed while its bytes were being read.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str).add("operation", "read").add("backendReason", "metadata_changed"));
                }
                if (!strM37961.isEmpty() && !strM37961.equals(str2)) {
                    throw m37962(strM50219, iM18216, strM37961, str2, str);
                }
                long j3 = c13588M15150.f43160;
                if (jM18216 > j3) {
                    throw m37961(jM18216, j3, strM50219, c9113M50227.f29602);
                }
                JSONArray jSONArrayArray = JSON.array();
                long j4 = c13588M15150.f43159;
                if (j4 < j2) {
                    jSONArrayArray.add(m37959("continue", "Continue reading the next byte page from the same file version.", strM50219, c13588M15150.f43162, j4, iM18216));
                }
                C1238 c1238 = new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219).add("hex", C16973.m40022(c13588M15150.f43161)).add("byteOffset", c13588M15150.f43158).add("nextByteOffset", j).add("totalBytes", j2).add("hasMore", j < j2).add("targetVersion", str2), jSONArrayArray));
                c19225M50228.close();
                return c1238;
            } catch (IOException e) {
                throw C22209.m50221(strM50219, e);
            }
        } catch (Throwable th) {
            try {
                c19225M50228.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
