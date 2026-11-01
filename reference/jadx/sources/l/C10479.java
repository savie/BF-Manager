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

/* JADX INFO: renamed from: l.ۤᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10479 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f35888;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2800 f35889;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f35890;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_read_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read File Text";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26586(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m26587(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C10479(C2800 c2800) {
        this.f35889 = c2800;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f35888 == null) {
            this.f35888 = m26584();
        }
        return this.f35888;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f35890 == null) {
            this.f35890 = C4969.m13780("Result for mt_file_read_text.", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path fixed for this call.")).add(TextBundle.TEXT_ENTRY, C4969.m13786("string", "Strictly decoded text with original LF, CRLF, and CR preserved.")).add("encoding", C4969.m13786("string", "Actual lowercase editor encoding token; physical BOM is included in the token.")).add("targetVersion", C4969.m13786("string", "Whole-file raw-byte version as 16 lowercase hex digits.")).add("startLine", C4969.m13786("integer", "Zero-based logical line requested for this page.")).add("startColumn", C4969.m13786("integer", "Zero-based Unicode code-point column requested for this page.")).add("nextLine", C4969.m13786("integer", "Logical line at which a continuation should start.")).add("nextColumn", C4969.m13786("integer", "Unicode code-point column at which a continuation should start.")).add("returnedLineCount", C4969.m13786("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C4969.m13786("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether decoded text remains at nextLine and nextColumn.", "hasMore", "One original-newline text page bound to a whole-file version."), C12123.m30172("mt_file_read_text"), C4969.m13783("Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action.", C4969.m13778(m26584(), "mt_file_read_text", "continue"), C4969.m13778(m26584(), "mt_file_read_text", "retry")));
        }
        return this.f35890;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_read_text", c12731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26591(C5928 c5928, String str) throws C12731 {
        int i = C9068.f30923[c5928.m16196().ordinal()];
        C2800 c2800 = this.f35889;
        if (i == 2) {
            c2800.getClass();
            throw C2800.m8501(str);
        }
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "Directories cannot be read as text.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic text tool.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as text.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26592(C5928 c5928, C5928 c5929, long j) {
        if (c5929.m16196() != EnumC12279.REGULAR) {
            return true;
        }
        if (c5928.m16197() < 0 || c5928.m16197() == j) {
            return c5929.m16197() >= 0 && c5929.m16197() != j;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m26588(String str, long j, long j2, C3318 c3318) {
        return C12731.m31627("FILE_OFFSET_OUT_OF_RANGE", "The requested text line and column are outside the file.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "operation", "read_text").add("backendReason", "text_position_out_of_range").add("startLine", j).add("startColumn", j2).add("finalLine", c3318.f12246).add("finalColumn", c3318.f12248));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m26589(String str, String str2) {
        return C12731.m31627("FILE_CHANGED_DURING_READ", "The file changed while its text was being read.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read_text").add("backendReason", "metadata_changed"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m26590(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return C12731.m31627("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m26585("retry", "Discard earlier pages and restart from the current file version.", str, str4, str3, i, i2, 0L, 0L)), C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str5).add("operation", "read_text").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m26585(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        return C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", i).add("maxChars", i2).add("startLine", j).add("startColumn", j2), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m26584() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("encoding", C4969.m13786("string", "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool.")).add("targetVersion", C4969.m13786("string", "Pass \"\" (empty string) on the first read; later copy the previous result unchanged.")).add("limit", C4969.m13786("integer", "Maximum logical lines touched, 1..2000; pass 500 by default.")).add("maxChars", C4969.m13786("integer", "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible.")).add("startLine", C4969.m13786("integer", "Zero-based logical line in 0..9007199254740991; pass 0 initially.")), "integer", "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially.", "startColumn", "Arguments for mt_file_read_text.");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a5 A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c4 A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:22:0x00e2, B:24:0x00fc, B:28:0x015f, B:29:0x0163, B:30:0x0164, B:31:0x016a, B:45:0x0188, B:47:0x018e, B:48:0x0199, B:50:0x01a5, B:52:0x01ad, B:53:0x01c3, B:54:0x01c4, B:55:0x01c8, B:59:0x01cf, B:60:0x01f8, B:57:0x01ca, B:58:0x01ce, B:37:0x0174, B:38:0x017a, B:4:0x007d, B:6:0x0090), top: B:75:0x0076, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [l.ۧ᩸۬] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [l.ۧ᩸۬] */
    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        ?? r28;
        Throwable th;
        int i;
        int i2;
        ?? r14;
        C12016 c12016M8600;
        C23863.m52589(jSONObject, new C19651(), "Unknown file text read argument", MotionUtils.EASING_TYPE_PATH, "encoding", "targetVersion", "limit", "maxChars", "startLine", "startColumn");
        String strM26586 = m26586((JSONObject) jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM26587 = m26586((JSONObject) jSONObject, "encoding");
        String strM26588 = m26586((JSONObject) jSONObject, "targetVersion");
        int iM38376 = (int) C16249.m38376((JSONObject) jSONObject, "limit", 1L, 2000L);
        int iM38377 = (int) C16249.m38376((JSONObject) jSONObject, "maxChars", 2L, 131072L);
        long jM38376 = C16249.m38376((JSONObject) jSONObject, "startLine", 0L, 9007199254740991L);
        long jM38377 = C16249.m38376((JSONObject) jSONObject, "startColumn", 0L, 9007199254740991L);
        C2800 c2800 = this.f35889;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(strM26586, c3070M8504, MotionUtils.EASING_TYPE_PATH);
        String str = c3070M8504.f11560;
        jSONObject = c2800.m8505(strM8495);
        try {
            try {
                C5928 c5928M8503 = c2800.m8503(strM8495);
                m26591(c5928M8503, strM8495);
                try {
                    try {
                        i = iM38377;
                        jSONObject = strM26588;
                        i2 = iM38376;
                        try {
                            C3318 c3318M13678 = C4917.m13678(c5928M8503.m16195(), strM26587, jM38376, jM38377, i2, i);
                            boolean z = c3318M13678.f12241;
                            String str2 = c3318M13678.f12249;
                            if (m26592(c5928M8503, c2800.m8503(strM8495), c3318M13678.f12250)) {
                                throw m26589(strM8495, str);
                            }
                            if (!jSONObject.isEmpty() && !jSONObject.equals(str2)) {
                                throw m26590(strM8495, jSONObject, c3318M13678.f12249, c3318M13678.f12243, i2, i, c3070M8504.f11560);
                            }
                            if (!c3318M13678.f12240) {
                                throw m26588(strM8495, jM38376, jM38377, c3318M13678);
                            }
                            JSONArray jSONArrayArray = JSON.array();
                            if (z) {
                                jSONArrayArray.add(m26585("continue", "Continue reading text from the same file version.", strM8495, c3318M13678.f12243, c3318M13678.f12249, i2, i, c3318M13678.f12252, c3318M13678.f12244));
                            }
                            C17669 c17669 = new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495).add(TextBundle.TEXT_ENTRY, c3318M13678.f12251).add("encoding", c3318M13678.f12243).add("targetVersion", str2).add("startLine", c3318M13678.f12253).add("startColumn", c3318M13678.f12245).add("nextLine", c3318M13678.f12252).add("nextColumn", c3318M13678.f12244).add("returnedLineCount", c3318M13678.f12242).add("returnedCodePoints", c3318M13678.f12247).add("hasMore", z), jSONArrayArray));
                            jSONObject.close();
                            return c17669;
                        } catch (CharacterCodingException e) {
                            e = e;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                try {
                                    c12016M8600 = C2842.m8600(c5928M8503.m16195(), 0L, 1);
                                    if (!m26592(c5928M8503, c2800.m8503(strM8495), c12016M8600.f40254)) {
                                        throw m26589(strM8495, str);
                                    }
                                    if (!r14.equals(c12016M8600.f40252)) {
                                        throw m26590(strM8495, r14, c12016M8600.f40252, "", i2, i, c3070M8504.f11560);
                                    }
                                } catch (IOException e2) {
                                    throw C2800.m8497(strM8495, e2);
                                }
                            }
                            throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        } catch (C23781 e3) {
                            e = e3;
                            r14 = jSONObject;
                            if (!r14.isEmpty()) {
                                c12016M8600 = C2842.m8600(c5928M8503.m16195(), 0L, 1);
                                if (!m26592(c5928M8503, c2800.m8503(strM8495), c12016M8600.f40254)) {
                                    throw m26589(strM8495, str);
                                }
                                if (!r14.equals(c12016M8600.f40252)) {
                                    throw m26590(strM8495, r14, c12016M8600.f40252, "", i2, i, c3070M8504.f11560);
                                }
                            }
                            throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                        }
                    } catch (IOException e4) {
                        throw C2800.m8497(strM8495, e4);
                    }
                } catch (CharacterCodingException e5) {
                    e = e5;
                    i = iM38377;
                    i2 = iM38376;
                    r14 = strM26588;
                    if (!r14.isEmpty()) {
                        c12016M8600 = C2842.m8600(c5928M8503.m16195(), 0L, 1);
                        if (!m26592(c5928M8503, c2800.m8503(strM8495), c12016M8600.f40254)) {
                            throw m26589(strM8495, str);
                        }
                        if (!r14.equals(c12016M8600.f40252)) {
                            throw m26590(strM8495, r14, c12016M8600.f40252, "", i2, i, c3070M8504.f11560);
                        }
                    }
                    throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
                } catch (C23781 e6) {
                    e = e6;
                    i = iM38377;
                    i2 = iM38376;
                    r14 = strM26588;
                    if (!r14.isEmpty()) {
                        c12016M8600 = C2842.m8600(c5928M8503.m16195(), 0L, 1);
                        if (!m26592(c5928M8503, c2800.m8503(strM8495), c12016M8600.f40254)) {
                            throw m26589(strM8495, str);
                        }
                        if (!r14.equals(c12016M8600.f40252)) {
                            throw m26590(strM8495, r14, c12016M8600.f40252, "", i2, i, c3070M8504.f11560);
                        }
                    }
                    throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, strM8495, "policyRevision", str).add("operation", "read_text").add("backendReason", e.getClass().getSimpleName()));
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
    public static C12731 m26587(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), C3184.m9603(MotionUtils.EASING_TYPE_PATH, "file.txt", "encoding", "").add("targetVersion", "").add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0));
    }
}
