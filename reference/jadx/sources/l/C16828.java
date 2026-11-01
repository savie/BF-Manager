package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16828 extends AbstractC16964 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f53862 = {MotionUtils.EASING_TYPE_PATH, "encoding", "pattern", "patternType", "caseSensitive", "contextBefore", "contextAfter", "limit", "maxChars", "cursor"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8964 f53863;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_search_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Search one regular text file line by line and return matching line numbers with original context. Use mt_file_search to find files in a directory. For a first call, use the recommended parameter values below and cursor=\"\". Search completed logs: detected changes require restarting the search; this is not a filesystem snapshot. Follow continue actions even on empty pages; stop calling to abandon a search. Slow files may exceed client timeouts. Decoding errors, lines above 1048576 UTF-16 units and regex resource exhaustion return partial results; inspect stopReason and keep warnings from every page.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Search File Text";
    }

    public C16828(C8964 c8964) {
        this.f53863 = c8964;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return m39469();
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C4969.m13780("Result for mt_file_search_text.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute source path.")).add("encoding", C4969.m13786("string", "Resolved lowercase encoding token, including physical BOM when present.")).add("matchedLines", m39470(C4969.m13786("integer", "One newly delivered matching line."), "Newly delivered matching lines in ascending order, zero-based. Each line counts once, including zero-width matches. Context may repeat earlier matches; long-line continuation fragments do not count again. Empty files have no lines; a final newline adds no extra empty line.")).add("blocks", m39470(C18828.m43457(JSON.object().add("startLine", C4969.m13786("integer", "Zero-based original logical line.")).add("startColumn", C4969.m13786("integer", "Zero-based Unicode code-point column on startLine.")), "string", "Original text including original line endings; never inserts ellipses or line numbers. Long lines may continue in another page.", TextBundle.TEXT_ENTRY, "One original text fragment."), "Original fragments in file order; adjacent fragments within a page are merged. Context may overlap across pages.")).add("searchedThroughByteOffset", C4969.m13786("integer", "Exclusive original-byte boundary of the contiguous prefix with completed matching decisions, including BOM. May stay unchanged while pending text is delivered.")).add("scanSize", C4969.m13789("integer", "Observed original byte length at search start; null if unavailable.")).add("stopReason", C4969.m13784("eof means both matching and output finished. match_limit, output_limit and scan_budget have a continue action. resource_limit and decode_error terminate incompletely; inspect warnings.", d.aB, "match_limit", "output_limit", "scan_budget", "resource_limit", "decode_error")).add("warnings", m39470(C18828.m43457(JSON.object().add("reason", C4969.m13784("context_clipped only reduces displayed context; context_incomplete means requested following context could not be finished. Other reasons stop matching at the indicated line.", "context_clipped", "context_incomplete", "invalid_encoding", "line_too_long", "match_resource_limit")), "integer", "Zero-based affected logical line.", "line", "A limit or incomplete search location."), "Keep warnings from all pages; context clipping does not imply skipped matching.")), "One text search page."), C12123.m30172("mt_file_search_text"), C4969.m13783("continue resumes pending results; retry recovers a rejected call as described by the action. Empty after eof or terminal partial results.", C4969.m13778(m39469(), "mt_file_search_text", "continue"), C4969.m13778(m39469(), "mt_file_search_text", "retry")));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m39472(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m39471(jSONValue, "Expected a string", str);
        }
        return jSONValue.asString();
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_search_text", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        String str;
        C23863.m52589(jSONObject, new C0599(), "Invalid mt_file_search_text argument", f53862);
        String strM39472 = m39472(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM39473 = m39472(jSONObject, "encoding");
        String strM39474 = m39472(jSONObject, "pattern");
        if (strM39474.isEmpty() || strM39474.length() > 16384) {
            throw C12731.m31626("Expected a non-empty pattern of at most 16384 UTF-16 units", "pattern", jSONObject.get("pattern"), JSON.array(), JSON.object());
        }
        String strM39475 = m39472(jSONObject, "patternType");
        if (strM39475.equals("literal") || strM39475.equals("regex")) {
            JSONValue jSONValue = jSONObject.get("caseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m39471(jSONValue, "Expected a boolean", "caseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            int iM38376 = (int) C16249.m38376(jSONObject, "contextBefore", 0L, 100L);
            int iM38377 = (int) C16249.m38376(jSONObject, "contextAfter", 0L, 100L);
            int iM38378 = (int) C16249.m38376(jSONObject, "limit", 1L, 200L);
            int iM38379 = (int) C16249.m38376(jSONObject, "maxChars", ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 131072L);
            try {
                C19547 c19547M23270 = this.f53863.m23270(strM39472, new C8258(strM39475.equals("regex"), iM38376, iM38377, iM38378, iM38379, zAsBoolean, strM39473, strM39474), m39472(jSONObject, "cursor"));
                JSONArray jSONArrayArray = JSON.array();
                if (!c19547M23270.m44637().isEmpty()) {
                    jSONArrayArray.add(C11320.m28376(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, c19547M23270.m44638().getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", c19547M23270.m44638().getString("encoding")).put("cursor", c19547M23270.m44637()), "mt_file_search_text", "continue", "Continue from this logical position, even when this page has no new matches."));
                }
                return new C17669(C0735.m3193(c19547M23270.m44638(), jSONArrayArray));
            } catch (C12731 e) {
                JSONObject jSONObject2 = new JSONObject(jSONObject);
                String str2 = e.f42472;
                if (str2.equals("FILE_INVALID_CURSOR") || str2.equals("FILE_CHANGED_DURING_READ")) {
                    jSONObject2.put("cursor", "");
                    String string = e.f42468.getString(MotionUtils.EASING_TYPE_PATH, null);
                    if (string != null) {
                        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, string);
                    }
                    str = "Restart with the current query and encoding. Treat earlier pages as a separate search.";
                } else {
                    if (!str2.equals("FILE_SEARCH_CANCELED") || !e.f42470) {
                        throw e;
                    }
                    str = "Retry the same search position after cancellation has cleared.";
                }
                throw e.m31632(JSON.array().add(C11320.m28376(jSONObject2, "mt_file_search_text", "retry", str)));
            }
        }
        throw C12731.m31626("Expected literal or regex", "patternType", jSONObject.get("patternType"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m39471(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m39470(JSONObject jSONObject, String str) {
        return C3184.m9603("type", "array", "description", str).add("items", jSONObject);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m39469() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative regular file path; empty is invalid.")).add("encoding", C4969.m13786("string", "Recommended empty for automatic detection on the first call. Otherwise an exact editor encoding token; copy the resolved token for continuation.")).add("pattern", C4969.m13786("string", "Non-empty literal or regex, at most 16384 UTF-16 units. Literal * is not a wildcard.")).add("patternType", C4969.m13784("Search syntax; recommended literal. LF, CRLF and CR delimit lines and are excluded from matching. Regex applies independently to each line, never across lines.", "literal", "regex")).add("caseSensitive", C4969.m13786(ClassTransform.BOOLEAN, "Recommended false enables Unicode case-insensitive matching.")).add("contextBefore", C4969.m13786("integer", "Requested preceding lines, 0..100; recommended 10. May be clipped with a warning.")).add("contextAfter", C4969.m13786("integer", "Requested following lines, 0..100; recommended 20. May continue on later pages.")).add("limit", C4969.m13786("integer", "Maximum newly delivered matching lines in this page, 1..200; recommended 50.")).add("maxChars", C4969.m13786("integer", "Total returned original-text Unicode code points, 1024..131072; recommended 32768. CRLF is never split.")), "string", "Empty starts a search; otherwise copy continuation arguments unchanged. Retries resume the same logical position but page boundaries may differ. After an application process restart, start a new search.", "cursor", "All fields are required; copy continuation arguments unchanged.");
    }
}
