package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20411 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f65413;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22209 f65414;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f65415;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read File Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_read_text";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46817(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m46818(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C20411(C22209 c22209) {
        this.f65414 = c22209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f65413 == null) {
            this.f65413 = m46824();
        }
        return this.f65413;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f65415 == null) {
            this.f65415 = C10932.m27734("Result for mt_file_read_text.", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path fixed for this call.")).add(TextBundle.TEXT_ENTRY, C10932.m27740("string", "Strictly decoded text with original LF, CRLF, and CR preserved.")).add("encoding", C10932.m27740("string", "Actual lowercase editor encoding token; physical BOM is included in the token.")).add("targetVersion", C10932.m27740("string", "Whole-file raw-byte version as 16 lowercase hex digits.")).add("startLine", C10932.m27740("integer", "Zero-based logical line requested for this page.")).add("startColumn", C10932.m27740("integer", "Zero-based Unicode code-point column requested for this page.")).add("nextLine", C10932.m27740("integer", "Logical line at which a continuation should start.")).add("nextColumn", C10932.m27740("integer", "Unicode code-point column at which a continuation should start.")).add("returnedLineCount", C10932.m27740("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C10932.m27740("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether decoded text remains at nextLine and nextColumn.", "hasMore", "One original-newline text page bound to a whole-file version."), C5596.m16576("mt_file_read_text"), C10932.m27737("Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action.", C10932.m27732(m46824(), "mt_file_read_text", "continue"), C10932.m27732(m46824(), "mt_file_read_text", "retry")));
        }
        return this.f65415;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_read_text", c10186);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46822(C1907 c1907, String str) throws C10186 {
        int i = C3257.f10592[c1907.m6567().ordinal()];
        C22209 c22209 = this.f65414;
        if (i == 2) {
            c22209.getClass();
            throw C22209.m50225(str);
        }
        if (i == 3) {
            throw C24770.m55295(c1907, c22209, "FILE_NOT_REGULAR", "Directories cannot be read as text.", str);
        }
        if (i == 4) {
            throw C24770.m55295(c1907, c22209, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic text tool.", str);
        }
        if (i == 5) {
            throw C24770.m55295(c1907, c22209, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as text.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46823(C1907 c1907, C1907 c1908, long j) {
        if (c1908.m6567() != EnumC13093.REGULAR) {
            return true;
        }
        if (c1907.m6566() < 0 || c1907.m6566() == j) {
            return c1908.m6566() >= 0 && c1908.m6566() != j;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m46819(String str, long j, long j2, C8871 c8871) {
        return C10186.m26302("FILE_OFFSET_OUT_OF_RANGE", "The requested text line and column are outside the file.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "operation", "read_text").add("backendReason", "text_position_out_of_range").add("startLine", j).add("startColumn", j2).add("finalLine", c8871.f28971).add("finalColumn", c8871.f28979));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m46820(String str, String str2) {
        return C10186.m26302("FILE_CHANGED_DURING_READ", "The file changed while its text was being read.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read_text").add("backendReason", "metadata_changed"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m46821(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return C10186.m26302("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m46816("retry", "Discard earlier pages and restart from the current file version.", str, str4, str3, i, i2, 0L, 0L)), C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str5).add("operation", "read_text").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m46816(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        return C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", i).add("maxChars", i2).add("startLine", j).add("startColumn", j2), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46824() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("encoding", C10932.m27740("string", "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool.")).add("targetVersion", C10932.m27740("string", "Pass \"\" (empty string) on the first read; later copy the previous result unchanged.")).add("limit", C10932.m27740("integer", "Maximum logical lines touched, 1..2000; pass 500 by default.")).add("maxChars", C10932.m27740("integer", "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible.")).add("startLine", C10932.m27740("integer", "Zero-based logical line in 0..9007199254740991; pass 0 initially.")), "integer", "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially.", "startColumn", "Arguments for mt_file_read_text.");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01ac A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:22:0x00e9, B:24:0x0103, B:28:0x0166, B:29:0x016a, B:30:0x016b, B:31:0x0171, B:45:0x018f, B:47:0x0195, B:48:0x01a0, B:50:0x01ac, B:52:0x01b4, B:53:0x01ca, B:54:0x01cb, B:55:0x01cf, B:59:0x01d6, B:60:0x01ff, B:57:0x01d1, B:58:0x01d5, B:37:0x017b, B:38:0x0181, B:4:0x0084, B:6:0x0097), top: B:69:0x0076, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b4 A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:22:0x00e9, B:24:0x0103, B:28:0x0166, B:29:0x016a, B:30:0x016b, B:31:0x0171, B:45:0x018f, B:47:0x0195, B:48:0x01a0, B:50:0x01ac, B:52:0x01b4, B:53:0x01ca, B:54:0x01cb, B:55:0x01cf, B:59:0x01d6, B:60:0x01ff, B:57:0x01d1, B:58:0x01d5, B:37:0x017b, B:38:0x0181, B:4:0x0084, B:6:0x0097), top: B:69:0x0076, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01cb A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:22:0x00e9, B:24:0x0103, B:28:0x0166, B:29:0x016a, B:30:0x016b, B:31:0x0171, B:45:0x018f, B:47:0x0195, B:48:0x01a0, B:50:0x01ac, B:52:0x01b4, B:53:0x01ca, B:54:0x01cb, B:55:0x01cf, B:59:0x01d6, B:60:0x01ff, B:57:0x01d1, B:58:0x01d5, B:37:0x017b, B:38:0x0181, B:4:0x0084, B:6:0x0097), top: B:69:0x0076, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [l.ᩳܿۚ] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [l.ᩳܿۚ] */
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        ?? r28;
        Throwable th;
        int i;
        int i2;
        ?? r14;
        C13588 c13588M15150;
        C9749.m25412((JSONObject) jSONObject, new C23395(), "Unknown file text read argument", MotionUtils.EASING_TYPE_PATH, "encoding", "targetVersion", "limit", "maxChars", "startLine", "startColumn");
        String strM46817 = m46817((JSONObject) jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM46818 = m46817((JSONObject) jSONObject, "encoding");
        String strM46819 = m46817((JSONObject) jSONObject, "targetVersion");
        int iM18216 = (int) C6437.m18216((JSONObject) jSONObject, "limit", 1L, 2000L);
        int iM18217 = (int) C6437.m18216((JSONObject) jSONObject, "maxChars", 2L, 131072L);
        long jM18216 = C6437.m18216((JSONObject) jSONObject, "startLine", 0L, 9007199254740991L);
        long jM18217 = C6437.m18216((JSONObject) jSONObject, "startColumn", 0L, 9007199254740991L);
        C22209 c22209 = this.f65414;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(strM46817, c9113M50227, MotionUtils.EASING_TYPE_PATH);
        String str = c9113M50227.f29602;
        jSONObject = c22209.m50228(strM50219);
        try {
            try {
                c22209.m50230(c22209.m50232(strM50219));
                C1907 c1907M50234 = c22209.m50234(strM50219);
                m46822(c1907M50234, strM50219);
                try {
                    try {
                        i = iM18217;
                        jSONObject = strM46819;
                        i2 = iM18216;
                        try {
                            C8871 c8871M20272 = C7380.m20272(c1907M50234.m6565(), strM46818, jM18216, jM18217, i2, i);
                            boolean z = c8871M20272.f28980;
                            String str2 = c8871M20272.f28976;
                            if (m46823(c1907M50234, c22209.m50234(strM50219), c8871M20272.f28975)) {
                                throw m46820(strM50219, str);
                            }
                            if (!jSONObject.isEmpty() && !jSONObject.equals(str2)) {
                                throw m46821(strM50219, jSONObject, c8871M20272.f28976, c8871M20272.f28969, i2, i, c9113M50227.f29602);
                            }
                            if (!c8871M20272.f28973) {
                                throw m46819(strM50219, jM18216, jM18217, c8871M20272);
                            }
                            JSONArray jSONArrayArray = JSON.array();
                            if (z) {
                                jSONArrayArray.add(m46816("continue", "Continue reading text from the same file version.", strM50219, c8871M20272.f28969, c8871M20272.f28976, i2, i, c8871M20272.f28974, c8871M20272.f28978));
                            }
                            C1238 c1238 = new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219).add(TextBundle.TEXT_ENTRY, c8871M20272.f28977).add("encoding", c8871M20272.f28969).add("targetVersion", str2).add("startLine", c8871M20272.f28981).add("startColumn", c8871M20272.f28972).add("nextLine", c8871M20272.f28974).add("nextColumn", c8871M20272.f28978).add("returnedLineCount", c8871M20272.f28968).add("returnedCodePoints", c8871M20272.f28970).add("hasMore", z), jSONArrayArray));
                            jSONObject.close();
                            return c1238;
                        } catch (CharacterCodingException e) {
                            e = e;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                try {
                                    c13588M15150 = C4945.m15150(c1907M50234.m6565(), 0L, 1);
                                    if (!m46823(c1907M50234, c22209.m50234(strM50219), c13588M15150.f43160)) {
                                        throw m46820(strM50219, str);
                                    }
                                    if (!r14.equals(c13588M15150.f43162)) {
                                        throw m46821(strM50219, r14, c13588M15150.f43162, "", i2, i, c9113M50227.f29602);
                                    }
                                } catch (IOException e2) {
                                    throw C22209.m50221(strM50219, e2);
                                }
                            }
                            throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        } catch (C10362 e3) {
                            e = e3;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                c13588M15150 = C4945.m15150(c1907M50234.m6565(), 0L, 1);
                                if (!m46823(c1907M50234, c22209.m50234(strM50219), c13588M15150.f43160)) {
                                    throw m46820(strM50219, str);
                                }
                                if (!r14.equals(c13588M15150.f43162)) {
                                    throw m46821(strM50219, r14, c13588M15150.f43162, "", i2, i, c9113M50227.f29602);
                                }
                            }
                            throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        }
                    } catch (IOException e4) {
                        throw C22209.m50221(strM50219, e4);
                    }
                } catch (CharacterCodingException e5) {
                    e = e5;
                    i = iM18217;
                    i2 = iM18216;
                    r14 = strM46819;
                    if (!r14.isEmpty()) {
                        c13588M15150 = C4945.m15150(c1907M50234.m6565(), 0L, 1);
                        if (!m46823(c1907M50234, c22209.m50234(strM50219), c13588M15150.f43160)) {
                            throw m46820(strM50219, str);
                        }
                        if (!r14.equals(c13588M15150.f43162)) {
                            throw m46821(strM50219, r14, c13588M15150.f43162, "", i2, i, c9113M50227.f29602);
                        }
                    }
                    throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                } catch (C10362 e6) {
                    e = e6;
                    i = iM18217;
                    i2 = iM18216;
                    r14 = strM46819;
                    if (!r14.isEmpty()) {
                        c13588M15150 = C4945.m15150(c1907M50234.m6565(), 0L, 1);
                        if (!m46823(c1907M50234, c22209.m50234(strM50219), c13588M15150.f43160)) {
                            throw m46820(strM50219, str);
                        }
                        if (!r14.equals(c13588M15150.f43162)) {
                            throw m46821(strM50219, r14, c13588M15150.f43162, "", i2, i, c9113M50227.f29602);
                        }
                    }
                    throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, strM50219, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                }
            } catch (Throwable th2) {
                th = th2;
                r28 = jSONObject;
                th = th;
                try {
                    r28.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            r28 = jSONObject;
            th = th;
            r28.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m46818(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), C22121.m50076(MotionUtils.EASING_TYPE_PATH, "file.txt", "encoding", "").add("targetVersion", "").add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0));
    }
}
